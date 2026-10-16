import java.util.Scanner;
public class day46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                ===MENU PILIHAN===
                1. BAN DALAM
                2. OLI SAMPING
                3. BENSIN
                silahkan pilih menunya (1-3)
                """);
                int a = input.nextInt();
                
        switch (a) {
            case 1:
                System.out.println("BAN DALAM READY");
                break;
            case 2:
                System.out.println("OLI SAMPING READY");
                break;
            case 3:
                System.out.println("BENSIN READY");
                break;
        
            default:
                System.out.println("Tidak ada dalam daftar");
                break;
        }
    }
}
