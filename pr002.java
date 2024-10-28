class pr002{
	//пример функции
	static int func1(){
		return 0;
	}

	public static void main(String args[])
			throws java.io.IOException {
		int intg = 10, intgr = 10;
	/*	char ch, answer = 'R';
		System.out.println("попробуйте угадать букву алфавита: ");
		ch = (char) System.in.read();
		if (ch == answer)
			System.out.println("угадали букву!!!!!!!!!!!!!!!!!");
		else {
			System.out.print("нужная буква по алфовиту ");
			if (ch < answer)
				System.out.println("выше, чем набранная");
			else
				System.out.println("ниже, чем указанная");
			
		}
		*/
		boolean bool = true;
		
		//int i;
		for (int i = 0; i < 10; i++)
			switch (i){
				case 0:
					System.out.println("i = 0");
					break;
				case 1:
                                        System.out.println("i = 1");
                                        break;
				case 2:
                                        System.out.println("i = 2");
                                        break;
				case 3:
                                        System.out.println("i = 3");
                                        break;
				case 4:
                                        System.out.println("i = 4");
                                        break;
				default:
					System.out.println("i = 5 или больше 5");

			}
		if (!bool)
			System.out.println("bool равен true");
		else
			System.out.println("bool равен false");

		System.out.println("\n");
		//оператор for

		for (int i = 0, j = 10; i < j; i++, j--)
			System.out.println("i и j: " + i + " " + j);
		
		for (int i = 0; i < 10;){
			System.out.println("Проход №" + i);
			i++;
		}
		

		//бесконечный цикл
		//for (;;);

		int sum = 0;
		for (int i = 1; i <= 5; sum += i++);
		System.out.println("\nсумма = " + sum);

		System.out.println("\n");

		//цикл while
		char ch1 = 'a';
		while (ch1 <= 'z'){
			System.out.print(ch1 + " ");
			ch1++;
		}
		System.out.println();
		System.out.println(((int) 'е') + " " + ((int) 'ё'));

		System.out.println("\n");
		//цикл do while
		/*char ch2;
		do {
			System.out.println("введите символ и нажмите Enter: ");
			ch2 = (char) System.in.read();
		} while (ch2 != 'q');*/
		//пример вывхова функции
		int ewsult = func1();
		
		System.out.println();
		//оператор break
		for (int i = 0; i < 100; i++){
			System.out.println("значение i: " + i);
			if (i == 5)
				break;
			System.out.println("следующая итерация");
		}

		System.out.println();
		//вложенный цикл в break
		for ( int i = 0; i < 3; i++){
			System.out.println("счетчик внешнего цикла:" + i);
			System.out.print("  счетчик внутреннего цикла: ");
			int t = 0;
			while (t < 100){
				if (t == 10)
					break;
				System.out.println(t + " ");
				t++;
			}
			System.out.println();
		}

		//использование break с меткой
		System.out.println();
		int i2;
		for (i2 = 1; i2 < 4; i2++){
one:		  {  
two:			{	
three:				{
					System.out.println("\ni2 равно " + i2);
					if (i2 == 1) break one;
					if (i2 == 2) break two;
					if (i2 == 3) break three;

					System.out.println("не выполняется");
				}
				System.out.println("после блока three");
			}
			System.out.println("после блока two");			
		  }			
		  System.out.println("после блока one");
		}
		System.out.println("после цикла for");
		

		//еще один пример break с меткой 
		System.out.println();
done:
		for (int i = 0; i < 10; i++){
			for (int j = 0; j < 10; j++){
				for (int k = 0; k < 10; k++){
					System.out.println(k + " ");
					if (k == 5) break done;
				}
				System.out.println("после цикла k");
			}
			System.out.println("псоле цикла j");
		}
		System.out.println("после цикла i\n");


		//оператор continue
		for (int i = 0; i <= 100; i++){
			if ((i % 2) != 0)
				continue;
			System.out.println(i);
		}
outerloop:
		for (int i = 1; i < 10; i++){
			System.out.println("\nпроход внешнего цикла №" + i + ", внетренний цикл: ");
			for (int j = 1; j < 10; j++){
				if (j == 5) continue outerloop;
				System.out.println(j);
			}
		}
		System.out.println();
	}


}






