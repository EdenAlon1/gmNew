package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgzf implements Serializable {
    public static final fgzf a = new fgzf("SU", null);
    public static final fgzf b = new fgzf("MO", null);
    public static final fgzf c = new fgzf("TU", null);
    public static final fgzf d = new fgzf("WE", null);
    public static final fgzf e = new fgzf("TH", null);
    public static final fgzf f = new fgzf("FR", null);
    public static final fgzf g = new fgzf("SA", null);
    private static final long serialVersionUID = -4412000990022011469L;
    public final int h;
    private final String i;

    public fgzf(fgzf fgzfVar) {
        this.i = fgzfVar.i;
        this.h = 0;
    }

    public static int a(fgzf fgzfVar) {
        if (a.i.equals(fgzfVar.i)) {
            return 1;
        }
        if (b.i.equals(fgzfVar.i)) {
            return 2;
        }
        if (c.i.equals(fgzfVar.i)) {
            return 3;
        }
        if (d.i.equals(fgzfVar.i)) {
            return 4;
        }
        if (e.i.equals(fgzfVar.i)) {
            return 5;
        }
        if (f.i.equals(fgzfVar.i)) {
            return 6;
        }
        return !g.i.equals(fgzfVar.i) ? -1 : 7;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fgzf)) {
            return false;
        }
        fgzf fgzfVar = (fgzf) obj;
        return fhox.a(fgzfVar.i, this.i) && fgzfVar.h == this.h;
    }

    public final int hashCode() {
        fhpa fhpaVar = new fhpa();
        fhpaVar.c(this.i);
        fhpaVar.a(this.h);
        return fhpaVar.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.h;
        if (i != 0) {
            stringBuffer.append(i);
        }
        stringBuffer.append(this.i);
        return stringBuffer.toString();
    }

    private fgzf(String str, byte[] bArr) {
        this.i = str;
        this.h = 0;
    }

    public fgzf(String str) {
        if (str.length() > 2) {
            this.h = fhet.a(str.substring(0, str.length() - 2));
        } else {
            this.h = 0;
        }
        String upperCase = str.substring(str.length() - 2).toUpperCase();
        this.i = upperCase;
        if (!a.i.equals(upperCase) && !b.i.equals(upperCase) && !c.i.equals(upperCase) && !d.i.equals(upperCase) && !e.i.equals(upperCase) && !f.i.equals(upperCase) && !g.i.equals(upperCase)) {
            throw new IllegalArgumentException("Invalid day: ".concat(String.valueOf(upperCase)));
        }
    }
}
