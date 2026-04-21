import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your player name: ");
        String playerName = sc.nextLine();

        Player player = new Player(playerName);
        Enemy enemy = new Enemy("Goblin");

        Item healthPotion = new Item("Health Potion", 20);
        Item sword = new Item("Sword", 15);

        BlackMagic poison = new BlackMagic("Poison", 10);
        BlackMagic magicOrb = new BlackMagic("Magic Orb", 0);

        boolean potionUsed = false;
        boolean swordUsed = false;
        boolean poisonUsed = false;
        boolean orbUsed = false;

        int turn = 1;

        System.out.println("\n====== BATTLE START ======");
        System.out.println(player);
        System.out.println(enemy);
        System.out.println("==========================\n");

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("---------- Turn " + turn + " ----------");

            // Player's turn
            System.out.println("Your turn!");
            System.out.println(player);

            System.out.println("Choose action:");
            System.out.println("  1. Attack");
            if (!potionUsed) System.out.println("  2. Use Health Potion");
            if (!swordUsed)  System.out.println("  3. Use Sword");

            int choice = 0;
            try { choice = Integer.parseInt(sc.nextLine().trim()); }
            catch (NumberFormatException e) { choice = 1; }

            if (choice == 2 && !potionUsed) {
                healthPotion.use(player);
                potionUsed = true;
            } else if (choice == 3 && !swordUsed) {
                sword.use(player);
                swordUsed = true;
            } else {
                int dmg = player.attack(enemy);
                System.out.println("  >> " + player.getName() + " attacks " + enemy.getType() + " for " + dmg + " damage!");
            }

            System.out.println("  " + player);
            System.out.println("  " + enemy);

            if (!enemy.isAlive()) break;

            // Enemy's turn
            System.out.println("\n" + enemy.getType() + "'s turn!");

            // Enemy uses black magic on odd turns if available
            if (turn % 2 == 1 && !poisonUsed) {
                poison.use(player, enemy);
                poisonUsed = true;
            } else if (turn % 4 == 0 && !orbUsed) {
                magicOrb.use(player, enemy);
                orbUsed = true;
            } else {
                enemy.attack(player);
                System.out.println("  >> " + enemy.getType() + " attacks " + player.getName() +
                        " for " + enemy.getAttackPower() + " damage!");
                // Reset orb boost after one use
                if (orbUsed && enemy.getAttackPower() > 5) {
                    enemy.setAttackPower(5);
                }
            }

            System.out.println("  " + player);
            System.out.println("  " + enemy);
            System.out.println();

            turn++;
        }

        System.out.println("\n====== BATTLE OVER ======");
        if (player.isAlive()) {
            System.out.println("*** " + player.getName() + " wins! ***");
        } else {
            System.out.println("*** " + enemy.getType() + " wins! ***");
        }
        System.out.println(player);
        System.out.println(enemy);

        sc.close();
    }
}