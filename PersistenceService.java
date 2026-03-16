import java.io.*;

public class PersistenceService {

    private static final String FILE_NAME = "system_state.dat";

    // Save system state
    public static void saveState(SystemState state) {

        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            out.writeObject(state);
            System.out.println("System state saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving system state.");
        }
    }

    // Load system state
    public static SystemState loadState() {

        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            SystemState state = (SystemState) in.readObject();
            System.out.println("System state restored successfully.");
            return state;

        } catch (Exception e) {
            System.out.println("No saved state found. Starting fresh.");
            return null;
        }
    }
}