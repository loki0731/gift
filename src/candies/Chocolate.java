package candies;

import java.util.Objects;

public class Chocolate extends Candy {

    private String kindOfChocolate;

    public Chocolate() {
    }

    public Chocolate(String name, double weight, double sugarContent, String kindOfChocolate) {
        super(name, weight, sugarContent);
        this.kindOfChocolate = kindOfChocolate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chocolate chocolate = (Chocolate) o;
        return kindOfChocolate.equals(chocolate.kindOfChocolate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kindOfChocolate);
    }

    public String getKindOfChocolate() {
        return kindOfChocolate;
    }

    public void setKindOfChocolate(String kindOfChocolate) {
        this.kindOfChocolate = kindOfChocolate;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "kindOfChocolate='" + kindOfChocolate + '\'' +
                "} " + super.toString();
    }
}
