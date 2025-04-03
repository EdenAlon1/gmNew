package defpackage;

import android.os.Build;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpzb {
    public static final void a(final ada adaVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi a;
        hfm hfmVar;
        hfd hfdVar2;
        adaVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(366745855);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(adaVar) : b.F(adaVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            d = ebs.d(hvi.e, 1.0f);
            hvi e = eba.e(dee.a(eba.j(eba.i(d, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), gft.a(b).r, eqm.a), 16.0f, 12.0f);
            dxj dxjVar = dxu.g;
            int i4 = huo.a;
            ipn a2 = ebm.a(dxjVar, hum.n, b, 54);
            int a3 = hey.a(b);
            hfm hfmVar2 = (hfm) b;
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, e);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            a = ebr.a.a(hvi.e, 1.0f, true);
            grl.b(jii.a(R.string.select_media_permission_request_text, b), a, gft.a(b).q, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).m, b, 0, 0, 65528);
            hvi d2 = eba.d(hvi.e, 12.0f);
            b.v(2062382152);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && b.F(adaVar));
            Object R = hfmVar2.R();
            if (z || R == hfc.a) {
                R = new ffix() { // from class: dpyy
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dpzb.b(ada.this);
                        return ffcu.a;
                    }
                };
                hfmVar = hfmVar2;
                hfmVar.ad(R);
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            hfdVar2 = b;
            grl.b(jii.a(R.string.select_media_permission_request_button, b), dfb.d(d2, false, null, (ffix) R, 7), gft.a(b).a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).m, hfdVar2, 0, 0, 65528);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpyz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dpzb.a(ada.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(ada adaVar) {
        adaVar.getClass();
        adaVar.c(Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : Build.VERSION.SDK_INT >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
    }
}
