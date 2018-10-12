public class Designer extends Karyawan {
	public void addGaji(int addGaji) {
       if((gaji+addGaji)<=gajidesigner){
       	gaji=gaji+addGaji;
       	System.out.println("Bonus Gaji Anda = "+addGaji);
       	System.out.println("Total Gaji Anda Sebesar = "+gaji);
       }
       else{
       	// gaji>=gajidesigner;
       	System.out.println("Gaji Melebihi Batas Maksimum");
       }
	}

	public void addGaji(int addGaji, String pesan) {
       if((gaji+addGaji)<=gajidesigner){
       	gaji=gaji+addGaji;
       	System.out.println("Gaji Yang Didapat = "+gaji);
       	System.out.println(pesan);
       }
       else{
       	// gaji>=gajidesigner;
       	System.out.println("Gaji Melebihi Batas Maksimum");
       }
	}
}