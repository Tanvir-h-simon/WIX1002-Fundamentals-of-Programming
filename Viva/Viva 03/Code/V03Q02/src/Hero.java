class Hero {
    String name;
    String element; // Pyro, Cryo, Hydro, Electro 
    double power;

    Hero(String name, String element, double power) {
        this.name = name;
        this.element = element;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return name + " (" + element + "), power = " + power;
    }
}