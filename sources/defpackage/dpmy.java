package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpmy {
    public static final void a(final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        ffjiVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(68325532);
        if (i3 == 0) {
            i2 = (true != b.F(ffjiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = hgs.a(ffhe.a, b);
                hfmVar.ad(R);
            }
            final ffsk ffskVar = (ffsk) R;
            gdx a2 = dwhi.a(ibw.e, 0L, b, 14);
            a = dlsj.a(dek.b(ebs.k(hvi.e, 70.0f), des.a(3.0f, ibw.d), eqm.a), jii.a(R.string.popup_camera_record_button_content_description, b), true);
            b.v(349897395);
            boolean F = b.F(ffskVar) | b.F(ffjiVar);
            Object R2 = hfmVar.R();
            if (F || R2 == hfc.a) {
                R2 = new ffix() { // from class: dpmv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffqy.d(ffsk.this, null, null, new dpmx(ffjiVar, null), 3);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            dwhl.a((ffix) R2, a, false, null, a2, dpmn.a, b, 1572864, 44);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpmw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dpmy.a(ffji.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
