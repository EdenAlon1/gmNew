package defpackage;

import android.net.Uri;
import androidx.compose.foundation.layout.AspectRatioElement;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnxw {
    public static final void a(final dnwq dnwqVar, final String str, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1547857146);
        if (i3 == 0) {
            i2 = (true != b.D(dnwqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else if (dnwqVar instanceof dnwl) {
            b.v(913623567);
            q((dnwl) dnwqVar, str, b, i2 & 112);
            ((hfm) b).Z();
        } else if (dnwqVar instanceof dnwm) {
            b.v(913626096);
            p((dnwm) dnwqVar, str, null, b, i2 & 112);
            ((hfm) b).Z();
        } else if (dnwqVar instanceof dnwn) {
            b.v(913628527);
            o((dnwn) dnwqVar, str, null, b, i2 & 112);
            ((hfm) b).Z();
        } else if (dnwqVar instanceof dnwo) {
            b.v(913631026);
            d((dnwo) dnwqVar, str, b, i2 & 112);
            ((hfm) b).Z();
        } else {
            if (!(dnwqVar instanceof dnwp)) {
                b.v(913622342);
                ((hfm) b).Z();
                throw new ffcd();
            }
            b.v(913633684);
            r((dnwp) dnwqVar, str, null, b, i2 & 112);
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnww
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnwq dnwqVar2 = dnwq.this;
                    int i4 = i;
                    dnxw.a(dnwqVar2, str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final long r18, final defpackage.igq r20, final long r21, defpackage.hvi r23, float r24, final java.lang.String r25, defpackage.hfd r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnxw.b(long, igq, long, hvi, float, java.lang.String, hfd, int, int):void");
    }

    public static final void c(final dyh dyhVar, final dnwk dnwkVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-5691831);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnwkVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else if (dnwkVar == dnwk.b) {
            f(dyhVar, b, i2 & 14);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnxg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dyh dyhVar2 = dyh.this;
                    int i4 = i;
                    dnxw.c(dyhVar2, dnwkVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dnwo dnwoVar, final String str, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hvi a;
        hvi a2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1765858913);
        if (i3 == 0) {
            i2 = (true != b.D(dnwoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            c = ebs.c(hvi.e, 1.0f);
            a = dee.a(c, gft.a(b).v, idb.a);
            a2 = dlsj.a(a, str, true);
            dym.a(a2, null, hpx.d(-852696331, new dnxm(dnwoVar), b), b, 3072, 6);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnwz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnwo dnwoVar2 = dnwo.this;
                    int i4 = i;
                    dnxw.d(dnwoVar2, str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.dnwq r16, final java.lang.String r17, defpackage.hvi r18, defpackage.dnyl r19, defpackage.ffix r20, defpackage.hfd r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnxw.e(dnwq, java.lang.String, hvi, dnyl, ffix, hfd, int, int):void");
    }

    public static final void f(final dyh dyhVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-391905410);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hve hveVar = hvi.e;
            int i4 = huo.a;
            dwho.a(dnaa.a(dmzz.ei, b), null, ebs.k(dyhVar.a(hveVar, hum.i), 32.0f), ibw.h, b, 3120, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnwx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    dnxw.f(dyh.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final String str, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1002910246);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            hviVar2 = hviVar;
            dnyk.b(hviVar2, null, hpx.d(-979996536, new dnxi(str), b), b, ((i2 >> 3) & 14) | 384, 2);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnxc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dnxw.g(str2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final dnym dnymVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(990627936);
        if (i3 == 0) {
            i2 = (true != b.D(dnymVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            a = dlsj.a(hviVar, dnymVar.c(), true);
            dnyk.d(hpx.d(710069666, new dnxj(dnymVar), b), hpx.d(959348067, new dnxk(dnymVar), b), dnymVar.a(), s(a, dnymVar.e()), dnymVar.b(), b, 54);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnwy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnym dnymVar2 = dnym.this;
                    int i4 = i;
                    dnxw.h(dnymVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi d;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(680419222);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            d = ebs.d(hviVar, 1.0f);
            a = d.a(new AspectRatioElement(1.0f));
            dyc.b(a, b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnxd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnxw.i(hvi.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final defpackage.dnym r10, defpackage.hvi r11, defpackage.hfd r12, final int r13) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnxw.j(dnym, hvi, hfd, int):void");
    }

    public static final void k(final dnym dnymVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(714597162);
        if (i3 == 0) {
            i2 = (true != b.D(dnymVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            a = dlsj.a(hviVar, dnymVar.c(), true);
            dnyk.e(hpx.d(-1174718878, new dnxn(dnymVar), b), hpx.d(1306455715, new dnxo(dnymVar), b), hpx.d(-507336988, new dnxp(dnymVar), b), hpx.d(1973837605, new dnxq(dnymVar), b), dnymVar.a(), s(a, dnymVar.e()), dnymVar.b(), b, 3510);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnwt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnym dnymVar2 = dnym.this;
                    int i4 = i;
                    dnxw.k(dnymVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void l(final String str, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(293101295);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            hviVar2 = hviVar;
            dnyk.b(hviVar2, null, hpx.d(1003426305, new dnxr(str), b), b, ((i2 >> 3) & 14) | 384, 2);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnws
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dnxw.l(str2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void m(final dnym dnymVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(1386781427);
        if (i3 == 0) {
            i2 = (true != b.D(dnymVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            a = dlsj.a(hviVar, dnymVar.c(), true);
            dnyk.f(hpx.d(130926850, new dnxt(dnymVar), b), hpx.d(380205251, new dnxu(dnymVar), b), hpx.d(629483652, new dnxv(dnymVar), b), dnymVar.a(), s(a, dnymVar.e()), dnymVar.b(), b, 438);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnwv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnym dnymVar2 = dnym.this;
                    int i4 = i;
                    dnxw.m(dnymVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void o(final dnwn dnwnVar, final String str, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hfd hfdVar2;
        final hvi hviVar2;
        hfd b = hfdVar.b(-974161208);
        if ((i & 6) == 0) {
            i2 = i | (true != b.D(dnwnVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
            hviVar2 = hviVar;
        } else {
            hve hveVar = hvi.e;
            c = ebs.c(hveVar, 1.0f);
            hfdVar2 = b;
            Uri uri = dnwnVar.a;
            Uri uri2 = dnwnVar.d;
            int i4 = inp.a;
            dnac.a(uri, str, c, uri2, null, null, ino.a, null, 0.0f, null, null, null, "GlideMonogram", dnwnVar.c, null, null, hfdVar2, (i3 & 112) | 12582912, 196608, 425840);
            hviVar2 = hveVar;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnwu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnwn dnwnVar2 = dnwn.this;
                    String str2 = str;
                    int i5 = i;
                    dnxw.o(dnwnVar2, str2, hviVar2, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void p(final dnwm dnwmVar, final String str, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        hvi a;
        hvi a2;
        hfd b = hfdVar.b(1710651399);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dnwmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if (((i2 | 384) & 147) == 146 && b.I()) {
            b.s();
        } else {
            hviVar = hvi.e;
            c = ebs.c(hviVar, 1.0f);
            a = dee.a(c, iby.c(((Number) dnwmVar.a.a(b, 0)).intValue()), idb.a);
            a2 = dlsj.a(a, str, true);
            dym.a(a2, null, hpx.d(1175487325, new dnxl(dnwmVar), b), b, 3072, 6);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnxb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnwm dnwmVar2 = dnwm.this;
                    String str2 = str;
                    int i3 = i;
                    dnxw.p(dnwmVar2, str2, hviVar, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void q(final dnwl dnwlVar, final String str, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(-9502403);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dnwlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        if (((i2 | 384) & 147) != 146 || !b.I()) {
            ebs.c(hvi.e, 1.0f);
            throw null;
        }
        b.s();
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnxa
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnwl dnwlVar2 = dnwl.this;
                    int i3 = i;
                    dnxw.q(dnwlVar2, str, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void r(final dnwp dnwpVar, final String str, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        hfd b = hfdVar.b(-1057156266);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dnwpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(str) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            hviVar2 = hvi.e;
            b(iby.c(((Number) dnwpVar.a.a(b, 0)).intValue()), dnaa.a(dmzz.A, b), gft.a(b).v, hviVar2, 1.0f, str, b, ((i3 << 3) & 7168) | 24576 | ((i3 << 12) & 458752), 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnxf
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnwp dnwpVar2 = dnwp.this;
                    String str2 = str;
                    int i4 = i;
                    dnxw.r(dnwpVar2, str2, hviVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final hvi s(hvi hviVar, ffix ffixVar) {
        hvi d;
        return (ffixVar == null || (d = dfb.d(hviVar, false, null, ffixVar, 7)) == null) ? hviVar : d;
    }
}
