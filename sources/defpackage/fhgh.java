package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgh implements Iterable, fflg {
    private final String[] a;

    public fhgh(String[] strArr) {
        this.a = strArr;
    }

    public final int a() {
        return this.a.length >> 1;
    }

    public final String b(String str) {
        String[] strArr = this.a;
        int length = strArr.length - 2;
        int a = ffib.a(length, 0, -2);
        if (a <= length) {
            while (!ffpc.j(str, strArr[length], true)) {
                if (length != a) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String c(int i) {
        return this.a[i + i];
    }

    public final String d(int i) {
        return this.a[i + i + 1];
    }

    public final fhgf e() {
        fhgf fhgfVar = new fhgf();
        ffdx.x(fhgfVar.a, this.a);
        return fhgfVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fhgh) && Arrays.equals(this.a, ((fhgh) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator<ffcf<String, String>> iterator() {
        int a = a();
        ffcf[] ffcfVarArr = new ffcf[a];
        for (int i = 0; i < a; i++) {
            ffcfVarArr[i] = new ffcf(c(i), d(i));
        }
        return ffjw.a(ffcfVarArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int a = a();
        for (int i = 0; i < a; i++) {
            String c = c(i);
            String d = d(i);
            sb.append(c);
            sb.append(": ");
            if (true == fhhl.w(c)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
