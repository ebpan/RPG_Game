import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TODO: Enable player to choose class of character (mage, warrior, etc)
        System.out.println("Select your class: 1. Mage, 2. Warrior, 3. Rogue");
        String charClass = scanner.nextLine();

        if (charClass.equals("1")) {
            Mage player = new Mage();
        }
        else if (charClass.equals("2")) {
            Warrior player = new Warrior();
        }
        else if (charClass.equals("3")) {
            Rogue player = new Rogue();
        }
        else {
            System.out.println("Invalid option. Exiting program.");
            System.exit(1);
        }



        System.out.println("Select your enemy: 1. Mage, 2. Warrior, 3. Rogue");
        String enemyClass = scanner.nextLine();

        if (enemyClass.equals("1")) {
            Mage enemy = new Mage();
        }
        else if (enemyClass.equals("2")) {
            Warrior enemy = new Warrior();
        }
        else if (enemyClass.equals("3")) {
            Rogue enemy = new Rogue();
        }
        else {
            System.out.println("Invalid option. Exiting program.");
            System.exit(1);
        }

        //Character player = new Character();
        //Character enemy = new Character();

        //player.setHp(player.getHp() - enemy.getAtk());

        //System.out.println(player.getHp());

        //player.addObject();
        //System.out.println(player.getHp());
        //TODO: break combat into its own method to be able to call it over for repeated battles
        while (player.getHp() > 0 && enemy.getHp() > 0) {
            System.out.println("1. Attack");
            System.out.println("2. Heal");
            System.out.println("3. Restore MP");
            System.out.println("Select your option: ");
            //TODO: add different actions, such as crippling enemy atk value, light attack, heavy attack, etc.
            String action = scanner.nextLine();

            switch (action) {
                case "1":
                    //TODO: Randomize the damage value by using range = maximum - minimum + 1; randomNum = rand.nextInt(range) + minimum
                    enemy.setHp(enemy.getHp() - player.getAtk());
                    break;
                case "2":
                    player.healHP();
                    break;
                case "3":
                    player.restoreMP();
                    break;
                default: System.out.println("Invalid entry");
                    break;
            }

            Random rand = new Random();

            int aiAction = rand.nextInt(2) + 1;

            switch (aiAction) {
                case 1:
                    player.setHp(player.getHp() - enemy.getAtk());
                    System.out.println("Enemy attacks for " + enemy.getAtk() + " damage!");
                    break;
                case 2:
                    enemy.healHP();
                    System.out.println("Enemy heals for 30 health!");
                    break;
                case 3:
                    enemy.restoreMP();
                    System.out.println("Enemy restores 30 MP!");
                    break;
                default: System.out.println("Invalid entry");
                    break;
            }

            System.out.println("Your HP: " + player.getHp() + ", Your Attack: " + player.getAtk() + ", Your MP: " + player.getMp());
            System.out.println("Enemy HP: " + enemy.getHp() + ", Enemy Attack: " + enemy.getAtk() + ", Enemy MP: " + enemy.getMp());
        }
    }
}
