package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdrf implements fdre {
    public static final edax a;
    public static final edax b;

    static {
        enpd enpdVar = enpd.a;
        enip v = enip.v("ONEGOOGLE_MOBILE", "STREAMZ_CONSENTKIT_MOBILE", "IDENTITY_CONSENT_UI", "GMAIL_ANDROID_PRIMES", "ANDROID_GMAIL", "GMAIL_ANDROID", "GMAIL_SYNC_HEALTH", "GMAIL_COUNTERS", "XPLAT_GMAIL_ANDROID", "CLIENT_LOGGING_PROD");
        a = edbk.f("45401462", true, "com.google.android.libraries.onegoogle", v, true, false, false);
        b = edbk.f("45414966", true, "com.google.android.libraries.onegoogle", v, true, false, false);
    }

    @Override // defpackage.fdre
    public final boolean a(Context context) {
        return ((Boolean) a.a(context)).booleanValue();
    }

    @Override // defpackage.fdre
    public final boolean b(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }
}
