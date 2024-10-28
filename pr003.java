class Cars{
	int pass; //количество пассажиров
	int volume; //объем топ.бака
	double fuel; //расход топлива на 100 
        
	void range(){
		System.out.println("расстояние на полном баке: " + (volume / fuel * 100)); 
	}
	double range2(){
		return volume / fuel * 100;
	}
	double range3(int x){
                return x / fuel * 100;
        }

	
}

class pr003{
	public static void main(String[] args){
		Cars BMW = new Cars();
		BMW.pass = 2;
		BMW.volume = 55;
		BMW.fuel = 20.0;
		Cars Honda = new Cars();
		Honda.pass = 5;
		Honda.volume = 40;
		Honda.fuel = 15.5;

		System.out.println("Параметры БЭХИ: ");
		System.out.println("кол-во пассажиров: " + BMW.pass + "объем бака: " + BMW.volume + "расход на 100 км: " + BMW.fuel);

		System.out.println("Параметры Хонды: ");
                System.out.println("кол-во пассажиров: " + Honda.pass + "объем бака: " + Honda.volume + "расход на 100 км: " + Honda.fuel);
	
		//double range;
		//range = BMW.volume / BMW.fuel * 100;
		System.out.println("БЭХА проедет ");
		BMW.range();
		System.out.println("BMW: " + BMW.range2());

		//range = Honda.volume / Honda.fuel * 100;
		System.out.println("Хонда проедет ");
		Honda.range();
		System.out.println("Honda: " + Honda.range3(15));
	}

}

