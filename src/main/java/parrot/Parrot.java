package parrot;

public class Parrot {

    private ParrotTypeEnum type;

    public Parrot(ParrotTypeEnum _type) {
        this.type = _type;
    }

    public double getSpeed() {
        switch (type) {
            case EUROPEAN:
                throw new IllegalStateException("Should be overridden");
            case AFRICAN:
                throw new IllegalStateException("Should be overridden");
            case NORWEGIAN_BLUE:
                throw new IllegalStateException("Should be overridden");
        }
        throw new RuntimeException("Should be unreachable");
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

}
