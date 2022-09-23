package src.dz13.task1;

public class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("open file *.txt");
    }

    @Override
    void create() {
        System.out.println("create file *.txt");
    }

    @Override
    void change() {
        System.out.println("change file *.txt");
    }

    @Override
    void save() {
        System.out.println("save file *.txt");
    }
}
