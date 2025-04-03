package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdk {
    public static final int a(ffbz ffbzVar) {
        return ((Number) ffbzVar.a()).intValue();
    }

    public static final fcx b(fcx fcxVar, fcw fcwVar, int i) {
        return new fcx(fcwVar.f.q(i), i, fcxVar.c);
    }

    public static final fcx c(fen fenVar, fcw fcwVar, fcx fcxVar) {
        int i = fenVar.l() ? fcwVar.c : fcwVar.d;
        if ((fenVar.l() ? fenVar.c() : fenVar.a()) != fcwVar.b) {
            return fcwVar.b(i);
        }
        ffbz b = ffca.b(3, new fdj(fcwVar, i));
        ffbz b2 = ffca.b(3, new fdi(fcwVar, i, fenVar.l() ? fcwVar.d : fcwVar.c, fenVar, b));
        if (fcwVar.a != fcxVar.c) {
            return f(b2);
        }
        int i2 = fcwVar.e;
        if (i == i2) {
            return fcxVar;
        }
        if (a(b) != fcwVar.f.h(i2)) {
            return f(b2);
        }
        int i3 = fcxVar.b;
        long l = fcwVar.f.l(i3);
        boolean l2 = fenVar.l();
        int i4 = fcwVar.e;
        if (i4 != -1) {
            if (i != i4) {
                if (!(l2 ^ (fcwVar.f() == 1))) {
                }
            }
            return fcwVar.b(i);
        }
        return (i3 == jpm.e(l) || i3 == jpm.a(l)) ? f(b2) : fcwVar.b(i);
    }

    public static final fcy d(fen fenVar, fck fckVar) {
        boolean z = fenVar.o() == 1;
        return new fcy(e(fenVar.i(), z, true, fenVar.c(), fckVar), e(fenVar.f(), z, false, fenVar.a(), fckVar), z);
    }

    private static final fcx e(fcw fcwVar, boolean z, boolean z2, int i, fck fckVar) {
        int i2 = z2 ? fcwVar.c : fcwVar.d;
        if (i != fcwVar.b) {
            return fcwVar.b(i2);
        }
        long a = fckVar.a(fcwVar, i2);
        return fcwVar.b(z ^ z2 ? jpm.e(a) : jpm.a(a));
    }

    private static final fcx f(ffbz ffbzVar) {
        return (fcx) ffbzVar.a();
    }
}
