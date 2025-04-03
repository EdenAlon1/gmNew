package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmwe {
    public static final void a(final hvi hviVar, final dmvk dmvkVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        hviVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(-220114193);
        if (i3 == 0) {
            i2 = i | (true != b.D(hviVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dmvkVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            ffix ffixVar = dmvkVar.g;
            String str = dmvkVar.a;
            b.v(-1941216729);
            hpn d = str == null ? null : hpx.d(585575446, new dmvy(str), b);
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            b.v(-1941201760);
            boolean z = ((Configuration) b.e(AndroidCompositionLocals_androidKt.a)).orientation == 2;
            hfmVar.Z();
            hfdVar2 = b;
            dweq.a(ffixVar, hpx.d(1537477943, new dmwa(dmvkVar), b), hviVar, hpx.d(1923340345, new dmwc(dmvkVar), b), dmts.a, d, hpx.d(-1792833348, new dmwd(dmvkVar), b), null, 0L, 0.0f, 0L, 0L, 0L, new keh(!z, 3), hfdVar2, ((i2 << 6) & 896) | 1600560, 0, 8064);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmvx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i4 = i;
                    dmwe.a(hviVar2, dmvkVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
