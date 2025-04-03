package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmvw {
    public static final void a(final hvi hviVar, final dmvi dmviVar, hfd hfdVar, final int i) {
        int i2;
        hviVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(348394206);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dmuy.d(ebs.u(hviVar, 0.0f, ((Configuration) b.e(AndroidCompositionLocals_androidKt.a)).screenHeightDp, 1), false, dmviVar.g, null, hpx.d(1592593124, new dmvv(dmviVar), b), b, 24576, 10);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmvu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i4 = i;
                    dmvw.a(hviVar2, dmviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
