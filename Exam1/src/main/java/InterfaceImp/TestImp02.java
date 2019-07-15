package InterfaceImp;

import InterFace.Test;

import java.util.ArrayList;
import java.util.List;

public class TestImp02 implements Test {
    private List<Integer> list = new ArrayList<Integer>();

    public void getData() {
        list.clear();
        //取随机数
        for(int i = 0; i<50; i++){
            int v_01 = (int)( 1 + Math.random() * 100);
            list.add(v_01);
        }
        //流方式操作list
        list.stream().forEach(System.out::println);

    }
}
