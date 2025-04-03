package defpackage;

import java.net.InetAddress;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiwf {
    public final int a;
    public final boolean b;
    public final int c;
    public final Object d;

    public fiwf(int i, boolean z, Object obj, int i2) {
        this.a = i;
        this.b = z;
        this.d = obj;
        this.c = i2;
        if (!fiwg.e(i, i2)) {
            throw new IllegalArgumentException("invalid prefix length");
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fiwf)) {
            fiwf fiwfVar = (fiwf) obj;
            if (this.a == fiwfVar.a && this.b == fiwfVar.b && this.c == fiwfVar.c && this.d.equals(fiwfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + this.c + (this.b ? 1 : 0);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.b) {
            stringBuffer.append("!");
        }
        stringBuffer.append(this.a);
        stringBuffer.append(":");
        int i = this.a;
        if (i == 1 || i == 2) {
            stringBuffer.append(((InetAddress) this.d).getHostAddress());
        } else {
            stringBuffer.append(fjat.a((byte[]) this.d));
        }
        stringBuffer.append("/");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }
}
