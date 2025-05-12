public abstract class CelestialBody {
    protected String name;
    protected double diameter;
    protected double dayLength;

    public CelestialBody(String name, double diameter, double dayLength) {
        this.name = name;
        this.diameter = diameter;
        this.dayLength = dayLength;
    }

    public abstract String getScientificDescription();

    public String getName() {
        return name;
    }
}