class pr001 {
	public static void main(String args[]){
		System.out.println("Hell");
		//преобразование типов 
		
		//целые типы данных 
		byte b; //8 bit

		b = -128;
		b = 127;
		b = (byte)130;
		System.out.println(b);
		short sh; //16 bit
		sh = (short)65536;
		int intg; //32 bit
		long l; //64 bit
		intg = 2000000000;
		l = intg;
		intg = intg * intg;
		System.out.println(intg);
		l = l * l * l;
		System.out.println(l);

		//вещественные типы данных
		float f; //32 bit
		double dd; //64 bit

		//символьный тип данных
		char ch; //16 bit
		ch = 'A';
		ch++; ++ch;
		for (int i = 0; i < 68; i++)
			System.out.print(ch++ + " ");
		System.out.println();
	

		//логический тип
		boolean bool;
		bool = true;
		bool = false;
		
	}
	
}
