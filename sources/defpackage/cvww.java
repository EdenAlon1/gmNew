package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvww {
    public static final ebe a = new ebf(24.0f, 24.0f, 24.0f, 24.0f);
    public static final ebe b = eba.h(0.0f, 0.0f, 0.0f, 16.0f, 7);
    public static final float c = 280.0f;
    public static final float d = 560.0f;

    public static final List a(hkx hkxVar) {
        return (List) hkxVar.a();
    }

    public static final void b(final cvwp cvwpVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-1659133299);
        if (i3 == 0) {
            i2 = (true != b2.D(cvwpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b2.I()) {
            b2.s();
        } else {
            hkx a2 = hkf.a(cvwpVar.a, b2);
            if (!a(a2).isEmpty()) {
                int i4 = ((Configuration) b2.e(AndroidCompositionLocals_androidKt.a)).orientation;
                kdc.a(cvwpVar.b, null, hpx.d(612148123, new cvwv(a2), b2), b2, 384, 2);
            }
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cvwq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int a3 = hip.a(i | 1);
                    cvww.b(cvwp.this, (hfd) obj, a3);
                    return ffcu.a;
                }
            };
        }
    }
}
