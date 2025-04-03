package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvuk {
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.hfd r1, int r2) {
        /*
            r0 = 2029967448(0x78fed858, float:4.135098E34)
            hfd r1 = r1.b(r0)
            r0 = 0
            if (r2 != 0) goto L16
            boolean r2 = r1.I()
            if (r2 != 0) goto L12
            r2 = r0
            goto L16
        L12:
            r1.s()
            goto L1a
        L16:
            defpackage.dnhp.d(r1, r0)
            r0 = r2
        L1a:
            hio r1 = r1.L()
            if (r1 == 0) goto L27
            cvuh r2 = new cvuh
            r2.<init>()
            r1.d = r2
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvuk.a(hfd, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
    
        if (defpackage.ffkj.e(((defpackage.cvum) r7).a, r6.c) == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.cvug r6, final defpackage.cvup r7, defpackage.hfd r8, final int r9) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvuk.b(cvug, cvup, hfd, int):void");
    }

    public static final void c(final cvug cvugVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(1008856662);
        if (i3 == 0) {
            i2 = (true != b.D(cvugVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(false) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(false) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
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
            dngm.t(new dngr(cvugVar.c), null, b, 0, 14);
            dngx dngxVar = cvugVar.b;
            hvi a3 = jfw.a(hvi.e, "contact_row_test_prefix_".concat(cvugVar.a));
            b.v(-1080650757);
            hfmVar.Z();
            b.v(-1080645917);
            hfmVar.Z();
            dngm.t(dngxVar, a3, b, 0, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvuj
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    cvuk.c(cvug.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
