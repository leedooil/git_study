package day40;

import java.util.*;

public class PhoneBookMain {
	static HashMap<String,String>hm=new HashMap<String,String>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int choice;
		while(true) {
			System.out.println("�١ڡ١ڡ١���ȭ��ȣ�Ρ١ڡ١ڡ١�");
			System.out.println("1. �� ���� ����");
			System.out.println("2. �� ���� �˻�");
			System.out.println("3. �� ���� ���");
			System.out.println("4. ������");
			System.out.print("��ȣ �Է�:");
			choice=sc.nextInt();
			if(choice==1) {
				System.out.println("---------�� ���� ����---------");
				insert();
			}
			else if(choice==2) {
				System.out.println("---------�� ���� �˻�---------");
				search();
			}
			else if(choice==3) {
				System.out.println("---------�� ���� ���---------");
				show();
			}
			else if(choice==4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			
		}
		
	}
	public static void insert() {
		String name,phone;
		System.out.print("������ ���� �̸�:");
		name=sc.next();
		//name�� Key �̹Ƿ�, �ߺ� ��� �Ұ�
		if(hm.containsKey(name)) {
			System.out.println("�̹� �����ϴ� �̸��Դϴ�.");
			return;
		}else {
			System.out.print("������ ���� ��ȣ:");
			phone=sc.next();
			hm.put(name, phone);
			System.out.println("���� �Ϸ�!");
			
		}
	}
 	public static void search() {
 		String searchName;
 		System.out.print("�˻��� �̸�:");
 		searchName=sc.next();
 		//searchName�� hm�� �����ؾ� �˻� ����!
 		if(hm.containsKey(searchName)) {
 			System.out.println("�˻� �Ϸ�!");
 			System.out.println("�˻��� ��ȭ��ȣ:"+hm.get(searchName));
 		}else {
 			System.out.println("�˻��� �̸��� �����ϴ�.");
 		}
 	}
	public static void show() {
		Set<String>keyset=hm.keySet();
		Iterator i=keyset.iterator();
		while(i.hasNext()) {
			String curName=(String)i.next();
			System.out.println("name:"+curName+", phone:"+hm.get(curName));
		}
	}
}
