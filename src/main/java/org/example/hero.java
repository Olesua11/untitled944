package org.example;

abstract class hero implements HavingSuperAbility {
    int health;
    int damage;
    String superAbility;

    public hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }


    public void applySuperAbility() {
        System.out.println(superAbility + " применил суперспособность");
    }
}
