package pc.component.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pc.component.ComputerComponent;
import pc.component.Storage;

@Component
public class CPU extends ComputerComponent implements Storage {

    @Value("${cpu.clock}")
    private Float speed;

    @Override
    public String toString() {
        return speed + "GHz SN:" + this.hashCode();
    }
}

