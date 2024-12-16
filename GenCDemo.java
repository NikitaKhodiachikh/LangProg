class Summ{
	private int sum;
	<T extends Number> Summ(T arg){
		sum = 0;
		for(int i = 0; i <= arg.intValue(); i++)
			sum += i;
	}
	int getSum(){
		return sum;
	}

}

class GenCDemo{
	public static void main(String[] args){
		Summ ob = new Summ(4);
		System.out.println("сумма целых чисел от 0 до 4: " + ob.getSum());
	}
}
