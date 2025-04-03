package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdqz implements fdqy {
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
    public static final edax k;

    static {
        enpd enpdVar = enpd.a;
        enip s = enip.s("ANDROID_MESSAGING", "CARRIER_SERVICES", "ANDROID_MESSAGING_PRIMES");
        a = edbk.d("21", 86400L, "com.google.android.libraries.mobileconfiguration", s, true, false, false);
        b = edbk.d("8", 86400L, "com.google.android.libraries.mobileconfiguration", s, true, false, false);
        c = edbk.f("20", false, "com.google.android.libraries.mobileconfiguration", s, true, false, false);
        d = edbk.f("13", false, "com.google.android.libraries.mobileconfiguration", s, true, false, false);
        e = edbk.f("10", true, "com.google.android.libraries.mobileconfiguration", s, true, false, false);
        f = edbk.f("14", false, "com.google.android.libraries.mobileconfiguration", s, true, false, false);
        g = edbk.d("6", 604800L, "com.google.android.libraries.mobileconfiguration", s, true, false, false);
        h = edbk.d("9", 3600L, "com.google.android.libraries.mobileconfiguration", s, true, false, false);
        i = edbk.d("7", 3600L, "com.google.android.libraries.mobileconfiguration", s, true, false, false);
        j = edbk.d("5", 3600L, "com.google.android.libraries.mobileconfiguration", s, true, false, false);
        k = edbk.f("22", false, "com.google.android.libraries.mobileconfiguration", s, true, false, false);
    }

    @Override // defpackage.fdqy
    public final long a(Context context) {
        return ((Long) a.a(context)).longValue();
    }

    @Override // defpackage.fdqy
    public final long b(Context context) {
        return ((Long) b.a(context)).longValue();
    }

    @Override // defpackage.fdqy
    public final long c(Context context) {
        return ((Long) g.a(context)).longValue();
    }

    @Override // defpackage.fdqy
    public final long d(Context context) {
        return ((Long) h.a(context)).longValue();
    }

    @Override // defpackage.fdqy
    public final long e(Context context) {
        return ((Long) i.a(context)).longValue();
    }

    @Override // defpackage.fdqy
    public final long f(Context context) {
        return ((Long) j.a(context)).longValue();
    }

    @Override // defpackage.fdqy
    public final boolean g(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }

    @Override // defpackage.fdqy
    public final boolean h(Context context) {
        return ((Boolean) d.a(context)).booleanValue();
    }

    @Override // defpackage.fdqy
    public final boolean i(Context context) {
        return ((Boolean) e.a(context)).booleanValue();
    }

    @Override // defpackage.fdqy
    public final boolean j(Context context) {
        return ((Boolean) f.a(context)).booleanValue();
    }

    @Override // defpackage.fdqy
    public final boolean k(Context context) {
        return ((Boolean) k.a(context)).booleanValue();
    }
}
