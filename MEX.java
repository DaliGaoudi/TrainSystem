public class MEX extends Train {
    private Train_Types types;

    public MEX(int ID, String departure, String destination, Train_Types types) {
        super(ID, departure, destination);
        this.types = types;
    }
}
