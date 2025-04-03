package defpackage;

import androidx.compose.material3.internal.ParentSemanticsNodeElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hak {
    public static final void a(kev kevVar, ffjm ffjmVar, gvi gviVar, hvi hviVar, ffjm ffjmVar2, hfd hfdVar, int i) {
        int i2;
        ffjm ffjmVar3;
        hfd b = hfdVar.b(342983150);
        if ((i & 6) == 0) {
            i2 = (true != b.D(kevVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ffjmVar3 = ffjmVar;
            i2 |= true != b.F(ffjmVar3) ? 16 : 32;
        } else {
            ffjmVar3 = ffjmVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? b.D(gviVar) : b.F(gviVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(hviVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.E(true) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.E(true) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != b.F(ffjmVar2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        int i3 = i2;
        if ((4793491 & i3) == 4793490 && b.I()) {
            b.s();
        } else {
            int i4 = i3 >> 6;
            int i5 = i3 >> 3;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hgd hgdVar = new hgd(hgs.a(ffhe.a, b));
                hfmVar.ad(hgdVar);
                R = hgdVar;
            }
            ffsk ffskVar = ((hgd) R).a;
            hve hveVar = hvi.e;
            int i6 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
            int i7 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar4 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar4);
            }
            int i8 = i5 & 112;
            hlc.b(b, b2, iss.c);
            if (gviVar.c()) {
                b.v(2073083575);
                b(kevVar, gviVar, ffskVar, ffjmVar3, b, (i3 & 14) | i8 | (i4 & 896) | (57344 & i5) | (458752 & (i3 << 12)));
                hfmVar.Z();
            } else {
                b.v(2073364187);
                hfmVar.Z();
            }
            c(gviVar, hviVar, ffjmVar2, b, ((i3 >> 18) & 14) | i8 | (i5 & 896) | ((i3 >> 12) & 7168));
            b.n();
            boolean z = (i3 & 896) == 256 || ((i3 & 512) != 0 && b.F(gviVar));
            Object R2 = hfmVar.R();
            if (z || R2 == hfc.a) {
                R2 = new gzp(gviVar);
                hfmVar.ad(R2);
            }
            hgs.c(gviVar, (ffji) R2, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gzq(kevVar, ffjmVar, gviVar, hviVar, ffjmVar2, i);
        }
    }

    public static final void b(kev kevVar, gvi gviVar, ffsk ffskVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        kev kevVar2;
        hfd b = hfdVar.b(29751458);
        if ((i & 6) == 0) {
            i2 = (true != b.D(kevVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(gviVar) : b.F(gviVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffskVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.E(true) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffjmVar) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
            kevVar2 = kevVar;
        } else {
            String a = jii.a(R.string.tooltip_description, b);
            boolean F = ((i2 & 112) == 32 || ((i2 & 64) != 0 && b.F(gviVar))) | ((i2 & 896) == 256) | b.F(ffskVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new gzs(gviVar, ffskVar);
                hfmVar.ad(R);
            }
            kevVar2 = kevVar;
            kdy.b(kevVar2, (ffix) R, new kex(true, false, 14), hpx.d(-936215100, new gzu(a, ffjmVar), b), b, (i2 & 14) | 3072, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gzv(kevVar2, gviVar, ffskVar, ffjmVar, i);
        }
    }

    public static final void c(gvi gviVar, hvi hviVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        hvi a;
        hvi a2;
        hfd b = hfdVar.b(354945668);
        if ((i & 6) == 0) {
            i2 = (true != b.E(true) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? b.D(gviVar) : b.F(gviVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffjmVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hgd hgdVar = new hgd(hgs.a(ffhe.a, b));
                hfmVar.ad(hgdVar);
                R = hgdVar;
            }
            ffsk ffskVar = ((hgd) R).a;
            String a3 = jii.a(R.string.tooltip_label, b);
            a = hviVar.a(new SuspendPointerInputElement(gviVar, null, null, new ilu(new haf(gviVar, null)), 6));
            a2 = a.a(new SuspendPointerInputElement(gviVar, null, null, new ilu(new haj(gviVar, null)), 6));
            hvi a4 = a2.a(new ParentSemanticsNodeElement(new gzz(a3, ffskVar, gviVar)));
            int i3 = huo.a;
            ipn a5 = dyc.a(hum.a, false);
            int a6 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a4);
            int i4 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a5, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a6))) {
                Integer valueOf = Integer.valueOf(a6);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar2);
            }
            hlc.b(b, b2, iss.c);
            ffjmVar.a(b, Integer.valueOf((i2 >> 9) & 14));
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gzw(gviVar, hviVar, ffjmVar, i);
        }
    }
}
