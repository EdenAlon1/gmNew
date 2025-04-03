package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class giw {
    public static final void a(ffix ffixVar, gio gioVar, cxj cxjVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        kah kahVar;
        Object obj;
        int i5 = i & 6;
        hfd b = hfdVar.b(1254951810);
        if (i5 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(gioVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? b.D(cxjVar) : b.F(cxjVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjmVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            View view = (View) b.e(AndroidCompositionLocals_androidKt.g);
            jzn jznVar = (jzn) b.e(jdr.e);
            kah kahVar2 = (kah) b.e(jdr.j);
            hfr b2 = hey.b(b);
            hkx a = hku.a(ffjmVar, b);
            UUID uuid = (UUID) hqr.c(new Object[0], null, giv.a, b, 3072, 6);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hgd hgdVar = new hgd(hgs.a(ffhe.a, b));
                hfmVar.ad(hgdVar);
                R = hgdVar;
            }
            ffsk ffskVar = ((hgd) R).a;
            boolean D = b.D(view) | b.D(jznVar);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                i3 = 4;
                z = true;
                i4 = i2;
                kahVar = kahVar2;
                ggx ggxVar = new ggx(ffixVar, gioVar, view, kahVar, jznVar, uuid, cxjVar, ffskVar);
                ggxVar.c.b(b2, new hpw(-1560960657, true, new giu(a)));
                hfmVar.ad(ggxVar);
                obj = ggxVar;
            } else {
                i4 = i2;
                obj = R2;
                z = true;
                kahVar = kahVar2;
                i3 = 4;
            }
            ggx ggxVar2 = (ggx) obj;
            boolean F = b.F(ggxVar2);
            Object R3 = hfmVar.R();
            if (F || R3 == hfc.a) {
                R3 = new giq(ggxVar2);
                hfmVar.ad(R3);
            }
            hgs.c(ggxVar2, (ffji) R3, b);
            boolean F2 = b.F(ggxVar2) | ((i4 & 14) == i3 ? z : false) | ((i4 & 112) == 32 ? z : false) | b.D(kahVar);
            Object R4 = hfmVar.R();
            if (F2 || R4 == hfc.a) {
                R4 = new gir(ggxVar2, ffixVar, gioVar, kahVar);
                hfmVar.ad(R4);
            }
            hgs.i((ffix) R4, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gis(ffixVar, gioVar, cxjVar, ffjmVar, i);
        }
    }
}
