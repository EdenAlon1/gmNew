package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dku {
    private static final kex a = new kex(true, false, 14);
    private static final djw b;

    static {
        long f;
        long f2;
        long j = ibw.d;
        long j2 = ibw.a;
        f = iby.f(ibw.d(j2), ibw.c(j2), ibw.b(j2), 0.38f, ibw.f(j2));
        f2 = iby.f(ibw.d(r1), ibw.c(r1), ibw.b(r1), 0.38f, ibw.f(ibw.a));
        b = new djw(j, j2, j2, f, f2);
    }

    public static final void a(djw djwVar, hvi hviVar, ffjn ffjnVar, hfd hfdVar, int i) {
        int i2;
        hvi a2;
        hvi c;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(-921259293);
        if (i3 == 0) {
            i2 = (true != b2.D(djwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(ffjnVar) ? 128 : 256;
        }
        int i4 = i2;
        if (b2.J((i4 & 147) != 146, i4 & 1)) {
            long j = dkh.a;
            a2 = dee.a(hyc.a(hviVar, 3.0f, eqm.b(4.0f), 0L, 0L, 28), djwVar.a, idb.a);
            c = dix.c(eba.i(eao.b(a2, 2), 0.0f, 8.0f, 1), dix.a(0, b2, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            dxq dxqVar = dxu.c;
            int i5 = huo.a;
            int i6 = (i4 << 3) & 7168;
            ipn a3 = dyo.a(dxqVar, hum.j, b2, 0);
            int a4 = hey.a(b2);
            hfm hfmVar = (hfm) b2;
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, c);
            int i7 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, a3, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            ffjnVar.a(dys.a, b2, Integer.valueOf(((i6 >> 6) & 112) | 6));
            b2.n();
        } else {
            b2.s();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new dkn(djwVar, hviVar, ffjnVar, i);
        }
    }

    public static final void b(kev kevVar, ffix ffixVar, hvi hviVar, djw djwVar, ffji ffjiVar, hfd hfdVar, int i) {
        int i2;
        ffix ffixVar2;
        kev kevVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(1447189339);
        if (i3 == 0) {
            i2 = (true != b2.D(kevVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.D(djwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(ffjiVar) ? 8192 : 16384;
        }
        if (b2.J((i2 & 9363) != 9362, i2 & 1)) {
            ffixVar2 = ffixVar;
            kdy.b(kevVar, ffixVar2, a, hpx.d(795909757, new dks(djwVar, hviVar, ffjiVar), b2), b2, (i2 & 14) | 3456 | (i2 & 112), 0);
            kevVar2 = kevVar;
        } else {
            ffixVar2 = ffixVar;
            kevVar2 = kevVar;
            b2.s();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new dkt(kevVar2, ffixVar2, hviVar, djwVar, ffjiVar, i);
        }
    }

    public static final void c(kev kevVar, ffix ffixVar, hvi hviVar, ffji ffjiVar, hfd hfdVar, int i) {
        kev kevVar2;
        int i2;
        ffix ffixVar2;
        hvi hviVar2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(712057293);
        if (i3 == 0) {
            kevVar2 = kevVar;
            i2 = (true != b2.D(kevVar2) ? 2 : 4) | i;
        } else {
            kevVar2 = kevVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            ffixVar2 = ffixVar;
            i2 |= true != b2.F(ffixVar2) ? 16 : 32;
        } else {
            ffixVar2 = ffixVar;
        }
        if ((i & 384) == 0) {
            hviVar2 = hviVar;
            i2 |= true != b2.D(hviVar2) ? 128 : 256;
        } else {
            hviVar2 = hviVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.F(ffjiVar) ? 1024 : 2048;
        }
        if (b2.J((i2 & 1171) != 1170, i2 & 1)) {
            Context context = (Context) b2.e(AndroidCompositionLocals_androidKt.b);
            boolean D = b2.D((Configuration) b2.e(AndroidCompositionLocals_androidKt.a)) | b2.D(context);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                djw djwVar = b;
                long j = djwVar.a;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int b3 = iby.b(j);
                int color = obtainStyledAttributes.getColor(0, b3);
                obtainStyledAttributes.recycle();
                if (color != b3) {
                    j = iby.c(color);
                }
                long j2 = j;
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
                obtainStyledAttributes2.recycle();
                long j3 = djwVar.b;
                int b4 = iby.b(j3);
                Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, b4)) : null;
                if (valueOf != null && valueOf.intValue() != b4) {
                    j3 = iby.c(valueOf.intValue());
                }
                long j4 = j3;
                long j5 = djwVar.d;
                int b5 = iby.b(j5);
                Integer valueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, b5)) : null;
                if (valueOf2 != null && valueOf2.intValue() != b5) {
                    j5 = iby.c(valueOf2.intValue());
                }
                long j6 = j5;
                djw djwVar2 = new djw(j2, j4, j4, j6, j6);
                hfmVar.ad(djwVar2);
                R = djwVar2;
            }
            b(kevVar2, ffixVar2, hviVar2, (djw) R, ffjiVar, b2, (i2 & 1022) | ((i2 << 3) & 57344));
        } else {
            b2.s();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new dkq(kevVar, ffixVar, hviVar, ffjiVar, i);
        }
    }

    public static final void d(String str, djw djwVar, hvi hviVar, ffix ffixVar, hfd hfdVar, int i) {
        int i2;
        hvi d;
        hfd b2 = hfdVar.b(791018367);
        if ((i & 6) == 0) {
            i2 = (true != b2.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.E(true) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.D(djwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.D(hviVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b2.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b2.F(ffixVar) ? 65536 : 131072;
        }
        if (b2.J((74899 & i2) != 74898, i2 & 1)) {
            long j = dkh.a;
            hus husVar = dkh.e;
            dxn dxnVar = new dxn(12.0f, true, dxr.a);
            boolean z = (i2 & 112) == 32;
            boolean z2 = (458752 & i2) == 131072;
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if ((z | z2) || R == hfc.a) {
                R = new dko(ffixVar);
                hfmVar.ad(R);
            }
            d = ebs.d(dfb.d(hviVar, true, str, (ffix) R, 4), 1.0f);
            hvi i3 = eba.i(ebs.n(d, 112.0f, 48.0f, 280.0f, 48.0f), 12.0f, 0.0f, 2);
            ipn a2 = ebm.a(dxnVar, husVar, b2, 54);
            int a3 = hey.a(b2);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, i3);
            int i4 = ist.a;
            ffix ffixVar2 = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar2);
            } else {
                b2.z();
            }
            hlc.b(b2, a2, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            ebr ebrVar = ebr.a;
            b2.v(554788141);
            hfmVar.Z();
            esa.e(str, ebrVar.a(hvi.e, 1.0f, true), new jpo(djwVar.b, dkh.a, dkh.b, null, dkh.d, 5, dkh.c, 16613240), null, 0, false, 1, 0, null, b2, (i2 & 14) | 1572864, 952);
            b2.n();
        } else {
            b2.s();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new dkp(str, djwVar, hviVar, ffixVar, i);
        }
    }
}
