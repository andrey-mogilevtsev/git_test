import ru.grave.store.ConnectionPool;
import ru.grave.store.UserStorage;

import java.sql.Connection;

/**
 * Created by Lenovo on 7/20/2016.
 */
public class test {
    public static void main(String[] args) {

        UserStorage.UserToDB("saved", "test","ru", "Ivanov", "Ivan");

    }
}
