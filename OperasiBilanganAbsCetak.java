package modul5;

public final class OperasiBilanganAbsCetak {
    public static void main(String arg[]){
        
        OperasiPenjumlahan jumlah = new OperasiPenjumlahan();
        jumlah.set_A(6.5);
        jumlah.set_B(0.5);
        jumlah.set_C();
        
        System.out.println("===OPERASI PENJUMLAHAN===");
        System.out.println("A: 6,5\nB: 0.5");
        System.out.println("A + B = "+jumlah.get_C());
        
        OperasiPengurangan kurang = new OperasiPengurangan();
        kurang.set_A(6.5);
        kurang.set_B(0.5);
        kurang.set_C();
        
        System.out.println("===OPERASI PENGURANGAN===");
        System.out.println("A: 6,5\nB: 0.5");
        System.out.println("A - B = "+kurang.get_C());
        
        OperasiPerkalian kali = new OperasiPerkalian();
        kali.set_A(6.5);
        kali.set_B(0.5);
        kali.set_C();
        
        System.out.println("===OPERASI PERKALIAN===");
        System.out.println("A: 6,5\nB: 0.5");
        System.out.println("A * B = "+kali.get_C());
        
        OperasiPembagian bagi = new OperasiPembagian();
        bagi.set_A(6.5);
        bagi.set_B(0.5);
        bagi.set_C();
        
        System.out.println("===OPERASI PEMBAGIAN===");
        System.out.println("A: 6,5\nB: 0.5");
        System.out.println("A / B = "+bagi.get_C());
    }
}
