package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fixg {
    public final int e;

    public fixg(int i) {
        int i2 = fizg.j;
        this.e = i;
    }

    public abstract String a();

    public abstract void b(fixb fixbVar);

    public abstract void c(fixd fixdVar);

    final byte[] d() {
        fixd fixdVar = new fixd();
        c(fixdVar);
        return fixdVar.h();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fixg)) {
            return false;
        }
        fixg fixgVar = (fixg) obj;
        if (this.e == fixgVar.e) {
            return Arrays.equals(d(), fixgVar.d());
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (byte b : d()) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append(fixf.a.c(this.e));
        stringBuffer.append(": ");
        stringBuffer.append(a());
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
