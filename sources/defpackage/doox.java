package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doox {
    public static final hik a = new hky(new ffix() { // from class: doot
        @Override // defpackage.ffix
        public final Object invoke() {
            return doox.c(false);
        }
    });

    public static final cyz a(final float f) {
        return cxu.d(cxu.c(1300, 0, new cym() { // from class: doou
            @Override // defpackage.cym
            public final float a(float f2) {
                hik hikVar = doox.a;
                float f3 = f;
                return f2 < f3 ? f2 / f3 : (1.0f - f2) / (1.0f - f3);
            }
        }, 2), 1, 0L, 4);
    }

    public static final dbu b() {
        return cxu.c(333, 0, cyp.b, 2);
    }

    public static final doos c(boolean z) {
        return z ? new doos(g(), h(), i(), j(), b(), m(), e(), doow.a, d(), o(), p(), q(), k(), l(), r(), f(), cue.a, cug.a, n(), new dooq(null), new door(null)) : new doos(g(), h(), i(), j(), b(), m(), e(), doov.a, d(), o(), p(), q(), k(), l(), r(), f(), ctt.l(cxu.c(250, 500, null, 4), 2).a(ctt.s(cxu.c(500, 0, null, 6), null, 14)), ctt.t(null, null, 15).a(ctt.m(null, 3)), n(), new dooq(null), new door(null));
    }

    private static final cyz d() {
        return cxu.d(new dbu(1300, BasePaymentResult.ERROR_REQUEST_FAILED, cyp.d), 1, 0L, 4);
    }

    private static final cyz e() {
        return cxu.d(cxu.c(1000, 0, cyp.c, 2), 0, 0L, 6);
    }

    private static final dbu f() {
        return cxu.c(1000, 0, new cyh(0.0f, 0.4f, 1.0f, 0.6f), 2);
    }

    private static final dbu g() {
        return cxu.c(350, 0, new door(null).f, 2);
    }

    private static final dbu h() {
        return cxu.c(150, 0, new door(null).c, 2);
    }

    private static final dbu i() {
        return new dbu(150, 150, cyp.b);
    }

    private static final dbu j() {
        return cxu.c(150, 0, cyp.c, 2);
    }

    private static final dbu k() {
        return cxu.c(500, 0, cyn.a, 2);
    }

    private static final dbu l() {
        return cxu.c(1000, 0, cyn.b, 2);
    }

    private static final dbu m() {
        return cxu.c(BasePaymentResult.ERROR_REQUEST_FAILED, 0, null, 6);
    }

    private static final dbu n() {
        return cxu.c(250, 0, new cyh(0.0f, 0.0f, 0.0f, 1.0f), 2);
    }

    private static final dbu o() {
        return cxu.c(1, BasePaymentResult.ERROR_REQUEST_FAILED, null, 4);
    }

    private static final dbu p() {
        return cxu.c(600, 0, cyp.a, 2);
    }

    private static final dbu q() {
        return cxu.c(250, 0, cyp.a, 2);
    }

    private static final dbu r() {
        return cxu.c(1400, 0, cyp.a, 2);
    }
}
