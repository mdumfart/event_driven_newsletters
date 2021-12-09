import broker.MessageBroker;
import publisher.Publisher;
import subscriber.Subscriber;

public class Runner {
    public static void main(String[] args) {
        MessageBroker broker = new MessageBroker();

        Publisher sportsPublisher = new Publisher("sports");
        Publisher financePublisher = new Publisher("finance");
        Publisher weatherPublisher = new Publisher("weather");


        Subscriber sub1 = new Subscriber("sub1");
        Subscriber sub2 = new Subscriber("sub2");
        Subscriber sub3 = new Subscriber("sub3");
        Subscriber sub4 = new Subscriber("sub4");
        Subscriber sub5 = new Subscriber("sub5");

        // Sub to sports
        sub1.subscribe("sports");
        sub2.subscribe("sports");
        sub3.subscribe("sports");

        // Sub to finance
        sub1.subscribe("finance");
        sub4.subscribe("finance");
        sub5.subscribe("finance");

        // Sub to weather
        sub1.subscribe("weather");
        sub3.subscribe("weather");
        sub5.subscribe("weather");

        // Publish
        sportsPublisher.publish("This is a sports newsletter");
    }
}
