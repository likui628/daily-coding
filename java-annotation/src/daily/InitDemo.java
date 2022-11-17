package daily;

public class InitDemo {

    @InitMethod
    public void init(){
        System.out.println("init ...");
    }

    @InitMethod
    public void test(){
        System.out.println("test ...");
    }
}
