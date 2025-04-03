package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dncq {
    public static final void a(final ebq ebqVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        hvi a2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1561524606);
        if (i3 == 0) {
            i2 = (true != b.D(ebqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            a = ebqVar.a(ebs.e(hvi.e, 1.0f), 1.0f, true);
            a2 = dee.a(a, gft.a(b).a, idb.a);
            dyc.b(a2, b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dncp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dncq.a(ebq.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final hvi hviVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(-122619566);
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
            int i4 = huo.a;
            int i5 = ((i2 << 6) & 7168) | 384;
            ipn a = ebm.a(dxu.a, hum.n, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, d);
            int i6 = ist.a;
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
            ffjnVar.a(ebr.a, b, Integer.valueOf(((i5 >> 6) & 112) | 6));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dncn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i7 = i;
                    dncq.b(hviVar2, ffjnVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.hfd r25, int r26) {
        /*
            r0 = 1794125091(0x6af02d23, float:1.4517767E26)
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
            goto L61
        L1b:
            r24 = r26
        L1d:
            r1 = 2132085080(0x7f150958, float:1.9810349E38)
            java.lang.String r1 = defpackage.jii.a(r1, r0)
            hve r2 = defpackage.hvi.e
            r3 = 0
            r4 = 2
            r5 = 1073741824(0x40000000, float:2.0)
            hvi r2 = defpackage.eba.i(r2, r5, r3, r4)
            gvs r3 = defpackage.gft.d(r0)
            jpo r3 = r3.l
            fxz r4 = defpackage.gft.a(r0)
            long r4 = r4.a
            jyj r11 = new jyj
            r6 = 3
            r11.<init>(r6)
            r22 = 0
            r23 = 65016(0xfdf8, float:9.1107E-41)
            r19 = r3
            r3 = r4
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
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
        L61:
            hio r0 = r20.L()
            if (r0 == 0) goto L6e
            dnco r1 = new dnco
            r1.<init>()
            r0.d = r1
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dncq.c(hfd, int):void");
    }

    public static final void d(final hvi hviVar, hfd hfdVar, final int i) {
        int i2 = i | 6;
        int i3 = i2 & 3;
        hfd b = hfdVar.b(622730329);
        if (i3 == 2 && b.I()) {
            b.s();
        } else {
            int i4 = i2 & 14;
            hve hveVar = hvi.e;
            b(hveVar, dncl.a, b, i4 | 48);
            hviVar = hveVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dncm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    dncq.d(hvi.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
