package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gim {
    public static final long a = ids.a(0.5f, 0.0f);

    public static final void a(long j, ffix ffixVar, boolean z, hfd hfdVar, int i) {
        int i2;
        hvi hviVar;
        hvi c;
        hvi a2;
        int i3 = i & 6;
        hfd b = hfdVar.b(951870469);
        if (i3 == 0) {
            i2 = (true != b.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else if (j != 16) {
            b.v(484651512);
            hkx c2 = cxo.c(true != z ? 0.0f : 1.0f, gjb.a(4, b), null, b, 0, 28);
            String b2 = hcb.b(R.string.close_sheet, b);
            if (z) {
                b.v(484942571);
                int i4 = i2 & 112;
                hve hveVar = hvi.e;
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (i4 == 32 || R == hfc.a) {
                    R = new gii(ffixVar, null);
                    hfmVar.ad(R);
                }
                a2 = hveVar.a(new SuspendPointerInputElement(ffixVar, null, null, new ilu((ffjm) R), 6));
                boolean D = b.D(b2) | (i4 == 32);
                Object R2 = hfmVar.R();
                if (D || R2 == hfc.a) {
                    R2 = new gik(b2, ffixVar);
                    hfmVar.ad(R2);
                }
                hviVar = jjs.c(a2, true, (ffji) R2);
                hfmVar.Z();
            } else {
                b.v(485368759);
                ((hfm) b).Z();
                hviVar = hvi.e;
            }
            c = ebs.c(hvi.e, 1.0f);
            hvi a3 = c.a(hviVar);
            boolean D2 = b.D(c2) | ((i2 & 14) == 4);
            hfm hfmVar2 = (hfm) b;
            Object R3 = hfmVar2.R();
            if (D2 || R3 == hfc.a) {
                R3 = new gif(j, c2);
                hfmVar2.ad(R3);
            }
            deu.a(a3, (ffji) R3, b, 0);
            hfmVar2.Z();
        } else {
            b.v(485550047);
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gig(j, ffixVar, z, i);
        }
    }

    public static final float b(idd iddVar, float f) {
        float c = iar.c(iddVar.r);
        if (Float.isNaN(c) || c == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (kav.b(0.0f, Math.min(jzm.d(iddVar, 48.0f), c), f) / c);
    }

    public static final float c(idd iddVar, float f) {
        float a2 = iar.a(iddVar.r);
        if (Float.isNaN(a2) || a2 == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (kav.b(0.0f, Math.min(jzm.d(iddVar, 24.0f), a2), f) / a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.ffix r28, defpackage.hvi r29, defpackage.gmk r30, float r31, boolean r32, defpackage.idh r33, long r34, long r36, float r38, long r39, defpackage.ffjm r41, defpackage.ffjm r42, defpackage.gio r43, defpackage.ffjn r44, defpackage.hfd r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gim.d(ffix, hvi, gmk, float, boolean, idh, long, long, float, long, ffjm, ffjm, gio, ffjn, hfd, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x023d, code lost:
    
        if (r8 == defpackage.hfc.a) goto L170;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.dyh r38, defpackage.cxj r39, defpackage.ffsk r40, defpackage.ffix r41, defpackage.ffji r42, defpackage.hvi r43, defpackage.gmk r44, float r45, boolean r46, defpackage.idh r47, long r48, long r50, float r52, defpackage.ffjm r53, defpackage.ffjm r54, defpackage.ffjn r55, defpackage.hfd r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gim.e(dyh, cxj, ffsk, ffix, ffji, hvi, gmk, float, boolean, idh, long, long, float, ffjm, ffjm, ffjn, hfd, int, int):void");
    }

    public static final gmk f(boolean z, hfd hfdVar, int i, int i2) {
        return gmd.a(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), gil.a, gml.a, false, hfdVar, (i & 14) | 384, 56);
    }
}
