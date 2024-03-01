import java.util.Scanner;

public class bodysurface {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // รับค่าความสูงและน้ำหนักจากผู้ใช้
        System.out.print("ความสูง (เซนติเมตร): ");
        double h = kb.nextDouble();
        System.out.print("น้ำหนัก (กิโลกรัม): ");
        double w = kb.nextDouble();

        // ตรวจสอบค่าป้อนเข้า
        if (h <= 0 || w <= 0) {
            System.out.println("ค่าป้อนเข้าไม่ถูกต้อง");
            return;
        }

        // คำนวณ BSA โดยใช้สูตร Mosteller
        double mosteller = Math.sqrt(w * h / 3600);

        double Dubois = 71.84 * Math.pow(w, 0.425) * Math.pow(h, 0.725) / 10e3;
        double Boyd = 3.207e-4 * Math.pow(h, 0.3) * Math.pow(1000 * w, (0.7285 - 0.0188 * (3 + Math.log10(w))));

        System.out.println("Mosteller (ตราตรางเมตร)" + mosteller);
        System.out.println("Dubois (ตราตรางเมตร)" + Dubois);
        System.out.println("Boyd (ตราตรางเมตร)" + Boyd);

    }
}