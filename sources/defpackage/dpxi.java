package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpxi {
    public static final void a(final dpxk dpxkVar, final float f, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        String str;
        ebf ebfVar;
        hfm hfmVar;
        long f2;
        fvo c2;
        hfm hfmVar2;
        dpxkVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(1937417998);
        if (i3 == 0) {
            i2 = (true != b.D(dpxkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.A(f) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            String format = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(dpxkVar.a)}, 1));
            format.getClass();
            String b2 = jii.b(R.string.camera_zoom_button_content_description, new Object[]{format}, b);
            final boolean z = dpxkVar.b == dpxkVar.a;
            hvi a = hxz.a(ebs.k(hvi.e, 32.0f), f);
            b.v(42113247);
            boolean E = b.E(z);
            hfm hfmVar3 = (hfm) b;
            Object R = hfmVar3.R();
            if (E || R == hfc.a) {
                R = new ffji() { // from class: dpxd
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.r(jkvVar, z);
                        return ffcu.a;
                    }
                };
                hfmVar3.ad(R);
            }
            hfmVar3.Z();
            c = jjs.c(a, false, (ffji) R);
            eql eqlVar = eqm.a;
            ebf ebfVar2 = new ebf(0.0f, 0.0f, 0.0f, 0.0f);
            if (z) {
                b.v(1305695140);
                ebe ebeVar = fvp.a;
                hfmVar = hfmVar3;
                ebfVar = ebfVar2;
                str = b2;
                c2 = fvp.c(gft.a(b).f, gft.a(b).g, 0L, 0L, b, 12);
                hfmVar.Z();
            } else {
                str = b2;
                ebfVar = ebfVar2;
                hfmVar = hfmVar3;
                b.v(1305883589);
                ebe ebeVar2 = fvp.a;
                long j = gft.a(b).q;
                f2 = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), 0.2f, ibw.f(iby.d(4288322202L)));
                c2 = fvp.c(f2, j, 0L, 0L, b, 12);
                hfmVar.Z();
            }
            fvo fvoVar = c2;
            b.v(42114570);
            int i4 = i2 & 14;
            Object R2 = hfmVar.R();
            if (i4 == 4 || R2 == hfc.a) {
                R2 = new ffix() { // from class: dpxe
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dpxk dpxkVar2 = dpxk.this;
                        dpxkVar2.c.invoke(Float.valueOf(dpxkVar2.a));
                        return ffcu.a;
                    }
                };
                hfmVar2 = hfmVar;
                hfmVar2.ad(R2);
            } else {
                hfmVar2 = hfmVar;
            }
            hfmVar2.Z();
            fwa.a((ffix) R2, c, false, eqlVar, fvoVar, null, null, ebfVar, hpx.d(1576898302, new dpxh(str, format), b), b, 817889280, 356);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpxf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dpxk dpxkVar2 = dpxk.this;
                    int i5 = i;
                    dpxi.a(dpxkVar2, f, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
