package broker;

import publisher.Publisher;
import subscriber.Subscriber;

import java.util.LinkedList;
import java.util.HashMap;

public class MessageBroker {
    private static MessageBroker broker;

    private final HashMap<String, LinkedList<Subscriber>> subscribers = new HashMap<>();

    public static MessageBroker getInstance() {
        if (broker == null) {
            broker = new MessageBroker();
        }

        return broker;
    }

    public void subscribe(String topic, Subscriber subscriber) {
        if (subscribers.get(topic) == null) {
            subscribers.put(topic, new LinkedList<>());
        }

        subscribers.get(topic).add(subscriber);
    }

    public void unsubscribe(String topic, Subscriber subscriber) {
        subscribers.get(topic).remove(subscriber);
    }

    public void publish(String topic, String message) {
        for(Subscriber sub: subscribers.get(topic)) {
            sub.receive(message);
        }
    }
}
