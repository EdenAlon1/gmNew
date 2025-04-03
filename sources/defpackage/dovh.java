package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovh {
    public static final Uri a(hho hhoVar) {
        return (Uri) hhoVar.a();
    }

    public static final Uri b(hho hhoVar) {
        return (Uri) hhoVar.a();
    }

    public static final void c(dovk dovkVar, final Object obj, eqd eqdVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        final dovk dovkVar2;
        final eqd eqdVar2;
        Uri uri;
        int i3 = i & 6;
        hfd b = hfdVar.b(207708283);
        if (i3 == 0) {
            i2 = (true != b.D(dovkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(obj) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(eqdVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            dovkVar2 = dovkVar;
            eqdVar2 = eqdVar;
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            b.v(-1457988604);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(Uri.EMPTY, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            hho hhoVar = (hho) R;
            hfmVar.Z();
            b.v(-1457986525);
            boolean D = b.D(obj);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new hic(null, hla.a);
                hfmVar.ad(R2);
            }
            hho hhoVar2 = (hho) R2;
            hfmVar.Z();
            b.v(-1457984512);
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                hic hicVar2 = new hic(false, hla.a);
                hfmVar.ad(hicVar2);
                R3 = hicVar2;
            }
            hho hhoVar3 = (hho) R3;
            hfmVar.Z();
            if (dovkVar.f.a) {
                if (!ffkj.e(dovkVar.a, Uri.EMPTY) && (ffkj.e(a(hhoVar), Uri.EMPTY) || !ffkj.e(a(hhoVar), dovkVar.a))) {
                    d(hhoVar, dovkVar.a);
                }
            } else if (ffkj.e(a(hhoVar), Uri.EMPTY) && !ffkj.e(dovkVar.a, Uri.EMPTY)) {
                d(hhoVar, dovkVar.a);
            }
            if (b(hhoVar2) == null && (uri = dovkVar.b) != null) {
                hhoVar2.b(uri);
            }
            a = dlsj.a(hvi.e, dovkVar.g, true);
            boolean z = b(hhoVar2) != null;
            dovkVar2 = dovkVar;
            eqdVar2 = eqdVar;
            dnmq.a(dovkVar2, a, eqdVar2, z, hpx.d(1376109312, new dovg(dovkVar, hhoVar3, hhoVar, hhoVar2), b), b, (i2 & 14) | 24576 | (i2 & 896), 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dovd
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    dovk dovkVar3 = dovk.this;
                    Object obj4 = obj;
                    int i4 = i;
                    dovh.c(dovkVar3, obj4, eqdVar2, (hfd) obj2, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final void d(hho hhoVar, Uri uri) {
        hhoVar.b(uri);
    }
}
