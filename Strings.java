class Strings{
	public static void main(String[] args){
		String str = new String("строка номер один");
		String str2 = new String(str);
		String str3 = "строка номер три";

		System.out.println(str + " " + str2 + " " + str3);

		//методы работающие со стоками
		//1. проверка на эквивалентность boolean equals(str)
		boolean eq;
		eq = str.equals(str2);
		System.out.println("строки str и str2 эквивалентны: " + eq);
		eq = str.equals(str3);
                System.out.println("строки str и str2 эквивалентны: " + eq);

		//2. метод определения длины строки: int length()
		int length = str.length();
		System.out.println("длина строкм str: " + length);

		//3. извлечение символа по индексу: charAt(index)
		char ch;
		ch = str.charAt(3);
		System.out.println("в строкек str символ под индексом 3: " + ch);
		for (int i = 0; i < str.length(); i++)
			System.out.print(str.charAt(i));
		System.out.println();
		
		System.out.println();
		//4. сравнение строк 
		int result;

		result = str.compareTo(str2);
                System.out.println("результат сравнения строк str и sttr2: " + result);
		result = str.compareTo(str3);
		System.out.println("результат сравнения строк str и sttr3: " + result);

		System.out.println();
		//5. поиск подстроки и вывод индекса по первому вхождению поодстроки 
		str3 = "од";
		result = str.indexOf(str3);
		System.out.println("первое вхождение подстроки \"од\" в str: " + result);
		
		System.out.println();
                //6. поиск подстроки и вывод индекса по первому вхождению поодстроки
		str3 = "н";
	        result = str.lastIndexOf(str3);
                System.out.println("последнее вхождение подстроки \"н\" в str: " + result);	
		
		//массивы строк
		System.out.println();
		String[] strs = {"Разные", "элементы", "массива", "строк", str};
		System.out.println("Исходный массив ");
		for (String s : strs)
			System.out.print(s + " ");
		System.out.println("\n");
		strs[1] = "измененные элементы";	
		strs[4] = "Новая строка один";
		System.out.println("Изменненый массив ");
                for (String s : strs)
                        System.out.print(s + " ");
                System.out.println("\n");

		//создание подстроки
		String substr;
		System.out.println("выделяем подстроку из строки str:");
		substr = str.substring(13, 17);
		System.out.println("оригинальная строка: " + str);
		System.out.println("подстрока: " + substr);

		//управление оператором switch при помощи строк
		String command = "cancel";
		switch(command){
			case "connect":
				System.out.println("подключение");
				break;
			case "cancel":
				System.out.println("отмена");
                                break;
			case "disconnect":
				System.out.println("отключение");
                                break;
			default:
			System.out.println("неизвестная команда");
                        break;
		}

		System.out.println();

		//текстовые блоки
		String strblk = """
			Пример блока с 
		       	естандартным форматированием 
	       		строк	       
				Можно пользоваться переносом строки, табуляцией и прочими управляющими символами	
			""";

		System.out.println(strblk);
		

		//аргументы командной строки
		System.out.println("Количество параметров, переданных программе: " + args.length);
		System.out.println("Список параметров : ");
		for (int i = 0; i < args.length; i++) {
			System.out.println("Аругмент [" + i +"]: " + args[i]);
		}
		System.out.println();

		String[][] phoneNumbers = {
			{"сто", "383-262-25-01"},
			{"деканат", "244-85-10"},
			{"поликлиника", "206-08-11"},
			{"сантехник", "353-01-02"}
		};
		int i2;
		if (args.length != 1)
			System.out.println("Usage: java Strings <наименование>");
		else{
			for ( i2 = 0; i2 < phoneNumbers.length; i2++){
				if (phoneNumbers[i2][0].equals(args[0])){
					System.out.println(phoneNumbers[i2][0] + ": " + phoneNumbers[i2][1]);
				}

			}
			if (i2 == phoneNumbers.length)
				System.out.println("ничего не найдено");
		}
	}


}
