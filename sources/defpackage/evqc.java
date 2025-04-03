package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evqc {
    static final enhk a;
    static final enhk b;
    static final enhk c;
    static final String d;
    static final Pattern e;
    static final Pattern f;
    static final String g;
    static final String h;
    static final String i;
    static final String j;
    static final Pattern k;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k('0', '0');
        enhdVar.k('1', '1');
        enhdVar.k('2', '2');
        enhdVar.k('3', '3');
        enhdVar.k('4', '4');
        enhdVar.k('5', '5');
        enhdVar.k('6', '6');
        enhdVar.k('7', '7');
        enhdVar.k('8', '8');
        enhdVar.k('9', '9');
        enhk c2 = enhdVar.c();
        a = c2;
        enhd enhdVar2 = new enhd();
        enhdVar2.k('A', '2');
        enhdVar2.k('B', '2');
        enhdVar2.k('C', '2');
        enhdVar2.k('D', '3');
        enhdVar2.k('E', '3');
        enhdVar2.k('F', '3');
        enhdVar2.k('G', '4');
        enhdVar2.k('H', '4');
        enhdVar2.k('I', '4');
        enhdVar2.k('J', '5');
        enhdVar2.k('K', '5');
        enhdVar2.k('L', '5');
        enhdVar2.k('M', '6');
        enhdVar2.k('N', '6');
        enhdVar2.k('O', '6');
        enhdVar2.k('P', '7');
        enhdVar2.k('Q', '7');
        enhdVar2.k('R', '7');
        enhdVar2.k('S', '7');
        enhdVar2.k('T', '8');
        enhdVar2.k('U', '8');
        enhdVar2.k('V', '8');
        enhdVar2.k('W', '9');
        enhdVar2.k('X', '9');
        enhdVar2.k('Y', '9');
        enhdVar2.k('Z', '9');
        enhk c3 = enhdVar2.c();
        b = c3;
        enhd enhdVar3 = new enhd();
        enhdVar3.g(c3);
        enhdVar3.g(c2);
        c = enhdVar3.c();
        String concat = String.valueOf(c3.keySet().toString().replaceAll("[, \\[\\]]", "")).concat(String.valueOf(emuz.c(c3.keySet().toString()).replaceAll("[, \\[\\]]", "")));
        d = concat;
        e = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        f = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String concat2 = String.valueOf(concat).concat("\\p{Nd}");
        g = concat2;
        String A = a.A("[", "]+((\\-)*[", concat2, concat2, "])*");
        h = A;
        String A2 = a.A("[", "]+((\\-)*[", concat, concat2, "])*");
        i = A2;
        String A3 = a.A("^(", "\\.)*", A, A2, "\\.?$");
        j = A3;
        k = Pattern.compile(A3);
    }
}
