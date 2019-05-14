public class RecordPlayer extends Component implements IPlayer{

    private int playSpeeds;
    private String song;

    public RecordPlayer(String make, String model, String name, int playSpeeds, String song) {
        super(make, model, name);
        this.playSpeeds = playSpeeds;
        this.song = song;
    }


    public void play(String song){
        this.song = song;

    }

    public String getSong() {
        return song;
    }

    public int getPlaySpeeds() {
        return playSpeeds;
    }
}
