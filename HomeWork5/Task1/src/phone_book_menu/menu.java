//Создается класс МЕНЮ, в котором задается структура меню, выбор пунктов меню.
//Меню прокручивается в бесконечном цикле, что бы программа не азвершалась после выбора како-либа пункта
////Логика выброра меню, и выполнение методов закрепленных за каждым пунктом меню


package phone_book_menu;

import java.util.Scanner;
import phone_book_hash.phonebook.*;

import static phone_book_hash.phonebook.*;

public class menu {

    private static String mainMenuView = "Главное меню:\n" +
            "1. Показать телефонную книгу\n" +
            "2. Добавить новый контакт\n" +
            "3. Добавить телефон с сущ. контакт\n" +
            "4. Показатть контакт\n" +
            "5. Выход\n";

    public static Integer inputMenuSelection(){//выбор пункта меню и вывод номера выбранного пункта меню
        while (true){
            System.out.print("Выберете пункт меню: ");
            Scanner menuNumber = new Scanner(System.in);
            if (menuNumber.hasNextInt()){
                int menuSelected = menuNumber.nextInt();
                if ( menuSelected> 0 && menuSelected < 6 ){
                    return menuSelected;
                }
            }
            else{
                System.out.println("Неверный выбор пункта меню!");
            }
        }
    }

    public static void run(){//Логика выброра меню, и выполнение методов закрепленных за каждым пунктом меню
        System.out.print(mainMenuView);
        while (true){
            switch (inputMenuSelection()){
                case 1://Посмотреть весь список контактов
                    printPhoneBook();
                    break;
                case 2://Добавить новый контакт
                    addContact();
                    break;
                case 3://Добавить телефон к контакту
                    updateContact();
                    break;
                case 4://показать контакт
                    showContact();
                    break;
                case 5://Выход
                    System.exit(0);
            }
        }
    }


}
