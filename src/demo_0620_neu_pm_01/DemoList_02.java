package demo_0620_neu_pm_01;

import java.util.ArrayList;
import java.util.List;

public class DemoList_02 {
	public static void main(String[] args) {
		// 构建一个容器准备装载10个随机函数
		List lis = new ArrayList();

		while (true) {
			double r = Math.random() * 35 + 1;
			int n = (int) r;
			// 判断该数字是否在list中存在
			if (lis.contains(n)) {
				// 跳过当次循环
				continue;
			}
			lis.add(n);
			if(lis.size()==10) break;
		}
         
		System.out.println("循环遍历：");
		for(int i = 0; i<lis.size();i++){
			System.out.println(lis.get(i));
		}
	}
}
