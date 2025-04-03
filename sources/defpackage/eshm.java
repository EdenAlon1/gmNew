package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eshm implements eyge {
    CMS_UNKNOWN_KEY(0),
    CMS_ENCRYPTION_KEY(1),
    CMS_BACKUP_KEY(2),
    CMS_HMAC_SHA256_KEY(3),
    UNRECOGNIZED(-1);

    private final int g;

    eshm(int i) {
        this.g = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
