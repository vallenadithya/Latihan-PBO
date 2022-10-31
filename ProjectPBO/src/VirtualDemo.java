public class VirtualDemo {
    public static void main(String[] args) {
        //Object Instance
        Gaji s = new Gaji("Wahyu","KUBAR",3,5000.00);
        
        //Polymorphisme
        Pegawai e = new Gaji("ini nama","Samarinda",2,2500.00);

        //Downcasting
        System.out.println("memanggil mailcheck berdasarkan referensi gaji--");
        s.mailCheck();

        //Upcasting
        System.out.println("\nmemanggil mailcheck berdasarkan referensi pegawai--");
        e.mailCheck();
    }
}