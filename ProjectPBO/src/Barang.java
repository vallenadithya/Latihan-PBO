/*
Anggota Kelompok :
Sekar Rayhannisa          2011521022
Harriko Nur Harzeki       2011521024
Vallen Aditya Rekhsana    2011522017
*/

public class Barang{
    private String nama, kode;
    private int modal, harga;
    public int stok;

    public Barang(){
        nama="-";
        kode="-";
    }

    public Barang(String nama, String kode){
        this.nama=nama;
        this.kode=kode;
    }

    public String getNama(){
        return nama;
    }

    public String getKode(){
        return kode;
    }

    public void setNama(String namaBaru){
        nama=namaBaru;
    }

    public void setKode(String kodeBaru){
        kode=kodeBaru;
    }

    public int getHarga(){
        return harga;
    }

    public void setHarga(int hargaBaru){
        if(modal<harga){
            harga=hargaBaru;
        }
    }

    public int getModal(){
        return modal;
    }

    public void setModal(int modalBaru){
        modal=modalBaru;
    }

    public void restok(int tambahan){
        stok=stok+tambahan;
    }

    public void showDetail(){
        System.out.println("Nama Barang : " + nama);
        System.out.println("Kode Barang : " + kode);
        System.out.println("Harga Beli  : " + modal);
        System.out.println("Harga Jual  : " + harga);
        System.out.println("Stok        : " + stok);
    }

}
