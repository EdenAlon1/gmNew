package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlzk {
    public static final void a(final dyh dyhVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1366866309);
        if (i3 == 0) {
            i2 = (true != b.D(dyhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hvi j = eba.j(ebs.k(hvi.e, 32.0f), 4.0f, 0.0f, 0.0f, 4.0f, 6);
            int i4 = huo.a;
            hvi a = hvr.a(dee.a(dyhVar.a(j, hum.g), gft.a(b).a, eqm.a), 1.0f);
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
            dyi dyiVar = dyi.a;
            igq a4 = dnaa.a(dmzz.cG, b);
            String a5 = jii.a(R.string.attachment_bubble_magic_edit, b);
            long j2 = gft.a(b).b;
            c = ebs.c(hvi.e, 1.0f);
            dwho.a(a4, a5, dyiVar.a(eba.d(c, 4.0f), hum.e), j2, b, 0, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlzg
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    dlzk.a(dyh.this, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final dlzl dlzlVar, hvi hviVar, final ibw ibwVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        ffjnVar.getClass();
        hfd b = hfdVar.b(1244131132);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dlzlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != b.D(ibwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.F(ffjnVar) ? 1024 : 2048;
        }
        if ((i3 & 1171) == 1170 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            hve hveVar = hvi.e;
            int i4 = huo.a;
            ipn a = dyc.a(hum.a, false);
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
            dyi dyiVar = dyi.a;
            hvi j = eba.j(hveVar, 0.0f, 8.0f, 8.0f, 0.0f, 9);
            eqd eqdVar = gft.c(b).c;
            b.v(1188146052);
            int i6 = i3 & 14;
            Object R = hfmVar.R();
            if (i6 == 4 || R == hfc.a) {
                R = new ffix() { // from class: dlzh
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dlzl dlzlVar2 = dlzl.this;
                        (dlzlVar2.d ? dlzlVar2.c : dlzlVar2.b).invoke();
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            gpa.e((ffix) R, j, false, eqdVar, 0L, 0L, 0.0f, null, null, hpx.d(-1380972661, new dlzj(ffjnVar), b), b, 1012);
            b = b;
            b.v(1188154839);
            if (dlzlVar.d) {
                a(dyiVar, b, 6);
            }
            hfmVar.Z();
            dmhc.a(dyiVar, new dmhd(dlzlVar.a), ibwVar, null, b, (i3 & 896) | 6, 4);
            b.n();
            hviVar2 = hveVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dlzi
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlzl dlzlVar2 = dlzl.this;
                    hvi hviVar3 = hviVar2;
                    ibw ibwVar2 = ibwVar;
                    dlzk.b(dlzlVar2, hviVar3, ibwVar2, ffjnVar, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
