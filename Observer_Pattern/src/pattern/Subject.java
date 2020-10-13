package pattern;

public interface Subject {
    void addSubscriber(Subscriber s);

    void deleteSubscriber(Subscriber s);

    void uploadVideo();
}
