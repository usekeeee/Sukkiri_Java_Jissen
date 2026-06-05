package chap1;
import java.util.Objects;

public class Hero {
    private String name;
    private int hp,mp;

    public String toString() {
        return "戦士(名前=" + this.name
                + "/HP=" + this.hp + "/MP=" + this.mp + ")";
    }
    public int hashCode(){
        return Objects.hash(this.name,this.hp);
        }
    }

