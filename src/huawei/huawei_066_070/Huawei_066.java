package huawei.huawei_066_070;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 配置文件恢复
 */
public class Huawei_066 {
    static List<Command> commands;

    public static class Command {
        String name;
        String operation;
        String nameArr[];

        Command(String name, String operation) {
            this.name = name;
            this.operation = operation;
            this.nameArr = name.split(" ");
        }

        public boolean match(String commandName) {
            String names[] = commandName.split(" ");
            if (names.length != nameArr.length) return false;
            for (int i=0;i<nameArr.length;i++){
                if(!nameArr[i].startsWith(names[i]))return false;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        initCommand();

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String commandName = sc.nextLine();
            int count=0;
            Command command = null;
            for (Command cd:commands){
                if(cd.match(commandName)){
                    count++;
                    command = cd;
                }
            }

            if(count==1) System.out.println(command.operation);
            else System.out.println("unkown command");
        }

        sc.close();
    }

    public static void initCommand() {
        commands = new ArrayList<>();
        commands.add(new Command("reset", "reset what"));
        commands.add(new Command("reset board", "board fault"));
        commands.add(new Command("board add", "where to add"));
        commands.add(new Command("board delet", "no board at all"));
        commands.add(new Command("reboot backplane", "impossible"));
        commands.add(new Command("backplane abort", "install first"));
    }
}
