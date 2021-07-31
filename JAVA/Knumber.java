package practice;

import java.util.Arrays;

public class Knumber {
	
	public static int[] solution(int[] array, int[][] commands) {
        
		int[] answer = new int[commands.length];
        int i; int j; int k;
        
        for(int a=0;a<commands.length;a++) {
        	i = commands[a][0];
        	j = commands[a][1];
        	k = commands[a][2];
        	
        	int[] tempArray = sliceArray(i, j, array);
        	System.out.println("i="+i+" j="+j+" k="+k);
        	System.out.println("slice = "+Arrays.toString(tempArray));
        	
        	tempArray = sortArray(tempArray);
        	
        	System.out.println("sort = "+Arrays.toString(tempArray));
        	System.out.println(tempArray[k-1]);
        	
        	answer[a] = tempArray[k-1];
        }
        
        return answer;
    }
	
	public static int[] sliceArray(int i, int j, int[] array){
		
		int[] tempSlice = new int[j-i+1];
		int index = 0;
		
		for(int a=i-1;a<j;a++) {
			tempSlice[index] = array[a];
			index++;
		}
		
		return tempSlice;
	}
	
	public static int[] sortArray(int[] array) {
		int tempIndex = 0;
		int tempVal = 0;
		
		for(int a=0;a<array.length;a++) {
			int min = array[a];
			
			for(int b=a;b<array.length;b++) {
				if(min >= array[b]) {
					tempIndex = b;
					min=array[b];
				}
			}
			tempVal = array[tempIndex];
			array[tempIndex] = array[a];
			array[a] = tempVal;
			System.out.println("정렬"+a+" : "+Arrays.toString(array));
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		System.out.println(Arrays.toString(solution(array, commands)));

	}

}
