import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    List<String> attacks = Arrays.asList("firelash", "flamethrower", "pyroball", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return "fire";
    }

    List<String> getAttacks() {
        return attacks;
    }

void fireLash(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with fireLash");
    switch (enemy.getType()) {
        case "water" -> {
            System.out.println(enemy.getName() + " loses 22 hp");
            enemy.setHp(enemy.getHp() - 22);
        }
        case "grass" -> {
            System.out.println(enemy.getName() + " loses 25 hp");
            enemy.setHp(enemy.getHp() - 25);
        }
        case "fire" -> {
            System.out.println(enemy.getName() + " loses 15 hp");
            enemy.setHp(enemy.getHp() - 15);
        }
        case "electric" -> {
            System.out.println(enemy.getName() + " loses 20 hp");
            enemy.setHp(enemy.getHp() - 20);
        }
    }
    System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
}

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flameThrower");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 28 hp");
                enemy.setHp(enemy.getHp() - 28);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 18 hp");
                enemy.setHp(enemy.getHp() - 18);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 22 hp");
                enemy.setHp(enemy.getHp() - 22);
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroBall");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 14 hp");
                enemy.setHp(enemy.getHp() - 14);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 18 hp");
                enemy.setHp(enemy.getHp() - 18);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() - 12);
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
    }
    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 21 hp");
                enemy.setHp(enemy.getHp() - 21);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " gains 24 hp");
                enemy.setHp(enemy.getHp() + 24);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 14 hp");
                enemy.setHp(enemy.getHp() - 14);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 19 hp");
                enemy.setHp(enemy.getHp() - 19);
            }
        }
        System.out.println(enemy.getName() + " now has " + enemy.getHp() + " hp left");
    }
}
