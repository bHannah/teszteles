package fuggvenyek;


public class Teszt {

    public static void assertKVegNagyobb() {
        int kapott;
        int vart;
        //első eset
        int k = 4;
        int min = 13;
        kapott = fuggvenyek1.KVegNagyobb(k, min);
        vart = 14;
        assert vart == kapott:"Nem működik: min utolsó számjegye kisebb, mint k";
        //masodik eset
        k = 4;
        min = 10;
        kapott = fuggvenyek1.KVegNagyobb(k, min);
        vart = 14;
        assert vart == kapott:"Nem működik: min utolsó számjegye nagyobb, mint k";
        //harmadik eset
        k = 4;
        min = 14;
        kapott = fuggvenyek1.KVegNagyobb(k, min);
        vart = 24;
        assert vart == kapott:"Nem működik: min utolsó számjegye egyenlő k";
        //negyedik eset
        k = 5;
        min = -14;
        kapott = fuggvenyek1.KVegNagyobb(k, min);
        vart = -5;
        assert vart == kapott:"Nem működik: min utolsó számjegye nagyobb, mint k";
        //otodik eset
        k = 0;
        min = 14;
        kapott = fuggvenyek1.KVegNagyobb(k, min);
        vart = 20;
        assert vart == kapott:"Nem működik: min utolsó számjegye nagyobb, mint k";
    }
        public static void assertszomszedPrimE() {
        //II. feladat
        
        boolean vart1;
        boolean kapott1;
        int p;
        //elso eset
        p = 1;
        kapott1 = fuggvenyek1.szomszedPrimE(p);
        vart1 = true;
        assert vart1 == kapott1:"Nem működik: közvetlen szomszédja prím";
        //masodik eset
        p = 11;
        kapott1 = fuggvenyek1.szomszedPrimE(p);
        vart1 = false;
        assert vart1 == kapott1:"Nem működik: maga a szám prím";
        //negyedik eset
        p = -8;
        kapott1 = fuggvenyek1.szomszedPrimE(p);
        vart1 = true;
        assert vart1 == kapott1:"Nem működik: negatív szám, szomszedja prim";
    }
    
}
