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
		for (int i = 1; i < nums.length; i++){
			if (nums[i] < min) min = nums[i];
			if (nums[i] > max) max = nums[i];
		}
		System.out.println("Минимальное значение: " + min + "\nМаксимальное значение: " + max);
		System.out.println();

		//альткрнативная форсма инициализации массива:
		int x = 10;
		int[] nums1 = {32, 234, 5376, -45, 56, -7856, 98, 1, -2, 2456, x};
		min = max = nums1[0];
		for (int i = 1; i < nums1.length; i++){
                        if (nums1[i] < min) min = nums1[i];
                        if (nums1[i] > max) max = nums1[i];
                }
                System.out.println("Минимальное значение: " + min + "\nМаксимальное значение: " + max);
                System.out.println();

		//двумерные массивы
		int t, j;
		int [][] table = new int[3][4];
	       	for (t = 0; t < 3; t++){
			for (j = 0; j < 4; j++){
				table[t][j] = (t * 4) + j + 1;
				System.out.print(table[t][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		//непрямоуголные массивы
		int [][] riders = new int[7][];
		riders[0] = new int[10];
		riders[1] = new int[10];
		riders[2] = new int[10];
		riders[3] = new int[10];
		riders[4] = new int[10];
		riders[5] = new int[2];
		riders[6] = new int[2];

		for (int i = 0; i < 5; i++)
			for (int k = 0; k < 10; k++)
				riders[i][k] = i + k + 10;
		for (int i = 5; i < 7; i++)
			for (int k = 0; k < 2; k++)
				riders[i][k] = i + k + 10;
		//вывод массива
		System.out.println("перевезено пассажиров  в будние дни: ");
		for (int i = 0; i < 5; i++){
                        for (int k = 0; k < 10; k++)
                                System.out.print(riders[i][k] + " ");
			System.out.println();
		}
		System.out.println();
		System.out.println("перевезено пассажиров  в выходные дни: ");
		for (int i = 5; i < 7; i++){
                        for (int k = 0; k < 2; k++)
                                System.out.print(riders[i][k] + " ");
			System.out.println();
		}
		System.out.println();

		//инициализация двумерного массива
		int[][] sqrt = {
			{1, 1},
			{2, 4},
			{3, 9},
			{4, 16},
			{5, 25},
			{6, 36},
			{7, 49},
			{8, 64},
			{9, 81},
			{10, 100}
		};
		System.out.println("содержимое двумерного массива sqrt: ");
                for (int i = 0; i < 10; i++){
                        for (int k = 0; k < 2; k++)
                                System.out.print(sqrt[i][k] + "\t");
                        System.out.println();
                }
		//объъвление массива: int[] nums = new nums[3]
		//альтернативный способ объявление массива: int nums[] = new nums[3]

		System.out.println();
		//ссылочный переменные, указывающие на массивы
		int[] nums2 = new int[10];
		int[] nums3 = new int[10];

		for (int i =0; i < 10; i++){
			nums2[i] = i;
                        nums3[i] = -i;
		}
		System.out.print("массив nums2: ");
		for (int i = 0; i < 10; i++)
                        System.out.print(nums2[i] + " ");
		System.out.println();

		System.out.print("массив nums3: ");
                for (int i = 0; i < 10; i++)
                        System.out.print(nums3[i] + " ");
                System.out.println();
		
		nums2[3] = 99;

		System.out.println("nums2 и nums3 независимы. Изменяется значения только у nums2[] ");
		System.out.print("Массив nums2: ");
		for(int i =0; i<10; i++)
			System.out.print(nums2[i] + " ");
		System.out.println();

		System.out.print("Массив nums3: ");
		for(int i =0; i<10; i++)
			System.out.print(nums3[i] + " ");
		System.out.println();

		System.out.println("Выполянем присвоение nums3 = nums2");
		nums3=nums2;
		

		nums3[3] = -99;

                System.out.println("nums2 и nums3 независимы. Изменяется значения только у nums2[] ");
                System.out.print("Массив nums2: ");
                for(int i =0; i<10; i++)
                        System.out.print(nums2[i] + " ");
                System.out.println();

                System.out.print("Массив nums3: ");
                for(int i =0; i<10; i++)
                        System.out.print(nums3[i] + " ");
                System.out.println();


		System.out.println();
		//переменная экземпляра length
		int[] list = new int[10];
		int[] nums4 = {1,2,3};
		int[][] table1 = {
			{1,2,3},
			{4,5},
			{6,7,8,9}
		};
		System.out.println("длтна list: " + list.length);
		System.out.println("длтна nums4: " + nums4.length);
		System.out.println("длтна table1: " + table1.length);
		System.out.println("длтна ttable1[0]: " + table1[0].length);
		System.out.println("длтна table1[1]: " + table1[1].length);
		System.out.println("длтна table1[2]: " + table1[2].length);

		//цикл for-each 
		System.out.println();
		int[] nums5 = {1,2,3,4,5,6,7,8,9,10,11,12};
		int sum = 0;
		for (int x1 : nums5){
			System.out.println("значение: " + x1);
		       	sum += x1;
			if (x1 == 5)
				break;	
		}
		System.out.println("сумма первых пяти элементов массива nums5: " + sum);
		
		System.out.println();
		//подсчет суммы элементов в двумерном массиве
		int sum1 = 0;
		int[][] nums6 = new int[3][5];

		for (int i = 0; i < 3; i++)
			for (int j1 = 0; j1 < 5; j1++)
				nums6[i][j1] = (i+1)*(j1+1);
			
		
		//выводим элементы массива и считаем сумму
		for (int[] x1 : nums6)
			for(int y : x1){
				System.out.println("значение: " + y);
				sum1 += y;
			}
		System.out.println("сумма: " + sum1);
		
		System.out.println();

		//поисккк при помощи цикла "for-each"
		int val = 9;
		boolean found = false;

		for (int x1 : nums5){
			if (x1 == val){
				found = true;
				break;
			}
		
		}
		if(found)
			System.out.println("значение " + val + " найдено");
		else
			System.out.println("значение " + val + " не найдено");


	}	

}
