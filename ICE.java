public class ICE extends Train {
    private Train_Types types;

    public ICE(int ID, String departure, String destination) {
        super(ID, departure, destination);
        types = Train_Types.ICE;
    }

    public ICE() {
    }
}
