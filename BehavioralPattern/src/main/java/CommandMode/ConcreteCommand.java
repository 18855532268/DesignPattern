package CommandMode;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/24 20:56
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

   public ConcreteCommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {

    }
}
