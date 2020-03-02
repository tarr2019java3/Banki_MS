package pl.sda.banki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Jan", "Kowalski", 44);
        User user2 = new User("Marcin", "Nowak", 66);
        User user3 = new User("Katarzyna", "Dobroń", 33);
        User user4 = new User("Ola", "Lewandowska", 33);

        BankAccount bankAccount1 = new BankAccount(1, "BankDlaBogatych", 5555, 6555.0);
        BankAccount bankAccount2 = new BankAccount(2, "BankNowoczesny", 4444, 6532455.0);
        BankAccount bankAccount3 = new BankAccount(3, "Bank", 3333, 234234.0);
        BankAccount bankAccount4 = new BankAccount(4, "BigBank",2222, 2342.0);

        Composition composition1 = new Composition(user1, bankAccount1);
        Composition composition2 = new Composition(user2, bankAccount2);
        Composition composition3 = new Composition(user3, bankAccount3);
        Composition composition4 = new Composition(user4, bankAccount4);

        List<Composition> list = new ArrayList<>();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("Lista.json"), list);
        } catch (IOException exc){
            exc.printStackTrace();
        }

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Wybierz Id użytkownika różnych banków w zakresie od 1 do 4 lub EXIT, aby wyjść.");
            String choice = s.next();
            if (choice.equals("EXIT")){
                break;
            }
            else {
                try{
                    int number = Integer.parseInt(choice);
                    switch (number){
                        case 1:
                            System.out.println("Imię: " + composition1.getUser().getName() + "\n"
                                    + "Nazwisko: " + composition1.getUser().getLastname() + "\n"
                                    + "Wiek: " + composition1.getUser().getAge() + "\n"
                                    + "Nazwa Banku: " + composition1.getBankAccount().getName() + "\n"
                                    + "Numer Konta: " + composition1.getBankAccount().getAccountNumber() + "\n"
                                    + "Saldo: " + composition1.getBankAccount().getBalance() + "\n"
                            );
                            break;
                        case 2:
                            System.out.println("Imię: " + composition2.getUser().getName() + "\n"
                                    + "Nazwisko: " + composition2.getUser().getLastname() + "\n"
                                    + "Wiek: " + composition2.getUser().getAge() + "\n"
                                    + "Nazwa Banku: " + composition2.getBankAccount().getName() + "\n"
                                    + "Numer Konta: " + composition2.getBankAccount().getAccountNumber() + "\n"
                                    + "Saldo: " + composition2.getBankAccount().getBalance() + "\n"
                            );
                            break;
                        case 3:
                            System.out.println("Imię: " + composition3.getUser().getName() + "\n"
                                    + "Nazwisko: " + composition3.getUser().getLastname() + "\n"
                                    + "Wiek: " + composition3.getUser().getAge() + "\n"
                                    + "Nazwa Banku: " + composition3.getBankAccount().getName() + "\n"
                                    + "Numer Konta: " + composition3.getBankAccount().getAccountNumber() + "\n"
                                    + "Saldo: " + composition3.getBankAccount().getBalance() + "\n"
                            );
                            break;
                        case 4:
                            System.out.println("Imię: " + composition4.getUser().getName() + "\n"
                                    + "Nazwisko: " + composition4.getUser().getLastname() + "\n"
                                    + "Wiek: " + composition4.getUser().getAge() + "\n"
                                    + "Nazwa Banku: " + composition4.getBankAccount().getName() + "\n"
                                    + "Numer Konta: " + composition4.getBankAccount().getAccountNumber() + "\n"
                                    + "Saldo: " + composition4.getBankAccount().getBalance() + "\n"
                            );
                            break;
                        default:
                            System.out.println("Błędny wybór brak takiego ID");

                    }
                } catch(NumberFormatException exc){
                    System.out.println("Wpisz Liczbę");
                    exc.printStackTrace();
                }

            }
        }
    }
}
