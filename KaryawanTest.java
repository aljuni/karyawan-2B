public class KaryawanTest {
	public static void main(String[] args) {
		Designer des = new Designer();

		System.out.println("================================");

		des.setNama("Aljuni HIrossie");
		System.out.println("Nama Karyawan = " + des.getNama());
		des.setJabatan("Designer");
		System.out.println("Jabatan = " + des.getJabatan());
		des.setAlamat("Sukamelang");
		System.out.println("Alamat Karyawan = " + des.getAlamat());
		des.addGaji(50, "Terimakasih Kerja Kerasnya ^_^");
		des.addGaji(15);
		System.out.println("================================");

		Programmer prog = new Programmer();

		prog.setNama("Saji Antonio");
		System.out.println("Nama Karyawan = " + prog.getNama());
		prog.setJabatan("Programmer");
		System.out.println("Jabatan = " + prog.getJabatan());
		prog.setAlamat("Lohbener");
		System.out.println("Alamat Karyawan = " + prog.getAlamat());
		prog.addGaji(60, "Selalu Semangat Yah :*");
		prog.addGaji(15);
		System.out.println("================================");

		Pm pm1 = new Pm();

		pm1.setNama("Dayunah Saraswati");
		System.out.println("Nama Karyawan = " + pm1.getNama());
		pm1.setJabatan("Project Manager");
		System.out.println("Jabatan = " + pm1.getJabatan());
		pm1.setAlamat("Sindang");
		System.out.println("Alamat Karyawan = " + pm1.getAlamat());
		pm1.addGaji(80, "Kerja Kamu Gud Sangat");
		pm1.addGaji(18);
	}
}