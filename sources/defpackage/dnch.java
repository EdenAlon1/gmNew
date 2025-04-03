package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnch {
    public static final void a(final dmzz dmzzVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        long j;
        int i3 = i & 6;
        hfd b = hfdVar.b(-202170910);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            eqd eqdVar = gft.c(b).b;
            if (z) {
                b.v(-1061057720);
                j = gft.a(b).f;
                ((hfm) b).Z();
            } else {
                b.v(-1060999037);
                j = gft.a(b).r;
                ((hfm) b).Z();
            }
            gpa.c(null, eqdVar, j, 0L, 0.0f, 0.0f, null, hpx.d(1074390183, new dncg(dmzzVar, z), b), b, 121);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnce
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmzz dmzzVar2 = dmzz.this;
                    int i4 = i;
                    dnch.a(dmzzVar2, z, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(24047939);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, eba.j(hvi.e, 0.0f, 2.0f, 0.0f, 0.0f, 13), gft.a(b).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).l, hfdVar2, (i2 & 14) | 48, 0, 65528);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dncc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnch.b(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1249554483);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, null, gft.a(b).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, dooy.d(b).g, hfdVar2, i2 & 14, 0, 65530);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnca
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnch.c(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dncj dncjVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(332490897);
        if (i3 == 0) {
            i2 = (true != b.D(dncjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            e(hviVar, dncjVar.e, hpx.d(-1852850347, new dncf(dncjVar), b), b, ((i2 >> 3) & 14) | 24576);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dncb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dncj dncjVar2 = dncj.this;
                    int i4 = i;
                    dnch.d(dncjVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final hvi hviVar, final boolean z, final ffjm ffjmVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(534063583);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(false) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffjmVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
        } else {
            b.v(836067847);
            idh idhVar = idb.a;
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            b.v(836070812);
            hfmVar.Z();
            b.v(148571012);
            b.v(836078934);
            long j = z ? ibw.g : gft.a(b).p;
            hfmVar.Z();
            gpa.c(hviVar, idhVar, j, 0L, 0.0f, 0.0f, null, ffjmVar, b, 56);
            hfmVar.Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dncd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    boolean z2 = z;
                    int i4 = i;
                    dnch.e(hviVar2, z2, ffjmVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
