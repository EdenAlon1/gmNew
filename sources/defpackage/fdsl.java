package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdsl implements fdsh {
    public static final edax a;
    public static final edax b;
    public static final edax c;
    public static final edax d;
    public static final edax e;
    public static final edax f;
    public static final edax g;

    static {
        enpd enpdVar = enpd.a;
        enpx enpxVar = new enpx("CLIENT_LOGGING_PROD");
        a = edbk.g("45390627", new edbj() { // from class: fdsi
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (eckn) eyfy.parseFrom(eckn.a, (byte[]) obj);
            }
        }, "CAAQAxgGIJBOLQrXIzw", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        b = edbk.g("45376983", new edbj() { // from class: fdsj
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (eclc) eyfy.parseFrom(eclc.a, (byte[]) obj);
            }
        }, "CAEQZBj0AyDoBw", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        c = edbk.f("45625683", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        d = edbk.f("45617767", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        e = edbk.f("33", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        f = edbk.d("45661178", 500L, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        g = edbk.g("45371370", new edbj() { // from class: fdsk
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (ecla) eyfy.parseFrom(ecla.a, (byte[]) obj);
            }
        }, "CJYBEMgB", "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
    }

    @Override // defpackage.fdsh
    public final long a(Context context) {
        return ((Long) f.a(context)).longValue();
    }

    @Override // defpackage.fdsh
    public final eckn b(Context context) {
        return (eckn) a.a(context);
    }

    @Override // defpackage.fdsh
    public final ecla c(Context context) {
        return (ecla) g.a(context);
    }

    @Override // defpackage.fdsh
    public final eclc d(Context context) {
        return (eclc) b.a(context);
    }

    @Override // defpackage.fdsh
    public final boolean e(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }

    @Override // defpackage.fdsh
    public final boolean f(Context context) {
        return ((Boolean) d.a(context)).booleanValue();
    }

    @Override // defpackage.fdsh
    public final boolean g(Context context) {
        return ((Boolean) e.a(context)).booleanValue();
    }
}
