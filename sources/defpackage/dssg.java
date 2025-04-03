package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dssg {
    public static final void a(final dsrv dsrvVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-143754347);
        if (i3 == 0) {
            i2 = (true != b.D(dsrvVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            dwhw.a(hpx.d(-697892, new dssb(dsrvVar), b), dsrvVar.c, null, null, false, null, null, b, 6, 508);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dsrz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dssg.a(dsrv.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dsrv dsrvVar, final ffjm ffjmVar, hfd hfdVar, final int i, final int i2) {
        int i3;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(1123971087);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(dsrvVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.F(ffjmVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            if (i5 != 0) {
                ffjmVar = dsru.a;
            }
            dwhl.b(dsrvVar.c, null, false, null, null, hpx.d(-801074588, new dssc(dsrvVar, ffjmVar), b), b, 1572864, 62);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dsry
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dsrv dsrvVar2 = dsrv.this;
                    int i6 = i;
                    dssg.b(dsrvVar2, ffjmVar, (hfd) obj, hip.a(i6 | 1), i2);
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final List list, final ffmj ffmjVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1950783650);
        if (i3 == 0) {
            i2 = (true != b.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffmjVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            b.v(1700739144);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                hic hicVar = new hic(false, hla.a);
                hfmVar.ad(hicVar);
                R = hicVar;
            }
            final hho hhoVar = (hho) R;
            hfmVar.Z();
            dmzz dmzzVar = dmzz.cs;
            String a = jii.a(R.string.toolbar_more_content_description, b);
            b.v(1700745600);
            Object R2 = hfmVar.R();
            if (R2 == hfc.a) {
                R2 = new ffix() { // from class: dsrw
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dssg.d(hho.this, true);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            b(new dsrv(dmzzVar, a, (ffix) R2), hpx.d(1447217041, new dssf(hhoVar, ffmjVar, list), b), b, 48, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dsrx
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    int i4 = i;
                    dssg.c(list2, ffmjVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void d(hho hhoVar, boolean z) {
        hhoVar.b(Boolean.valueOf(z));
    }

    public static final void e(final ebq ebqVar, final List list, final int i, hfd hfdVar, final int i2) {
        hfd b = hfdVar.b(-1902066011);
        int i3 = ((i2 & 48) == 0 ? (true != b.F(list) ? 16 : 32) | i2 : i2) | 384;
        if ((i3 & 145) == 144 && b.I()) {
            b.s();
        } else {
            int size = list.size() <= 3 ? list.size() : 2;
            b.v(1011319958);
            for (int i4 = 0; i4 < size; i4++) {
                b((dsrv) list.get(i4), null, b, 0, 2);
            }
            ((hfm) b).Z();
            if (size < list.size()) {
                c(list, ffmk.q(size, list.size()), b, (i3 >> 3) & 14);
            }
            i = 3;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dssa
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ebq ebqVar2 = ebq.this;
                    List list2 = list;
                    int i5 = i2;
                    dssg.e(ebqVar2, list2, i, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
