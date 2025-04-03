package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epaa implements eyge {
    UNKNOWN_PROVISIONING_STATE(0),
    PROVISIONED(1),
    NOT_PROVISIONED(2),
    DISABLED(3),
    NOT_PROVISIONED_BUT_INITIALIZED(4);

    public final int f;

    epaa(int i) {
        this.f = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
