import Shield.RoundShield;
import Shield.SteelShield;
import Shield.WoodenShield;
import items.Archer;
import items.ArcherBuilder;
import items.SwordMan;
import items.Warrior;
import team.Team;
import weapons.Bow;
import weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archerTeam = new Team<>("Archers");
        archerTeam.addWarrior(new ArcherBuilder().setName("Vasya").setShield(new SteelShield()).setWeapon(new Bow()).createArcher())
                .addWarrior(new ArcherBuilder().setName("Petya").setWeapon(new Bow()).setShield(new WoodenShield()).createArcher())
                .addWarrior(new ArcherBuilder().setName("Misha").setWeapon(new Bow()).setShield(new WoodenShield()).createArcher())
                .addWarrior(new ArcherBuilder().setName("Grisha").setWeapon(new Bow()).setShield(new WoodenShield()).createArcher());

        System.out.println(archerTeam);

        Team<Warrior> mixTeam = new Team<>("Mixer");
        mixTeam.addWarrior(new ArcherBuilder().setName("Vasya").setWeapon(new Bow()).setShield(new SteelShield()).createArcher())
                .addWarrior(new SwordMan("Petya", new Sword(), new RoundShield()))
                .addWarrior(new ArcherBuilder().setName("Misha").setWeapon(new Bow()).setShield(new RoundShield()).createArcher())
                .addWarrior(new SwordMan("Grisha", new Sword(), new WoodenShield()));

        System.out.println(mixTeam);

        SwordMan greg = new SwordMan("Petya", new Sword(), new SteelShield());
        Archer misha = new ArcherBuilder().setName("Misha").setWeapon(new Bow()).setShield(new SteelShield()).createArcher();

        while (greg.getHealthPoint() > 0 && misha.getHealthPoint() > 0) {
            int damage2 = misha.hitDamage(greg);
            int damage1 = greg.hitDamage(misha);
            System.out.printf("Здоровье Гриши: %d Здоровье Миши: %d \n", greg.getHealthPoint(), misha.getHealthPoint());
        }

        if (greg.getHealthPoint()>0)
            System.out.println("Гриша победил");
        else
            System.out.println("Миша победил");
    }
}