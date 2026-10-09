/**
 * Java Proqramlaşdırma — Dərs 07
 * Tapşırıq Vərəqi — Bölmə F: Praktik Tapşırıq
 * Müəllim: Samir Abbasov
 * Xal: 10 / 10
 *
 * TAPŞIRIQ: Ders07Telebe
 *
 * Şərt:
 *   Ders07Telebe adlı Java proqramı yazın. Sinif aşağıdakıları əhatə etməlidir:
 *
 *   1. Sahələr (private):
 *      - String ad
 *      - int yas
 *      - double ortalama
 *
 *   2. static int telebeSayi = 0
 *      Hər new çağırışında constructor içində telebeSayi++ artırın.
 *
 *   3. Tam constructor: (String ad, int yas, double ortalama)
 *      this açar sözü ilə sahələri doldurun. telebeSayi++ əlavə edin.
 *
 *   4. Sadə constructor: (String ad, int yas)
 *      this(ad, yas, 0.0) ilə tam constructoru çağırın.
 *
 *   5. toString() override:
 *      "Telebe{ad=..., yas=..., ort=..., n=...}" formatında
 *
 *   6. main metodunda:
 *      3 tələbə yaradın, println ilə çap edin, telebeSayi göstərin.
 *
 * Nümunəvi çıxış:
 * ---------------
 *   Telebe{ad=Nigar, yas=20, ort=90.5, n=1}
 *   Telebe{ad=Kamil, yas=22, ort=0.0, n=2}
 *   Telebe{ad=Leyla, yas=19, ort=85.0, n=3}
 *   Ümumi tələbə sayı: 3
 */
public class Ders07Telebe {

    // TODO 1: private sahələri elan edin (ad, yas, ortalama)


    // TODO 2: static telebeSayi sahəsini elan edin (başlanğıc dəyər: 0)


    // TODO 3: Tam constructor yazın (String ad, int yas, double ortalama)
    //   - this.ad = ad; this.yas = yas; this.ortalama = ortalama;
    //   - telebeSayi++;


    // TODO 4: Sadə constructor yazın (String ad, int yas)
    //   - this(ad, yas, 0.0);  ← tam constructoru çağırır


    // TODO 5: toString() override yazın
    //   @Override
    //   public String toString() {
    //       return "Telebe{ad=" + ad + ", yas=" + yas +
    //              ", ort=" + ortalama + ", n=" + telebeSayi + "}";
    //   }


    public static void main(String[] args) {

        // TODO 6: 3 tələbə yaradın:
        // Ders07Telebe t1 = new Ders07Telebe("Nigar", 20, 90.5);
        // Ders07Telebe t2 = new Ders07Telebe("Kamil", 22);   // sadə constructor
        // Ders07Telebe t3 = new Ders07Telebe("Leyla", 19, 85.0);

        // Çap edin:
        // System.out.println(t1);
        // System.out.println(t2);
        // System.out.println(t3);
        // System.out.println("Ümumi tələbə sayı: " + telebeSayi);

    }

}
