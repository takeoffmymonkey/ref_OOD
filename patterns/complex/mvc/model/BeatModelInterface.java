package patterns.complex.mvc.model;

import patterns.complex.mvc.abstract_observer.BPMObserver;
import patterns.complex.mvc.abstract_observer.BeatObserver;

public interface BeatModelInterface {
    void initialize();

    void on();

    void off();

    void setBPM(int bpm);

    int getBPM();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}