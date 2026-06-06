package chap1;

public class Hero_2 implements Cloneable{
    String name;
    int hp;
    int mp;
    Sword sword;

    public Hero_2(String name){
        this.name = name;
    }

    public Hero_2(){
    }

    public Sword getSword(){
        return this.sword;
    }
    public void setSword(Sword s){
        this.sword = s;
    }

    public Hero_2 clone() {
        try {
            Hero_2 result = (Hero_2) super.clone();
            result.name = this.name;
            result.hp = this.hp;
            result.sword = this.sword.clone();
            if (this.sword != null) {
                result.sword = this.sword.clone();
            }
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
