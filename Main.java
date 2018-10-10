public class Main {
	public static void main (String [] args){
	Orang [] m = new Orang[3];
	
	m[0] = new Orang();
	m[0].setNo ("012606");
	m[0].setNama ("Uchiha Sasuke");
	m[0].setPeringkat("Genin");
	
	m[1] = new Orang();
	m[1].setNo ("012607");
	m[1].setNama ("Uzumaki Naruto");
	m[1].setPeringkat("Genin");
	
	m[2] = new Orang();
	m[2].setNo ("012601");
	m[2].setNama ("Haruno Sakura");
	m[2].setPeringkat("Chunin");
	
	System.out.println("Data Shinobi \n");
	for(Orang x:m){
		System.out.println("No. Registrasi	: "+x.getNo());
		System.out.println("Nama 		: "+x.getNama());
		System.out.println("Peringkat	: "+x.getPeringkat());
		System.out.println();
		}
	}
}