package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdtd implements fdtc {
    public static final edax a;
    public static final edax b;
    public static final edax c;

    static {
        enpd enpdVar = enpd.a;
        enpx enpxVar = new enpx("CLIENT_LOGGING_PROD");
        a = edbk.f("45665792", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        b = edbk.f("45668206", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        c = edbk.f("45668205", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
    }

    @Override // defpackage.fdtc
    public final boolean a(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.fdtc
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.fdtc
    public final boolean c(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }
}
