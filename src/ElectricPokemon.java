import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private static final List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackel");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return "electric";
    }

    List<String> getAttacks() {
        return attacks;
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderpunch");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 18 hp");
                enemy.setHp(enemy.getHp() - 18);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() - 12);
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroBall");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 22 hp");
                enemy.setHp(enemy.getHp() - 22);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 17 hp");
                enemy.setHp(enemy.getHp() - 17);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 13 hp");
                enemy.setHp(enemy.getHp() - 13);
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
    }

        void voltTackle(Pokemon name, Pokemon enemy) {
            System.out.println(name.getName() + " attacks " + enemy.getName() + " with voltTackle");
            switch (enemy.getType()) {
                case "water" -> {
                    System.out.println(enemy.getName() + " loses 20 hp");
                    enemy.setHp(enemy.getHp() - 20);
                }
                case "grass" -> {
                    System.out.println(enemy.getName() + " loses 15 hp");
                    enemy.setHp(enemy.getHp() - 15);
                }
                case "fire" -> {
                    System.out.println(enemy.getName() + " loses 13 hp");
                    enemy.setHp(enemy.getHp() - 13);
                }
                case "electric" -> {
                    System.out.println(enemy.getName() + " loses 10 hp");
                    enemy.setHp(enemy.getHp() - 10);
                }
            }
            System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
        }
            void thunder(Pokemon name, Pokemon enemy) {
                System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder");
                switch (enemy.getType()) {
                    case "water" -> {
                        System.out.println(enemy.getName() + " loses 40 hp");
                        enemy.setHp(enemy.getHp() - 40);
                    }
                    case "grass" -> {
                        System.out.println(enemy.getName() + " loses 30 hp");
                        enemy.setHp(enemy.getHp() - 30);
                    }
                    case "fire" -> {
                        System.out.println(enemy.getName() + " loses 20 hp");
                        enemy.setHp(enemy.getHp() - 20);
                    }
                    case "electric" -> {
                        System.out.println(enemy.getName() + " gains 10 hp");
                        enemy.setHp(enemy.getHp() + 10);
                        System.out.println(name.getName() + " gains 10 hp");
                        name.setHp(name.getHp() + 10);
                    }
                }
                System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
                System.out.println(name.getName() + " now has " + name.getHp() + " hp left");
    }
}