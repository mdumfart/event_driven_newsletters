package subscriber;

import broker.MessageBroker;

public class Subscriber {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void receive(String message) {
        System.out.println(name + " received: " + message);
    }

    public void subscribe(String topic) {
        MessageBroker.getInstance().subscribe(topic, this);
    }

    public void unsubscribe(String topic) {
        MessageBroker.getInstance().unsubscribe(topic, this);
    }
}
