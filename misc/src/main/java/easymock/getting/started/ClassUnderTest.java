package easymock.getting.started;

/**
 * Created by franck on 13/04/16.
 */
public class ClassUnderTest {

    private Collaborator listener;

    public void setListener(Collaborator listener){
        this.listener =listener;
    }

    public void addDocument(String title, byte[] document) {
        // ...
    }
}
