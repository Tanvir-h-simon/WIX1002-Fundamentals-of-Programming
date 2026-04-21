public class BlackMagic {
    private String name;
    private int effect;

    public BlackMagic(String name, int effect) {
        this.name = name;
        this.effect = effect;
    }

    public String getName() { return name; }

    public int use(Player player, Enemy enemy) {
        if (name.equalsIgnoreCase("Poison")) {
            player.setHealth(player.getHealth() - effect);
            int reduced = (int) Math.round(player.getAttackPower() * 0.10);
            player.setAttackPower(player.getAttackPower() - reduced);
            System.out.println("  >> " + enemy.getType() + " cast Poison! " +
                    player.getName() + " loses " + effect + " HP and -10% ATK.");
        } else if (name.equalsIgnoreCase("Magic Orb")) {
            int boosted = enemy.getAttackPower() * 3;
            enemy.setAttackPower(boosted);
            System.out.println("  >> " + enemy.getType() + " cast Magic Orb! ATK boosted to " + boosted + " (300%).");
        }
        return effect;
    }

    @Override
    public String toString() {
        return "[BlackMagic] " + name + " | Effect: " + effect;
    }
}