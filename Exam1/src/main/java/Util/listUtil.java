package Util;

import java.util.List;

public class listUtil {
    //对list排序
    public static List<Integer> listSort(List<Integer> data){
        for(int i=0;i<data.size()-1;i++)
        {
            for(int j=i+1;j<data.size();j++)
            {
                if(data.get(i) >data.get(j))
                {
                    int temp = data.get(i);

                    data.set(i, data.get(j));
                    data.set(j,temp);
                }
            }
        }
        return data;
    }
}
