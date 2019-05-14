public abstract class Component {
    private  String model;
    private  String make;

    private String name;

    public Component(String make, String model, String name) {
        this.make = make;
        this.model = model;
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getName() {
        return name;
    }
}
