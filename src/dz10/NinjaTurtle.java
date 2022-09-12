package dz10;

public enum NinjaTurtle {
    LEONARDO("blue"),
    DONATELLO,
    RAFAEL("red"),
    MICHELANGELO;
    private String colour;

    NinjaTurtle() {
    }

    NinjaTurtle(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "NinjaTurtles{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
