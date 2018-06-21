package patterns.structural.facade.facade;

import patterns.structural.facade.complicated_system.Computer;
import patterns.structural.facade.complicated_system.Light;
import patterns.structural.facade.complicated_system.MidiDevice;
import patterns.structural.facade.complicated_system.Reaper;


/* ФАСАД: предоставляет быстрый доступ к определённой функциональности подсистемы
 *
 * - знает, каким классам нужно переадресовать запрос, и какие данные для этого нужны
 *
 * - можно ввести дополнительный фасад, чтобы не «захламлять» единственный фасад разнородной
 * функциональностью
 *
 * - может использоваться как клиентом, так и другими фасадами*/


public class WritingMusicFacade {
    Computer computer;
    Reaper reaper;
    MidiDevice midiDevice;
    Light light;

    public WritingMusicFacade(Computer computer, Reaper reaper, MidiDevice midiDevice, Light light) {
        this.computer = computer;
        this.reaper = reaper;
        this.midiDevice = midiDevice;
        this.light = light;
    }

    public void startProducing() {
        computer.on();
        midiDevice.on();
        reaper.start();
        reaper.loadLastProject();
        light.on();
        light.dim();
    }

    public void finishProducing() {
        reaper.close();
        midiDevice.off();
        computer.off();
        light.off();
    }
}