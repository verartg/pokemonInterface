import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private static final List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return "water";
    }

    List<String> getAttacks() {
        return attacks;
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() - 12);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 18 hp");
                enemy.setHp(enemy.getHp() - 18);
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroPump");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 18 hp");
                enemy.setHp(enemy.getHp() - 18);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 21 hp");
                enemy.setHp(enemy.getHp() - 21);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 23 hp");
                enemy.setHp(enemy.getHp() - 23);
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroCanon");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() - 12);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 14 hp");
                enemy.setHp(enemy.getHp() - 14);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 18 hp");
                enemy.setHp(enemy.getHp() - 18);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 16 hp");
                enemy.setHp(enemy.getHp() - 16);
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
    }
    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with rainDance");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " gains 10 hp");
                enemy.setHp(enemy.getHp() + 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "electric" -> {
                System.out.println("has no effect on " + enemy.getName());
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
    }
}
