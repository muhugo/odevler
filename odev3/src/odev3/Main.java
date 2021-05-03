package odev3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instructer egitmen1=new Instructer();
egitmen1.id= 001;
egitmen1.email="egitmen@kodlama.io";



Student ogrenci1= new Student();
ogrenci1.id=625;
ogrenci1.email="ogrenci@kodlama.io";



UserManager usermanager=new UserManager();
usermanager.add(ogrenci1);
usermanager.add(egitmen1);
	}

}
