package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwvc {
    public static final void a(final cwvd cwvdVar, final Context context, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hvi c2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1109888170);
        if (i3 == 0) {
            i2 = (true != b.F(cwvdVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(context) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            c = ebs.c(hvi.e, 1.0f);
            b.v(2116029341);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffji() { // from class: cwuz
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.u(jkvVar, "sim_preference");
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c2 = jjs.c(c, false, (ffji) R);
            hvi j = eba.j(c2, 15.0f, 0.0f, 0.0f, 0.0f, 14);
            b.v(2116032634);
            boolean F = b.F(context) | b.F(cwvdVar);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new ffix() { // from class: cwva
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        eldl.q(context, cwvdVar.c, null);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hvi d = dfb.d(j, false, null, (ffix) R2, 7);
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
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
            String b3 = cuxh.b(cwvdVar.a);
            b3.getClass();
            hfdVar2 = b;
            dwjt.b(b3, null, e(b), 0L, null, null, 0L, new jyj(5), 0L, 0, false, 0, 0, null, gft.d(b).j, hfdVar2, 0, 0, 65018);
            String b4 = cuxh.b(cwvdVar.b);
            b4.getClass();
            dwjt.b(b4, null, e(hfdVar2), 0L, null, null, 0L, new jyj(5), 0L, 0, false, 0, 0, null, gft.d(hfdVar2).j, hfdVar2, 0, 0, 65018);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cwvb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cwvd cwvdVar2 = cwvd.this;
                    int i6 = i;
                    cwvc.a(cwvdVar2, context, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final List list, final Context context, final Intent intent, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        long j;
        int i3 = i & 6;
        hfd b = hfdVar.b(-308216697);
        if (i3 == 0) {
            i2 = (true != b.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(context) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(intent) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            hve hveVar = hvi.e;
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hveVar);
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
            d(b, 6);
            c(context, intent, b, (i2 >> 3) & 126);
            b.v(1943161165);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cwvd cwvdVar = (cwvd) it.next();
                d(b, 6);
                d = ebs.d(hvi.e, 1.0f);
                b.v(1087211232);
                if (dfq.a(b)) {
                    b.v(451587600);
                    j = gft.a(b).u;
                    hfmVar.Z();
                } else {
                    b.v(451643152);
                    j = gft.a(b).r;
                    hfmVar.Z();
                }
                hfmVar.Z();
                dwgw.a(d, 0.0f, j, b, 6, 2);
                d(b, 6);
                a(cwvdVar, context, b, i2 & 112);
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cwuw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    Context context2 = context;
                    int i6 = i;
                    cwvc.b(list2, context2, intent, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final Context context, final Intent intent, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1722500702);
        if (i3 == 0) {
            i2 = (true != b.F(context) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(intent) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            c = ebs.c(hvi.e, 1.0f);
            hvi j = eba.j(c, 15.0f, 0.0f, 0.0f, 0.0f, 14);
            b.v(-2021387106);
            boolean F = b.F(context) | b.F(intent);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new ffix() { // from class: cwux
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        eldl.q(context, intent, null);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi d = dfb.d(j, false, null, (ffix) R, 7);
            dxq dxqVar = dxu.c;
            int i4 = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, b, 0);
            int a2 = hey.a(b);
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
            String string = context.getString(R.string.general_settings);
            string.getClass();
            hfdVar2 = b;
            dwjt.b(string, null, e(b), 0L, null, null, 0L, new jyj(5), 0L, 0, false, 0, 0, null, gft.d(b).j, hfdVar2, 0, 0, 65018);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cwuy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Context context2 = context;
                    int i6 = i;
                    cwvc.c(context2, intent, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(hfd hfdVar, final int i) {
        int i2;
        hvi d;
        int i3 = i & 6;
        hfd b = hfdVar.b(272086554);
        if (i3 == 0) {
            i2 = (true != b.B(16) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            ebv.a(ebs.e(d, 16.0f), b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cwuv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cwvc.d((hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final long e(hfd hfdVar) {
        long j;
        hfdVar.v(1327463927);
        if (dfq.a(hfdVar)) {
            hfdVar.v(-1354462711);
            j = gft.a(hfdVar).v;
            ((hfm) hfdVar).Z();
        } else {
            hfdVar.v(-1354405175);
            j = gft.a(hfdVar).s;
            ((hfm) hfdVar).Z();
        }
        ((hfm) hfdVar).Z();
        return j;
    }
}
