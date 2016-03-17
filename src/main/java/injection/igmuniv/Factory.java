package injection.igmuniv;

/**
 * Created by frlegros on 17/03/16.
 */
public class Factory {

    public InterfaceI getDependency(){
        System.out.println("Factory getDependency");
        return new ClassB();
    }
}
