import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("ASUS", "X-5","LINUX" ,17.5, "AMD",
                "INTEL",512, 1024, "SSD", 1024,770.23,
                2.5, 1);
        Laptop laptop2 = new Laptop("SAMSUNG", "SKY-MX","WINDOWS 10" ,13.0,
                "AMD", "ATI",
                1024, 512, "HDD", 512, 1100.0, 3.0, 2);
        Laptop laptop3 = new Laptop("ACER", "MX-3000L","None" ,14.0, "AMD",
                "NVIDIA",
                512, 512, "SSD", 1024,800.5, 2.2, 3);
        Laptop laptop4 = new Laptop("DELL", "L800FG","WINDOWS" ,19.3, "AMD",
                "INTEL",
                1024, 1024, "HDD", 1024, 990.0, 4.1, 4);
        Laptop laptop5 = new Laptop("MSI", "G14H7","WINDOWS", 17.5, "AMD",
                "AMD", 512, 1024, "SSD", 1024,1000.3,
                4.1, 5);

        HashSet<Laptop> laptopSet = new HashSet<>();
        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        //laptopSet.add(laptop5); выключил для проверки метода hashcode

        System.out.println("Изначальный экзепляр класса");
        System.out.println(laptop1);
        System.out.println("Изменненный экзепляр класса");
        laptop1.addRAM(1024);
        laptop1.changeOS("LinuxMint");
        laptop1.applyDiscount(12.5);
        System.out.println(laptop1);//проверить что методы класса спаботали
        laptopSet.add(laptop1);
        System.out.println("***");


        System.out.println(laptop4);
        System.out.println("***");
        System.out.println(laptop3);
        System.out.println("***");

        System.out.println(laptop1.equals(laptop2));
        System.out.println(laptop1.equals(laptop1));

        System.out.println("***");

        System.out.println(laptopSet.contains(laptop2));
        System.out.println(laptopSet.contains(laptop5));

        System.out.println("***");

        System.out.println(laptop1.findLaptop(laptopSet));






    }
}