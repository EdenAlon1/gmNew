package defpackage;

import android.text.format.DateUtils;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlzo {
    public static final void a(final float f, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(304703075);
        if (i3 == 0) {
            i2 = (true != b.A(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            a = dee.a(hxo.a(ebs.k(hvi.e, f), eqm.a), gft.a(b).w, idb.a);
            dyc.b(a, b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlzn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlzo.a(f, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dlzq dlzqVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        long j;
        hfd hfdVar2;
        hfd b = hfdVar.b(-581172012);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dlzqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
            hfdVar2 = b;
        } else {
            hviVar2 = hvi.e;
            dxj dxjVar = dxu.e;
            int i3 = huo.a;
            ipn a = ebm.a(dxjVar, hum.n, b, 54);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar2);
            int i4 = ist.a;
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
            hvi k = ebs.k(hvi.e, 8.0f);
            ipn a3 = dyc.a(hum.e, false);
            int a4 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, k);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf2 = Integer.valueOf(a4);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            b.v(-662782749);
            float f = ((jzq) czk.c(czk.b(b), new jzq(4.0f), new jzq(8.0f), dcp.c, dooy.c(b).e, b, 33208).a()).a;
            hfmVar.Z();
            a(f, b, 0);
            b.n();
            hvi j2 = eba.j(hvi.e, 7.0f, 0.0f, 0.0f, 0.0f, 14);
            String formatElapsedTime = DateUtils.formatElapsedTime(dlzqVar.a.getSeconds());
            formatElapsedTime.getClass();
            b.v(-1182005364);
            Duration minus = dlzqVar.b.minus(dlzqVar.a);
            Duration duration = dlzp.a;
            if (minus.compareTo(dlzp.a) <= 0) {
                b.v(-379263540);
                j = gft.a(b).w;
                hfmVar.Z();
            } else {
                b.v(-379216792);
                j = gft.a(b).q;
                hfmVar.Z();
            }
            hfmVar.Z();
            hfdVar2 = b;
            dwjt.b(formatElapsedTime, j2, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpo.y(gft.d(b).k, 0L, 0L, null, null, null, "tnum", 0L, null, 0, 0, 0L, null, null, 0, 16777151), hfdVar2, 48, 0, 65528);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlzm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlzq dlzqVar2 = dlzq.this;
                    int i5 = i;
                    dlzo.b(dlzqVar2, hviVar2, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
