package elearn;

import org.junit.Test;

/**
 * Created by Ed on 28/03/2017.
 */
public class Bmw extends Cars {

    @Test
    public void Model(){

        // cars bmw (refrence variable) referrs to the new object.. The new object controls Access to the method (Cars) and expose functionality/behaviour of the object

        Cars bmw = new Cars();
        bmw.openDoor();
        bmw.closeDoor();
        bmw.startEngine();
        bmw.changeGear();
        bmw.openbonnet();



}



}
