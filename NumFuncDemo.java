class NumFunc<T extends Number>{
	T num;

	NumFunc(T n){
		num = n;
	}

	double reciprocal(){
		return 1 / num.doubleValue();
	}

	double fraction(){
		return num.doubleValue() - num.intValue();
	}

	boolean absEqual(NumFunc<?> ob){
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
}


/*
 *можно ограничивать классы родственными связями:
 class Pair<T, V extends T>{
 .....
 }
 */
class NumFuncDemo{
	public static void main(String[] args){
		//NumFunc Ob;
		NumFunc<Integer> iOb;
			
		iOb = new NumFunc<>(5);
		//Ob = iOb;

		System.out.println("обратная величина iOb: " + iOb.reciprocal());
		System.out.println("дробная чать  iOb: " + iOb.fraction());

		NumFunc<Double> dOb = new NumFunc<>(52.5);
		//Ob = dOb;
		
		System.out.println("обратная величина dOb: " + dOb.reciprocal());
                System.out.println("дробная чать  dOb: " + dOb.fraction());

		//нарушение ограничений на обощенный тип
		//NumFunc<String> sOb = new NumFunc<>("строка");

		NumFunc<Integer> intOb = new NumFunc<>(7);
		NumFunc<Double> doOb = new NumFunc<>(7.0);

		if(intOb.absEqual(doOb))
			System.out.println("модули чисел равны");
		else 
			System.out.println("модули чисе не равны");
	

	}
}
