package patterns.complex.mvc.controller;

public interface ControllerInterface {
    void start();

    void stop();

    void increaseBPM();

    void decreaseBPM();

    void setBPM(int bpm);
}