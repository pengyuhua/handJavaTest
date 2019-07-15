package InterfaceImp;

import InterFace.Test;

import java.io.InputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import static Util.listUtil.listSort;

public class TestImp01 implements Test {

    private List<Integer> list = new ArrayList<Integer>();
    private HashMap<Integer, List<Integer>> data = new HashMap<Integer, List<Integer>>();

    //  普通方式
    public void getData() {
        list.clear();
        //取随机数
        for (int i = 0; i < 50; i++) {
            int v_01 = (int) (1 + Math.random() * 100);
//            System.out.println(v_01);
            list.add(v_01);
        }
        // 处理list

        for (int x = 0; x < list.size(); x++) {
            List<Integer> temp = new ArrayList<>();
            int result = list.get(x) / 10;
            if (data.containsKey(result)) {
                temp.addAll(data.get(result));
                temp.add(list.get(x));
                data.remove(result);
            } else {
                temp.add(list.get(x));
            }
            temp = listSort(temp);
            data.put(result, temp);
        }
        //遍历结果
        Iterator iterator = data.entrySet().iterator();
        System.out.println("传统方式:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
