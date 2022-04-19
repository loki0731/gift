package candies;

import java.util.Objects;

public class Toffee extends Candy{

    private boolean soft;

    public Toffee() {
    }

    public Toffee(String name, double weight, double sugarContent, boolean soft) {
        super(name, weight, sugarContent);
        this.soft = soft;
    }

    public boolean isSoft() {
        return soft;
    }

    public void setSoft(boolean soft) {
        this.soft = soft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Toffee toffee = (Toffee) o;
        return soft == toffee.soft;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), soft);
    }

    @Override
    public String toString() {
        return "Toffee{" +
                "soft=" + soft +
                "} " + super.toString();
    }
}
