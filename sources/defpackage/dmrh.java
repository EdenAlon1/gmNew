package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmrh {
    public static final void a(final dmms dmmsVar, final dmov dmovVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1826242253);
        if (i3 == 0) {
            i2 = (true != b.D(dmmsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmovVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dmou.a(dmovVar, b, (i2 >> 3) & 14);
            int i4 = huo.a;
            hun hunVar = hum.k;
            hve hveVar = hvi.e;
            ipn a = dyo.a(dxu.c, hunVar, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dmmp dmmpVar = dmmsVar.a;
            b.v(1627427467);
            dmqe dmqeVar = dmmpVar.f;
            if (dmqeVar != null) {
                ebv.a(ebs.e(hvi.e, 8.0f), b);
                dmmi.d(dmqeVar, 0, b, 0, 2);
            }
            hfmVar.Z();
            dmob.c(dmmsVar.d, false, false, null, b, 0, 14);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmrf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmms dmmsVar2 = dmms.this;
                    int i6 = i;
                    dmrh.a(dmmsVar2, dmovVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmms dmmsVar, final dmov dmovVar, final dmpg dmpgVar, final float f, final hvi hviVar, final hzi hziVar, final dmpi dmpiVar, hfd hfdVar, final int i) {
        int i2;
        hviVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-1581516938);
        if (i3 == 0) {
            i2 = (true != b.D(dmmsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmovVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(dmpgVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.A(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(hviVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.D(hziVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(dmpiVar) ? 524288 : 1048576;
        }
        int i4 = i2;
        if ((599187 & i4) == 599186 && b.I()) {
            b.s();
        } else {
            hvi i5 = eba.i(hviVar, 0.0f, 8.0f, 1);
            dxq dxqVar = dxu.c;
            int i6 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, i5);
            int i7 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            hus husVar = hum.o;
            hve hveVar = hvi.e;
            ipn a3 = ebm.a(dxu.a, husVar, b, 48);
            int a4 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, hveVar);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            ebv.a(ebs.o(hvi.e, 8.0f), b);
            int i8 = i4 >> 3;
            dmkt.a(dmmsVar.c, dmpgVar, f, false, hpx.d(-1229251129, new dmrg(dmmsVar, dmpgVar, f, hziVar, dmpiVar, dmovVar), b), b, (i8 & 112) | 24576 | (i8 & 896), 8);
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmre
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmms dmmsVar2 = dmms.this;
                    dmov dmovVar2 = dmovVar;
                    dmpg dmpgVar2 = dmpgVar;
                    float f2 = f;
                    hvi hviVar2 = hviVar;
                    hzi hziVar2 = hziVar;
                    dmrh.b(dmmsVar2, dmovVar2, dmpgVar2, f2, hviVar2, hziVar2, dmpiVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
