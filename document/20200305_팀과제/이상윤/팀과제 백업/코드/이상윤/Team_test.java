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
		
//		ds.Analysis_get(new LinkedList<Integer>());
//		ds.Analysis_get(new CopyList<Integer>());
//		ds.Analysis_get(new CopyList2<Integer>());
//		ds.Analysis_get(new CopyList3<Integer>());
//		ds.Analysis_get(new CopyList4<Integer>());
//		ds.Analysis_get(new CopyList5<Integer>());
		
		ds.Analysis_SequentialGet(new LinkedList_sg<Integer>());
	}
}

abstract class Data_structure {
	
	int a = 0;
	int size = 100000;
	int[] array = new int[size];
	
	public abstract void Analysis_add(List list);
	public abstract void Analysis_get(List list);
	public abstract void Analysis_SequentialGet(List list);
	
	public void Produce() {	
		for(int i=0; i<size; i++){
			array[i] = i;
		}
	}
	
	public void Produce(List list) {
		for(int i=0; i<size; i++){
			list.add(i);
		}
	}
	
	public void Remote_control() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("실험번호 입력 : ");
		
		a = scan.nextInt();
	}
	
	public static void Print_result(long start, long end, int a) {
		
		if(a == 1){
			System.out.println("가장 느린 데이터 add() 걸린 시간 : " + (end - start) + " ns");
		}
		else if(a == 2){
			System.out.println("중간 데이터 add() 걸린 시간 : " + (end - start) + " ns");
		}
		else if(a == 3){
			System.out.println("가장 빠른 데이터 add() 걸린 시간 : " + (end - start) + " ns");
		}
		else if(a == 10){
			System.out.println("데이터 get() 걸린 시간 : " + (end - start) + " ns");
		}
		else{
			System.out.println("데이터 SequentialGet() 걸린 시간 : " + (end - start) + " ns");
		}
	}
}

class Team_analysis extends Data_structure {

	@Override
	public void Analysis_add(List list) {
		
		System.gc();
		
		Produce();
		Remote_control();
		Experiment_add(list);
	}
	
	@Override
	public void Analysis_get(List list) {
		
		System.gc();
		
		Produce(list);
		Experiment_get(list);
	}
	

	@Override
	public void Analysis_SequentialGet(List list) {
		
		System.gc();
		
		Produce(list);
		Emperiment_SequentialGet(list);
	}

	public void Experiment_add(List list) {
		
		switch (a) {	
		case 1:	
			long start = System.nanoTime();
			
			for(Integer i : array){
				list.add(i, array[i]);
			}
			
			long end = System.nanoTime();
			
			Print_result(start, end, a);
			
			break;
			
		case 2:
			if(list instanceof LinkedList){
				start = System.nanoTime();
				
				for(int i=0; i<size/2; i++){
					((LinkedList) list).addFirst(array[(size/2) - i]);
				}
				for(int j=size/2; j<size; j++){
					((LinkedList) list).addLast(array[j]);
				}
				
				end = System.nanoTime();
				
				Print_result(start, end, a);
			}
			else if(list instanceof CopyList){
				start = System.nanoTime();
				
				for(int i=0; i<size/2; i++){
					((CopyList) list).addFirst(array[i]);
				}
				for(int i=size/2; i<size; i++){
					((CopyList) list).addLast(array[i]);
				}
				end = System.nanoTime();
				
				Print_result(start, end, a);
			}
			else if(list instanceof CopyList2){
				start = System.nanoTime();
				
				for(int i=0; i<size/2; i++){
					((CopyList2) list).addFirst(array[i]);
				}
				for(int i=size/2; i<size; i++){
					((CopyList2) list).addLast(array[i]);
				}
				
				end = System.nanoTime();
				
				Print_result(start, end, a);
			}
			else if(list instanceof CopyList3){
				start = System.nanoTime();
				
				for(int i=0; i<size/2; i++){
					((CopyList3) list).addFirst(array[i]);
				}
				for(int i=size/2; i<size; i++){
					((CopyList3) list).addLast(array[i]);
				}
				
				end = System.nanoTime();
				
				Print_result(start, end, a);
			}
			else if(list instanceof CopyList4){
				start = System.nanoTime();
				
				for(int i=0; i<size/2; i++){
					((CopyList4) list).addFirst(array[(size/2) - i]);
				}
				for(int i=size/2; i<size; i++){
					((CopyList4) list).addLast(array[i]);
				}
				
				end = System.nanoTime();
				
				Print_result(start, end, a);
			}
			else{
				start = System.nanoTime();
				
				for(int i=0; i<size/2; i++){
					((CopyList5) list).addFirst(array[i]);
				}
				for(int i=size/2; i<size; i++){
					((CopyList5) list).addLast(array[i]);
				}
				
				end = System.nanoTime();
				
				Print_result(start, end, a);
			}
			
			break;
			
		case 3:
			start = System.nanoTime();
			
			Produce(list);
			
			end = System.nanoTime();
			
			Print_result(start, end, a);
			
			break;
		}
	}

	public void Experiment_get(List list) {
		
		long start = System.nanoTime();
		
		for(int i=0; i<size; i++){
			list.get(i);
		}
		
		long end = System.nanoTime();
		
		Print_result(start, end, 10);
	}

	public void Emperiment_SequentialGet(List list) {
		
		long start = System.nanoTime();
		
		for(int i=0; i<size; i++){
			((LinkedList_sg) list).SequentialGet();
		}
		
		long end = System.nanoTime();
		
		Print_result(start, end, 11);
	}
}