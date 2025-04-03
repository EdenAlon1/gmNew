package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbc implements kev {
    private final long a;
    private final jzn b;
    private final int c;
    private final ffjm d;
    private final hbr e;
    private final hbr f;
    private final hbr g;
    private final hbr h;
    private final hbs i;
    private final hbs j;
    private final hbs k;
    private final hbs l;
    private final hbs m;

    public hbc(long j, jzn jznVar, int i, ffjm ffjmVar) {
        this.a = j;
        this.b = jznVar;
        this.c = i;
        this.d = ffjmVar;
        int eo = jznVar.eo(jzt.a(j));
        int i2 = huo.a;
        hun hunVar = hum.j;
        this.e = new gyg(hunVar, hunVar, eo);
        hun hunVar2 = hum.l;
        this.f = new gyg(hunVar2, hunVar2, eo);
        huo huoVar = hui.a;
        this.g = new hdj(hui.c);
        this.h = new hdj(hui.d);
        int eo2 = jznVar.eo(jzt.b(j));
        hus husVar = hum.m;
        hus husVar2 = hum.o;
        this.i = new gyh(husVar, husVar2, eo2);
        this.j = new gyh(husVar2, husVar, eo2);
        this.k = new gyh(hum.n, husVar, eo2);
        this.l = new hdk(husVar, i);
        this.m = new hdk(husVar2, i);
    }

    @Override // defpackage.kev
    public final long a(kac kacVar, long j, kah kahVar, long j2) {
        int i;
        hbr[] hbrVarArr = new hbr[3];
        int i2 = 0;
        hbrVarArr[0] = this.e;
        hbrVarArr[1] = this.f;
        hbrVarArr[2] = kaa.a(kacVar.c()) < kaf.b(j) / 2 ? this.g : this.h;
        List g = ffdx.g(hbrVarArr);
        int size = g.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i = 0;
                break;
            }
            i = ((hbr) g.get(i3)).a(kacVar, j, kaf.b(j2), kahVar);
            if (i3 == ffdx.e(g)) {
                break;
            }
            if (i >= 0) {
                if (kaf.b(j2) + i <= kaf.b(j)) {
                    break;
                }
            }
            i3++;
        }
        hbs[] hbsVarArr = new hbs[4];
        hbsVarArr[0] = this.i;
        hbsVarArr[1] = this.j;
        hbsVarArr[2] = this.k;
        hbsVarArr[3] = kaa.b(kacVar.c()) < kaf.a(j) / 2 ? this.l : this.m;
        List g2 = ffdx.g(hbsVarArr);
        int size2 = g2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            int a = ((hbs) g2.get(i4)).a(kacVar, j, kaf.a(j2));
            if (i4 != ffdx.e(g2)) {
                int i5 = this.c;
                if (a >= i5) {
                    if (kaf.a(j2) + a <= kaf.a(j) - i5) {
                    }
                }
            }
            i2 = a;
            break;
        }
        long a2 = kab.a(i, i2);
        this.d.a(kacVar, kad.a(a2, j2));
        return a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbc)) {
            return false;
        }
        hbc hbcVar = (hbc) obj;
        return jzt.d(this.a, hbcVar.a) && ffkj.e(this.b, hbcVar.b) && this.c == hbcVar.c && ffkj.e(this.d, hbcVar.d);
    }

    public final int hashCode() {
        return (((((jzs.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) jzt.c(this.a)) + ", density=" + this.b + ", verticalMargin=" + this.c + ", onPositionCalculated=" + this.d + ')';
    }
}
