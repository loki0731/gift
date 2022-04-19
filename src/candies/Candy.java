package candies;

import java.util.Objects;

public class Candy {
    private String name;
    private double weight;
    private double sugarContent;

    public Candy() {
    }

    public Candy(String name, double weight, double sugarContent) {
        this.name = name;
        this.weight = weight;
        this.sugarContent = sugarContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candy candy = (Candy) o;
        return Double.compare(candy.weight, weight) == 0 && Double.compare(candy.sugarContent, sugarContent) == 0 && name.equals(candy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, sugarContent);
    }

    @Override
    public String toString() {
        return "Candy{" +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", sugarContent=" + sugarContent +
                '}';
    }
}
