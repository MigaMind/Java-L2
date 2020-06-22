import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PhoneBook {
    List<Person> personList = new ArrayList<>();

    public void add(String surname, String phoneNumber) {
        Person person = new Person(surname, phoneNumber);
        personList.add(person);
    }

    public void get(String searchName) {
        ListIterator<Person> i = this.personList.listIterator();
        boolean found = false;
        while (i.hasNext()) {
            Person p = i.next();
            if (searchName.equals(p.getSurname())) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println(String.format("%s not found", searchName));
        }
    }

    static class Person implements Comparable {
        private String surname;
        private String phoneNumber;

        public Person(String surname, String phoneNumber) {
            this.surname = surname;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public int compareTo(Object o) {
            Person another = (Person)o;
            if (another.surname.equals(this.surname)) {
                return 0;
            }
            return 1;
        }

        @Override
        public String toString() {
            return "[" + surname + ", phone:" + phoneNumber + ']';
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }
}