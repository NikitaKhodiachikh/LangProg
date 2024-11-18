import java.util.Random;
class Bits{
        public static void main(String[] args){
                //сброс 6-го бита - изменение регистра латиницы
		char ch;
                System.out.println("преобразование букв из ниженего регистра в верхний");
                for (int i = 0; i < 26; i++){
                        ch = (char) ('a' + i);
                        System.out.print(ch);
			ch = (char) ((int) ch & 65503);
			System.out.print(ch + " ");
			
                }
		//отображение числа в двоичной форме
		System.out.println();
		int t;
		byte val;
		val = 2;
		for (t = 128; t > 0; t = t / 2){
			if ((val&t) != 0) 
				System.out.print("1 ");
			else System.out.print("0 ");
		}
		System.out.println();

		//преобразование букв из верхнего регистра в нижний
		System.out.println("преобразование букв из верхнего регистра в нижний");
                for (int i = 0; i < 26; i++){
                        ch = (char) ('A' + i);
                        System.out.print(ch);
                        ch = (char) ((int) ch | 32);
                        System.out.print(ch + " ");

                }
		System.out.println();

		//шифрование сообщения при помощи операции "исключающее ИЛИ"
		String msg = "Незашифрованная строка";
		String encmsg = "";
		String decmsg = "";
		Random rand = new Random();
		int key = rand.nextInt(585);
		
		
		System.out.println("исходное сообщение: " + msg);
		
		//шифрование;
		for (int i = 0; i < msg.length(); i++)
			encmsg = encmsg + (char) (msg.charAt(i)^key);
		System.out.println("закодированное сообщение: " + encmsg);

		//расшифровкка
		for (int i = 0; i < msg.length(); i++)
                        decmsg = decmsg + (char) (encmsg.charAt(i)^key);
		System.out.println("декодированное сообщение: " + decmsg);
		System.out.println();
	
		//операция "побитовое НЕ"
		byte b = -34;
		for (int t2 = 128; t2 > 0; t2 = t2 / 2){
			if ((b&t2) != 0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		System.out.println();

		b = (byte) ~b;
		for (int t2 = 128; t2 > 0; t2 = t2 / 2){
                        if ((b&t2) != 0)
                                System.out.print("1 ");
                        else
                                System.out.print("0 ");
                }
		System.out.println("\n");

		//побитовый сдвиг
		int val2 = 1;
		for(int i = 0; i < 7; i++){
			for (int t2 = 128; t2 > 0; t2 = t2 / 2){
                        	if ((val2&t2) != 0)
                                	System.out.print("1 ");
                        	else
                                	System.out.print("0 ");
                	}
                System.out.println();
		val2 = val2 << 1; //сдвиг влево
		}
		for(int i = 0; i < 8; i++){
                        for (int t2 = 128; t2 > 0; t2 = t2 / 2){
                                if ((val2&t2) != 0)
                                        System.out.print("1 ");
                                else
                                        System.out.print("0 ");
                        }
                System.out.println();
                val2 = val2 >> 1; //сдвиг вправо
                }
		

        }

}

