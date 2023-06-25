//В этом классе созданы все методы для работы с телефонной книго:
//Добавление нового котакта
//Добавление нового телефона в выбранный контакт
//Распечатка заданного контакта со всемми его телефонами

package phone_book_hash;

import java.util.*;
import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class phonebook {

    private static HashMap<String, List<Integer>> hashPhoneBook = new HashMap<>();


    public static void addContact() {//Добавление нового котакта
        System.out.println("Введите новый контакт в формате имя:номер телефона");
        Scanner userInput = new Scanner(System.in);
        String contactInfo = userInput.nextLine();
        String[] splitContactInfo = contactInfo.split(":");
        if (!hashPhoneBook.containsKey(splitContactInfo[0])) {
            List<Integer> contactPhonesList = new ArrayList<>();
            contactPhonesList.add(Integer.parseInt(splitContactInfo[1]));
            hashPhoneBook.put(splitContactInfo[0], contactPhonesList);
        } else {
            System.out.print("Такой котакт уже есть!");
        }
    }

    public static void updateContact() {//Добавление нового телефона в выбранный контакт
        System.out.print("В какой контакт добавить телефон?");
        Scanner userInput = new Scanner(System.in);
        String name = userInput.nextLine();
        if (!hashPhoneBook.containsKey(name)) {
            System.out.print("Контакт не найден");
        } else {
            System.out.print("Введите номер телефона: ");
            Scanner phoneInput = new Scanner(System.in);
            Integer phone = phoneInput.nextInt();
            hashPhoneBook.get(name).add(phone);
        }
    }

    public static void showContact() {//Распечатка заданного контакта со всемми его телефонами
        System.out.print("Введите имя котакта: ");
        Scanner userInput = new Scanner(System.in);
        String contactName = userInput.nextLine();
        if (!hashPhoneBook.containsKey(contactName)) {
            System.out.println("Контакт не найден");
        } else {
            System.out.println("Имя: " + contactName);
            for (Integer phone : hashPhoneBook.get(contactName)) {
                System.out.println("Телефон: " + phone);
            }
        }
    }


    public static void printPhoneBook() {//Распечатка всей телефонной книги
        if (!hashPhoneBook.isEmpty()){
            for (String name: hashPhoneBook.keySet()){
                System.out.println("Имя: " + name);
                for (Integer phone: hashPhoneBook.get(name)){
                    System.out.println("Телефон: " + phone);
                }
        }
        }else {
            System.out.println("В телефонной книге еще нет записей!");
        }
    }
}
