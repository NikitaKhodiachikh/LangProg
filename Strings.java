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

	}

}
