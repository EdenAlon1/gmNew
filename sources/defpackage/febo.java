package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febo {
    public static final Logger a = Logger.getLogger(febo.class.getName());
    public static final febh b = new febc();
    public static final febf c = new febd();
    static final eoeg d = eoeg.e.g();
    public Object[] e;
    public int f;

    public febo() {
    }

    public static byte[] k(InputStream inputStream) {
        try {
            return eoej.b(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("failure reading serialized stream", e);
        }
    }

    private final int n() {
        Object[] objArr = this.e;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final void o(int i) {
        Object[] objArr = new Object[i];
        if (!i()) {
            System.arraycopy(this.e, 0, objArr, 0, a());
        }
        this.e = objArr;
    }

    private final void p(int i, byte[] bArr) {
        this.e[i + i] = bArr;
    }

    private final void q(int i, Object obj) {
        if (this.e instanceof byte[][]) {
            o(n());
        }
        this.e[i + i + 1] = obj;
    }

    private final void r(int i, byte[] bArr) {
        this.e[i + i + 1] = bArr;
    }

    public final int a() {
        int i = this.f;
        return i + i;
    }

    public final Object b(febj febjVar) {
        int i = this.f;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(febjVar.b, j(i)));
        return d(i, febjVar);
    }

    public final Object c(int i) {
        return this.e[i + i + 1];
    }

    public final Object d(int i, febj febjVar) {
        febi a2;
        Object c2 = c(i);
        if (c2 instanceof byte[]) {
            return febjVar.a((byte[]) c2);
        }
        febl feblVar = (febl) c2;
        return (!febjVar.c() || (a2 = febl.a(febjVar)) == null) ? febjVar.a(feblVar.c()) : a2.b(feblVar.b());
    }

    public final void e(febj febjVar) {
        if (i()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f; i2++) {
            if (!Arrays.equals(febjVar.b, j(i2))) {
                p(i, j(i2));
                q(i, c(i2));
                i++;
            }
        }
        Arrays.fill(this.e, i + i, a(), (Object) null);
        this.f = i;
    }

    public final void f(febo feboVar) {
        if (feboVar.i()) {
            return;
        }
        int n = n() - a();
        if (i() || n < feboVar.a()) {
            o(a() + feboVar.a());
        }
        System.arraycopy(feboVar.e, 0, this.e, a(), feboVar.a());
        this.f += feboVar.f;
    }

    public final void g(febj febjVar, Object obj) {
        febjVar.getClass();
        obj.getClass();
        if (a() == 0 || a() == n()) {
            int a2 = a();
            o(Math.max(a2 + a2, 8));
        }
        p(this.f, febjVar.b);
        if (febjVar.c()) {
            int i = this.f;
            febi a3 = febl.a(febjVar);
            a3.getClass();
            q(i, new febl(a3, obj));
        } else {
            r(this.f, febjVar.b(obj));
        }
        this.f++;
    }

    public final boolean h(febj febjVar) {
        for (int i = 0; i < this.f; i++) {
            if (Arrays.equals(febjVar.b, j(i))) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return this.f == 0;
    }

    public final byte[] j(int i) {
        return (byte[]) this.e[i + i];
    }

    public final byte[] l(int i) {
        Object c2 = c(i);
        return c2 instanceof byte[] ? (byte[]) c2 : ((febl) c2).c();
    }

    public final void m(febj febjVar, Object obj) {
        febjVar.getClass();
        obj.getClass();
        int i = 0;
        while (i < this.f) {
            int i2 = i + 1;
            if (Arrays.equals(febjVar.b, j(i)) && obj.equals(d(i, febjVar))) {
                int i3 = i2 + i2;
                int a2 = a() - i3;
                Object[] objArr = this.e;
                System.arraycopy(objArr, i3, objArr, i + i, a2);
                int i4 = this.f - 1;
                this.f = i4;
                p(i4, null);
                r(this.f, null);
                return;
            }
            i = i2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(j(i), StandardCharsets.US_ASCII);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(d.j(l(i)));
            } else {
                sb.append(new String(l(i), StandardCharsets.US_ASCII));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public febo(int i, Object[] objArr) {
        this.f = i;
        this.e = objArr;
    }

    public febo(byte[]... bArr) {
        this(bArr.length >> 1, bArr);
    }
}
