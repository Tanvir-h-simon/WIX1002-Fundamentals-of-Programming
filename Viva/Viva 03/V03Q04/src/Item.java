public class Item {
    private String name;
    private int effect;

    public Item(String name, int effect) {
        this.name = name;
        this.effect = effect;
    }

    public String getName() { return name; }

    public int use(Player player) {
        if (name.equalsIgnoreCase("Health Potion")) {
            player.setHealth(player.getHealth() + effect);
            System.out.println("  >> " + player.getName() + " used Health Potion! HP restored by " + effect + ".");
        } else if (name.equalsIgnoreCase("Sword")) {
            player.setAttackPower(player.getAttackPower() + effect);
            System.out.println("  >> " + player.getName() + " equipped Sword! ATK increased by " + effect + ".");
        }
        return effect;
    }

    @Override
    public String toString() {
        return "[Item] " + name + " | Effect: " + effect;
    }
}