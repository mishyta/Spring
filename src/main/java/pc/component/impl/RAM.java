package pc.component.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pc.component.ComputerComponent;
import pc.component.Storage;

@Component
@Scope("prototype")
public class RAM extends ComputerComponent implements Storage {

    @Value("${ram.volume}")
    private Long volume;

    @Override
    public String toString() {
        return volume + "MB SN:" + this.hashCode();
    }
}
