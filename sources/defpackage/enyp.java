package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyp implements Comparable, Serializable, enzo, enzy {
    static final enyr a = enyr.c;
    transient eobe b;
    public final int c;
    public enyl d;
    public enyl e;
    public int f;
    private final AtomicInteger g = new AtomicInteger();
    private final enyr[] h;
    private boolean i;

    /* JADX WARN: Removed duplicated region for block: B:87:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public enyp(java.util.List r27) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enyp.<init>(java.util.List):void");
    }

    private final int q() {
        int i;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            i = this.c;
            if (i2 >= i) {
                break;
            }
            if (d(i2).compareTo(d(i3)) < 0) {
                i3 = i2;
            }
            i2++;
        }
        return (i <= 0 || d(i3 + 1).compareTo(d((this.c + i3) + (-1))) < 0) ? i3 : i3 + this.c;
    }

    private Object readResolve() {
        f();
        return this;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(enyp enypVar) {
        int i = this.c;
        int i2 = enypVar.c;
        if (i != i2) {
            return i - i2;
        }
        if (i == 0) {
            return 0;
        }
        int q = q() % this.c;
        int q2 = enypVar.q() % enypVar.c;
        for (int i3 = 0; i3 < i; i3++) {
            int compareTo = d(q).compareTo(enypVar.d(q2));
            if (compareTo != 0) {
                return compareTo;
            }
            q++;
            q2++;
        }
        return 0;
    }

    public final int b(enyr enyrVar) {
        if (this.c < 10) {
            for (int i = 1; i <= this.c; i++) {
                if (d(i).p(enyrVar)) {
                    return i;
                }
            }
            return -1;
        }
        enyi a2 = this.b.a();
        if (!enyf.d(a2, enyrVar)) {
            return -1;
        }
        eobb b = ((eoac) a2.a()).b(0);
        for (int d = b.d() - 1; d >= 0; d--) {
            int c = b.c(d);
            if (d(c).p(enyrVar)) {
                return c == 0 ? this.c : c;
            }
            int i2 = c + 1;
            if (d(i2).p(enyrVar)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.enzy
    public final int c() {
        if (l()) {
            return 0;
        }
        return this.c;
    }

    public final enyr d(int i) {
        try {
            enyr[] enyrVarArr = this.h;
            int length = enyrVarArr.length;
            return enyrVarArr[i >= length ? i - length : i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalStateException("Invalid vertex index " + i + " for loop of " + this.h.length + " vertices.", e);
        }
    }

    @Override // defpackage.enzy
    public final void e(int i, enzx enzxVar) {
        int i2 = i + 1;
        enyr d = d(i);
        enyr d2 = d(i2);
        enzxVar.a = d;
        enzxVar.b = d2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enyp) {
            enyp enypVar = (enyp) obj;
            if (Arrays.equals(this.h, enypVar.h) && this.i == enypVar.i && emxb.a(this.d, enypVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int i = this.c;
        int i2 = 10;
        if (i > 8) {
            if (i <= 8192) {
                i2 = 50;
            } else if (i > 50000) {
                i2 = 2;
            }
        }
        this.g.set(i2);
        eobe eobeVar = new eobe();
        this.b = eobeVar;
        eobeVar.c(this);
    }

    final boolean g(enyr enyrVar) {
        if (this.c < 3) {
            return this.i;
        }
        enyb enybVar = new enyb(enxw.e, enyrVar, d(0));
        boolean z = this.i;
        for (int i = 1; i <= this.c; i++) {
            z ^= enybVar.d(d(i));
        }
        return z;
    }

    public final boolean h(enyr enyrVar) {
        enyl enylVar;
        if (!this.b.d && (enylVar = this.d) != null && !enylVar.h(enyrVar)) {
            return false;
        }
        if (this.c <= 32 || (!this.b.d && this.g.decrementAndGet() > 0)) {
            return g(enyrVar);
        }
        enyi a2 = this.b.a();
        if (enyf.d(a2, enyrVar)) {
            return o(a2, enyrVar);
        }
        return false;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 7) + (this.c * 11) + (this.i ? 1 : 0);
    }

    public final boolean i(enyp enypVar) {
        enyl enylVar = this.e;
        enxo enxoVar = enylVar.a;
        enyl enylVar2 = enypVar.d;
        enxo enxoVar2 = enylVar2.a;
        if ((!enxoVar2.i() && (enxoVar2.a < enxoVar.a || enxoVar2.b > enxoVar.b)) || !enylVar.b.j(enylVar2.b)) {
            return false;
        }
        if (l() || enypVar.c < 2) {
            return m() || enypVar.k();
        }
        int b = b(enypVar.d(1));
        if (b < 0) {
            return h(enypVar.d(1));
        }
        enyr d = d(b - 1);
        enyr d2 = d(b);
        enyr d3 = d(b + 1);
        enyr d4 = enypVar.d(0);
        return enyy.b(d3, enypVar.d(2), d4, d2) && enyy.b(d4, d, d3, d2);
    }

    @Override // defpackage.enzy
    public final boolean j() {
        return this.i;
    }

    public final boolean k() {
        return l() && !this.i;
    }

    public final boolean l() {
        return this.c == 1;
    }

    public final boolean m() {
        return l() && this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n(enyi enyiVar, enxy enxyVar) {
        int i;
        int i2;
        int i3 = 0;
        eobb b = ((eoac) enyiVar.a()).b(0);
        int d = b.d();
        if (d == 0) {
            return false;
        }
        if (enyf.a(enyiVar, enxyVar.d) == 0) {
            return true;
        }
        enxp enxpVar = new enxp();
        enxpVar.a.e(enxyVar.e, enxyVar.f);
        enxpVar.b.e(enxyVar.g, enxyVar.h);
        enxp b2 = enxpVar.b(enyd.b);
        enxq enxqVar = new enxq();
        enxq enxqVar2 = new enxq();
        int i4 = 0;
        while (i4 < d) {
            int c = b.c(i4);
            if (enyd.d(d(c), d(c + 1), enxyVar.a, enyd.b, enxqVar, enxqVar2)) {
                i = i3;
                i2 = d;
                enxp enxpVar2 = new enxp(enxo.c(enxqVar.a, enxqVar2.a), enxo.c(enxqVar.b, enxqVar2.b));
                if (b2.a.h(enxpVar2.a) && b2.b.h(enxpVar2.b)) {
                    enxq b3 = enxq.b(enxqVar2, enxqVar);
                    enxq enxqVar3 = new enxq(-b3.b, b3.a);
                    int i5 = enxqVar3.a >= eobe.a ? 1 : i;
                    int i6 = enxqVar3.b >= eobe.a ? 1 : i;
                    double a2 = enxq.a(enxqVar3, enxq.b(b2.c(i5, i6), enxqVar));
                    double a3 = enxq.a(enxqVar3, enxq.b(b2.c(1 - i5, 1 - i6), enxqVar));
                    if (a2 >= eobe.a && a3 <= eobe.a) {
                        return true;
                    }
                }
            } else {
                i = i3;
                i2 = d;
            }
            i4++;
            i3 = i;
            d = i2;
        }
        return i3;
    }

    public final boolean o(enyi enyiVar, enyr enyrVar) {
        int i = 0;
        eobb b = ((eoac) enyiVar.a()).b(0);
        boolean f = b.f();
        int d = b.d();
        if (d > 0) {
            enyb enybVar = new enyb(enyf.c(enyiVar), enyrVar);
            int i2 = -2;
            while (i < d) {
                int c = b.c(i);
                if (c != i2 + 1) {
                    enybVar.c(d(c));
                }
                f ^= enybVar.d(d(c + 1));
                i++;
                i2 = c;
            }
        }
        return f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("S2Loop, depth=");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.h.length);
        sb.append(" points. [");
        for (enyr enyrVar : this.h) {
            sb.append(enyrVar.o());
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.enzy
    public final void p() {
    }

    public enyp(List list, boolean z, enyl enylVar) {
        f();
        int size = list.size();
        this.c = size;
        enyr[] enyrVarArr = new enyr[size];
        this.h = enyrVarArr;
        this.d = enylVar;
        this.e = enyc.a(enylVar);
        this.f = 0;
        this.i = z;
        list.toArray(enyrVarArr);
    }
}
