package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum byzi {
    VERIFICATION_NA,
    VERIFICATION_VERIFIED,
    VERIFICATION_UNVERIFIED,
    VERIFICATION_IN_PROGRESS;

    private static final enip e;

    static {
        byzi byziVar = VERIFICATION_UNVERIFIED;
        e = enip.r(VERIFICATION_IN_PROGRESS, byziVar);
    }

    public final boolean a() {
        return this != VERIFICATION_NA;
    }

    public final boolean b() {
        return e.contains(this);
    }
}
