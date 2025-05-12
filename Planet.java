public class Planet extends CelestialBody implements Habitable {
    private int moonCount;
    private boolean hasAtmosphere;

    public Planet(String name, double diameter, double dayLength, int moonCount, boolean hasAtmosphere) {
        super(name, diameter, dayLength);
        this.moonCount = moonCount;
        this.hasAtmosphere = hasAtmosphere;
    }

    @Override
    public String getScientificDescription() {
        String atmosphere = hasAtmosphere ? "and having atmoshpere" : "and does not having atmosphere";
        return name + " have diameter " + diameter + " km " + atmosphere + ". he have " + moonCount + " moon(s).";
    }

    public boolean hasAtmosphere() {
        return hasAtmosphere;
    }

    @Override
    public String getHabitabilityReport() {
        return "Planet " + name + (hasAtmosphere ? " may be potentially habitable." : " It's not habitable.");
    }
}