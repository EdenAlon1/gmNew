package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdrc implements fdrb {
    public static final edax a;
    public static final edax b;
    public static final edax c;
    public static final edax d;

    static {
        enpd enpdVar = enpd.a;
        enip v = enip.v("ONEGOOGLE_MOBILE", "STREAMZ_CONSENTKIT_MOBILE", "IDENTITY_CONSENT_UI", "GMAIL_ANDROID_PRIMES", "ANDROID_GMAIL", "GMAIL_ANDROID", "GMAIL_SYNC_HEALTH", "GMAIL_COUNTERS", "XPLAT_GMAIL_ANDROID", "CLIENT_LOGGING_PROD");
        a = edbk.f("45477821", false, "com.google.android.libraries.onegoogle", v, true, false, false);
        b = edbk.f("45383896", true, "com.google.android.libraries.onegoogle", v, true, false, false);
        c = edbk.f("45386670", true, "com.google.android.libraries.onegoogle", v, true, false, false);
        d = edbk.f("45644389", false, "com.google.android.libraries.onegoogle", v, true, false, false);
    }

    @Override // defpackage.fdrb
    public final boolean a(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.fdrb
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.fdrb
    public final boolean c(Context context) {
        return ((Boolean) c.a(context)).booleanValue();
    }

    @Override // defpackage.fdrb
    public final boolean d(Context context) {
        return ((Boolean) d.a(context)).booleanValue();
    }
}
