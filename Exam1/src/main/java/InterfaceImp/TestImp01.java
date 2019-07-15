package InterfaceImp;

import InterFace.Test;

import java.util.ArrayList;
import java.util.List;

public class TestImp01 implements Test {

    private List<Integer> list = new ArrayList<Integer>();
    //  普通方式
    public void getData() {
        list.clear();
        //取随机数
        for(int i = 0; i<50; i++){
            int v_01 = (int)( 1 + Math.random() * 100);
            System.out.println(v_01);
            list.add(v_01);
        }
    // 处理list
        List<Integer> temp = new ArrayList<Integer>();
        for(int x: list){
            temp.add(x / 10);
        }
        list.clear();
        list.addAll(temp);
    }
}
