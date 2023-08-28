import java.util.List;

public class Central {

    public static Train setup_train(Train train, String departue, String destination, List<Station> stations) {
        train.setDeparture(departue);
        train.setDestination(destination);
        train.setID(departue.length() + destination.length() * 20);
        train.setStations(stations);
        return train;
    }
    public static void main(String[] args) {
        while(true) {

        }
        //JOptionPane.showMessageDialog(null, "Welcome to the Train System!");
    }
}
