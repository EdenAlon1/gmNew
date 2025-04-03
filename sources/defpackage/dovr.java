package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovr {
    public static final void a(final dyh dyhVar, final String str, hfd hfdVar, final int i) {
        int i2;
        long f;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1351040213);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hve hveVar = hvi.e;
            int i4 = huo.a;
            hvi a = jfw.a(eba.j(dyhVar.a(hveVar, hum.g), 8.0f, 0.0f, 0.0f, 8.0f, 6), "video_controls_duration_tag");
            f = iby.f(ibw.d(r3), ibw.c(r3), ibw.b(r3), 0.7f, ibw.f(dooy.a(b).i));
            gpa.c(a, eqm.a, f, 0L, 0.0f, 0.0f, null, hpx.d(1818921584, new dovp(str), b), b, 120);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dovn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    int i5 = i;
                    dovr.a(dyhVar2, str, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmzz dmzzVar, String str, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        final String str2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1366438761);
        if (i3 == 0) {
            i2 = (true != b.D(dmzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            str2 = str;
        } else {
            a = dee.a(ebs.k(hvi.e, 16.0f), ibw.a, idb.a);
            ebv.a(a, b);
            str2 = str;
            dwho.a(dnaa.a(dmzzVar, b), str2, ebs.k(hvi.e, 40.0f), ibw.d, b, (i2 & 112) | 3456, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dovl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmzz dmzzVar2 = dmzz.this;
                    int i4 = i;
                    dovr.b(dmzzVar2, str2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dyh dyhVar, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1150281173);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(false) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            dmzz dmzzVar = dmzz.cW;
            b.v(1636371871);
            String a = jii.a(R.string.video_controls_play_content_description, b);
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            if (ffixVar != null) {
                b.v(1636475783);
                hve hveVar = hvi.e;
                int i4 = huo.a;
                dwhl.b(ffixVar, dyhVar.a(hveVar, hum.e), false, null, null, hpx.d(-164085724, new dovq(dmzzVar, a), b), b, ((i2 >> 6) & 14) | 1572864, 60);
                hfmVar.Z();
            } else {
                b.v(1636646748);
                hve hveVar2 = hvi.e;
                int i5 = huo.a;
                hvi a2 = dyhVar.a(hveVar2, hum.e);
                ipn a3 = dyc.a(hum.e, false);
                int a4 = hey.a(b);
                hqb ai = hfmVar.ai();
                hvi b2 = huz.b(b, a2);
                int i6 = ist.a;
                ffix ffixVar2 = iss.a;
                b.x();
                if (hfmVar.z) {
                    b.j(ffixVar2);
                } else {
                    b.z();
                }
                hlc.b(b, a3, iss.e);
                hlc.b(b, ai, iss.d);
                ffjm ffjmVar = iss.f;
                if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                    Integer valueOf = Integer.valueOf(a4);
                    hfmVar.ad(valueOf);
                    b.h(valueOf, ffjmVar);
                }
                hlc.b(b, b2, iss.c);
                b(dmzzVar, a, b, 0);
                b.n();
                hfmVar.Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dovm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    int i7 = i;
                    dovr.c(dyhVar2, ffixVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dyh dyhVar, final dovt dovtVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1713133330);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dovtVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hvi b2 = dyhVar.b(hvi.e);
            int i4 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b, b2);
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
            hlc.b(b, b3, iss.c);
            dyi dyiVar = dyi.a;
            b.v(522353130);
            c(dyiVar, dovtVar.b, b, 6);
            hfmVar.Z();
            String str = dovtVar.a;
            b.v(522357908);
            if (str != null) {
                a(dyiVar, str, b, 6);
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dovo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    dovt dovtVar2 = dovtVar;
                    int i6 = i;
                    dovr.d(dyhVar2, dovtVar2, hviVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
