package guru.qa.vgromova;

public class Base {

    // поле класса
    boolean bool = true;
    char character = 'a';

    byte aByte = -128; //8-bit signed two's complement integer -128 ; 127
    short aShort = 0; //16-bit signed two's complement integer -32,768 : 32,767
    int aInteger = 2147483647; //32-bit signed two's complement integer -2147483648 .. 2147483647
    long aLong = 9223372036854775807L; //64-bit two's complement integer. 0 : 2(64) или -9223372036854775808 .. 9223372036854775807

    float aFloat = 0.9999999F;
    double aDouble = 0.0;

    int[] arr = new int[] {1,2,3,4,5}; //Массив

    boolean result1 = 3 > 2;
    boolean result2 = 3 >= 2;
    boolean result3 = 3 < 2;
    boolean result4 = 3 <= 2;
    boolean result5 = 3 != 2;
    boolean result6 = 3 == 2;
    boolean result7 = !(3 > 2) && 3 > 2;
    boolean result8 = !(3 > 2) || 3 > 2;

}
