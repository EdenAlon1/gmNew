package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cytv {
    public static final void a(final cytr cytrVar, final float f, final float f2, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1631194912);
        if (i3 == 0) {
            i2 = (true != b.D(cytrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.A(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.A(f2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            dnwn dnwnVar = cytrVar.a;
            if (dnwnVar != null) {
                int i4 = huo.a;
                huo huoVar = hum.e;
                hve hveVar = hvi.e;
                ipn a = dyc.a(huoVar, false);
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
                String a3 = jii.a(R.string.conversation_icon, b);
                b.v(901960749);
                int i6 = i2 & 14;
                Object R = hfmVar.R();
                if (i6 == 4 || R == hfc.a) {
                    R = new ffix() { // from class: cyts
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            cytr.this.b.invoke();
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R);
                }
                hfmVar.Z();
                dnyo dnyoVar = new dnyo(dnwnVar, a3, 0, null, 0.0f, (ffix) R, 28);
                hvi h = ebs.h(hvi.e, f2);
                b.v(901968993);
                int i7 = i2 & 112;
                Object R2 = hfmVar.R();
                if (i7 == 32 || R2 == hfc.a) {
                    R2 = new ffji() { // from class: cytt
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            idd iddVar = (idd) obj;
                            iddVar.getClass();
                            float f3 = f;
                            iddVar.x(f3);
                            iddVar.y(f3);
                            return ffcu.a;
                        }
                    };
                    hfmVar.ad(R2);
                }
                hfmVar.Z();
                dnxw.j(dnyoVar, eau.c(icf.a(h, (ffji) R2), 0.0f, (1.0f - f) * f2, 1), b, 0);
                b.n();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cytu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cytr cytrVar2 = cytr.this;
                    float f3 = f;
                    int i8 = i;
                    cytv.a(cytrVar2, f3, f2, (hfd) obj, hip.a(i8 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
