package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdta implements fdsz {
    public static final edax a;
    public static final edax b;

    static {
        enpd enpdVar = enpd.a;
        enpx enpxVar = new enpx("CLIENT_LOGGING_PROD");
        a = edbk.f("45359255", false, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
        b = edbk.f("36", true, "com.google.android.libraries.performance.primes", enpxVar, true, true, false);
    }

    @Override // defpackage.fdsz
    public final boolean a(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.fdsz
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }
}
