import java.util.ArrayList;
import java.util.List;

public class Station {

    private String name;

    private List<Train> trains_in;

    public Station(String name) {
        this.name = name;
        trains_in = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Train> getTrains_in() {
        return trains_in;
    }

    public void setTrains_in(List<Train> trains_in) {
        this.trains_in = trains_in;
    }
}
