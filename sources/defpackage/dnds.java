package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnds {
    public static final void a(final dndt dndtVar, final hvi hviVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        dndtVar.getClass();
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-629176957);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dndtVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            if (i5 != 0) {
                hviVar = hvi.e;
            }
            hvi hviVar2 = hviVar;
            if (dndtVar instanceof dnem) {
                b.v(736818270);
                dnej.h((dnem) dndtVar, hviVar2, b, i3 & 112);
                ((hfm) b).Z();
            } else if (dndtVar instanceof dngx) {
                b.v(736820925);
                dngm.t((dngx) dndtVar, hviVar2, b, i3 & 112, 12);
                ((hfm) b).Z();
            } else if (dndtVar instanceof dnha) {
                b.v(736823549);
                dngz.a((dnha) dndtVar, hviVar2, b, i3 & 112);
                ((hfm) b).Z();
            } else if (dndtVar instanceof dnhh) {
                b.v(736826074);
                dnhg.a((dnhh) dndtVar, hviVar2, null, b, i3 & 112, 4);
                ((hfm) b).Z();
            } else if (dndtVar instanceof dnia) {
                b.v(736828737);
                dnhz.a((dnia) dndtVar, hviVar2, b, i3 & 112, 0);
                ((hfm) b).Z();
            } else if (dndtVar instanceof dnir) {
                b.v(736831518);
                dniq.e((dnir) dndtVar, hviVar2, b, i3 & 112, 0);
                ((hfm) b).Z();
            } else if (dndtVar instanceof dniu) {
                b.v(736834142);
                dnit.a((dniu) dndtVar, hviVar2, b, i3 & 112);
                ((hfm) b).Z();
            } else if (dndtVar instanceof dnjg) {
                b.v(736836665);
                dnjf.d((dnjg) dndtVar, hviVar2, b, i3 & 112);
                ((hfm) b).Z();
            } else if (dndtVar instanceof dnjs) {
                b.v(736839396);
                dnjq.d((dnjs) dndtVar, hviVar2, b, i3 & 112);
                ((hfm) b).Z();
            } else if (dndtVar instanceof dnkl) {
                b.v(736842107);
                dnkk.e((dnkl) dndtVar, hviVar2, b, i3 & 112);
                ((hfm) b).Z();
            } else if (dndtVar instanceof dnlc) {
                b.v(736844636);
                dnla.e((dnlc) dndtVar, hviVar2, b, i3 & 112);
                ((hfm) b).Z();
            } else if (dndtVar instanceof dnmk) {
                b.v(736847295);
                dnmi.b((dnmk) dndtVar, hviVar2, b, i3 & 112);
                ((hfm) b).Z();
            } else if (dndtVar instanceof dnlz) {
                b.v(736849882);
                dnly.a((dnlz) dndtVar, hviVar2, b, i3 & 112, 0);
                ((hfm) b).Z();
            } else {
                b.v(1367558038);
                ((hfm) b).Z();
            }
            hviVar = hviVar2;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dndr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dndt dndtVar2 = dndt.this;
                    int i6 = i;
                    dnds.a(dndtVar2, hviVar, (hfd) obj, hip.a(i6 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }
}
