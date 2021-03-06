package org.scify.jthinkfreedom.stimuli;

import java.util.List;
import org.scify.jthinkfreedom.reactors.IReactor;
import org.scify.jthinkfreedom.sensors.ISensor;

/**
 *
 * @author ggianna
 * @param <T>
 */
public interface IStimulus<T> {

    public void addReactor(IReactor rToUse);

    public List<IReactor> listReactors();

    public boolean removeReactor(IReactor rToRemove);

    public void clearReactors();

    public void addSensor(ISensor<T> sToUse);

    public List<ISensor<T>> listSensors();

    public boolean removeSensor(ISensor<T> sToRemove);

    public void clearSensors();

    public void start();

    public void stop();

    public void callReactors();

    public void onDataReceived();

}
