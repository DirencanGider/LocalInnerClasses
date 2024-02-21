/*

Statik Olmayan ve Statik Inner Classlar, classlarımızın birer üyesiydi.

Lokal Inner Classlar ise metodların birer üyesidir. Yani değişken tanımlar gibi metodların içerisine tanımlayabiliyoruz.
Sadece metoda özgüdürler.
Oluşturulduğu metod dışında geçersizdirler.
"public", "static" gibi ifadeler class'lara özgü olduğu için burada kullanamıyoruz.

Faydası: Bir class tanımlayacaksak, hemen bir obje oluşturmak istersek bunu başka dosyada yapmamıza gerek yok.
Sadece ilgili metodun içerisinde kullanacaksak lokal inner classları kullanabiliriz.
Başka bir class içerisine tanımlamamıza gerek kalmada pratik bir şekilde metod içerisinde lokal inner class oluşturup işlemimizi
gerçekleştirebiliriz.

 */

public class Main {

    public static void main(String[] args) {

        class Alan { //  Local Inner Class tanımlamış olduk. Main metoduna özgü oldu. Main metodu dışında geçersiz bir class.  //  1
            public void daire_alan(int yaricap) {

                System.out.println("Dairenin Alanı: " + (yaricap * yaricap * Math.PI));

            }
        }
        Alan alan = new Alan();  //Normal bir obje oluşturma işlemi gerçekleştirdik. Local Inner Class sayesinde. //  2
        Alan alan2 = new Alan(); //  4

        alan.daire_alan(10);  //  3

        alan2.daire_alan(3);  //  5

    }
    public static void deneme() {

        /* Alan alan = new Alan();  /*  Hata verdi. Çünkü lokal inner classda olan Alan objesi burada çağırılamıyor. Sadece main
                                     metoduna özgü olduğu için */  //  6

    }

}
