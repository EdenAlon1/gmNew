package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvc {
    public static final void a(final dlwk dlwkVar, final idh idhVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        dlwkVar.getClass();
        int i4 = i2 & 1;
        hfd b = hfdVar.b(-730325091);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dlwkVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(idhVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            if (i5 != 0) {
                idhVar = idb.a;
            }
            if (dlwkVar instanceof dlvq) {
                b.v(-1787770640);
                dlxp.l((dlvq) dlwkVar, null, idhVar, b, (i3 << 3) & 896);
                ((hfm) b).Z();
            } else if (dlwkVar instanceof dlvw) {
                b.v(-1787768349);
                dlxx.g((dlvw) dlwkVar, null, b, 0);
                ((hfm) b).Z();
            } else if (dlwkVar instanceof dlwa) {
                b.v(-1787766560);
                dlyf.g((dlwa) dlwkVar, null, b, 0);
                ((hfm) b).Z();
            } else if (dlwkVar instanceof dlwb) {
                b.v(-1787764600);
                dlyl.a((dlwb) dlwkVar, b, 0);
                ((hfm) b).Z();
            } else if (dlwkVar instanceof dlwf) {
                b.v(-1787762623);
                dlyq.d((dlwf) dlwkVar, null, b, 0);
                ((hfm) b).Z();
            } else {
                if (!(dlwkVar instanceof dlwj)) {
                    b.v(-1787771802);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(-1787760863);
                dlyw.e((dlwj) dlwkVar, null, b, 0);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlvb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlwk dlwkVar2 = dlwk.this;
                    int i6 = i;
                    dlvc.a(dlwkVar2, idhVar, (hfd) obj, hip.a(i6 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }
}
