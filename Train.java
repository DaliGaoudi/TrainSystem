import java.util.ArrayList;
import java.util.List;

public class Train {

    private int ID;
    private String departure;
    private String destination;

    private List<Station> stations;

    public Train(int ID, String departure, String destination) {
        this.ID = ID;
        this.departure = departure;
        this.destination = destination;
        this.stations = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    @Override
    public String toString() {
        return "Train{" +
                "ID=" + ID +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", stations=" + stations +
                '}';
    }
}
