package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbac {
    public final dazq a;
    public final List b;

    /* JADX WARN: Multi-variable type inference failed */
    public dbac(dazq dazqVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = dazqVar;
        this.b = ffdx.g(ffbrVar.b(), new dbby("Messages", (dbca) ffbrVar2.b()), new dbby("Conversations", (dbca) ffbrVar3.b()), new dbby("Participants", (dbca) ffbrVar4.b()), ffbrVar5.b());
    }

    public final void a(final hho hhoVar, final int i, final dazo dazoVar, hfd hfdVar, final int i2) {
        int i3;
        boolean z;
        hhoVar.getClass();
        dazoVar.getClass();
        int i4 = i2 & 6;
        hfd b = hfdVar.b(636697074);
        boolean z2 = true;
        if (i4 == 0) {
            i3 = (true != b.D(hhoVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.B(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b.F(dazoVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            if (((Number) hhoVar.a()).intValue() == i) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            b.v(-950480902);
            boolean z3 = (i3 & 14) == 4 ? z : false;
            if ((i3 & 112) != 32) {
                z = false;
            }
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z3 | z) || R == hfc.a) {
                R = new ffix() { // from class: dazr
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        hho.this.b(Integer.valueOf(i));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            dwjg.a(z2, (ffix) R, null, false, hpx.d(-1313676724, new dazu(dazoVar), b), 0L, 0L, b, 24576, 492);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dazs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbac dbacVar = dbac.this;
                    hho hhoVar2 = hhoVar;
                    int i5 = i;
                    dbacVar.a(hhoVar2, i5, dazoVar, (hfd) obj, hip.a(i2 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void b(hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-357543454);
        if (i3 == 0) {
            i2 = (true != b.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dweu.b(dbaf.a, null, hpx.d(1670774353, new dazw(this), b), null, null, null, b, 390);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dazt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dbac.this.b((hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
