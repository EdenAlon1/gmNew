package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdrw implements fdru {
    public static final edax a;
    public static final edax b;
    public static final edax c;
    public static final edax d;
    public static final edax e;
    public static final edax f;
    public static final edax g;
    public static final edax h;

    static {
        enpd enpdVar = enpd.a;
        enpx enpxVar = new enpx("CLIENT_LOGGING_PROD");
        a = edbk.f("45352228", true, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        b = edbk.g("45352241", new edbj() { // from class: fdrv
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (fgku) eyfy.parseFrom(fgku.a, (byte[]) obj);
            }
        }, "CAYIBAgFCAM", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        c = edbk.f("45671696", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        d = edbk.f("45633315", true, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        e = edbk.f("45659478", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        f = edbk.f("45677546", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        g = edbk.d("45646085", 175500L, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        h = edbk.d("45676837", -1L, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
    }

    @Override // defpackage.fdru
    public final long a(Context context) {
        return ((Long) g.a(context)).longValue();
    }

    @Override // defpackage.fdru
    public final long b(Context context) {
        return ((Long) h.a(context)).longValue();
    }

    @Override // defpackage.fdru
    public final fgku c(Context context) {
        return (fgku) b.a(context);
    }

    @Override // defpackage.fdru
    public final boolean d(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.fdru
    public final boolean e(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }

    @Override // defpackage.fdru
    public final boolean f(Context context) {
        return ((Boolean) d.a(context)).booleanValue();
    }

    @Override // defpackage.fdru
    public final boolean g(Context context) {
        return ((Boolean) e.a(context)).booleanValue();
    }

    @Override // defpackage.fdru
    public final boolean h(Context context) {
        return ((Boolean) f.a(context)).booleanValue();
    }
}
