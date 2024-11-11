//пузырьковая сортировка
class Bubbles{
	public static void main(String[] args){
		int[] nums = {34, 353, 521, 24, -242, -10, 583, 32, 122, -44};
		int a, b, t, vnesh = 0, vnut = 0;
		int size;

		size = 10;

		//отображенеи исходного массива
		System.out.print("исходный массив: ");
		for (int i = 0; i < size; i++)
			System.out.print(" " + nums[i]);
		System.out.println();

		//сортировка
		for (a = 1; a < size; a++){
			System.out.println("Итерация " + a + "внешний цикл");
			vnesh++;
			for (b = size - 1; b >= a; b--){
				System.out.println("Итерация " + b + "внутрений цикл");
				vnut++;
				if (nums[b - 1] > nums[b]){
					t = nums[b - 1];
					nums[b - 1] = nums[b];
					nums[b] = t;
				}
			}
		}	
		//отображение отсортированного массива
		System.out.print("отсортированный массив: ");
		for (int i = 0; i < size; i++)
       	                System.out.print(" " + nums[i]);
		System.out.println("\nколичество внешних роходов: " + vnesh + "\nколичесво внутренних проходов: " + vnut);
		System.out.println();

	}
}
