package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmcf {
    public static final void a(final dmat dmatVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2143150952);
        if (i3 == 0) {
            i2 = (true != b.D(dmatVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            c(dmatVar.c, dmatVar.d, dmatVar.e, null, 0L, 0L, 0.0f, 0.0f, hpx.d(561251407, new dmbw(dmatVar), b), b, 100663296, 248);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmbr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmcf.a(dmat.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dmba dmbaVar, final boolean z, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1946934488);
        if (i3 == 0) {
            i2 = (true != b.D(dmbaVar) ? 2 : 4) | i;
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
        } else if (dmbaVar instanceof dmay) {
            b.v(1665853502);
            k((dmay) dmbaVar, z, ffixVar, b, i2 & 1008);
            ((hfm) b).Z();
        } else if (dmbaVar instanceof dmau) {
            b.v(1665856514);
            d((dmau) dmbaVar, z, ffixVar, b, i2 & 1008);
            ((hfm) b).Z();
        } else if (dmbaVar instanceof dmax) {
            b.v(1665859847);
            j((dmax) dmbaVar, z, ffixVar, b, i2 & 1008);
            ((hfm) b).Z();
        } else if (dmbaVar instanceof dmav) {
            b.v(1665862870);
            e((dmav) dmbaVar, z, b, i2 & 112);
            ((hfm) b).Z();
        } else if (dmbaVar instanceof dmaw) {
            b.v(1665865409);
            f((dmaw) dmbaVar, b, 0);
            ((hfm) b).Z();
        } else if (dmbaVar instanceof dmaz) {
            b.v(1665867198);
            l((dmaz) dmbaVar, b, 0);
            ((hfm) b).Z();
        } else {
            if (!(dmbaVar instanceof dmat)) {
                b.v(1665852509);
                ((hfm) b).Z();
                throw new ffcd();
            }
            b.v(1665869059);
            a((dmat) dmbaVar, b, 0);
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmbm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmba dmbaVar2 = dmba.this;
                    boolean z2 = z;
                    int i4 = i;
                    dmcf.b(dmbaVar2, z2, ffixVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final int r21, final java.lang.String r22, final defpackage.dmci r23, defpackage.hvi r24, long r25, long r27, float r29, float r30, final defpackage.ffjn r31, defpackage.hfd r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmcf.c(int, java.lang.String, dmci, hvi, long, long, float, float, ffjn, hfd, int, int):void");
    }

    public static final void d(final dmau dmauVar, final boolean z, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1919058574);
        if (i3 == 0) {
            i2 = (true != b.D(dmauVar) ? 2 : 4) | i;
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
            int i4 = i2 << 12;
            g(dmzz.aX, dmauVar.a, 0, dmauVar.b, null, z, ffixVar, b, (458752 & i4) | 6 | (i4 & 3670016), 16);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmbg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmau dmauVar2 = dmau.this;
                    boolean z2 = z;
                    int i5 = i;
                    dmcf.d(dmauVar2, z2, ffixVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dmav dmavVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1234212868);
        if (i3 == 0) {
            i2 = (true != b.D(dmavVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else if (dmavVar.a.length() == 0) {
            b.v(802868607);
            String str = dmavVar.c;
            int i4 = dmavVar.b;
            dmci dmciVar = dmavVar.d;
            int i5 = dmciVar.a;
            int i6 = i2;
            dmzz dmzzVar = dmzz.bI;
            ibw ibwVar = new ibw(s(i5, dooy.f(b), b));
            b.v(-251185761);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffix() { // from class: dmbb
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            g(dmzzVar, str, i4, dmciVar, ibwVar, z, (ffix) R, b, ((i6 << 12) & 458752) | 1572870, 0);
            hfmVar.Z();
        } else {
            b.v(803193673);
            c(dmavVar.b, dmavVar.c, dmavVar.d, null, 0L, 0L, 0.0f, 0.0f, hpx.d(-169409449, new dmca(dmavVar), b), b, 100663296, 248);
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmbk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmav dmavVar2 = dmav.this;
                    int i7 = i;
                    dmcf.e(dmavVar2, z, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final dmaw dmawVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1329682360);
        if (i3 == 0) {
            i2 = (true != b.D(dmawVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            int i4 = dmawVar.c;
            String str = dmawVar.d;
            dmci dmciVar = dmawVar.e;
            c(i4, str, dmciVar, null, 0L, 0L, t(dmciVar.b, b) * dmawVar.b, t(dmawVar.e.b, b) * dmawVar.b, hpx.d(1393668847, new dmcb(dmawVar), b), b, 100663296, 56);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmbs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    dmcf.f(dmaw.this, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.dmzz r16, final java.lang.String r17, final int r18, final defpackage.dmci r19, defpackage.ibw r20, final boolean r21, final defpackage.ffix r22, defpackage.hfd r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmcf.g(dmzz, java.lang.String, int, dmci, ibw, boolean, ffix, hfd, int, int):void");
    }

    public static final void h(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-929465029);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            Uri parse = Uri.parse(str);
            int i4 = inp.a;
            hfdVar2 = b;
            dnac.a(parse, null, eba.d(hvi.e, 0.5f), null, null, null, ino.b, null, 0.0f, null, null, null, null, null, null, null, hfdVar2, 12583344, 0, 524152);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmbe
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    dmcf.h(str, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1680758493);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dwjt.b(str, dlsj.c(hvi.e), ((ibw) b.e(fzc.a)).i, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, q(b), hfdVar2, i2 & 14, 0, 65016);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmbo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmcf.i(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final dmax dmaxVar, final boolean z, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1085599952);
        if (i3 == 0) {
            i2 = (true != b.D(dmaxVar) ? 2 : 4) | i;
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
            final jdt jdtVar = (jdt) b.e(jdr.k);
            final Context context = (Context) b.e(AndroidCompositionLocals_androidKt.b);
            final View view = (View) b.e(AndroidCompositionLocals_androidKt.g);
            String str = dmaxVar.a;
            dmci dmciVar = dmaxVar.b;
            dmzz dmzzVar = dmzz.f10do;
            b.v(-48868446);
            boolean D = b.D(jdtVar) | b.F(context) | b.F(view);
            boolean z2 = (i2 & 896) == 256;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z2 | D) || R == hfc.a) {
                R = new ffix() { // from class: dmbc
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        jdt jdtVar2 = jdt.this;
                        if (jdtVar2 != null) {
                            Context context2 = context;
                            jdtVar2.a();
                            InputMethodManager inputMethodManager = (InputMethodManager) context2.getSystemService(InputMethodManager.class);
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                            }
                        }
                        ffixVar.invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            g(dmzzVar, str, 0, dmciVar, null, z, (ffix) R, b, ((i2 << 12) & 458752) | 6, 16);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmbd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmax dmaxVar2 = dmax.this;
                    boolean z3 = z;
                    int i4 = i;
                    dmcf.j(dmaxVar2, z3, ffixVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void k(final dmay dmayVar, final boolean z, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(922735656);
        if (i3 == 0) {
            i2 = (true != b.D(dmayVar) ? 2 : 4) | i;
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
            int i4 = i2 << 12;
            g(dmzz.dI, dmayVar.a, 0, dmayVar.b, null, z, ffixVar, b, (458752 & i4) | 6 | (i4 & 3670016), 16);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmbn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmay dmayVar2 = dmay.this;
                    boolean z2 = z;
                    int i5 = i;
                    dmcf.k(dmayVar2, z2, ffixVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void l(final dmaz dmazVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(374984922);
        if (i3 == 0) {
            i2 = (true != b.D(dmazVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            jpi a = jpj.a(b);
            c(0, dmazVar.b, dmazVar.c, null, 0L, 0L, Math.max(((int) (((int) (jpi.a(a, dmazVar.a, q(b), 0, 0, 0L, 1020).c >> 32)) / Resources.getSystem().getDisplayMetrics().density)) + (t(dmazVar.c.b, b) - r(8, b)), r(40, b)), 0.0f, hpx.d(1736483153, new dmcd(dmazVar), b), b, 100663296, 184);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmbq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dmcf.l(dmaz.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void m(final dmas dmasVar, hfd hfdVar, final int i) {
        int i2;
        hfm hfmVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(1447191808);
        if (i3 == 0) {
            i2 = (true != b.D(dmasVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(false) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            ffix ffixVar = dmasVar.c;
            hve hveVar = hvi.e;
            b.v(-1728761616);
            hfm hfmVar2 = (hfm) b;
            Object R = hfmVar2.R();
            if (R == hfc.a) {
                R = new dwn();
                hfmVar2.ad(R);
            }
            hfmVar2.Z();
            hvi b2 = dlsj.b(dfb.c(hveVar, (dwn) R, null, false, null, null, ffixVar, 20));
            dxn dxnVar = new dxn(8.0f, true, dxr.a);
            int i4 = huo.a;
            ipn a = ebm.a(dxnVar, hum.m, b, 6);
            int a2 = hey.a(b);
            hqb ai = hfmVar2.ai();
            hvi b3 = huz.b(b, b2);
            int i5 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar2.z || !ffkj.e(hfmVar2.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar2.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b3, iss.c);
            if (dmasVar.b != null) {
                b.v(-203580537);
                jzn jznVar = (jzn) b.e(jdr.e);
                List list = dmasVar.a;
                dlti dltiVar = dmasVar.b;
                b.v(1240365124);
                boolean z = (i2 & 112) == 32;
                boolean D = b.D(jznVar) | z;
                Object R2 = hfmVar2.R();
                if (D || R2 == hfc.a) {
                    R2 = new ffji() { // from class: dmbi
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            ((Integer) obj).intValue();
                            return ctt.l(null, 3).a(ctt.n(null, 0.0f, 0L, 7)).a(cue.a);
                        }
                    };
                    hfmVar2.ad(R2);
                }
                ffji ffjiVar = (ffji) R2;
                hfmVar2.Z();
                b.v(1240391005);
                boolean D2 = b.D(jznVar) | z;
                Object R3 = hfmVar2.R();
                if (D2 || R3 == hfc.a) {
                    R3 = new ffji() { // from class: dmbj
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            ((Integer) obj).intValue();
                            return ctt.m(null, 3).a(ctt.o(null, 0.0f, 0L, 7)).a(cug.a);
                        }
                    };
                    hfmVar2.ad(R3);
                }
                hfmVar2.Z();
                hfmVar = hfmVar2;
                dlth.b(list, dltiVar, ffjiVar, (ffji) R3, null, hpx.d(20149687, new dmbx(dmasVar), b), b, 196608);
                hfmVar.Z();
            } else {
                hfmVar = hfmVar2;
                b.v(-201858456);
                Iterator it = dmasVar.a.iterator();
                while (it.hasNext()) {
                    b((dmba) it.next(), dmasVar.e.a, dmasVar.c, b, 0);
                }
                hfmVar.Z();
            }
            b.n();
            Integer valueOf2 = Integer.valueOf(dmasVar.a.size());
            b.v(-1728689379);
            int i6 = i2 & 14;
            Object R4 = hfmVar.R();
            if (i6 == 4 || R4 == hfc.a) {
                R4 = new dmby(dmasVar, null);
                hfmVar.ad(R4);
            }
            hfmVar.Z();
            hgs.g(valueOf2, (ffjm) R4, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmbl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    dmcf.m(dmas.this, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final float o(long j, hfd hfdVar) {
        hfdVar.v(1135685962);
        float ef = ((jzn) hfdVar.e(jdr.e)).ef(j);
        hfdVar.o();
        return ef;
    }

    public static final void p(final dmcg dmcgVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi hviVar2;
        hfd b = hfdVar.b(-486407539);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dmcgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            int i4 = dmcgVar.b;
            if (i4 != 1) {
                hviVar2 = hviVar.a(i4 == 2 ? eba.j(hvi.e, 0.0f, 0.0f, 52.0f, 0.0f, 11) : eba.j(hvi.e, 52.0f, 0.0f, 0.0f, 0.0f, 14));
            } else {
                hviVar2 = hviVar;
            }
            dxn dxnVar = new dxn(12.0f, true, dxr.a);
            int i5 = huo.a;
            ipn a = ebm.a(dxnVar, hum.m, b, 6);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar2);
            int i6 = ist.a;
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
            b.v(-1952429810);
            Iterator it = dmcgVar.a.iterator();
            while (it.hasNext()) {
                m((dmas) it.next(), b, (i3 >> 3) & 112);
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dmbh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dmcg dmcgVar2 = dmcg.this;
                    int i7 = i;
                    dmcf.p(dmcgVar2, hviVar, (hfd) obj, hip.a(i7 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final jpo q(hfd hfdVar) {
        hfdVar.v(-429571024);
        jpo y = jpo.y((jpo) hfdVar.e(grl.a), 0L, gft.d(hfdVar).j.g(), null, null, null, null, 0L, null, 0, 0, gft.d(hfdVar).j.g(), null, null, 0, 16646141);
        ((hfm) hfdVar).Z();
        return y;
    }

    private static final float r(int i, hfd hfdVar) {
        hfdVar.v(-383972475);
        float o = o(kal.c(i), hfdVar);
        ((hfm) hfdVar).Z();
        return o;
    }

    private static final long s(int i, boolean z, hfd hfdVar) {
        long j;
        hfdVar.v(1978301337);
        if (i != 1) {
            j = ibw.d;
        } else if (z) {
            hfdVar.v(-1059910364);
            j = gft.a(hfdVar).H;
            ((hfm) hfdVar).Z();
        } else {
            hfdVar.v(-1059837979);
            j = gft.a(hfdVar).J;
            ((hfm) hfdVar).Z();
        }
        ((hfm) hfdVar).Z();
        return j;
    }

    private static final float t(int i, hfd hfdVar) {
        float o;
        hfdVar.v(678237569);
        if (i - 1 != 0) {
            hfdVar.v(-1277171679);
            long g = gft.d(hfdVar).d.g();
            kal.e(g);
            o = o(kal.d(kak.b(g), (float) (kak.a(g) * 1.13d)), hfdVar);
            ((hfm) hfdVar).Z();
        } else {
            hfdVar.v(-1277174303);
            o = o(gft.d(hfdVar).e.g(), hfdVar);
            ((hfm) hfdVar).Z();
        }
        ((hfm) hfdVar).Z();
        return o;
    }
}
