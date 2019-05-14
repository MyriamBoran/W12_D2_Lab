public class Stereo extends Component implements IPlayer, ITune, IConnect {

    private int numCd;
    private int playSpeeds;
    private String song;
    private String station;


    public Stereo(String make, String model, String name, int numCd, int playSpeeds, String song, String station) {
        super(make, model, name);
        this.numCd = numCd;
        this.playSpeeds = playSpeeds;
        this.song = song;
        this.station = station;
    }

    @Override
    public void play(String song) {
        this.song = song;
    }

    @Override
    public void tune(String station) {
        this.station = station;
    }

    @Override
    public String connect(Stereo stereo) {
        return null;
    }

    public int getNumCd() {
        return numCd;
    }

    public int getPlaySpeeds() {
        return playSpeeds;
    }

    public String getSong() {
        return song;
    }

    public String getStation() {
        return station;
    }
}
