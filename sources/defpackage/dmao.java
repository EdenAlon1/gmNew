package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmao {
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hfd r7, int r8) {
        /*
            r0 = 1391191287(0x52ebe4f7, float:5.06579354E11)
            hfd r7 = r7.b(r0)
            r0 = 0
            if (r8 != 0) goto L17
            boolean r8 = r7.I()
            if (r8 != 0) goto L12
            r8 = r0
            goto L17
        L12:
            r7.s()
            goto L8d
        L17:
            hik r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.a
            java.lang.Object r1 = r7.e(r1)
            android.content.res.Configuration r1 = (android.content.res.Configuration) r1
            int r1 = r1.orientation
            r2 = 2
            if (r1 != r2) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = r0
        L27:
            donk r2 = defpackage.dooy.a(r7)
            hve r3 = defpackage.hvi.e
            hvi r3 = defpackage.ebs.s(r3)
            donk r4 = defpackage.dooy.a(r7)
            donf r4 = r4.d
            long r4 = r4.a
            hvi r3 = defpackage.dee.c(r3, r4)
            r4 = 817762645(0x30be1155, float:1.3829246E-9)
            r7.v(r4)
            r4 = r7
            hfm r4 = (defpackage.hfm) r4
            java.lang.Object r5 = r4.R()
            java.lang.Object r6 = defpackage.hfc.a
            if (r5 != r6) goto L56
            dmai r5 = new dmai
            r5.<init>()
            r4.ad(r5)
        L56:
            ffji r5 = (defpackage.ffji) r5
            r4.Z()
            hvi r3 = defpackage.icf.a(r3, r5)
            r5 = 817766239(0x30be1f5f, float:1.3833236E-9)
            r7.v(r5)
            boolean r5 = r7.E(r1)
            boolean r6 = r7.D(r2)
            r5 = r5 | r6
            java.lang.Object r6 = r4.R()
            if (r5 != 0) goto L78
            java.lang.Object r5 = defpackage.hfc.a
            if (r6 != r5) goto L80
        L78:
            dmaj r6 = new dmaj
            r6.<init>()
            r4.ad(r6)
        L80:
            ffji r6 = (defpackage.ffji) r6
            r4.Z()
            hvi r1 = defpackage.hxs.b(r3, r6)
            defpackage.dyc.b(r1, r7, r0)
            r0 = r8
        L8d:
            hio r7 = r7.L()
            if (r7 == 0) goto L9a
            dmak r8 = new dmak
            r8.<init>()
            r7.d = r8
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmao.a(hfd, int):void");
    }

    public static final void b(final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-874121470);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            boolean g = dooy.g(b);
            cru.b(g, null, ctt.l(dooy.c(b).k, 2), ctt.m(dooy.c(b).l, 2), null, hpx.d(-252810278, new dman(g, ffixVar), b), b, 196608, 18);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmal
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmao.b(ffix.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
