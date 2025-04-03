package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdso implements fdsn {
    public static final edax a;
    public static final edax b;
    public static final edax c;

    static {
        enpd enpdVar = enpd.a;
        enpx enpxVar = new enpx("CLIENT_LOGGING_PROD");
        a = edbk.f("45647279", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        b = edbk.f("45647278", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        c = edbk.a("45676195", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
    }

    @Override // defpackage.fdsn
    public final boolean a(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.fdsn
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.fdsn
    public final boolean c(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }
}
