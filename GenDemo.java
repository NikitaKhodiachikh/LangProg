//пример обощенного класса 
class Gen <T> {
	//объявление ссылки на объект обобщенного типа
	T ob;
	
	//конструктор
	Gen(T o){
		ob = o;
	}
	//методы для проверки инфоормации об объектах 
	T getOb(){
		return ob;
	}

	void showType(){
		System.out.println("тип Т: " + ob.getClass().getName());
	}
}
class GenDemo{
	public static void main(String[] args){
		//объявили переменную класса Gen
		Gen <Integer> iOb;
		//создаем объект 
		iOb = new Gen <Integer> (100);
		//ошибочное использование: 
		//iOb = new Gen <Integer> (100.0);

		iOb.showType();
		int v = iOb.getOb();
		System.out.println("значение v: " + v);
		System.out.println();
		
		//объявили переменную класса Gen
                Gen <Double> dOb;
                //создаем объект 
                dOb = new Gen <Double> (100.1);
                //ошибочное использование: 
                //iOb = new Gen <Integer> (100.0);

		dOb.showType();
                double x = dOb.getOb();
                System.out.println("значение x: " + x);
                System.out.println();


		//объявили переменную класса Gen
                Gen <String> sOb;
                //создаем объект 
                sOb = new Gen <String> ("строка");
                //ошибочное использование: 
                //iOb = new Gen <Integer> (100.0);

                sOb.showType();
                String s = sOb.getOb();
                System.out.println("значение s: " + s);
                System.out.println();
		
		//неверное присваивание невсовместимых объектов 
		//dOb = iOb;
		


	}

}
