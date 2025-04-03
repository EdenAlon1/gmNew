package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enym implements Serializable, enzo {
    public final enxo a;
    public final enxu b;

    public enym(enxo enxoVar, enxu enxuVar) {
        this.a = enxoVar;
        this.b = enxuVar;
    }

    public static boolean k(enxo enxoVar, enxu enxuVar) {
        if (Math.abs(enxoVar.a) > 1.5707963267948966d || Math.abs(enxoVar.b) > 1.5707963267948966d || Math.abs(enxuVar.a) > 3.141592653589793d || Math.abs(enxuVar.b) > 3.141592653589793d) {
            return false;
        }
        double d = enxuVar.a;
        if (d != -3.141592653589793d || enxuVar.b == 3.141592653589793d) {
            return (enxuVar.b != -3.141592653589793d || d == 3.141592653589793d) && enxoVar.i() == enxuVar.l();
        }
        return false;
    }

    public abstract enxo a();

    public abstract enxu b();

    public final boolean equals(Object obj) {
        if (!(obj instanceof enym)) {
            return false;
        }
        enym enymVar = (enym) obj;
        return a().equals(enymVar.a()) && b().equals(enymVar.b());
    }

    public final boolean h(enyr enyrVar) {
        enyj enyjVar = new enyj(enyrVar);
        if (!this.a.g(enyjVar.a)) {
            return false;
        }
        enxu enxuVar = this.b;
        double d = enyjVar.b;
        if (d == -3.141592653589793d) {
            d = 3.141592653589793d;
        }
        return enxuVar.k(d);
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 629) * 37) + this.b.hashCode();
    }

    public final boolean i() {
        return this.a.i();
    }

    public final boolean j() {
        return k(this.a, this.b);
    }

    public final String toString() {
        return "[Lo=" + new enyj(new enxs(this.a.a), new enxs(this.b.a)).toString() + ", Hi=" + new enyj(new enxs(this.a.b), new enxs(this.b.b)).toString() + "]";
    }

    public enym() {
        this.a = new enxo(1.0d, eobe.a);
        this.b = enxu.c();
    }
}
