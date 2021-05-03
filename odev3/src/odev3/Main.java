package odev3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instructer egitmen1=new Instructer();
egitmen1.setId(001);
egitmen1.setEmail("egitmen@kodlama.io");



Student ogrenci1= new Student();
ogrenci1.setId(625);
ogrenci1.setEmail("ogrenci@kodlama.io");

;
User user = new User();
user.setId(855);
user.setEmail("ziyaretçi@hotmail.com");



UserManager usermanager=new UserManager();
usermanager.add(ogrenci1);
usermanager.add(egitmen1);
usermanager.add(user);
	}

}
