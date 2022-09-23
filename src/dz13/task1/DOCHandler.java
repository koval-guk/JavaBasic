package src.dz13.task1;

public class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("open file *.doc");
    }

    @Override
    void create() {
        System.out.println("create file *.doc");
    }

    @Override
    void change() {
        System.out.println("change file *.doc");
    }

    @Override
    void save() {
        System.out.println("save file *.doc");
    }
}
