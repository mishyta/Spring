package pc.component.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pc.component.ComputerComponent;
import pc.component.Storage;

@Component
public class GPU extends ComputerComponent implements Storage {

    @Value("${gpu.clock}")
    private Float speed;

    @Value("${gpu.volume}")
    private Long volume;

    @Override
    public String toString() {
        return speed + "GHz " + volume + "MB SN:" + this.hashCode();
    }
}

