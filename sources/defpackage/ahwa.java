package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwa {
    public static final void a(final ahvx ahvxVar, hfd hfdVar, final int i) {
        int i2;
        long f;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-838257690);
        if (i3 == 0) {
            i2 = (true != b.D(ahvxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            b.v(-242131323);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new hzi();
                hfmVar.ad(R);
            }
            hzi hziVar = (hzi) R;
            hfmVar.Z();
            dmpj dmpjVar = (dmpj) hkf.a(ahvxVar.a, b).a();
            hve hveVar = hvi.e;
            f = iby.f(ibw.d(r6), ibw.c(r6), ibw.b(r6), 0.96f, ibw.f(gft.a(b).p));
            a = dee.a(hveVar, f, idb.a);
            dmnj.a(dmpjVar, a, hziVar, b, 384, 0);
            View view = (View) b.e(AndroidCompositionLocals_androidKt.g);
            dsma dsmaVar = (dsma) b.e(dsmp.a);
            b.v(-242120125);
            boolean F = b.F(dsmaVar) | b.F(view);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new ahvz(dsmaVar, view, null);
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hgs.g(hziVar, (ffjm) R2, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: ahvy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ahwa.a(ahvx.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
