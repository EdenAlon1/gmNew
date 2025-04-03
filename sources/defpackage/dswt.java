package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dswt {
    public static final void a(final dyh dyhVar, final String str, String str2, boolean z, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi a;
        final String str3;
        hfd b = hfdVar.b(781679860);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(str2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.E(true) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
            str3 = str2;
        } else {
            dxj dxjVar = dxu.g;
            int i3 = huo.a;
            hus husVar = hum.n;
            d = ebs.d(dyhVar.a(hvi.e, hum.h), 1.0f);
            hvi e = eba.e(d, 12.0f, 14.0f);
            ipn a2 = ebm.a(dxjVar, husVar, b, 54);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, e);
            int i4 = ist.a;
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
            ebr ebrVar = ebr.a;
            dbu dbuVar = dswb.a;
            cru.c(ebrVar, true, null, ctt.l(dswb.a, 2), ctt.m(dswb.a, 2), null, hpx.d(2014139960, new dswm(str), b), b, ((i2 >> 6) & 112) | 1600518, 18);
            b = b;
            hkx c = cxo.c(0.0f, dswb.a, null, b, 48, 28);
            a = ebrVar.a(hvi.e, 1.0f, true);
            ebv.a(a, b);
            b(null, str2, ((Number) c.a()).floatValue(), b, (i2 >> 3) & 112, 1);
            str3 = str2;
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            final boolean z2 = true;
            L.d = new ffjm(str, str3, z2, i) { // from class: dswj
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d = true;
                public final /* synthetic */ int e;

                {
                    this.e = i;
                }

                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    String str4 = this.b;
                    dswt.a(dyhVar2, str4, this.c, true, (hfd) obj, hip.a(this.e | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.hvi r28, final java.lang.String r29, float r30, defpackage.hfd r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dswt.b(hvi, java.lang.String, float, hfd, int, int):void");
    }

    public static final void c(final dyh dyhVar, final boolean z, final boolean z2, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        boolean z3;
        String a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-45049624);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z3 = z2;
            i2 |= true != b.E(z3) ? 128 : 256;
        } else {
            z3 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(ffixVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b.I()) {
            b.s();
        } else {
            dmzz dmzzVar = z ? dmzz.cD : dmzz.cW;
            if (z) {
                b.v(-2009476890);
                a = jii.a(R.string.video_pause_button_content_description, b);
                ((hfm) b).Z();
            } else {
                b.v(-2009394585);
                a = jii.a(R.string.video_play_button_content_description, b);
                ((hfm) b).Z();
            }
            hve hveVar = hvi.e;
            int i4 = huo.a;
            hvi a2 = dyhVar.a(hveVar, hum.e);
            dbu dbuVar = dswb.a;
            cru.b(z3, a2, ctt.l(dswb.a, 2), ctt.m(dswb.a, 2), null, hpx.d(1943570880, new dswn(a, dmzzVar, ffixVar), b), b, ((i2 >> 6) & 14) | 200064, 16);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dswi
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    boolean z4 = z;
                    boolean z5 = z2;
                    dswt.c(dyhVar2, z4, z5, ffixVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dyh dyhVar, final boolean z, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        long f;
        String a;
        hvi a2;
        hvi a3;
        hvi a4;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1702372483);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            dmzz dmzzVar = z ? dmzz.cB : dmzz.cT;
            f = iby.f(ibw.d(r2), ibw.c(r2), ibw.b(r2), 0.6f, ibw.f(dooy.a(b).i));
            if (z) {
                b.v(-972119681);
                a = jii.a(R.string.video_pause_button_content_description, b);
                ((hfm) b).Z();
            } else {
                b.v(-972037376);
                a = jii.a(R.string.video_play_button_content_description, b);
                ((hfm) b).Z();
            }
            a2 = dlsj.a(ebs.k(hvi.e, 48.0f), a, true);
            int i4 = huo.a;
            a3 = dee.a(hxo.a(dyhVar.a(a2, hum.e), eqm.a), f, idb.a);
            a4 = dee.a(ebs.k(hvi.e, 24.0f), ibw.g, idb.a);
            dnmv.a(a3, a4, 0.0f, dnaa.a(dmzzVar, b), null, dooy.a(b).j, ffixVar, b, ((i2 << 12) & 3670016) | 24624, 4);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dswk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    boolean z2 = z;
                    int i5 = i;
                    dswt.d(dyhVar2, z2, ffixVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final hvi hviVar, final float f, boolean z, final boolean z2, final ffji ffjiVar, final ffix ffixVar, hfd hfdVar, final int i) {
        hvi hviVar2;
        int i2;
        float f2;
        boolean z3;
        ffji ffjiVar2;
        long f3;
        hfd b = hfdVar.b(-217910357);
        if ((i & 6) == 0) {
            hviVar2 = hviVar;
            i2 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            f2 = f;
            i2 |= true != b.A(f2) ? 16 : 32;
        } else {
            f2 = f;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z3 = z2;
            i2 |= true != b.E(z3) ? 1024 : 2048;
        } else {
            z3 = z2;
        }
        if ((i & 24576) == 0) {
            ffjiVar2 = ffjiVar;
            i2 |= true != b.F(ffjiVar2) ? 8192 : 16384;
        } else {
            ffjiVar2 = ffjiVar;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.F(ffixVar) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
        } else {
            b.v(-227099266);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar.ad(R);
            }
            dwn dwnVar = (dwn) R;
            hfmVar.Z();
            long j = dooy.a(b).j;
            long j2 = dooy.a(b).j;
            f3 = iby.f(ibw.d(r1), ibw.c(r1), ibw.b(r1), 0.3f, ibw.f(dooy.a(b).j));
            gmm c = dwiv.c(j, j2, f3, b, 1012);
            dbu dbuVar = dswb.a;
            cru.b(true, hviVar2, ctt.l(dswb.a, 2), ctt.m(dswb.a, 2), null, hpx.d(-1431588733, new dsws(f2, ffjiVar2, z3, ffixVar, c, dwnVar), b), b, ((i2 >> 6) & 14) | 200064 | ((i2 << 3) & 112), 16);
        }
        hio L = b.L();
        if (L != null) {
            final boolean z4 = true;
            L.d = new ffjm(f, z4, z2, ffjiVar, ffixVar, i) { // from class: dswf
                public final /* synthetic */ float b;
                public final /* synthetic */ boolean c = true;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ ffji e;
                public final /* synthetic */ ffix f;
                public final /* synthetic */ int g;

                {
                    this.d = z2;
                    this.e = ffjiVar;
                    this.f = ffixVar;
                    this.g = i;
                }

                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar3 = hvi.this;
                    float f4 = this.b;
                    boolean z5 = this.d;
                    ffji ffjiVar3 = this.e;
                    dswt.e(hviVar3, f4, true, z5, ffjiVar3, this.f, (hfd) obj, hip.a(this.g | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final hvi hviVar, final String str, hfd hfdVar, final int i) {
        int i2;
        long f;
        hvi a;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(719902646);
        if (i3 == 0) {
            i2 = i | (true != b.D(hviVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            f = iby.f(ibw.d(r4), ibw.c(r4), ibw.b(r4), 0.7f, ibw.f(dooy.a(b).i));
            a = dee.a(hxo.a(hviVar, eqm.b(20.0f)), f, idb.a);
            int i4 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
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
            hfdVar2 = b;
            dwjt.b(str, eba.e(hvi.e, 5.0f, 2.0f), dooy.a(b).j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpo.y(gft.d(b).n, 0L, 0L, null, null, null, "tnum", 0L, null, 3, 0, 0L, null, null, 0, 16744383), hfdVar2, (i2 >> 3) & 14, 0, 65528);
            hfdVar2.n();
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dswg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i6 = i;
                    dswt.f(hviVar2, str, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final hvi hviVar, boolean z, boolean z2, final String str, ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        boolean z3;
        final boolean z4;
        final ffix ffixVar2;
        ffixVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(1197925283);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(str) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(ffixVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
            z3 = z2;
            ffixVar2 = ffixVar;
            z4 = z;
        } else {
            int i4 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
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
            dyi dyiVar = dyi.a;
            z3 = z2;
            c(dyiVar, z, z3, ffixVar, b, (i2 & 112) | 6 | (i2 & 896) | ((i2 >> 3) & 7168));
            z4 = z;
            ffixVar2 = ffixVar;
            hvi b3 = dyiVar.b(hvi.e);
            ipn a3 = dyc.a(hum.a, false);
            int a4 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b4 = huz.b(b, b3);
            ffix ffixVar4 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar4);
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
            hlc.b(b, b4, iss.c);
            dyi dyiVar2 = dyi.a;
            hus husVar = hum.n;
            hvi a5 = dyiVar2.a(hvi.e, hum.i);
            ipn a6 = ebm.a(dxu.a, husVar, b, 48);
            int a7 = hey.a(b);
            hqb ai3 = hfmVar.ai();
            hvi b5 = huz.b(b, a5);
            ffix ffixVar5 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar5);
            } else {
                b.z();
            }
            hlc.b(b, a6, iss.e);
            hlc.b(b, ai3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                Integer valueOf3 = Integer.valueOf(a7);
                hfmVar.ad(valueOf3);
                b.h(valueOf3, ffjmVar3);
            }
            hlc.b(b, b5, iss.c);
            f(eba.d(hvi.e, 16.0f), str, b, ((i2 >> 6) & 112) | 6);
            b.n();
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            final boolean z5 = z3;
            L.d = new ffjm() { // from class: dswe
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    boolean z6 = z4;
                    boolean z7 = z5;
                    String str2 = str;
                    dswt.g(hviVar2, z6, z7, str2, ffixVar2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final hvi hviVar, final boolean z, boolean z2, final boolean z3, final boolean z4, final String str, final String str2, final float f, final ffix ffixVar, final ffji ffjiVar, final ffix ffixVar2, hfd hfdVar, final int i, final int i2) {
        hvi hviVar2;
        int i3;
        boolean z5;
        String str3;
        String str4;
        float f2;
        ffix ffixVar3;
        ffji ffjiVar2;
        int i4;
        ffixVar.getClass();
        ffjiVar.getClass();
        ffixVar2.getClass();
        hfd b = hfdVar.b(-1613432712);
        if ((i & 6) == 0) {
            hviVar2 = hviVar;
            i3 = (true != b.D(hviVar2) ? 2 : 4) | i;
        } else {
            hviVar2 = hviVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != b.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.E(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z5 = z3;
            i3 |= true != b.E(z5) ? 1024 : 2048;
        } else {
            z5 = z3;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b.E(z4) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            str3 = str;
            i3 |= true != b.D(str3) ? 65536 : 131072;
        } else {
            str3 = str;
        }
        if ((1572864 & i) == 0) {
            str4 = str2;
            i3 |= true != b.D(str4) ? 524288 : 1048576;
        } else {
            str4 = str2;
        }
        if ((12582912 & i) == 0) {
            f2 = f;
            i3 |= true != b.A(f2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        } else {
            f2 = f;
        }
        if ((100663296 & i) == 0) {
            ffixVar3 = ffixVar;
            i3 |= true != b.F(ffixVar3) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            ffixVar3 = ffixVar;
        }
        if ((805306368 & i) == 0) {
            ffjiVar2 = ffjiVar;
            i3 |= true != b.F(ffjiVar2) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        } else {
            ffjiVar2 = ffjiVar;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != b.F(ffixVar2) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 3) == 2 && b.I()) {
            b.s();
        } else {
            int i5 = (i3 & 14) | 3072;
            hvi hviVar3 = hviVar2;
            dym.a(hviVar3, null, hpx.d(-1852953906, new dswp(z, z4, ffixVar3, f2, true, z5, ffjiVar2, ffixVar2, str3, str4), b), b, i5, 6);
        }
        hio L = b.L();
        if (L != null) {
            final boolean z6 = true;
            L.d = new ffjm(z, z6, z3, z4, str, str2, f, ffixVar, ffjiVar, ffixVar2, i, i2) { // from class: dswh
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c = true;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ String f;
                public final /* synthetic */ String g;
                public final /* synthetic */ float h;
                public final /* synthetic */ ffix i;
                public final /* synthetic */ ffji j;
                public final /* synthetic */ ffix k;
                public final /* synthetic */ int l;
                public final /* synthetic */ int m;

                {
                    this.d = z3;
                    this.e = z4;
                    this.f = str;
                    this.g = str2;
                    this.h = f;
                    this.i = ffixVar;
                    this.j = ffjiVar;
                    this.k = ffixVar2;
                    this.l = i;
                    this.m = i2;
                }

                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    hfd hfdVar2 = (hfd) obj;
                    ((Integer) obj2).intValue();
                    hvi hviVar4 = hvi.this;
                    boolean z7 = this.b;
                    boolean z8 = this.d;
                    boolean z9 = this.e;
                    String str5 = this.f;
                    String str6 = this.g;
                    float f3 = this.h;
                    ffix ffixVar4 = this.i;
                    ffji ffjiVar3 = this.j;
                    int i6 = this.l;
                    dswt.h(hviVar4, z7, true, z8, z9, str5, str6, f3, ffixVar4, ffjiVar3, this.k, hfdVar2, hip.a(i6 | 1), hip.a(this.m));
                    return ffcu.a;
                }
            };
        }
    }
}
