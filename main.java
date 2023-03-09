import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        add_toy Car = new add_toy(1, "Red_car", 3, 10);
        add_toy Dog = new add_toy(2, "Big_Dog", 4, 7);
        add_toy Solder = new add_toy(3, "Soldier", 2, 3);
        add_toy B_Car = new add_toy(4, "Blue_car", 3, 5);
        bank_toy bank_all_toys = new bank_toy();
        bank_all_toys.addbank_toys(Car);
        bank_all_toys.addbank_toys(Dog);
        bank_all_toys.addbank_toys(Solder);
        bank_all_toys.addbank_toys(B_Car);
        bank_all_toys.drawlist();

        
    }

}
