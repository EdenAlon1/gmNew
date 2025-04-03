package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpmf {
    public static final void a(hvi hviVar, final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1875054843);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjiVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = hgs.a(ffhe.a, b);
                hfmVar.ad(R);
            }
            final ffsk ffskVar = (ffsk) R;
            ebe ebeVar = dwfd.a;
            fvo b2 = dwfd.b(gft.a(b).h, gft.a(b).i, b, 12);
            igq a = jie.a(R.drawable.gs_restart_alt_vd_theme_24, b, 0);
            String a2 = jii.a(R.string.popup_camera_restart_button_content_description, b);
            String a3 = jii.a(R.string.popup_camera_restart_button_text, b);
            b.v(-2035990931);
            boolean F = b.F(ffskVar) | b.F(ffjiVar);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new ffix() { // from class: dplz
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffqy.d(ffsk.this, null, null, new dpmd(ffjiVar, null), 3);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hviVar2 = hviVar;
            c((ffix) R2, b2, a, a2, a3, hviVar2, false, b, (i2 << 15) & 458752);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpma
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    int i4 = i;
                    dpmf.a(hviVar3, ffjiVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(hvi hviVar, final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(595353862);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjiVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = hgs.a(ffhe.a, b);
                hfmVar.ad(R);
            }
            final ffsk ffskVar = (ffsk) R;
            ebe ebeVar = dwfd.a;
            fvo b2 = dwfd.b(gft.a(b).a, gft.a(b).b, b, 12);
            igq a = jie.a(R.drawable.gs_send_vd_theme_24, b, 0);
            String a2 = jii.a(R.string.popup_camera_send_button_content_description, b);
            String a3 = jii.a(R.string.popup_camera_send_button_text, b);
            b.v(1626821706);
            boolean F = b.F(ffskVar) | b.F(ffjiVar);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new ffix() { // from class: dplx
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffqy.d(ffsk.this, null, null, new dpme(ffjiVar, null), 3);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hviVar2 = hviVar;
            c((ffix) R2, b2, a, a2, a3, hviVar2, false, b, (i2 << 15) & 458752);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dply
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    int i4 = i;
                    dpmf.b(hviVar3, ffjiVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final ffix ffixVar, final fvo fvoVar, final igq igqVar, final String str, final String str2, final hvi hviVar, boolean z, hfd hfdVar, final int i) {
        ffix ffixVar2;
        int i2;
        hfd hfdVar2;
        final boolean z2;
        hfd b = hfdVar.b(-1750623745);
        if ((i & 6) == 0) {
            ffixVar2 = ffixVar;
            i2 = (true != b.F(ffixVar2) ? 2 : 4) | i;
        } else {
            ffixVar2 = ffixVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(fvoVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(igqVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(str) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(str2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.D(hviVar) ? 65536 : 131072;
        }
        int i3 = i2 | 1572864;
        if ((599187 & i3) == 599186 && b.I()) {
            b.s();
            z2 = z;
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwfj.a(ffixVar2, ebs.e(hviVar, 56.0f), true, null, fvoVar, null, null, null, hpx.d(-911073809, new dpmc(igqVar, str, str2), b), hfdVar2, (i3 & 14) | 805306368 | ((i3 >> 12) & 896) | ((i3 << 9) & 57344), 488);
            z2 = true;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpmb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar3 = ffix.this;
                    fvo fvoVar2 = fvoVar;
                    igq igqVar2 = igqVar;
                    String str3 = str;
                    String str4 = str2;
                    hvi hviVar2 = hviVar;
                    dpmf.c(ffixVar3, fvoVar2, igqVar2, str3, str4, hviVar2, z2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
