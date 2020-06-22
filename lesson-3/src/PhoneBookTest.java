public class PhoneBookTest {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Ivanov","+7-999-685-9922");
        myPhoneBook.add("Petrov","+7-996-515-5435");
        myPhoneBook.add("Mikhailov","+7-996-532-2245");
        myPhoneBook.add("Ivanov","+7-999-754-8864");
        myPhoneBook.add("Chekhov","+7-996-845-6495");

        myPhoneBook.get("Ivanov");
        System.out.println();
        myPhoneBook.get("Sidorov");
    }
}
