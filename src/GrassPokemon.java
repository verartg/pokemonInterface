import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        String type = "grass";
        return type;
    }

    List<String> getAttacks() {
        return attacks;
    }

    void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafStorm");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() - 12);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 18 hp");
                enemy.setHp(enemy.getHp() - 18);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
    }

    void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with solarBeam");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 19 hp");
                enemy.setHp(enemy.getHp() - 19);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 21 hp");
                enemy.setHp(enemy.getHp() - 21);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 23 hp");
                enemy.setHp(enemy.getHp() - 23);
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
    }

    void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leechSeed");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 6 hp");
                enemy.setHp(enemy.getHp() - 6);
                name.setHp(name.getHp() + 6);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 4 hp");
                enemy.setHp(enemy.getHp() - 4);
                name.setHp(name.getHp() + 4);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() - 8);
                name.setHp(name.getHp() + 8);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                name.setHp(name.getHp() + 10);
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
    }

    void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaveBlade");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 22 hp");
                enemy.setHp(enemy.getHp() - 22);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " gains 10 hp");
                enemy.setHp(enemy.getHp() + 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 24 hp");
                enemy.setHp(enemy.getHp() - 24);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 26 hp");
                enemy.setHp(enemy.getHp() - 26);
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
    }
}
