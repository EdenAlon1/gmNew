package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dohz {
    public static final void a(final hvi hviVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1408792654);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar, 1.0f);
            a = dee.a(ebs.u(d, 48.0f, 0.0f, 2), gft.a(b).F, idb.a);
            hvi j = eba.j(a, 20.0f, 0.0f, 16.0f, 0.0f, 10);
            int i4 = huo.a;
            int i5 = ((i2 << 6) & 7168) | 384;
            ipn a2 = ebm.a(dxu.a, hum.n, b, 48);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j);
            int i6 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            ffjnVar.a(ebr.a, b, Integer.valueOf(((i5 >> 6) & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dohs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i7 = i;
                    dohz.a(hviVar2, ffjnVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.hfd r25, int r26) {
        /*
            r0 = 386306362(0x1706913a, float:4.3481037E-25)
            r1 = r25
            hfd r0 = r1.b(r0)
            if (r26 != 0) goto L1b
            boolean r1 = r0.I()
            r2 = 0
            if (r1 != 0) goto L15
            r24 = r2
            goto L1d
        L15:
            r0.s()
            r20 = r0
            goto L5e
        L1b:
            r24 = r26
        L1d:
            hve r1 = defpackage.hvi.e
            r5 = 0
            r6 = 11
            r2 = 0
            r3 = 0
            r4 = 1086324736(0x40c00000, float:6.0)
            hvi r2 = defpackage.eba.j(r1, r2, r3, r4, r5, r6)
            r1 = 2132087485(0x7f1512bd, float:1.9815227E38)
            java.lang.String r1 = defpackage.jii.a(r1, r0)
            fxz r3 = defpackage.gft.a(r0)
            long r3 = r3.q
            gvs r5 = defpackage.gft.d(r0)
            jpo r5 = r5.k
            r22 = 0
            r23 = 65528(0xfff8, float:9.1824E-41)
            r19 = r5
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 48
            r20 = r0
            defpackage.dwjt.b(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = r24
        L5e:
            hio r0 = r20.L()
            if (r0 == 0) goto L6b
            doht r1 = new doht
            r1.<init>()
            r0.d = r1
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dohz.b(hfd, int):void");
    }

    @ffbs
    public static final void c(final doia doiaVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1683586570);
        if (i3 == 0) {
            i2 = (true != b.D(doiaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            a(hviVar, hpx.d(1518019072, new dohw(doiaVar), b), b, ((i2 >> 3) & 14) | 48);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dohu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doia doiaVar2 = doia.this;
                    int i4 = i;
                    dohz.c(doiaVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final String str, final doie doieVar, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(70753423);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(doieVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            dwft.a(false, ffixVar, hpx.d(-97099262, new dohx(str), b), null, false, hpx.d(2090080517, new dohy(doieVar), b), null, null, null, null, b, ((i2 >> 3) & 112) | 196998, 0, 4056);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dohv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    doie doieVar2 = doieVar;
                    int i4 = i;
                    dohz.d(str2, doieVar2, ffixVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
