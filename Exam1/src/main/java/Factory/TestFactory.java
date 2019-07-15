package Factory;

import InterFace.Test;
import InterfaceImp.TestImp01;
import InterfaceImp.TestImp02;

public class TestFactory {

//   private static Test test;

   public static Test getTest(String name){
       if(!name.equals("")){
           if(name.equals("TestImp01")){
                return new TestImp01();
           }else if(name.equals("TestImp02")){
               return new TestImp02();
           }else {
               throw new RuntimeException("创建对象实例失败!");
           }
       }else {
           throw new NullPointerException("传入参数非空!");
       }
   }

}
