package cpecmu.cpe218.sp2019.hw4;

import java.util.Set;

public interface MaxAstronomyEvents {

    /**
     * Return the array containing coordinate for each astronomical event.
     * @return the array containing coordinate for each astronomical event
     */
    int[] eventCoordinates();

    /**
     * Return the maximum number of observable events, provided that the
     * telescope is at coordinate 0 at the beginning, the telescope can
     * move at most 1 degree per minute, and the last event must be observed.
     * @return the maximum number of observable events
     */
    int maxObservableEvents();

    /**
     * Return the observable events of maximum size that can be observed
     * (optional).
     * This method should only be called after {@link #maxObservableEvents()}.
     * @return the set containing observable events
     */
    Set<Integer> observableEvents();
}
