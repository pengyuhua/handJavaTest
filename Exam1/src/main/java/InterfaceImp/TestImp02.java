package InterfaceImp;

import InterFace.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static Util.listUtil.listSort;

public class TestImp02 implements Test {
    private List<Integer> list = new ArrayList<Integer>();
    private HashMap<Integer, List<Integer>> mapData = new HashMap();

    public void getData() {
        list.clear();
        //取随机数
        for(int i = 0; i<50; i++){
            int v_01 = (int)( 1 + Math.random() * 100);
            list.add(v_01);
        }
        //流方式操作list
        list.stream().forEach(x ->{
            List<Integer> list = new ArrayList<>();
            int result = x/10;
            if(mapData.containsKey(result)){
                list.addAll(mapData.get(result));
                list.add(x);
                mapData.remove(result);
            }else {
                list = listSort(list);
                list.add(x);
            }
            mapData.put(result, list);
        });
        System.out.println("Stream方式:");
        mapData.entrySet().stream().forEach(System.out::println);
    }
}
