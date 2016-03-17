package injection.igmuniv;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 17/03/16.
 */
public class ClassATest {

    ClassA classA;

    @Before
    public void setUp() throws Exception {
        InterfaceI interfaceI = new Factory().getDependency();
        classA = new ClassA(interfaceI);

    }

    @Test
    public void testDoWork() throws Exception {

        classA.doWork();
    }
}