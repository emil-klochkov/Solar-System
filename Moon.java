public class Moon extends CelestialBody implements Habitable {
    private String planetOrbiting;
    private boolean isRocky;

    public Moon(String name, double diameter, double dayLength, String planetOrbiting, boolean isRocky) {
        super(name, diameter, dayLength);
        this.planetOrbiting = planetOrbiting;
        this.isRocky = isRocky;
    }

    @Override
    public String getScientificDescription() {
        String rocky = isRocky ? "rocky surface" : "the surface is not rocky";
        return name + " spinning around " + planetOrbiting + ", have diameter " + diameter + " km and " + rocky + ".";
    }
    
    @Override
    public String getHabitabilityReport() {
        return name + " " + (isRocky ? "can" : "can not") + " support live";
    }

    public String getPlanetOrbiting() {
        return planetOrbiting;
    }
}