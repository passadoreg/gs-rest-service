package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final String ip;
    private final String mac;

    public Greeting(long id, String content, String ip, String mac) {
        this.id = id;
        this.content = content;
        this.ip = ip;
        this.mac = mac;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getIp() {
        return ip;
    }

    public String getMac() {
        return mac;
    }
}
