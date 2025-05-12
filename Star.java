public class Star extends CelestialBody {
    private double surfaceTemp;
    private String spectralType;

    public Star(String name, double diameter, double dayLength, double surfaceTemp, String spectralType) {
        super(name, diameter, dayLength);
        this.surfaceTemp = surfaceTemp;
        this.spectralType = spectralType;
    }

    @Override
    public String getScientificDescription() {
        return name + " — star type " + spectralType + " with temperature surface " + surfaceTemp + " K.";
    }
}