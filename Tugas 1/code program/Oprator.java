public class Oprator {

public static void main(String[] args) {

boolean Bool1, Bool2, TF ; int i,j, hsl ;
float x,y,res;
System.out.println ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");

Bool1 = true; Bool2 = false;
TF = Bool1 && Bool2 ; /* Boolean AND */
TF = Bool1 || Bool2 ; /* Boolean OR */
TF = ! Bool1 ; /* NOT */
TF = Bool1 ^Bool2; /* XOR */

i = 5; j = 2 ;
hsl = i+j; hsl = i - j; hsl = i / j; hsl = i * j;
hsl = i /j ; /* pembagian bulat */
hsl = i%j ; /* sisa. modulo */

/* operasi numerik */
x = 5 ; y = 5 ;
res = x + y; res = x - y; res = x / y; res = x * y;

/* operasi relasional numerik */
TF = (i==j); TF = (i!=j);
TF = (i < j); TF = (i > j); TF = (i <= j); TF = (i >= j);

/* operasi relasional numerik */
TF = (x != y);
TF = (x < y); TF = (x > y); TF = (x <= y); TF = (x >= y);
}
}