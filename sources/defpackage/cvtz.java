package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvtz {
    /* JADX WARN: Removed duplicated region for block: B:67:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.cvsj r28, final defpackage.olu r29, final defpackage.hkx r30, final defpackage.cvux r31, final defpackage.cvuc r32, final defpackage.cvvz r33, final defpackage.cvvl r34, final java.util.List r35, defpackage.hfd r36, final int r37) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvtz.a(cvsj, olu, hkx, cvux, cvuc, cvvz, cvvl, java.util.List, hfd, int):void");
    }

    public static final void b(cvsj cvsjVar, hfd hfdVar, final int i) {
        int i2;
        final cvsj cvsjVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-987060721);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(cvsjVar) : b.F(cvsjVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            cvsjVar2 = cvsjVar;
        } else {
            cvsjVar2 = cvsjVar;
            a(cvsjVar2, olz.a(cvsjVar.b, ((axni) b.e(axoy.a)).a, b, 0), hkf.a(cvsjVar.a, b), (cvux) hkf.a(cvsjVar.c, b).a(), (cvuc) hkf.a(cvsjVar.d, b).a(), (cvvz) hkf.a(cvsjVar.e, b).a(), (cvvl) hkf.a(cvsjVar.f, b).a(), (List) hkf.a(cvsjVar.g, b).a(), b, (i2 & 14) | 72);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvtg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cvtz.b(cvsj.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1114018117);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(false) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            ffixVar2 = ffixVar;
            dwfj.c(ffixVar2, eba.j(hvi.e, 16.0f, 18.0f, 16.0f, 0.0f, 8), false, null, null, null, null, cvsg.b, b, (i2 & 14) | 805306368, 508);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvtc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cvtz.c(ffix.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
