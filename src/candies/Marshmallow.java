package candies;

import java.util.Objects;

public class Marshmallow extends Candy{

    private boolean inChocolate;

    public Marshmallow() {
    }

    public Marshmallow(String name, double weight, double sugarContent, boolean inChocolate) {
        super(name, weight, sugarContent);
        this.inChocolate = inChocolate;
    }

    public boolean isInChocolate() {
        return inChocolate;
    }

    public void setInChocolate(boolean inChocolate) {
        this.inChocolate = inChocolate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Marshmallow that = (Marshmallow) o;
        return inChocolate == that.inChocolate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), inChocolate);
    }

    @Override
    public String toString() {
        return "Marshmallow{" +
                "inChocolate=" + inChocolate +
                "} " + super.toString();
    }
}
