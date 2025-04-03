package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajna {
    public static final void a(final ajmx ajmxVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi a;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-37431158);
        if (i3 == 0) {
            i2 = (true != b.D(ajmxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            d = ebs.d(hvi.e, 1.0f);
            hvi e = eba.e(d, 8.0f, 4.0f);
            dxj dxjVar = dxu.e;
            int i4 = huo.a;
            ipn a2 = ebm.a(dxjVar, hum.m, b, 6);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, e);
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
            a = dlsj.a(eba.j(ebs.A(hvi.e), 12.0f, 4.0f, 12.0f, 0.0f, 8), jii.b(R.string.sending_as_a11y_description, new Object[]{ajmxVar.a}, b), true);
            b.v(2092067707);
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffji() { // from class: ajmy
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((jkv) obj).getClass();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi b3 = jjs.b(a, (ffji) R);
            ipn a4 = ebm.a(dxu.e, hum.n, b, 54);
            int a5 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b4 = huz.b(b, b3);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a4, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b4, iss.c);
            hfdVar2 = b;
            dwjt.b(jii.a(R.string.sending_as_prefix, b), null, gft.a(b).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).l, hfdVar2, 0, 0, 65530);
            ebv.a(ebs.o(hvi.e, 6.0f), hfdVar2);
            dnxw.j(new dnyo(ajmxVar.b, null, 0, null, 0.0f, null, 62), ebs.h(hvi.e, 24.0f), hfdVar2, 48);
            ebv.a(ebs.o(hvi.e, 6.0f), hfdVar2);
            dwjt.b(ajmxVar.a, null, gft.a(hfdVar2).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(hfdVar2).l, hfdVar2, 0, 3120, 55290);
            hfdVar2.n();
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: ajmz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    ajna.a(ajmx.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
