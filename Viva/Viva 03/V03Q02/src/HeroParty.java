import java.util.Arrays;
import java.util.Comparator;

class HeroParty {
    private Hero[] heroes;

    public HeroParty(Hero[] heroes) {
        this.heroes = heroes;
    }

    // Sort heroes based on power
    public void sortList() {
    //     for (int i = 0; i < heroes.length - 1; i++) {
    //         for (int j = 0; j < heroes.length - i - 1; j++) {
    //             if (heroes[i].getPower() > heroes[j + 1].getPower()) {
    //                 Hero temp = heroes[i];
    //                 heroes[i] = heroes[j + 1];
    //                 heroes[j + 1] = temp;
    //             }
    //         }
    //     }

        Arrays.sort(heroes, Comparator.comparingDouble(Hero::getPower));
        // Arrays.sort(heroes, new Comparator<Hero>() {
        //     @Override
        //     public int compare(Hero h1, Hero h2) {
        //         return Double.compare(h1.getPower(), h2.getPower());
        //     }
        // });
    }

    public void battleWinners(Monster enemy) {
        for (Hero h : heroes) {
            double res = enemy.getResistance(h.getElement());
            double damage = h.getPower() * (1 - res / 100);

            if (damage >= enemy.getHealthPoints()) {
                System.out.println(h.getName());
            }
        }
    }

    private double calculateDamage(Hero h, Monster m) {
        double res = m.getResistance(h.getElement());
        return h.getPower() * (1 - res / 100);
    }

    public void battleBoss(Monster boss) {
        double maxDamage = 0;
        Hero best1 = null;
        Hero best2 = null;

        for (int i = 0; i < heroes.length; i++) {
            for (int j = 0; j < heroes.length; j++) {
                if (i == j) continue; // cannot use same hero

                Hero h1 = heroes[i];
                Hero h2 = heroes[j];

                double d1 = calculateDamage(h1, boss);
                double d2 = calculateDamage(h2, boss);

                String e1 = h1.getElement();
                String e2 = h2.getElement();

                // Apply buffs
                if ((e1.equals("Pyro") && e2.equals("Hydro")) ||
                        (e1.equals("Hydro") && e2.equals("Pyro"))) {
                    d1 *= 1.5;
                }
                else if ((e1.equals("Pyro") && e2.equals("Cryo")) ||
                        (e1.equals("Cryo") && e2.equals("Pyro"))) {
                    d1 *= 2.0;
                }
                else if ((e1.equals("Pyro") && e2.equals("Electro")) ||
                        (e1.equals("Electro") && e2.equals("Pyro"))) {
                    d1 += (50 + Math.random() * 51); // 50–100
                }
                else if ((e1.equals("Hydro") && e2.equals("Electro")) ||
                        (e1.equals("Electro") && e2.equals("Hydro"))) {
                    d1 += (int)(1 + Math.random() * 20) * 5; // (1–20)*5
                }
                else if ((e1.equals("Electro") && e2.equals("Cryo")) ||
                        (e1.equals("Cryo") && e2.equals("Electro"))) {
                    double newRes = boss.getResistance(e2) - 10;
                    d2 = h2.getPower() * (1 - newRes / 100);
                }

                double totalDamage = d1 + d2;

                if (totalDamage > maxDamage) {
                    maxDamage = totalDamage;
                    best1 = h1;
                    best2 = h2;
                }
            }
        }

        System.out.println("The pair with the highest damage: " + best1.getName() + " and " + best2.getName());
        System.out.printf("Total damage dealt: %.2f", maxDamage);
    }
}