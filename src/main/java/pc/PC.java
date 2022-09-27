package pc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pc.component.PCComponent;
import pc.component.impl.CPU;
import pc.component.impl.GPU;
import pc.component.impl.RAM;
import pc.component.impl.SSD;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

@Component
public class PC {
    //init by interface to study @Qualifier
    @Qualifier("CPU")
    @Autowired
    private PCComponent cpu;

    @Qualifier("GPU")
    @Autowired
    private PCComponent gpu;

    //ram scope - prototype
    @Autowired
    private RAM ram1;

    @Autowired
    private RAM ram2;

    @Autowired
    private SSD ssd;


    public String systemInfo() {
        StringBuilder builder = new StringBuilder("Summery:\n");
        getAllComponents().forEach(pcComponent -> builder.append(pcComponent.getInfo()).append("\n"));
        return builder.toString();
    }

    @PostConstruct
    private void turnedOn(){
        System.out.println("Turned on");
    }

    @PreDestroy
    private void turnedOff(){
        System.out.println("Turned off");
    }

    private List<PCComponent> getAllComponents() {
        return Arrays.asList(cpu, ram1, ram2, gpu, ssd);
    }
}
