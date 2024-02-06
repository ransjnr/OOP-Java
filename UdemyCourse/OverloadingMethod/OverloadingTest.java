public class OverloadingTest {
    void addNum(){
        System.out.println("addNum() with zero arguments");
    }

    void addNum(int x, int y){
        System.out.println("addNum() with 2 parameters");
    }

    void addNum(int x, float y){
        System.out.println("addNum() with 2 parameters int and float");
    }

    public static void main(String[] args){

    }
}