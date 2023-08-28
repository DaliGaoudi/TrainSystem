import java.util.ArrayList;
import java.util.List;

public abstract class Train implements SoundPlayer {
    private int ID;
    private String departure;
    private String destination;
    private List<Station> stations;
    private Train_Types type;

    public Train(int ID, String departure, String destination) {
        this.ID = ID;
        this.departure = departure;
        this.destination = destination;
        this.stations = new ArrayList<>();
    }

    public Train() {
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

    public Train_Types getType() {
        return type;
    }

    public void setType(Train_Types type) {
        this.type = type;
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

    @Override
    public void playSound() {
        stations.forEach(Station::playSound);
    }
}
