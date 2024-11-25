class Block {
        int a, b, c;
        int v;

        public Block(int i, int j, int k) {
                a = i;
                b = j;
                c = k;
        v = a*b*c;
        }

        public boolean sameBlock(Block ob) {
                if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
                else return false;
        }

        public boolean sameV(Block ob) {
                if(ob.v == v) return true;
                else return false;
        }

}

class ByValue {
        void noChange( int i, int j) {
                i = i+j;
                j = -j;
        }
}

class ByRef{
        int a, b;
        ByRef(int i, int j){
                a = i;
                b = j;
        }
        void change(ByRef ob){
                ob.a = ob.a + ob.b;
                ob.b = -ob.b;
        }
}

class ErrorMsg{
	String[] msg = {
		"Ошибка вывода",
		"Ошибка ввода",
		"Переполнение диска",
		"Выход индекса за границы массива"
	};
	//пример возврата объекта в виде строки 
	String getErrorMsg(int i){
		if (i >= 0 & i < msg.length)
			return msg[i];
		else return "неизвестная ошибкакa"; 
	}
}

class Err{
	String msgs;
	int severity;
	Err(String m, int s){
		msgs = m;
		severity = s;
	}
}

class ErrorInfo{
	String[] msg = {
                "Ошибка вывода",
                "Ошибка ввода",
                "Переполнение диска",
                "Выход индекса за границы массива"
        };
	int[] howBad = {3,3,2,4};
	Err getErrorInfo(int i){
		if (i >= 0 & i < msg.length)
			return new Err(msg[i], howBad[i]);
		else
			return new Err("неизвестная ошшибка", 0);	
	}
}
class pr0004 {
        public static void main(String[] args) {
                Block ob1 = new Block(10,2,5);
                Block ob2 = new Block(10,2,5);
                Block ob3 = new Block(5,4,5);

                System.out.println("ob1 эквивалентен ob2 " + ob1.sameBlock(ob2));
                System.out.println("ob1 эквивалентен ob3 " + ob1.sameBlock(ob3));
                System.out.println("объем ob1 равен ob2 " + ob1.sameV(ob2));

                System.out.println();
                //пример передачи параметров по значению
                ByValue ob4 = new ByValue();
                int a = 15, b = 20;
                System.out.println("а и b перед вызовом метода noChange(): " + a + " " + b);
                ob4.noChange(a, b);
                System.out.println("а и b после вызовом метода noChange(): " + a + " " + b);
                //значения a и b после вызова метода noChange() не изменяются
                System.out.println();

                //пример передачи параметров по ссылке
                ByRef ob5 = new ByRef(15, 20);
                System.out.println("ob5.а и ob5.b перед вызовом метода change(): " + ob5.a + " " + ob5.b);
                ob5.change(ob5);
                System.out.println("ob5.а и ob5.b после вызовом метода change(): " + ob5.a + " " + ob5.b);
                //значения a и b внутри ob5 меняются методом change()
		
		System.out.println();
		ErrorMsg err = new ErrorMsg();

		System.out.println(err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(10));

		//демонстрация возврата методом объекта, сконструированного из строки и целого цисла
		
		ErrorInfo err2 = new ErrorInfo();
	       	Err e;
		e = err2.getErrorInfo(2);
		System.out.println(e.msgs + " уровень серьезности: " + e.severity);
		e = err2.getErrorInfo(10);
		System.out.println(e.msgs + " уровень серьезности: " + e.severity);
		
		

        }
}


