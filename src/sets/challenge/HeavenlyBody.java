package sets.challenge;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<sets.HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites =  new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<sets.HeavenlyBody> getSatellites() {
        return satellites;
    }

    public boolean addMoon(sets.HeavenlyBody moon){
        return this.satellites.add(moon);
    }

//    TODO
}
