package pc.component;

public abstract class ComputerComponent {

    public String getInfo() {
        return this.getClass().getSimpleName() + " " + this;
    }
}
