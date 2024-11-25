class Factorial{
	//рекурсивный метод
	int factR(int n){
		int result;
		
		if(n == 1)
			return 1;
		result = factR(n-1) * n;
		return result;
	}
	//итеративный метод
	int factI(int n){
		int t, result;
		result = 1;
		for(t = 1; t <= n; t++)
			result *= t;
		return result;
	}

}
//примеры испольхования статических переменных и методов

class StaticDemo{
	int x;
	static int y;

	int sum(){
		return x + y;
	}
}
class StaticMeth{
	static int val = 1024;
	static int valDiv2(){
		return val / 2;
	} 
}

class StaticBlock{
	static double rootOf2;
	static double rootOf3;

	static{
		System.out.println("внтри статического блока");
		rootOf2 = Math.sqrt(2.0);
		rootOf3 = Math.sqrt(3.0);
	}
	StaticBlock(String msg){
		System.out.println(msg);	
	}
}

class Recurtion{
	public static void main(String[] args){
		Factorial f = new Factorial();

		System.out.println("вычисленеи факториала рекурсивным методом: ");
		System.out.println("факториал 3 равен: " + f.factR(3));
		System.out.println("факториал 4 равен: " + f.factR(4));
		System.out.println("факториал 5 равен: " + f.factR(5));
		System.out.println();
		System.out.println("вычисленеи факториала итеративным методом: ");
		System.out.println("факториал 3 равен: " + f.factI(3));
                System.out.println("факториал 4 равен: " + f.factI(4));
                System.out.println("факториал 5 равен: " + f.factI(5));
                System.out.println();
		
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();

		ob1.x = 10;
		ob2.x = 20;

		System.out.println("переменные ob1.x и ob2.x независимы");
		System.out.println("ob1: " + ob1.x + "\nob2: " + ob2.x);
		System.out.println();
		//объекты используют одну копию статической переменной
		System.out.println("статическая переменная Y является общей");
		StaticDemo.y = 19;
		System.out.println("значение staticDemo.y равно 19");
		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();

		StaticDemo.y = 190;
                System.out.println("значение staticDemo.y равно 19");
                System.out.println("ob1.sum(): " + ob1.sum());
                System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();
		
		//демонстрация вызова статического метода
		System.out.println("vaal: " + StaticMeth.val); 
		System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());

		StaticMeth.val = 2;
		System.out.println("vaal: " + StaticMeth.val);
                System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
		System.out.println();
		
		//демонстрация вызова статического блока
		StaticBlock ob = new StaticBlock("внутри конструктора");
		System.out.println("квадратный ккорень из 2: " + StaticBlock.rootOf2);
		System.out.println("квадратный ккорень из 3: " + StaticBlock.rootOf3);
		

		


	}
}
