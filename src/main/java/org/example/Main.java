package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем массив из 3 разных героев
        hero[] heroes = {new Magic(), new Medic(), new Warrior()};

        for (org.example.hero hero : heroes) {
            hero.applySuperAbility();
        }
    }
}