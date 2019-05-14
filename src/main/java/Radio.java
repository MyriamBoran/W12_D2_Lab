public class Radio extends Component implements ITune {

    private String station;

    public Radio(String make, String model, String name, String station) {
        super(make, model, name);
        this.station = station;
    }


    public String getStation() {
        return station;
    }

    public void tune(String station) {
        this.station = station;
    }
}
