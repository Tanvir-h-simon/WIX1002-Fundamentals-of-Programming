public class Enemy {
    private String type;
    private int health;
    private int attackPower;

    public Enemy(String type) {
        this.type = type;
        this.health = 50;
        this.attackPower = 5;
    }

    public String getType() { return type; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = Math.max(0, health); }
    public int getAttackPower() { return attackPower; }
    public void setAttackPower(int attackPower) { this.attackPower = attackPower; }

    public void attack(Player player) {
        player.setHealth(player.getHealth() - this.attackPower);
    }

    public boolean isAlive() { return health > 0; }

    @Override
    public String toString() {
        return "[Enemy] " + type + " | HP: " + health + " | ATK: " + attackPower;
    }
}