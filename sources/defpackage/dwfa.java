package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfa {
    public static final dwfa a = new dwfa();

    private dwfa() {
    }

    public static final long a(hfd hfdVar) {
        return dwfv.c(40, hfdVar);
    }

    public static final idh b(hfd hfdVar) {
        return dwiq.b(4, hfdVar);
    }

    public final void c(hvi hviVar, float f, float f2, idh idhVar, long j, hfd hfdVar, final int i) {
        hvi hviVar2;
        float f3;
        float f4;
        idh idhVar2;
        long c;
        final String str;
        hvi c2;
        hfd hfdVar2;
        final hvi hviVar3;
        final float f5;
        final float f6;
        final idh idhVar3;
        final long j2;
        hfd b = hfdVar.b(1578277453);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 = i | 22;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((i2 & 9363) == 9362 && b.I()) {
            b.s();
            hviVar3 = hviVar;
            f6 = f;
            f5 = f2;
            idhVar3 = idhVar;
            j2 = j;
            hfdVar2 = b;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                hviVar2 = hvi.e;
                f3 = 4.0f;
                f4 = 32.0f;
                idhVar2 = gft.c(b).e;
                c = dwfv.c(19, b);
            } else {
                b.s();
                hviVar2 = hviVar;
                f4 = f;
                f3 = f2;
                idhVar2 = idhVar;
                c = j;
            }
            b.l();
            b.v(-482266667);
            b.e(AndroidCompositionLocals_androidKt.a);
            Resources resources = ((Context) b.e(AndroidCompositionLocals_androidKt.b)).getResources();
            if (dwjb.a(0)) {
                str = resources.getString(R.string.navigation_menu);
                str.getClass();
            } else if (dwjb.a(1)) {
                str = resources.getString(R.string.close_drawer);
                str.getClass();
            } else if (dwjb.a(2)) {
                str = resources.getString(R.string.close_sheet);
                str.getClass();
            } else if (dwjb.a(3)) {
                str = resources.getString(R.string.default_error_message);
                str.getClass();
            } else if (dwjb.a(4)) {
                str = resources.getString(R.string.dropdown_menu);
                str.getClass();
            } else if (dwjb.a(5)) {
                str = resources.getString(R.string.range_start);
                str.getClass();
            } else if (dwjb.a(6)) {
                str = resources.getString(R.string.range_end);
                str.getClass();
            } else if (dwjb.a(8)) {
                str = resources.getString(R.string.expanded);
                str.getClass();
            } else if (dwjb.a(9)) {
                str = resources.getString(R.string.collapsed);
                str.getClass();
            } else if (dwjb.a(10)) {
                str = resources.getString(R.string.dismiss);
                str.getClass();
            } else if (dwjb.a(11)) {
                str = resources.getString(R.string.bottom_sheet_drag_handle_description);
                str.getClass();
            } else {
                str = "";
            }
            hfm hfmVar = (hfm) b;
            hfmVar.Z();
            hvi i3 = eba.i(hviVar2, 0.0f, 22.0f, 1);
            b.v(1998083307);
            boolean D = b.D(str);
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new ffji() { // from class: dwex
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.k(jkvVar, str);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            c2 = jjs.c(i3, false, (ffji) R);
            hfdVar2 = b;
            gpa.c(c2, idhVar2, c, 0L, 0.0f, 0.0f, null, hpx.d(2095541970, new dwez(f4, f3), b), hfdVar2, 120);
            hviVar3 = hviVar2;
            f5 = f3;
            f6 = f4;
            idhVar3 = idhVar2;
            j2 = c;
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwey
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dwfa dwfaVar = dwfa.this;
                    hvi hviVar4 = hviVar3;
                    float f7 = f6;
                    float f8 = f5;
                    idh idhVar4 = idhVar3;
                    dwfaVar.c(hviVar4, f7, f8, idhVar4, j2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
