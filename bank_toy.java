import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
//Создаем список игрушек
public class bank_toy {
    public ArrayList<add_toy> toys = new ArrayList<>();

    Random rnd = new Random();

    public void addbank_toys(add_toy add_toy) {
        toys.add(add_toy);

    }
//Розыгрышь,удаление из списка и распечатка выйграша.
    public void drawlist() {
        int iii = 0;
        int obj = 0;
        int obj1 = 0;
        int obj2 = 0;
        int obj3 = 0;
        int num1 = rnd.nextInt(0, 11);
        for (var i = 0; i < toys.size(); i++) {
            if (toys.get(0).getRandom() == num1) {
                saveInFile(toys.get(0));
                obj = 1;

                System.out.println("Your winnings Red car");
                break;

            }

            else {
                System.out.println("You didn't win the Red car");
                break;
            }

        }
        int num2 = rnd.nextInt(0, 8);
        for (var i = 0; i < toys.size(); i++) {
            if (toys.get(1).getRandom() == num2) {
                saveInFile(toys.get(1));
                obj1 = 1;
                System.out.println("Your winnings Big_Dog");
                break;
            }

            else {
                System.out.println("You didn't win the Big_Dog");
                break;
            }

        }
        int num3 = rnd.nextInt(0, 6);
        for (var i = 0; i < toys.size(); i++) {
            if (toys.get(2).getRandom() == num3) {
                // toys.remove(2);
                saveInFile(toys.get(2));
                obj2 = 1;
                System.out.println("Your winnings Soldier");
                break;
            } else {
                System.out.println("You didn't win the Soldier");
                break;
            }

        }
        int num4 = rnd.nextInt(0, 4);
        for (var i = 0; i < toys.size(); i++) {
            if (toys.get(3).getRandom() == num4) {                
                saveInFile(toys.get(3));                
                obj3 = 1;
                System.out.println("Your winnings Blue_car");
                break;
            }

            else {
                System.out.println("You didn't win the Blue_car");
                break;
            }

        }
        if (obj != iii) {

           toys.remove(0);
        }
        if (obj1 != iii) {

           toys.remove(1);
        }
        if (obj2 != iii) {

            toys.remove(2);
        }
        if (obj3 != iii) {

            toys.remove(3);
        }

    }
//Запись выйграша в файл
    private void saveInFile(Object toys) {
        try (FileWriter writer = new FileWriter("winning_toys.txt", true)) {

            writer.write(toys + "\n");
            writer.close();
        } catch (Exception ex) {
            System.out.println("Ошибка записи файла");
        }
    }

}
