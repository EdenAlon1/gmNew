package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdqt implements fdqs {
    public static final edax a;
    public static final edax b;
    public static final edax c;
    public static final edax d;
    public static final edax e;

    static {
        enpd enpdVar = enpd.a;
        enip s = enip.s("ANDROID_MESSAGING", "CARRIER_SERVICES", "ANDROID_MESSAGING_PRIMES");
        a = edbk.f("3", false, "com.google.android.libraries.mobileconfiguration", s, true, false, false);
        b = edbk.e("1", "mobileconfiguration-pa.googleapis.com", "com.google.android.libraries.mobileconfiguration", s, true, false, false);
        c = edbk.f("45669836", false, "com.google.android.libraries.mobileconfiguration", s, true, false, false);
        d = edbk.e("4", "oauth2:https://www.googleapis.com/auth/mobileconfiguration", "com.google.android.libraries.mobileconfiguration", s, true, false, false);
        e = edbk.e("2", "AIzaSyAjKazdIYitdprpqlEAYHkgTae00yoo8rQ", "com.google.android.libraries.mobileconfiguration", s, true, false, false);
    }

    @Override // defpackage.fdqs
    public final String a(Context context) {
        return (String) b.a(context);
    }

    @Override // defpackage.fdqs
    public final String b(Context context) {
        return (String) d.a(context);
    }

    @Override // defpackage.fdqs
    public final String c(Context context) {
        return (String) e.a(context);
    }

    @Override // defpackage.fdqs
    public final boolean d(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.fdqs
    public final boolean e(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }
}
