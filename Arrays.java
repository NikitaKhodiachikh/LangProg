//работа с массивами 
class Arrays {
	public static void main (String[] args){
		int [] nums = new int [10];
		//заполнение массива значениями 
		for (int i = 0; i < 10; i++)
			nums[i] = i;
			//вывод содержимого массива 
		for (int i = 0; i < 10; i++)
			System.out.println("элемента nums[" + i + "] :" + nums[i]);
		System.out.println();
	
		//ввод каждого элемента массива "вручную"
		nums[0] = 32;
		nums[1] = 234;
		nums[2] = 5376;
		nums[3] = -45;
		nums[4] = 56;
		nums[5] = -7856;
		nums[6] = 98;
		nums[7] = 1;
		nums[8] = -2;
		nums[9] = 2456;

		//находим максимольное и минимально значение в массив
		int min, max;
		min = max = nums[0];
		for (int i = 1; i < 10; i++){
			if (nums[i] < min) min = nums[i];
			if (nums[i] > max) max = nums[i];
		}
		System.out.println("Минимальное значение: " + min + "\nМаксимальное значение: " + max);
		System.out.println();

		//альткрнативная форсма инициализации массива:
		int x = 10;
		int[] nums1 = {32, 234, 5376, -45, 56, -7856, 98, 1, -2, 2456, x};
		min = max = nums1[0];
		for (int i = 1; i < 10; i++){
                        if (nums1[i] < min) min = nums1[i];
                        if (nums1[i] > max) max = nums1[i];
                }
                System.out.println("Минимальное значение: " + min + "\nМаксимальное значение: " + max);
                System.out.println();
	}
}
