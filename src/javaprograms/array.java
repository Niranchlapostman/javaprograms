package javaprograms;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[]= {1,2,3,4,5};
		int array2[]= {1,2,3,4,5};
		int i ,j,sum=0;
		for (i=0;i<array1.length;i++)
		{
			for (j=0;j<array2.length;j++)
			{
				sum=array1[i]+array2[i];
			}
		
	
		}
		
		System.out.println(sum);
		

	}

}
