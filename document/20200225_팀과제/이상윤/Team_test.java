package assignment;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Team_test {

	public static void main(String[] args) {
		
		Data_structure ds = new Team_analysis();
		
		ds.analysis(new LinkedList<Integer>());
	}
}

abstract class Data_structure {
	
	int size = 100000;
	int[] array = new int[size];
	
	public abstract void analysis(LinkedList<Integer> list);
	
	public void Produce() {
		
		for(int i=0; i<size; i++){
			array[i] = i;
		}
	}
	
	public static void Print_result(long start, long end, int a) {
		
		if(a == 1){
			System.out.println("가장 느린 데이터 넣기 걸린 시간 : " + (end - start) + " ns");
		}
		else if(a == 2){
			System.out.println("중간 데이터 넣기 걸린 시간 : " + (end - start) + " ns");
		}
		else{
			System.out.println("가장 빠른 데이터 넣기 걸린 시간 : " + (end - start) + " ns");
		}
	}
}

class Team_analysis extends Data_structure {

	@Override
	public void analysis(LinkedList<Integer> list) {
		
		System.gc();
		Produce();
		Experiment(list);
	}
	
	public void Experiment(LinkedList<Integer> list) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("실험번호 입력 : ");
		
		int a = scan.nextInt();
		
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
			start = System.nanoTime();
			
			for(int i=0; i<size/2; i++){
				list.addFirst(array[i]);
			}
			for(int i=size/2; i<size; i++){
				list.addLast(array[size-i]);
			}
			
			end = System.nanoTime();
			
			Print_result(start, end, a);
			
			break;
			
		case 3:
			start = System.nanoTime();
			
			for(int i=0; i<size; i++){
				list.add(i);
			}
			
			end = System.nanoTime();
			
			Print_result(start, end, a);
			
			break;
		}
	}
}