package publisher;

import broker.MessageBroker;

public class Publisher {
    private final String topic;

    public Publisher(String topic) {
        this.topic = topic;
    }

    public void publish(String message) {
        MessageBroker.getInstance().publish(topic, message);
    }
}