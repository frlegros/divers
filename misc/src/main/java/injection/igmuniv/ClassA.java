package injection.igmuniv;

/**
 * Created by frlegros on 17/03/16.
 */
public class ClassA {

    InterfaceI inst;

    public ClassA(InterfaceI interfaceI) {
        this.inst = interfaceI;
    }

    public void doWork(){

        inst.methodB();
    }
}
