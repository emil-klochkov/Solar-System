import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CelestialBody> bodies = new ArrayList<>();

        bodies.add(new Planet("Earth", 12742, 24, 1, true));
        bodies.add(new Star("Sun", 1392000, 600, 5778, "G2V"));
        bodies.add(new Moon("Moon", 3474, 708, "Earth", true));
        bodies.add(new Planet("Mars", 6779, 24.6, 2, false));

        System.out.println("= All objects =");
        for (CelestialBody body : bodies) {
            System.out.println(body.getScientificDescription());
        }

        System.out.println("\n= Planets with atmosphere =");

        for (CelestialBody body : bodies) {

            if (body instanceof Planet) {
                Planet P = (Planet) body;

                if (P.hasAtmosphere()) {
                    System.out.println(P.getScientificDescription());
                }
            }
        }

        System.out.println("\n= Moon, spinning around Earth =");
        for (CelestialBody body : bodies) {
            if (body instanceof Moon) {
                Moon M = (Moon) body;
                if (M.getPlanetOrbiting().equalsIgnoreCase("Earth")) {
                    System.out.println(M.getScientificDescription());
                }
            }
        }

        System.out.println("\n= Analys of habit=");
        HabitabilityPrinter printer = new HabitabilityPrinter();
        for (CelestialBody body : bodies) {
            if (body instanceof Habitable) {
                printer.printReport((Habitable) body);
            }
        }
    }
}