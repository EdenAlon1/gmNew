package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdue implements fdud {
    public static final edax a;
    public static final edax b;
    public static final edax c;
    public static final edax d;
    public static final edax e;
    public static final edax f;
    public static final edax g;
    public static final edax h;
    public static final edax i;
    public static final edax j;

    static {
        enpd enpdVar = enpd.a;
        enpx enpxVar = new enpx("CLIENT_LOGGING_PROD");
        a = edbk.f("45658651", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        b = edbk.f("45658654", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        c = edbk.f("45658650", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        d = edbk.d("45660938", -1L, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        e = edbk.d("45660940", -1L, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        f = edbk.d("45660937", -1L, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        g = edbk.d("45660939", -1L, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        h = edbk.d("45658655", 3000L, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        i = edbk.d("45658652", 10000L, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        j = edbk.d("45658653", 300000L, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
    }

    @Override // defpackage.fdud
    public final long a(Context context) {
        return ((Long) d.a(context)).longValue();
    }

    @Override // defpackage.fdud
    public final long b(Context context) {
        return ((Long) e.a(context)).longValue();
    }

    @Override // defpackage.fdud
    public final long c(Context context) {
        return ((Long) f.a(context)).longValue();
    }

    @Override // defpackage.fdud
    public final long d(Context context) {
        return ((Long) g.a(context)).longValue();
    }

    @Override // defpackage.fdud
    public final long e(Context context) {
        return ((Long) h.a(context)).longValue();
    }

    @Override // defpackage.fdud
    public final long f(Context context) {
        return ((Long) i.a(context)).longValue();
    }

    @Override // defpackage.fdud
    public final long g(Context context) {
        return ((Long) j.a(context)).longValue();
    }

    @Override // defpackage.fdud
    public final boolean h(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.fdud
    public final boolean i(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.fdud
    public final boolean j(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }
}
