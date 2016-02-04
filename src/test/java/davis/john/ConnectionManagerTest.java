package davis.john;

/**
 * Created by jrdavis on 2/4/16.
 */
public class ConnectionManagerTest {


    public static void main(String[] args) {
        ConnectionManager.Connection conn = ConnectionManager.newConnectiton();


        for (int i = 0; i != 6; ++i) {
            ConnectionManager.Connection tmp = ConnectionManager.newConnectiton();
            if (tmp == null)
                System.out.println("Out of Connection objects");
            else {
                System.out.println("Got object: " + tmp);
            }


        }
    }
}