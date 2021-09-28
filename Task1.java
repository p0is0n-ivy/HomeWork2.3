package project3;

//Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
public class Task1<T> {
    private T a, b;
    private T[] nums;

    public Task1(T... nums) {
        this.nums = nums;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    public void changePlaces() {
        this.a = (T) this.nums[0];
        this.b = (T) this.nums[1];
        this.nums[0] = (T) this.b;
        this.nums[1] = (T) this.a;
        System.out.println(nums[0] + " " + nums[1]);
    }
}