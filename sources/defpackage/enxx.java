package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxx implements Serializable, enzo {
    public final enyr a;
    public final enxt b;

    public enxx(enyr enyrVar, enxt enxtVar) {
        this.a = enyrVar;
        this.b = enxtVar;
    }

    public static enxx b(enyr enyrVar, enxs enxsVar) {
        enxt enxtVar;
        emxf.a(enxw.d(enyrVar));
        enxs enxsVar2 = new enxs(Math.min(enxsVar.c, 3.141592653589793d));
        double d = enxsVar2.c;
        enxt enxtVar2 = enxt.a;
        if (d < eobe.a) {
            enxtVar = enxt.e;
        } else if (enxsVar2.equals(enxs.a)) {
            enxtVar = enxt.d;
        } else {
            double sin = Math.sin(Math.min(3.141592653589793d, enxsVar2.c) * 0.5d);
            double d2 = sin + sin;
            enxtVar = new enxt(d2 * d2);
        }
        return new enxx(enyrVar, enxtVar);
    }

    public final double a() {
        return this.b.f * 0.5d;
    }

    public final boolean c() {
        return this.b.e();
    }

    public final boolean d() {
        return enxt.c.equals(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enxx) {
            enxx enxxVar = (enxx) obj;
            if (this.a.p(enxxVar.a) && this.b.equals(enxxVar.b)) {
                return true;
            }
            if (c() && enxxVar.c()) {
                return true;
            }
            if (d() && enxxVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (d()) {
            return 17;
        }
        if (c()) {
            return 37;
        }
        return ((this.a.hashCode() + 629) * 37) + this.b.hashCode();
    }

    public final String toString() {
        enxt enxtVar = this.b;
        return "[Point = " + this.a.toString() + " Radius = " + String.valueOf(enxtVar) + "]";
    }
}
