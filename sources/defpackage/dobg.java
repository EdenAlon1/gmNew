package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dobg {
    public static final void a(final hvi hviVar, final dobh dobhVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1594277986);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dobhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjnVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            eba.i(ebs.x(hviVar, 0.0f, 412.0f, 1), 16.0f, 0.0f, 2);
            b.v(-971138627);
            c(hviVar, dobhVar.c, ffjnVar, b, i2 & 910);
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dobc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    dobh dobhVar2 = dobhVar;
                    int i4 = i;
                    dobg.a(hviVar2, dobhVar2, ffjnVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final String str, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2070942394);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, eba.i(hviVar, 24.0f, 0.0f, 2), gft.a(b).s, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(b).k, hfdVar2, i2 & 14, 0, 65016);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dobe
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dobg.b(str2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final hvi hviVar, final ffix ffixVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1684220430);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjnVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            hve hveVar = hvi.e;
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i5 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
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
            idh idhVar = idb.a;
            fwd b3 = dwfk.b(ibw.g, 0L, b, 14);
            b.v(1533722993);
            dwfo.b(ffixVar, hviVar, false, idhVar, b3, null, ffjnVar, b, ((i2 >> 3) & 14) | 3072 | ((i2 << 3) & 112) | ((i2 << 18) & 234881024));
            hfmVar.Z();
            b = b;
            dwgw.a(hyc.a(hvi.e, 1.0f, null, 0L, 0L, 30), 0.0f, 0L, b, 6, 6);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dobd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    ffix ffixVar3 = ffixVar;
                    int i6 = i;
                    dobg.c(hviVar2, ffixVar3, ffjnVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dobh dobhVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-39517062);
        if (i3 == 0) {
            i2 = (true != b.D(dobhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            a(hviVar, dobhVar, hpx.d(865808086, new dobf(dobhVar), b), b, ((i2 << 3) & 112) | ((i2 >> 3) & 14) | 384);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dobb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dobh dobhVar2 = dobh.this;
                    int i4 = i;
                    dobg.d(dobhVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
