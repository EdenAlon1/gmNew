package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum drsq implements eyge {
    NOT_INSTALLED(0),
    SERVICE_NOT_AVAILABLE(1),
    ACCOUNT_NOT_SIGNED_IN(2),
    ONBOARDING_INCOMPLETE(3);

    public final int e;

    drsq(int i) {
        this.e = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
