package pc.component.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pc.component.ComputerComponent;
import pc.component.Storage;

@Component
@Scope("prototype")
public class SSD extends ComputerComponent implements Storage {

    @Value("${ssd.volume}")
    private Long volume;
    @Value("${ssd.pci.version}")
    private Float pciVersion;

    @Override
    public String toString() {
        return volume + "GB PCI:"+pciVersion+" SN:" + this.hashCode();
    }
}
