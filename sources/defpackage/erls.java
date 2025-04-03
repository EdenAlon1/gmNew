package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erls implements Serializable {
    private static final long serialVersionUID = 0;
    public final String a;
    public final int b;
    private final boolean c;

    private erls(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public static erls a(String str, int i) {
        emxf.d(d(i), "Port out of range: %s", i);
        erls b = b(str);
        emxf.f(!b.c(), "Host has a port: %s", str);
        return new erls(b.a, i, b.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.erls b(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erls.b(java.lang.String):erls");
    }

    private static boolean d(int i) {
        return i >= 0 && i <= 65535;
    }

    public final boolean c() {
        return this.b >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof erls) {
            erls erlsVar = (erls) obj;
            if (emxb.a(this.a, erlsVar.a) && this.b == erlsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a.length() + 8);
        if (this.a.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.a);
            sb.append(']');
        } else {
            sb.append(this.a);
        }
        if (c()) {
            sb.append(':');
            sb.append(this.b);
        }
        return sb.toString();
    }
}
