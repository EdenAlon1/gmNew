package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlyl {
    public static final void a(final dlwb dlwbVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1281972601);
        if (i3 == 0) {
            i2 = (true != b.D(dlwbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hvi d = eba.d(hvi.e, 8.0f);
            int i4 = huo.a;
            ipn a = ebm.a(new dxn(12.0f, true, dxr.a), hum.n, b, 54);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, d);
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
            int i6 = i2 & 14;
            ebr ebrVar = ebr.a;
            c(dlwbVar, b, i6);
            hvi a3 = ebrVar.a(hvi.e, 1.0f, false);
            ipn a4 = dyc.a(hum.a, false);
            int a5 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, a3);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a4, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            d(dlwbVar, b, i6);
            b.n();
            b(b, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlyj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    dlyl.a(dlwb.this, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.hfd r11, int r12) {
        /*
            r0 = 1276009169(0x4c0e5ad1, float:3.7317444E7)
            hfd r8 = r11.b(r0)
            r11 = 0
            if (r12 != 0) goto L16
            boolean r12 = r8.I()
            if (r12 != 0) goto L12
            r12 = r11
            goto L16
        L12:
            r8.s()
            goto L38
        L16:
            hve r0 = defpackage.hvi.e
            r4 = 0
            r5 = 10
            r1 = 1082130432(0x40800000, float:4.0)
            r2 = 0
            r3 = 1090519040(0x41000000, float:8.0)
            hvi r3 = defpackage.eba.j(r0, r1, r2, r3, r4, r5)
            r0 = 2131232290(0x7f080622, float:1.8080685E38)
            igq r1 = defpackage.jie.a(r0, r8, r11)
            r9 = 384(0x180, float:5.38E-43)
            r10 = 120(0x78, float:1.68E-43)
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            defpackage.dgx.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11 = r12
        L38:
            hio r12 = r8.L()
            if (r12 == 0) goto L45
            dlyi r0 = new dlyi
            r0.<init>()
            r12.d = r0
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlyl.b(hfd, int):void");
    }

    public static final void c(final dlwb dlwbVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-684293294);
        if (i3 == 0) {
            i2 = (true != b.D(dlwbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !b.I()) {
            hxo.a(ebs.k(hvi.e, 56.0f), gft.c(b).b);
            throw null;
        }
        b.s();
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlyh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlyl.c(dlwb.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dlwb dlwbVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1201806586);
        if (i3 == 0) {
            i2 = (true != b.D(dlwbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hio L = b.L();
            if (L != null) {
                L.d = new ffjm() { // from class: dlyk
                    @Override // defpackage.ffjm
                    public final Object a(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        int i4 = i;
                        dlyl.d(dlwb.this, (hfd) obj, hip.a(i4 | 1));
                        return ffcu.a;
                    }
                };
                return;
            }
            return;
        }
        hve hveVar = hvi.e;
        dxq dxqVar = dxu.c;
        int i4 = huo.a;
        ipn a = dyo.a(dxqVar, hum.j, b, 0);
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
        throw null;
    }
}
