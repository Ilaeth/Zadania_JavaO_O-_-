import java.util.Comparator;
import java.util.HashSet;

public class Application {
    String name;
    String version;
    Double value;
    public static HashSet<Application> allApplications = new HashSet<>();
    public static Comparator<Application> sortByName = Comparator.comparing(app -> app.name);
    public static Comparator<Application> sortByValue = Comparator.comparingDouble(app -> app.value);

    public Application(String name, String version, Double value) {
        this.name = name;
        this.version = version;
        this.value = value;
        allApplications.add(this);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
