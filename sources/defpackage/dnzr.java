package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnzr {
    public static final void a(final hvi hviVar, final dnzv dnzvVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2084979778);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnzvVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            igq a = dnaa.a(dnzvVar.b, b);
            hvi k = ebs.k(hviVar, 48.0f);
            c = ebs.c(hvi.e, 1.0f);
            dnmv.a(k, c, 0.0f, a, jii.a(R.string.pending_bubble_retry_button_content_description, b), 0L, dnzvVar.a, b, 48, 36);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnzo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i4 = i;
                    dnzr.a(hviVar2, dnzvVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final hvi hviVar, final dnzy dnzyVar, hfd hfdVar, final int i) {
        int i2;
        hvi a;
        ffcu ffcuVar;
        hvi a2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1211794698);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(dnzyVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            int i4 = huo.a;
            ipn a3 = dyc.a(hum.e, false);
            int a4 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            dnmv.a(ebs.k(hvi.e, 24.0f), null, 0.0f, dnaa.a(dmzz.ai, b), jii.a(R.string.pending_bubble_cancel_button_content_description, b), 0L, dnzyVar.b, b, 6, 38);
            Float f = dnzyVar.a;
            b.v(690763598);
            if (f == null) {
                ffcuVar = null;
            } else {
                float floatValue = f.floatValue();
                a = dlsj.a(ebs.k(hvi.e, 36.0f), jii.b(R.string.pending_bubble_finite_spinner_content_description, new Object[]{Integer.valueOf((int) (100.0f * floatValue))}, b), true);
                gkn.d(floatValue, a, 0L, 0.0f, gft.a(b).c, 0, b, 0);
                ffcuVar = ffcu.a;
            }
            hfmVar.Z();
            b.v(690763059);
            if (ffcuVar == null) {
                a2 = dlsj.a(ebs.k(hvi.e, 36.0f), jii.a(R.string.pending_bubble_infinite_spinner_content_description, b), true);
                gkn.a(a2, 0L, 0.0f, gft.a(b).c, 0, 0.0f, b, 0, 54);
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnzp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    int i6 = i;
                    dnzr.b(hviVar2, dnzyVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void c(final dnzz dnzzVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        hfd b = hfdVar.b(-2069053281);
        if ((i & 6) == 0) {
            i2 = (true != b.D(dnzzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hviVar = hvi.e;
            b.v(-2058918165);
            int i4 = i3 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new dnzq(dnzzVar, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.g(dnzzVar, (ffjm) R, b);
            if (dnzzVar instanceof dnzy) {
                b.v(-2058915449);
                b(hviVar, (dnzy) dnzzVar, b, (i3 >> 3) & 14);
                hfmVar.Z();
            } else {
                if (!(dnzzVar instanceof dnzv)) {
                    b.v(-2058917187);
                    hfmVar.Z();
                    throw new ffcd();
                }
                b.v(-2058912572);
                a(hviVar, (dnzv) dnzzVar, b, (i3 >> 3) & 14);
                hfmVar.Z();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnzn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnzz dnzzVar2 = dnzz.this;
                    int i5 = i;
                    dnzr.c(dnzzVar2, hviVar, (hfd) obj, hip.a(i5 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
