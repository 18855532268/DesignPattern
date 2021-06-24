package CommandMode;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/24 20:57
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
