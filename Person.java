public class Person {
    private String date;
    private String fullName;
    private String user;
    private String eventContext;
    private String component;
    private String eventName;
    private String description;
    private String origin;
    private String IP;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person ==> " +
                "date: " + date +
                ", fullName='" + fullName + '\'' +
                ", user='" + user + '\'' +
                ", eventContext='" + eventContext + '\'' +
                ", component='" + component + '\'' +
                ", eventName='" + eventName + '\'' +
                ", description='" + description + '\'' +
                ", origin='" + origin + '\'' +
                ", IP='" + IP + '\'';
    }

    public Person(String date, String fullName, String user, String eventContext, String component, String eventName, String description, String origin, String IP) {
        this.date = date;
        this.fullName = fullName;
        this.user = user;
        this.eventContext = eventContext;
        this.component = component;
        this.eventName = eventName;
        this.description = description;
        this.origin = origin;
        this.IP = IP;
    }
}
