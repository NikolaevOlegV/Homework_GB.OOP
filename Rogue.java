package Homework.java;

public class Rogue extends Character {
    private int agilityLevel;
    private int health;
    private int attackPower;

    public Rogue(int attackPower, int defense, int health, int speed, int agilityLevel) {
        super(attackPower, defense, health, speed, agilityLevel);
        this.agilityLevel = agilityLevel;
        this.health = health;
    }

    public void attack() {
        System.out.println("Разбойник атакует!");

    // Дополнительные методы и функциональность для Разбойника
    // ...
}

    public void takeDamage(int i) {
    }

	// public String getAttackPower() {
	// 	return null;
	// }
}