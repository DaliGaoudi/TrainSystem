import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Station implements SoundPlayer {

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

    @Override
    public synchronized void playSound() {

        Thread t = new Thread(new Runnable(){
            public void run() {
                File soundfile = new File("D:\\TrainSystem\\TrainSystem\\ressources\\" + name + ".wav");
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(soundfile);
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        });
        t.start();
    }
}
