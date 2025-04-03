package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cqy implements ipn {
    private final crx a;
    private boolean b;

    public cqy(crx crxVar) {
        this.a = crxVar;
    }

    @Override // defpackage.ipn
    public final int a(iny inyVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int a = ((inx) list.get(0)).a(i);
        int e = ffdx.e(list);
        if (e > 0) {
            int i2 = 1;
            while (true) {
                int a2 = ((inx) list.get(i2)).a(i);
                if (a2 > a) {
                    a = a2;
                }
                if (i2 == e) {
                    break;
                }
                i2++;
            }
        }
        return a;
    }

    @Override // defpackage.ipn
    public final int b(iny inyVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int b = ((inx) list.get(0)).b(i);
        int e = ffdx.e(list);
        if (e > 0) {
            int i2 = 1;
            while (true) {
                int b2 = ((inx) list.get(i2)).b(i);
                if (b2 > b) {
                    b = b2;
                }
                if (i2 == e) {
                    break;
                }
                i2++;
            }
        }
        return b;
    }

    @Override // defpackage.ipn
    public final int c(iny inyVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int c = ((inx) list.get(0)).c(i);
        int e = ffdx.e(list);
        if (e > 0) {
            int i2 = 1;
            while (true) {
                int c2 = ((inx) list.get(i2)).c(i);
                if (c2 > c) {
                    c = c2;
                }
                if (i2 == e) {
                    break;
                }
                i2++;
            }
        }
        return c;
    }

    @Override // defpackage.ipn
    public final int d(iny inyVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int d = ((inx) list.get(0)).d(i);
        int e = ffdx.e(list);
        if (e > 0) {
            int i2 = 1;
            while (true) {
                int d2 = ((inx) list.get(i2)).d(i);
                if (d2 > d) {
                    d = d2;
                }
                if (i2 == e) {
                    break;
                }
                i2++;
            }
        }
        return d;
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        ipo ei;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iqk e = ((ipl) list.get(i3)).e(j);
            i2 = Math.max(i2, e.a);
            i = Math.max(i, e.b);
            arrayList.add(e);
        }
        if (ipqVar.eu()) {
            this.b = true;
            this.a.b.b(new kaf((i2 << 32) | (4294967295L & i)));
        } else if (!this.b) {
            this.a.b.b(new kaf((i2 << 32) | (4294967295L & i)));
        }
        ei = ipqVar.ei(i2, i, ffem.a, new cqx(arrayList));
        return ei;
    }
}
