package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.material.productlockup.ProductLockupView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class depj {
    public static final void a(final String str, final depa depaVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1774946352);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(depaVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            d = ebs.d(eba.j(hvi.e, 40.0f, 0.0f, 40.0f, 40.0f, 2), 1.0f);
            int i4 = huo.a;
            ipn a = ebm.a(dxu.a, hum.n, b, 48);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, d);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
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
            igq a3 = jie.a(depaVar.a, b, 0);
            hvi k = ebs.k(hvi.e, 36.0f);
            b.v(-873407670);
            ibl iblVar = depaVar.b ? new ibl(gft.a(b).s, 5) : null;
            hfmVar.Z();
            dgx.a(a3, null, k, null, null, 0.0f, iblVar, b, 432, 56);
            ebv.a(ebs.o(hvi.e, 24.0f), b);
            hfdVar2 = b;
            dwjt.b(str, null, gft.a(b).q, 0L, null, null, 0L, new jyj(5), 0L, 0, false, 0, 0, null, gft.d(b).k, hfdVar2, i2 & 14, 0, 65018);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: depi
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i6 = i;
                    depj.a(str2, depaVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dys dysVar, final depe depeVar, hfd hfdVar, final int i) {
        hvi d;
        hvi d2;
        int i2 = i & 6;
        hfd b = hfdVar.b(-651586858);
        int i3 = i2 == 0 ? (true != b.D(dysVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.F(depeVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            if (depeVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: depf
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            depj.b(dys.this, null, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            b.v(-1928461285);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffji() { // from class: depg
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        ProductLockupView productLockupView = new ProductLockupView(context);
                        productLockupView.b(context.getString(R.string.google_messages_title));
                        productLockupView.a(0);
                        return productLockupView;
                    }
                };
                hfmVar.ad(R);
            }
            ffji ffjiVar = (ffji) R;
            hfmVar.Z();
            d = ebs.d(hvi.e, 1.0f);
            hvi d3 = eba.d(d, 8.0f);
            int i4 = huo.a;
            kcg.b(ffjiVar, dys.a(d3, hum.k), null, b, 6, 4);
            ebv.a(ebs.e(hvi.e, 24.0f), b);
            dwjt.b(jii.a(R.string.welcome_new_user_title, b), null, gft.a(b).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).b, b, 0, 0, 65530);
            ebv.a(ebs.e(hvi.e, 2.0f), b);
            dwjt.b(jii.a(R.string.welcome_no_account_description, b), ebs.o(hvi.e, 358.0f), gft.a(b).q, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, gft.d(b).g, b, 48, 0, 65016);
            b = b;
            ebv.a(ebs.e(hvi.e, 48.0f), b);
            d2 = ebs.d(hvi.e, 1.0f);
            hvi a = dee.a(d2, gft.a(b).J, eqm.b(74.0f));
            ipn a2 = dyo.a(dxu.c, hum.j, b, 0);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            ebv.a(ebs.e(hvi.e, 40.0f), b);
            b.v(-1036017840);
            for (depb depbVar : depeVar.a) {
                a(jii.a(depbVar.a, b), depbVar.b, b, 0);
            }
            hfmVar.Z();
            b.n();
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: deph
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dys dysVar2 = dys.this;
                    int i6 = i;
                    depj.b(dysVar2, depeVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
