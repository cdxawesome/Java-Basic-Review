package com.simple.interfaceinherit;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("盖伦");
        Hero adHero = new ADHero("艾希");
        APHero apHero = new APHero();
        ADAPHero adapHero = new ADAPHero();

        hero.kill(apHero);
        hero.kill(adapHero);
    }
}
