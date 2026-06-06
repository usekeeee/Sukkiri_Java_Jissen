package chap1;

public class Sword implements Cloneable {
    private String name;

    public Sword(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sword clone() {
        try {
            Sword result = (Sword) super.clone();
            result.name = this.name;
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
