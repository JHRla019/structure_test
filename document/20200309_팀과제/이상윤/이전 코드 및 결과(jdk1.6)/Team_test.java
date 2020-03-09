package assignment;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Team_test {

	public static void main(String[] args) {
		
		Data_structure ds = new Team_analysis();
		
//		ds.Analysis_add(new LinkedList<Integer>());
//		ds.Analysis_add(new CopyList<Integer>());
//		ds.Analysis_add(new CopyList2<Integer>());
//		ds.Analysis_add(new CopyList3<Integer>());
//		ds.Analysis_add(new CopyList4<Integer>());
//		ds.Analysis_add(new CopyList5<Integer>());
//		ds.Analysis_add(new CopyList6<Integer>());
//		ds.Analysis_add(new CopyList7<Integer>());
//		ds.Analysis_add(new CopyList8<Integer>());
//		ds.Analysis_add(new CopyList9<Integer>());
		
		
//		ds.Analysis_get(new LinkedList<Integer>());
//		ds.Analysis_get(new CopyList<Integer>());
//		ds.Analysis_get(new CopyList2<Integer>());
//		ds.Analysis_get(new CopyList3<Integer>());
//		ds.Analysis_get(new CopyList4<Integer>());
//		ds.Analysis_get(new CopyList5<Integer>());
//		ds.Analysis_get(new CopyList6<Integer>());
//		ds.Analysis_get(new CopyList7<Integer>());
//		ds.Analysis_get(new CopyList8<Integer>());
//		ds.Analysis_get(new CopyList9<Integer>());
		
//		ds.Analysis_SequentialGet(new LinkedList_sg<Integer>());
	}
}

abstract class Data_structure {
	
	int size = 100000;
	int[] array = new int[size];
	long start, end;
	
	public abstract void Analysis_add(List list);
	public abstract void Analysis_get(List list);
	public abstract void Analysis_SequentialGet(List list);
	
	public void Produce(List list) {
		for(int i=0; i<size; i++){
			list.add(i);
		}
	}
	
	public void Remote_control() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("실험번호 입력 : ");
		
		int a = scan.nextInt();
	}
	
	public static void Print_result(long start, long end, int a) {
		
		if(a == 1){
			System.out.println("데이터 add() 걸린 시간 : " + (end - start) + " ns");
		}
		else if(a == 2){
			System.out.println("데이터 get() 걸린 시간 : " + (end - start) + " ns");
		}
		else if(a == 3){
			System.out.println("데이터 SequentialGet() 걸린 시간 : " + (end - start) + " ns");
		}
		else{
			System.out.println("새로운 데이터 걸린 시간 : " + (end - start) + " ns");
		}
	}
}

class Team_analysis extends Data_structure {

	@Override
	public void Analysis_add(List list) {
		
		System.gc();
		
		Experiment_add(list);
	}
	
	@Override
	public void Analysis_get(List list) {
		
		System.gc();
		
//		Produce(list);
		Experiment_get(list);
	}

	@Override
	public void Analysis_SequentialGet(List list) {
		
		System.gc();
		
		Produce(list);
		Emperiment_SequentialGet(list);
	}

	public void Experiment_add(List list) {
		
		start = System.nanoTime();
		
		Produce(list);
		
		end = System.nanoTime();
		
		Print_result(start, end, 1);
		
	}

	public void Experiment_get(List list) {
		
		start = System.nanoTime();
		
		for(int i=0; i<size; i++){
			list.get(i);
		}
		
		end = System.nanoTime();
		
		Print_result(start, end, 2);
	}

	public void Emperiment_SequentialGet(List list) {
		
		start = System.nanoTime();
		
		for(int i=0; i<size; i++){
			((LinkedList_sg) list).SequentialGet();
		}
		
		end = System.nanoTime();
		
		Print_result(start, end, 3);
	}
}