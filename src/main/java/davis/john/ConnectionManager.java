package davis.john;

/**
 * Created by jrdavis on 2/4/16.
 */

public class ConnectionManager {
    private static Connection[] connections = new Connection[5];

    private ConnectionManager() {}

    public static Connection newConnectiton() {
        for ( int i = 0; i != connections.length; ++i ) {
            if ( connections[i] == null ) {
                connections[i] = new Connection();
                return connections[i];
            }
        }
        return null;
    }

    public static class Connection {
        private Connection() {}
    }

}