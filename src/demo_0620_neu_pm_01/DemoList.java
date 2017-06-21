package demo_0620_neu_pm_01;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
	public static void main(String[] args) {
         List<String> list = new ArrayList<String>();
         //通过集合的add方法 把数据添加到集合
         list.add("张三");
         list.add("李四");
         list.add("小王");
         
         //get方法 获取集合中的数据
         //下标 为2的数据，集合的下标从0开始
         String str = list.get(2);
         System.out.println(str);
         for(String s:list){
        	 System.out.println(s);
         }
         
	}
}
