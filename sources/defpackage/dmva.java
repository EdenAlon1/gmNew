package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmva {
    public static final void a(final dmvt dmvtVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        dmvtVar.getClass();
        hfd b = hfdVar.b(-1263223211);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dmvtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            boolean z = dmvtVar instanceof dmve;
            hve hveVar = hvi.e;
            if (z) {
                b.v(752226919);
                dmtq.a(hveVar, (dmve) dmvtVar, b, (i3 >> 3) & 14);
                ((hfm) b).Z();
            } else if (dmvtVar instanceof dmvg) {
                b.v(752229040);
                dmui.a(hveVar, (dmvg) dmvtVar, b, (i3 >> 3) & 14);
                ((hfm) b).Z();
            } else if (dmvtVar instanceof dmvi) {
                b.v(752231176);
                dmvw.a(hveVar, (dmvi) dmvtVar, b, (i3 >> 3) & 14);
                ((hfm) b).Z();
            } else if (dmvtVar instanceof dmvk) {
                b.v(752233097);
                dmwe.a(hveVar, (dmvk) dmvtVar, b, (i3 >> 3) & 14);
                ((hfm) b).Z();
            } else if (dmvtVar instanceof dmvl) {
                b.v(752235115);
                dmwg.a(hveVar, (dmvl) dmvtVar, b, (i3 >> 3) & 14);
                ((hfm) b).Z();
            } else if (dmvtVar instanceof dmvq) {
                b.v(752237294);
                dmwr.a(hveVar, (dmvq) dmvtVar, b, (i3 >> 3) & 14);
                ((hfm) b).Z();
            } else {
                if (!(dmvtVar instanceof dmvn)) {
                    b.v(752225980);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(752239368);
                dmwj.a(hveVar, (dmvn) dmvtVar, b, (i3 >> 3) & 14);
                ((hfm) b).Z();
            }
            hviVar = hveVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmuz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmvt dmvtVar2 = dmvt.this;
                    int i4 = i;
                    dmva.a(dmvtVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
