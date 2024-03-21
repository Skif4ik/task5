import model.PersonList;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        final String FILE_NAME = "src" + File.separator + "data" + File.separator + "people.txt";

        PersonList personList1 = new PersonList();
        personList1.loadFromFile(FILE_NAME);

        personList1.show();

    }
}
