package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dskb {
    public static final void a(boolean z, gvs gvsVar, final ffjm ffjmVar, hfd hfdVar, final int i, final int i2) {
        boolean z2;
        int i3;
        int i4;
        gvs a;
        final gvs gvsVar2;
        ffjmVar.getClass();
        int i5 = i & 6;
        hfd b = hfdVar.b(-364459343);
        if (i5 == 0) {
            int i6 = 2;
            if ((i2 & 1) == 0) {
                z2 = z;
                if (b.E(z2)) {
                    i6 = 4;
                }
            } else {
                z2 = z;
            }
            i3 = i6 | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= 16;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
            gvsVar2 = gvsVar;
        } else {
            int i7 = i2 & 1;
            b.t();
            if ((i & 1) == 0 || b.G()) {
                if (i7 != 0) {
                    i3 &= -15;
                    z2 = dfq.a(b);
                }
                i4 = i3 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                a = dwki.a();
            } else {
                b.s();
                if (i7 != 0) {
                    i3 &= -15;
                }
                i4 = i3 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                a = gvsVar;
            }
            b.l();
            Context context = (Context) b.e(AndroidCompositionLocals_androidKt.b);
            boolean z3 = Build.VERSION.SDK_INT >= 31;
            gga.c((z3 && z2) ? gdp.b(context) : z3 ? gdp.c(context) : z2 ? fyc.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15) : fyc.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15), null, a, ffjmVar, b, (i4 << 3) & 7168);
            gvsVar2 = a;
        }
        final boolean z4 = z2;
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dska
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z5 = z4;
                    gvs gvsVar3 = gvsVar2;
                    dskb.a(z5, gvsVar3, ffjmVar, (hfd) obj, hip.a(i | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }
}
