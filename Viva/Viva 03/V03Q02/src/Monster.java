class Monster {
    private String name;
    private double pyroRes;
    private double hydroRes;
    private double electroRes;
    private double cryoRes;
    private double healthPoints;

    Monster(String name, double pyroRes, double hydroRes, double
            electroRes, double cryoRes, double healthPoints) {
        this.name = name;
        this.pyroRes = pyroRes;
        this.hydroRes = hydroRes;
        this.electroRes = electroRes;
        this.cryoRes = cryoRes;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public double getResistance(String element) {
        if (element.equals("Pyro")) {
            return pyroRes;
        } else if (element.equals("Hydro")) {
            return hydroRes;
        } else if (element.equals("Electro")) {
            return electroRes;
        } else if (element.equals("Cryo")) {
            return cryoRes;
        } else {
            return 0;
        }
    }
}