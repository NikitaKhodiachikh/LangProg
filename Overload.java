//демонстрация перегрузки методов
class Overl{
	int s;
	Overl(){
		System.out.println("внутри конструктора без параметров");
		s = 0;
	}
	Overl(int i){
		System.out.println("внутри конструктора с одним параметром: ");
		s = i;
	}
	Overl(double i){
                System.out.println("внутри конструктора с одним вещественным параметром: ");
                s = (int) i;
        }
    	Overl(int i, int j){
                System.out.println("внутри конструктора с двумя параметрами: ");
                s = i + j;
        }    	

	void ovlDemo(){
		System.out.println("выполнение метода бех параметров");

	}
	void ovlDemo(int a){
		System.out.println("один параметр типа int: " + a);
	}
	
	int ovlDemo(int a, int b){
		System.out.println("два параметра типа int: " + a + " " + b);
		return a + b;
	}
	
	double ovlDemo(double a, double b){
		System.out.println("два параметра типа double" + a + " " + b);
		return a + b;
	}

	void f(int x){
		System.out.println("внутри f(int): " + x);
	}

	void f(double x){
                System.out.println("внутри f(double): " + x);
        }

} 

class Summation{
	int sum;

	Summation(int num){
		sum = 0;
		for(int i = 1; i <= num; i++)
			sum += i;
	}
	
	Summation(Summation ob){
		sum = ob.sum;
	}
}

class Overload{
	public static void main(String[] args){
		Overl ob = new Overl();
		int resI;
		double resD;

		System.out.println();
		ob.ovlDemo();
		System.out.println();
		resI = ob.ovlDemo(3, 7);
		System.out.println("результат выполнения ob.ovlDemp(3,7): " + resI);
		System.out.println();
		ob.ovlDemo(6);
		System.out.println();
		resD = ob.ovlDemo(3.5, 8.5);
		System.out.println("результат выполнения ob.ovlDemp(3.5,8.5): " + resD);
		
		//автоматическое преоббразование типов при перегрузке
                System.out.println();
		int i = 10;
		double d = 99.6;
		byte b = 30;
		short s = 23;
		float f = 11.2f;
		ob.f(i);
		ob.f(d);
		ob.f(b);
		ob.f(s);
		ob.f(f);
		
		//демонстрация перегрузки конструкторов 
		System.out.println();
		Overl t1 = new Overl();
		Overl t2 = new Overl(3);
		Overl t3 = new Overl(4.5);
		Overl t4 = new Overl(5, 5);
		System.out.println("t1.s: " + t1.s);
		System.out.println("t2.s: " + t2.s);
		System.out.println("t3.s: " + t3.s);
		System.out.println("t4.s: " + t4.s);
		
		//демонстрация инициализации одного объекта на основе другого
		System.out.println();
		Summation s1 = new Summation(5);
		Summation s2 = new Summation(s1);
		System.out.println("s1.sum: " + s1.sum);
		System.out.println("s2.sum: " + s2.sum);


	}
}




