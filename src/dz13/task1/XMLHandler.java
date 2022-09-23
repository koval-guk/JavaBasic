package src.dz13.task1;

public class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("open file *.xml");
    }

    @Override
    void create() {
        System.out.println("create file *.xml");
    }

    @Override
    void change() {
        System.out.println("change file *.xml");
    }

    @Override
    void save() {
        System.out.println("save file *.xml");
    }
}
