public class Player {
    private String name;
    private int health;
    private int attackPower;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.attackPower = 10;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = Math.max(0, attackPower);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(0, health);
    }

    public int attack(Enemy enemy) {
        enemy.setHealth(enemy.getHealth() - this.attackPower);
        return this.attackPower;
    }

    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return "[Player] " + name + " | HP: " + health + " | ATK: " + attackPower;
    }
}