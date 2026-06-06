package Chap1_quiz;

public record Monster(String name, int hp, boolean isBoss) {
    public Monster{
        if(hp<0){
            throw new IllegalArgumentException("HPにマイナス値は設定できません:"+hp);
        }
    }
}
