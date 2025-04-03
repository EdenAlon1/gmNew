package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxy implements Serializable, enzo {
    public byte a;
    public byte b;
    byte c;
    enxz d;
    public double e;
    public double f;
    public double g;
    public double h;

    static {
        Math.asin(Math.sqrt(0.3333333333333333d));
    }

    public enxy() {
    }

    public final enyr a() {
        return enyr.m(this.d.z());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enxy) {
            enxy enxyVar = (enxy) obj;
            if (this.a == enxyVar.a && this.b == enxyVar.b && this.c == enxyVar.c && this.d.equals(enxyVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a + 629) * 37) + this.c) * 37) + this.b) * 37) + this.d.hashCode();
    }

    public final String toString() {
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        return "[" + ((int) b) + ", " + ((int) b2) + ", " + ((int) b3) + ", " + String.valueOf(this.d) + "]";
    }

    public enxy(enxz enxzVar) {
        this.d = enxzVar;
        this.a = (byte) enxzVar.b();
        long q = enxzVar.q();
        this.c = (byte) enxz.e(q);
        this.b = (byte) enxzVar.h();
        int c = enxz.c(q);
        int d = enxz.d(q);
        int g = enxz.g(enxzVar.h());
        this.e = enzn.a(c, g);
        this.f = enzn.a(c + g, g);
        this.g = enzn.a(d, g);
        this.h = enzn.a(d + g, g);
    }
}
