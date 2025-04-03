package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnly {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.dnlz r16, defpackage.hvi r17, defpackage.hfd r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnly.a(dnlz, hvi, hfd, int, int):void");
    }

    public static final void b(final String str, final List list, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1404581764);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(list) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dlur.e(new dluu(str, list, 4), null, ((ibw) b.e(fzc.a)).i, (jpo) b.e(grl.a), null, 0L, null, false, null, hfdVar2, 0, 498);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnlo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    dnly.b(str2, list, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final int i, hfd hfdVar, final int i2) {
        int i3;
        hfd hfdVar2;
        int i4 = i2 & 6;
        hfd b = hfdVar.b(1532416540);
        if (i4 == 0) {
            i3 = (true != b.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            String quantityString = ((Context) b.e(AndroidCompositionLocals_androidKt.b)).getResources().getQuantityString(R.plurals.abc_text_list_item_count_description, i, Integer.valueOf(i));
            quantityString.getClass();
            hvi a = dlsj.a(hvi.e, quantityString, false);
            b.v(-438136824);
            String valueOf = i < 100 ? String.valueOf(i) : jii.a(R.string.abc_text_list_item_many_items, b);
            ((hfm) b).Z();
            hfdVar2 = b;
            dwjt.b(valueOf, a, gft.a(b).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).m, hfdVar2, 0, 0, 65528);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnlq
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i2;
                    dnly.c(i, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final int i, final boolean z, final boolean z2, hfd hfdVar, final int i2) {
        int i3;
        hfd hfdVar2;
        int i4 = i2 & 6;
        hfd b = hfdVar.b(94260436);
        if (i4 == 0) {
            i3 = (true != b.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b.E(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b.E(z2) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            String quantityString = ((Context) b.e(AndroidCompositionLocals_androidKt.b)).getResources().getQuantityString(R.plurals.abc_text_list_item_count_description, i, Integer.valueOf(i));
            quantityString.getClass();
            hvi j = eba.j(hvi.e, 0.0f, 0.0f, z ? 8.0f : 0.0f, 0.0f, 11);
            if (!z2) {
                j = j.a(hxe.a(hvi.e, 0.38f));
            }
            hvi a = dlsj.a(j, quantityString, false);
            b.v(-437934968);
            String valueOf = i < 100 ? String.valueOf(i) : jii.a(R.string.abc_text_list_item_many_items, b);
            ((hfm) b).Z();
            hfdVar2 = b;
            dwjt.b(valueOf, a, gft.a(b).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).m, hfdVar2, 0, 0, 65528);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnlm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    boolean z3 = z;
                    int i6 = i2;
                    dnly.d(i5, z3, z2, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void e(final dnlg dnlgVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(183938540);
        if (i3 == 0) {
            i2 = (true != b.D(dnlgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else if (dnlgVar instanceof dnle) {
            b.v(-1964873175);
            dwij.a(ebs.k(hvi.e, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, b, 390, 58);
            ((hfm) b).Z();
        } else {
            if (!(dnlgVar instanceof dnlf)) {
                b.v(-1964875720);
                ((hfm) b).Z();
                throw new ffcd();
            }
            b.v(-1964869245);
            g((dnlf) dnlgVar, b, 0);
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnli
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dnly.e(dnlg.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void f(final dnlg dnlgVar, final ibw ibwVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1980678175);
        if (i3 == 0) {
            i2 = (true != b.D(dnlgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(ibwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else if (dnlgVar instanceof dnlf) {
            b.v(-1964732663);
            h((dnlf) dnlgVar, ibwVar, z, b, i2 & 1008);
            ((hfm) b).Z();
        } else {
            if (!(dnlgVar instanceof dnle)) {
                b.v(-1964734492);
                ((hfm) b).Z();
                throw new ffcd();
            }
            b.v(-1964727831);
            dwij.a(ebs.k(hvi.e, 24.0f), 0L, 2.0f, 0L, 0, 0.0f, b, 390, 58);
            ((hfm) b).Z();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnlh
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnlg dnlgVar2 = dnlg.this;
                    ibw ibwVar2 = ibwVar;
                    int i4 = i;
                    dnly.f(dnlgVar2, ibwVar2, z, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void g(final dnlf dnlfVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-406491058);
        if (i3 == 0) {
            i2 = (true != b.D(dnlfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            int i4 = huo.a;
            hun hunVar = hum.k;
            hve hveVar = hvi.e;
            ipn a = dyo.a(dxu.c, hunVar, b, 48);
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
            dwho.a(dnaa.a(dnlfVar.a, b), null, ebs.k(hvi.e, 24.0f), 0L, b, 384, 8);
            String str = dnlfVar.b;
            b.v(1579549288);
            if (str != null) {
                dolc.a(str, ebs.x(hvi.e, 0.0f, 24.0f, 1), 0L, new jyj(3), 2, 1, dooy.d(b).e, b, 221232, 4);
                b = b;
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnlk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dnly.g(dnlf.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void h(final dnlf dnlfVar, final ibw ibwVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        hfm hfmVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(2128654081);
        if (i3 == 0) {
            i2 = (true != b.D(dnlfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(ibwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            float f = z ? 1.0f : 0.38f;
            b.v(-684601009);
            long j = ibwVar == null ? gft.a(b).s : ibwVar.i;
            hfm hfmVar2 = (hfm) b;
            hfmVar2.Z();
            int i4 = huo.a;
            hun hunVar = hum.k;
            hve hveVar = hvi.e;
            ipn a = dyo.a(dxu.c, hunVar, b, 48);
            int a2 = hey.a(b);
            hqb ai = hfmVar2.ai();
            hvi b2 = huz.b(b, hveVar);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar2.z) {
                b.j(ffixVar);
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
            hlc.b(b, b2, iss.c);
            dwho.a(dnaa.a(dnlfVar.a, b), null, hxe.a(ebs.k(hvi.e, 24.0f), f), j, b, 0, 0);
            String str = dnlfVar.b;
            b.v(1579698732);
            if (str != null) {
                hfmVar = hfmVar2;
                dolc.a(str, ebs.x(hxe.a(hvi.e, f), 0.0f, 24.0f, 1), j, new jyj(3), 2, 1, dooy.d(b).e, b, 221184, 0);
                b = b;
            } else {
                hfmVar = hfmVar2;
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnlp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnlf dnlfVar2 = dnlf.this;
                    ibw ibwVar2 = ibwVar;
                    int i6 = i;
                    dnly.h(dnlfVar2, ibwVar2, z, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void i(final String str, final boolean z, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(477780371);
        if (i3 == 0) {
            i2 = i | (true != b.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hvi i4 = eba.i(hvi.e, 16.0f, 0.0f, 2);
            if (!z) {
                i4 = i4.a(hxe.a(hvi.e, 0.38f));
            }
            hfdVar2 = b;
            dwjt.b(str, i4, gft.a(b).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(b).o, hfdVar2, i2 & 14, 0, 65528);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnlr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i5 = i;
                    dnly.i(str2, z, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void j(final String str, final List list, final boolean z, final jpo jpoVar, final ibw ibwVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-877402214);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(jpoVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(ibwVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hvi i4 = eba.i(hvi.e, 16.0f, 0.0f, 2);
            if (!z) {
                i4 = i4.a(hxe.a(hvi.e, 0.38f));
            }
            dluu dluuVar = new dluu(str, list, 4);
            b.v(1591918336);
            long j = ibwVar == null ? gft.a(b).q : ibwVar.i;
            ((hfm) b).Z();
            hfdVar2 = b;
            dlur.e(dluuVar, i4, j, jpoVar, null, 0L, null, false, null, hfdVar2, i2 & 7168, 496);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnll
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    List list2 = list;
                    boolean z2 = z;
                    jpo jpoVar2 = jpoVar;
                    dnly.j(str2, list2, z2, jpoVar2, ibwVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0367 A[LOOP:1: B:122:0x0361->B:124:0x0367, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e7  */
    @defpackage.ffbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final defpackage.dnlz r28, defpackage.hvi r29, defpackage.jpo r30, defpackage.ibw r31, defpackage.ibw r32, defpackage.jzq r33, defpackage.jzq r34, defpackage.hun r35, defpackage.hfd r36, final int r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnly.k(dnlz, hvi, jpo, ibw, ibw, jzq, jzq, hun, hfd, int, int, int):void");
    }

    public static final void l(final String str, final List list, final boolean z, final jpo jpoVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1291155890);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(jpoVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.D(null) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hvi i4 = eba.i(hvi.e, 16.0f, 0.0f, 2);
            if (!z) {
                i4 = i4.a(hxe.a(hvi.e, 0.38f));
            }
            dluu dluuVar = new dluu(str, list, 4);
            b.v(-609858609);
            long j = gft.a(b).s;
            ((hfm) b).Z();
            hfdVar2 = b;
            dlur.e(dluuVar, i4, j, jpoVar, null, 0L, null, false, null, hfdVar2, i2 & 7168, 496);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnls
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    List list2 = list;
                    boolean z2 = z;
                    dnly.l(str2, list2, z2, jpoVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
