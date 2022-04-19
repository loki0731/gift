package candies;

import java.util.Objects;

public class Lollipop extends Candy{

    private String taste;

    public Lollipop() {
    }

    public Lollipop(String name, double weight, double sugarContent, String taste) {
        super(name, weight, sugarContent);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lollipop lollipop = (Lollipop) o;
        return taste.equals(lollipop.taste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), taste);
    }

    @Override
    public String toString() {
        return "Lollipop{" +
                "taste='" + taste + '\'' +
                "} " + super.toString();
    }
}
