package orgorg;

public class JavaPract {
 	public static void main(String[] args) {
	int ar[] = { 1, 2, 3, 4 };
		char charar[] = { 'a', 'b', 'c', 'd' };
		for (int i = charar.length - 1, j = 0; i >= 0 && j < ar.length; i--, j++) {

			System.out.print(charar[i] + "" + ar[j]);
		}
		System.out.println();
		int flag = 1;
		for (int k = 1; k < 5; k++) {
			for (int m = 1; m <= k; m++) {
				System.out.print(flag);
				flag++;
			}
			System.out.println();
		}
		int search = 13;
		int barr[] = { 5, 7, 8, 12, 13, 15, 19, 22, 25 };
		int high = barr.length - 1;
		int lower = 0;
		int middle = high + lower / 2;
		for (int i = 0; i < barr.length - 1; i++) {
			if (search == barr[middle]) {
				System.out.println("Element found " + search + " at index " + middle);
				break;
			} else if (search > barr[middle]) {

				middle = (middle + high) / 2;

			} else {
				middle = (lower + middle) / 2;

			}
		}
		int arrayList[] = { 1, 2, 7, 4, 3,6 };
		int n = arrayList.length + 1;
		System.out.println(n*(n+1));
		int maxSum = (n * (n + 1)) / 2;
		int sum = 0;
		for (int k = 0; k < arrayList.length; k++) {
			sum += arrayList[k];
		}
		int missingNum = maxSum-sum;
		System.out.println(missingNum);
		int aa[] = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 };

		int register[] = new int[aa.length];
		for (int i : aa) {
			register[i] = 1;
		}
		for (int l = 0; l < register.length; l++) {
			if (register[l] == 0) {
				System.out.println(l);
			}
		}
		String str="#!#!@#!@#Ankit1231654Mittal";
		String news=str.replaceAll("[^A-Za-z]", "");
		System.out.println(news);
		
		A a= new B();
		A superA = new A();
		B b=new B();
		a.care();
		a.display();
		superA.care();
		superA.display();
		b.care();
		b.display();
		
	}
}
