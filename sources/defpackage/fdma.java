package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdma implements fdlz {
    public static final edax a;
    public static final edax b;
    public static final edax c;

    static {
        enpd enpdVar = enpd.a;
        a = edbk.f("CollectionBasisVerifierFeatures__enable_cbv_v2", false, "com.google.android.libraries.consentverifier", enpdVar, true, false, false);
        b = edbk.f("CollectionBasisVerifierFeatures__enable_google_signature_check", false, "com.google.android.libraries.consentverifier", enpdVar, true, false, false);
        c = edbk.f("CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false, "com.google.android.libraries.consentverifier", enpdVar, true, false, false);
    }

    @Override // defpackage.fdlz
    public final boolean a() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.fdlz
    public final boolean b() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // defpackage.fdlz
    public final void c() {
        ((Boolean) c.get()).booleanValue();
    }
}
