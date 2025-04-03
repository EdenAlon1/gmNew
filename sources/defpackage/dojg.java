package defpackage;

import android.content.Context;
import android.graphics.BitmapShader;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dojg {
    public static final hik a = new hgq(hla.a, doje.a);

    public static final void a(final dokx dokxVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        long j;
        hvi a2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-578400234);
        if (i3 == 0) {
            i2 = (true != b.D(dokxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(-664346604);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(null, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            if (dokxVar.b().b()) {
                b.v(880231599);
                j = gft.a(b).a;
                hfmVar.Z();
            } else {
                b.v(880288360);
                j = gft.a(b).B;
                hfmVar.Z();
            }
            der a3 = des.a(1.0f, j);
            ebf ebfVar = new ebf(16.0f, 12.0f, 16.0f, 12.0f);
            ffix a4 = dokxVar.a();
            b.v(-664325114);
            hvi x = ebs.x(hviVar, h(dokxVar, b), 0.0f, 2);
            if (hhoVar.a() != null) {
                x = x.a(eba.i(hvi.e, 0.0f, Math.max(Math.min(ffln.b((((int) (((jpg) r12).c & 4294967295L)) / (((Context) b.e(AndroidCompositionLocals_androidKt.b)).getResources().getDisplayMetrics().ydpi / 160.0f)) + 24.0f), 48) - 40, 0) / 2, 1));
            }
            hfmVar.Z();
            a2 = dlsj.a(x, dokxVar.d(), true);
            eql b2 = eqm.b(dokxVar.b().a());
            ebe ebeVar = dwfd.a;
            dwfj.d(a4, a2, false, b2, dwfd.e(g(b), b, 14), a3, ebfVar, hpx.d(392751496, new dojc(dokxVar, hhoVar), b), b, 817889280, 292);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doiv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dokx dokxVar2 = dokx.this;
                    int a5 = hip.a(i4 | 1);
                    dojg.a(dokxVar2, hviVar, (hfd) obj, a5);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dokx dokxVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi a2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1787602499);
        if (i3 == 0) {
            i2 = (true != b.D(dokxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            der derVar = new der(1.0f, new ibr(new BitmapShader(iay.a(jia.b(R.drawable.chipbg, b)), ibi.a(0), ibi.a(0))));
            ebf ebfVar = new ebf(12.0f, 4.0f, 12.0f, 4.0f);
            ffix a3 = dokxVar.a();
            a2 = dlsj.a(ebs.x(hviVar, h(dokxVar, b), 0.0f, 2), dokxVar.d(), true);
            eql b2 = eqm.b(dokxVar.b().a());
            ebe ebeVar = dwfd.a;
            dwfj.d(a3, a2, false, b2, dwfd.e(g(b), b, 14), derVar, ebfVar, hpx.d(119619723, new dojd(dokxVar), b), b, 817889280, 292);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doiy
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dokx dokxVar2 = dokx.this;
                    int a4 = hip.a(i4 | 1);
                    dojg.b(dokxVar2, hviVar, (hfd) obj, a4);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final ebq ebqVar, final dokx dokxVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1110296460);
        if (i3 == 0) {
            i2 = (true != b.D(ebqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dokxVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hvi k = ebs.k(hvi.e, 18.0f);
            int i4 = huo.a;
            hvi b2 = ebqVar.b(k, hum.n);
            if (dokxVar instanceof dokw) {
                b.v(-551544560);
                dokw dokwVar = (dokw) dokxVar;
                dokv dokvVar = dokwVar.a;
                if (dokvVar instanceof dokt) {
                    b.v(-551438385);
                    dwho.a(jie.a(((dokt) dokvVar).a, b, 0), null, b2, i(dokwVar.b, b), b, 0, 0);
                    ((hfm) b).Z();
                } else {
                    if (!(dokvVar instanceof doku)) {
                        b.v(-2096001500);
                        ((hfm) b).Z();
                        throw new ffcd();
                    }
                    b.v(-551133686);
                    dnac.a(((doku) dokvVar).a, null, b2, null, null, null, null, null, 0.0f, null, null, null, "ResourceUri", null, null, null, b, 0, 196608, 491512);
                    b = b;
                    ((hfm) b).Z();
                }
                ((hfm) b).Z();
            } else {
                if (!(dokxVar instanceof dokq)) {
                    b.v(-2096003249);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(-550871612);
                dokq dokqVar = (dokq) dokxVar;
                dmzz dmzzVar = dokqVar.a;
                b.v(-2095979602);
                igq a2 = dmzzVar == null ? null : dnaa.a(dmzzVar, b);
                hfm hfmVar = (hfm) b;
                hfmVar.Z();
                if (a2 != null) {
                    dwho.a(a2, null, b2, i(dokqVar.b, b), b, 0, 0);
                }
                hfmVar.Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dojb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    ebq ebqVar2 = ebq.this;
                    int a3 = hip.a(i5 | 1);
                    dojg.c(ebqVar2, dokxVar, (hfd) obj, a3);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dokx dokxVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        long j;
        hvi a2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1110554840);
        if (i3 == 0) {
            i2 = (true != b.D(dokxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dojx b2 = dokxVar.b();
            boolean z = b2 instanceof doju;
            doju dojuVar = z ? (doju) b2 : null;
            ffjm ffjmVar = dojuVar != null ? dojuVar.a : null;
            if (z) {
            }
            if (ffjmVar != null) {
                b.v(61977677);
                j = ((ibw) ffjmVar.a(b, 0)).i;
                ((hfm) b).Z();
            } else if (b2.b()) {
                b.v(62122881);
                j = gft.a(b).a;
                ((hfm) b).Z();
            } else {
                b.v(62179642);
                j = gft.a(b).B;
                ((hfm) b).Z();
            }
            der a3 = des.a(1.0f, j);
            ebf ebfVar = new ebf(12.0f, 4.0f, 12.0f, 4.0f);
            eql b3 = eqm.b(dokxVar.b().a());
            ffix a4 = dokxVar.a();
            a2 = dlsj.a(ebs.x(hviVar, h(dokxVar, b), 0.0f, 2), dokxVar.d(), true);
            ebe ebeVar = dwfd.a;
            dwfj.d(a4, a2, false, b3, dwfd.e(g(b), b, 14), a3, ebfVar, hpx.d(-1459431526, new dojf(dokxVar), b), b, 817889280, 292);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doiw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dokx dokxVar2 = dokx.this;
                    int a5 = hip.a(i4 | 1);
                    dojg.d(dokxVar2, hviVar, (hfd) obj, a5);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dokx dokxVar, final hvi hviVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(596044650);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dokxVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            int i6 = i3 & 112;
            if (i5 != 0) {
                hviVar = hvi.e;
            }
            dokq dokqVar = dokxVar instanceof dokq ? (dokq) dokxVar : null;
            dojx dojxVar = dokqVar != null ? dokqVar.b : null;
            if (dojxVar instanceof dojt) {
                b.v(1203637013);
                b(dokxVar, hviVar, b, i6);
                ((hfm) b).Z();
            } else if (dojxVar instanceof dojs) {
                b.v(1203639532);
                a(dokxVar, hviVar, b, i6);
                ((hfm) b).Z();
            } else {
                b.v(1203640976);
                d(dokxVar, hviVar, b, i3 & 126);
                ((hfm) b).Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: doix
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    dokx dokxVar2 = dokx.this;
                    int a2 = hip.a(i7 | 1);
                    dojg.e(dokxVar2, hviVar, (hfd) obj, a2, i2);
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.dokx r33, defpackage.hho r34, defpackage.hfd r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dojg.f(dokx, hho, hfd, int, int):void");
    }

    private static final long g(hfd hfdVar) {
        hfdVar.v(-918311533);
        ibw ibwVar = (ibw) hfdVar.e(a);
        long j = ibwVar == null ? gft.a(hfdVar).p : ibwVar.i;
        ((hfm) hfdVar).Z();
        return j;
    }

    private static final float h(dokx dokxVar, hfd hfdVar) {
        hfdVar.v(-434164891);
        String c = dokxVar.c();
        ((hfm) hfdVar).Z();
        return c != null ? 64.0f : 48.0f;
    }

    private static final long i(dojx dojxVar, hfd hfdVar) {
        long j;
        hfdVar.v(-1098809980);
        if (dojxVar instanceof dojv) {
            hfdVar.v(1896421726);
            j = gft.a(hfdVar).a;
            ((hfm) hfdVar).Z();
        } else if (dojxVar instanceof dojw) {
            hfdVar.v(1862293989);
            ((hfm) hfdVar).Z();
            j = ibw.h;
        } else {
            hfdVar.v(1862295585);
            j = gft.a(hfdVar).a;
            ((hfm) hfdVar).Z();
        }
        ((hfm) hfdVar).Z();
        return j;
    }
}
