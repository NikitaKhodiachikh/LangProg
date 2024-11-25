class Queue{
	private char[] q;
	private int putloc, getloc; //указатели на индекс помещение и извлечение символов
	//создается пустая очередь заданного размера
	Queue(int size){
		q = new char[size]; //выделяем память под очередь нужного размера
		putloc = getloc = 0;
	}
	//Создается очередь на осноове другогоо объекта
	
	Queue(Queue ob){
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		//копирование элементов массива
		for(int i = getloc; i < putloc; i++)
			q[i] = ob.q[i];
	}
	//создание очереди с начальными значениями на основе массива
	Queue(char[] a){
		putloc = 0;
		getloc = 0;
		q = new char[a.length];
		for(int i = 0; i < a.length; i++)
			put(a[i]);
	}

	//метод для помещения символа в очередь 
	void put(char ch){
		if (putloc == q.length){
			System.out.println(" - очередь переполнена");
			return;
		}
		q[putloc++] = ch;
	}
	//метод для извлечения символа их очереди
	char get(){
		if (getloc == putloc){
			System.out.println(" - очередь пуста");
			return (char)0;
		}
		return q[getloc++];
	}

}
class QDemo{
	public static void main(String[] args){
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.println("Сохраняем алфавит в очередь bigQ");
		for (i = 0; i < 26; i++)
			bigQ.put((char) ('A' + i));

		System.out.print("содержимое очереди bigQ: ");
		for (i = 0; i < 26; i++){
                        ch = bigQ.get();
			if (ch != (char)0)
				System.out.print(ch);
		}
		System.out.println("\n");
		System.out.println("Сохраняем алфавит в очередь smallQ");
                for (i = 0; i < 5; i++){
			System.out.print("попытка сохранения " + (char) ('Z' - i));
                        smallQ.put((char) ('Z' - i));
			System.out.println();
	
		}
		System.out.println();
		System.out.println("извлекаем символы из очереди smallQ");
		for (i = 0; i < 5; i++){
                        ch = smallQ.get();
                        if (ch != (char)0)
                               System.out.print(ch);
       	        }
		System.out.println();
		//попытка доступа к закрытым переменным класса Queue
		//bigQ.q[3] = 343;
		//bigQ.putloc = 3
			
		Queue q1 = new Queue(10);
		char[] chars = {'A','B','C'};
		//создание очереди на базе массива
		Queue q2= new Queue(chars);
		for(i = 0; i < 10; i++)
			q1.put((char) ('D' + i));
		//создание очереди на базе другой очереди
		Queue q3 = new Queue(q1);

		System.out.println("очередь q1: ");
		for(i = 0; i < 10; i++){
			ch = q1.get();
			System.out.print(ch);
		}
		System.out.println("\n");


		System.out.println("очередь q2: ");
                for(i = 0; i < 3; i++){
                        ch = q2.get();
                        System.out.print(ch);
                }
		System.out.println("\n");


                System.out.println("очередь q3: ");
                for(i = 0; i < 10; i++){
                        ch = q3.get();
                        System.out.print(ch);
                }



	}
}
