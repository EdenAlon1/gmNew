package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyg implements ipn {
    public final huo a;
    private final boolean b;

    public dyg(huo huoVar, boolean z) {
        this.a = huoVar;
        this.b = z;
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int a(iny inyVar, List list, int i) {
        return ipm.a(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int b(iny inyVar, List list, int i) {
        return ipm.b(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int c(iny inyVar, List list, int i) {
        return ipm.c(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int d(iny inyVar, List list, int i) {
        return ipm.d(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        ipo ei;
        int d;
        int c;
        iqk e;
        ipo ei2;
        ipo ei3;
        if (list.isEmpty()) {
            ei3 = ipqVar.ei(jzk.d(j), jzk.c(j), ffem.a, dyd.a);
            return ei3;
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            ipl iplVar = (ipl) list.get(0);
            if (dyc.d(iplVar)) {
                d = jzk.d(j);
                c = jzk.c(j);
                e = iplVar.e(jzj.c(jzk.d(j), jzk.c(j)));
            } else {
                e = iplVar.e(j2);
                d = Math.max(jzk.d(j), e.a);
                c = Math.max(jzk.c(j), e.b);
            }
            int i = c;
            int i2 = d;
            ei2 = ipqVar.ei(i2, i, ffem.a, new dye(e, iplVar, ipqVar, i2, i, this));
            return ei2;
        }
        iqk[] iqkVarArr = new iqk[list.size()];
        ffkz ffkzVar = new ffkz();
        ffkzVar.a = jzk.d(j);
        ffkz ffkzVar2 = new ffkz();
        ffkzVar2.a = jzk.c(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            ipl iplVar2 = (ipl) list.get(i3);
            if (dyc.d(iplVar2)) {
                z = true;
            } else {
                iqk e2 = iplVar2.e(j2);
                iqkVarArr[i3] = e2;
                ffkzVar.a = Math.max(ffkzVar.a, e2.a);
                ffkzVar2.a = Math.max(ffkzVar2.a, e2.b);
            }
        }
        if (z) {
            int i4 = ffkzVar.a;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = ffkzVar2.a;
            long d2 = jzl.d(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ipl iplVar3 = (ipl) list.get(i7);
                if (dyc.d(iplVar3)) {
                    iqkVarArr[i7] = iplVar3.e(d2);
                }
            }
        }
        ei = ipqVar.ei(ffkzVar.a, ffkzVar2.a, ffem.a, new dyf(iqkVarArr, list, ipqVar, ffkzVar, ffkzVar2, this));
        return ei;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyg)) {
            return false;
        }
        dyg dygVar = (dyg) obj;
        return ffkj.e(this.a, dygVar.a) && this.b == dygVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
