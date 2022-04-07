import java.util.*;

public class ArrayListDemo {
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
	{
		ArrayList<T> newList = new ArrayList<T>();
		for (T element : list) {
			if (!newList.contains(element)) {
				newList.add(element);
			}
		}
		return newList;
	}
	public static void main(String args[])
	{
		ArrayList<Integer>
		list = new ArrayList<>(
				Arrays
				.asList(1,1,1,2,3,4,5,6,7,7,8,8,9));
		System.out.println("ArrayList with duplicates: "
				+ list);
		ArrayList<Integer>
		newList = removeDuplicates(list);
		System.out.println("ArrayList with duplicates removed: "
				+ newList);
	}
}