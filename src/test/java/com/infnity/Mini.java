package com.infnity;

import elearn.Cars;
import elearn.Planes;
import org.junit.Test;

/**
 * Created by Ed on 28/03/2017.
 */
public class Mini extends  Planes{

    @Test
    public void Model(){

        Mini airBus = new Mini();

        airBus.cargo();
        airBus.speed();
    }

}
