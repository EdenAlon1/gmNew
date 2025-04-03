package defpackage;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gna implements ipn {
    final /* synthetic */ gnn a;

    public gna(gnn gnnVar) {
        this.a = gnnVar;
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
        int i;
        int max;
        int i2;
        int i3;
        int b;
        ipo ei;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ipl iplVar = (ipl) list.get(i4);
            if (ioe.b(iplVar) == gmn.a) {
                iqk e = iplVar.e(j);
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ipl iplVar2 = (ipl) list.get(i5);
                    if (ioe.b(iplVar2) == gmn.b) {
                        iqk e2 = this.a.e == dqs.a ? iplVar2.e(jzk.m(jzl.l(j, 0, -e.b, 1), 0, 0, 0, 0, 14)) : iplVar2.e(jzk.m(jzl.l(j, -e.a, 0, 2), 0, 0, 0, 0, 11));
                        ffkz ffkzVar = new ffkz();
                        if (this.a.e == dqs.a) {
                            i = Math.max(e2.a, e.a);
                            int i6 = e.b;
                            int i7 = e2.b;
                            max = i6 + i7;
                            i2 = (i - e2.a) / 2;
                            i3 = i6 / 2;
                            b = (i - e.a) / 2;
                            ffkzVar.a = ffln.b(i7 * this.a.b());
                        } else {
                            i = e.a + e2.a;
                            max = Math.max(e2.b, e.b);
                            i2 = e.a / 2;
                            i3 = (max - e2.b) / 2;
                            b = ffln.b(e2.a * this.a.b());
                            ffkzVar.a = (max - e.b) / 2;
                        }
                        gnn gnnVar = this.a;
                        int i8 = e2.a;
                        int i9 = e2.b;
                        gnnVar.n.i(i8);
                        gnnVar.o.i(i9);
                        gnnVar.j.i(i);
                        gnnVar.k.i(max);
                        ei = ipqVar.ei(i, max, ffem.a, new gmz(e2, i2, i3, e, b, ffkzVar));
                        return ei;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
