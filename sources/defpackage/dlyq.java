package defpackage;

import android.net.Uri;
import androidx.compose.foundation.layout.AspectRatioElement;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlyq {
    public static final void a(final dlwc dlwcVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1296353160);
        if (i3 == 0) {
            i2 = (true != b.D(dlwcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dnch.d(new dncj(dmzz.bG, dlwcVar.a, dlwcVar.b, false, true, 72), eao.b(hviVar, 2), b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlyn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlwc dlwcVar2 = dlwc.this;
                    int i4 = i;
                    dlyq.a(dlwcVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dlwd dlwdVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1298869760);
        if (i3 == 0) {
            i2 = (true != b.D(dlwdVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            a = hviVar.a(new AspectRatioElement(1.0f));
            Uri uri = dlwdVar.a;
            Uri uri2 = dlwdVar.b;
            String str = dlwdVar.c;
            int i4 = inp.a;
            hfdVar2 = b;
            dnac.a(uri, str, a, uri2, null, null, ino.a, null, 0.0f, null, null, null, "ImageAttachment", null, null, null, hfdVar2, 12582912, 196608, 491376);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlym
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlwd dlwdVar2 = dlwd.this;
                    int i5 = i;
                    dlyq.b(dlwdVar2, hviVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1517696456);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            a = hviVar.a(new AspectRatioElement(1.0f));
            ebv.a(doaq.a(a, new ibw(ibw.g), new ibw(gft.a(b).v), true), b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlyp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlyq.c(hvi.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(final dlwf dlwfVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(636920835);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dlwfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            boolean z = dlwfVar instanceof dlwe;
            hve hveVar = hvi.e;
            if (z) {
                b.v(-1151854574);
                c(hveVar, b, (i3 >> 3) & 14);
                ((hfm) b).Z();
            } else if (dlwfVar instanceof dlwd) {
                b.v(-1151852329);
                b((dlwd) dlwfVar, hveVar, b, i3 & 112);
                ((hfm) b).Z();
            } else {
                if (!(dlwfVar instanceof dlwc)) {
                    b.v(-1151856127);
                    ((hfm) b).Z();
                    throw new ffcd();
                }
                b.v(-1151849962);
                a((dlwc) dlwfVar, hveVar, b, i3 & 112);
                ((hfm) b).Z();
            }
            hviVar = hveVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlyo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlwf dlwfVar2 = dlwf.this;
                    int i4 = i;
                    dlyq.d(dlwfVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
