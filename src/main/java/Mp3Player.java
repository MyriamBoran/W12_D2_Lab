public class Mp3Player extends Component implements IConnect {

    private String song;

    public Mp3Player(String make, String model, String name, String song) {
        super(make, model, name);
        this.song = song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String connect(Stereo stereo){
        return stereo.getName();
    }
}
