package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class domq {
    public static final void a(final ffix ffixVar, final ffix ffixVar2, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(187602164);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar2) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hvi j = eba.j(hvi.e, 0.0f, 0.0f, 4.0f, 0.0f, 11);
            dxi dxiVar = dxu.a;
            int i4 = huo.a;
            ipn a = ebm.a(dxiVar, hum.m, b, 0);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, j);
            int i5 = ist.a;
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            b(dmzz.ag, jii.a(R.string.text_results_bar_previous, b), ffixVar, b, ((i2 << 6) & 896) | 6);
            b(dmzz.ah, jii.a(R.string.text_results_bar_next, b), ffixVar2, b, ((i2 << 3) & 896) | 6);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: domm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar4 = ffix.this;
                    int i6 = i;
                    domq.a(ffixVar4, ffixVar2, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmzz dmzzVar, final String str, ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2074331909);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            ffixVar2 = ffixVar;
            dwhl.b(ffixVar2, null, false, null, null, hpx.d(1054108057, new domp(dmzzVar, str), b), b, ((i2 >> 6) & 14) | 1572864, 62);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: domn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmzz dmzzVar2 = dmzz.this;
                    String str2 = str;
                    int i4 = i;
                    domq.b(dmzzVar2, str2, ffixVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final domr domrVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi b;
        hvi a;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(562311825);
        if (i3 == 0) {
            i2 = (true != b2.D(domrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            hvi e = ebs.e(hviVar, 56.0f);
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, b2, 0);
            int a3 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, e);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, a2, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            d = ebs.d(hvi.e, 1.0f);
            b = dys.b(d, 1.0f, true);
            a = dee.a(b, gft.a(b2).n, idb.a);
            ipn a4 = ebm.a(dxu.g, hum.n, b2, 54);
            int a5 = hey.a(b2);
            hqb ai2 = hfmVar.ai();
            hvi b4 = huz.b(b2, a);
            ffix ffixVar2 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar2);
            } else {
                b2.z();
            }
            hlc.b(b2, a4, iss.e);
            hlc.b(b2, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                hfmVar.ad(valueOf2);
                b2.h(valueOf2, ffjmVar2);
            }
            hlc.b(b2, b4, iss.c);
            hvi j = eba.j(hvi.e, 20.0f, 0.0f, 0.0f, 0.0f, 14);
            b2.v(663443680);
            String quantityString = ((Context) b2.e(AndroidCompositionLocals_androidKt.b)).getResources().getQuantityString(R.plurals.text_results_bar_results, domrVar.a, Integer.valueOf(domrVar.b), Integer.valueOf(domrVar.a));
            quantityString.getClass();
            hfmVar.Z();
            hfdVar2 = b2;
            dwjt.b(quantityString, j, gft.a(b2).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b2).k, hfdVar2, 48, 0, 65528);
            a(domrVar.c, domrVar.d, hfdVar2, 0);
            hfdVar2.n();
            dwgw.a(null, 0.0f, gft.a(hfdVar2).r, hfdVar2, 0, 3);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: domo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    domr domrVar2 = domr.this;
                    int i6 = i;
                    domq.c(domrVar2, hviVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
