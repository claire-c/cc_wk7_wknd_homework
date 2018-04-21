package Characters.Heroes.Fighters;

import Characters.Heroes.Hero;

public abstract class Fighter extends Hero {

    private String name;
    private int hp;
    private Weapon weapon;
    private Defence defence;

    public Fighter(String name){
        super(name);

    }


}