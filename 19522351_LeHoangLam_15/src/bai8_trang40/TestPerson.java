package bai8_trang40;

import java.util.ArrayList;

public class TestPerson {

	public static void main(String[] args) {
		// Tạo danh sách người
        ArrayList<Person> People = new ArrayList<Person>();

        // Thêm các người vào danh sách
        People.add(new Person("Nguyen Van A", "123 Nguyễn Văn Linh, Quận 7, TP. HCM"));
        People.add(new Person("Tran Thi B", "456 Lê Văn Việt, Quận 9, TP. HCM"));
        People.add(new Person("Pham Van C", "789 Quang Trung, Quận Gò Vấp, TP. HCM"));

        // In ra danh sách người
        System.out.println("Danh sách người:");
        for (Person Person : People) {
            System.out.println(Person);
        }

        // Xóa người đầu tiên khỏi danh sách
        People.remove(0);

        // In ra danh sách người sau khi xóa
        System.out.println("\nDanh sách người sau khi xóa:");
        for (Person Person : People) {
            System.out.println(Person);
        }

        // Sắp xếp danh sách người theo thứ tự tên
        sortByName(People);

        // In ra danh sách người sau khi sắp xếp
        System.out.println("\nDanh sách người sau khi sắp xếp theo tên:");
        for (Person Person : People) {
            System.out.println(Person);
        }

	}

	private static void sortByName(ArrayList<Person> people) {
		// TODO Auto-generated method stub
		
	}

}
