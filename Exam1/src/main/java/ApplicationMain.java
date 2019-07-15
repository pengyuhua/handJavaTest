import Factory.TestFactory;
import InterFace.Test;

public class ApplicationMain {
    public static void main (String[] args){
//        Test test = TestFactory.getTest(""); 测试正常
        Test test01 = TestFactory.getTest("TestImp01");
        Test test02 = TestFactory.getTest("TestImp02");
        test01.getData();
        test02.getData();
    }
}
