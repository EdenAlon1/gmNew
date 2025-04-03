package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum axes implements eyge {
    ENCRYPTION_STATUS_UNSPECIFIED(0),
    ENCRYPTION_STATUS_ENCRYPTED(1),
    ENCRYPTION_STATUS_NOT_ENCRYPTED(2);

    public final int d;

    axes(int i) {
        this.d = i;
    }

    public static axes b(int i) {
        if (i == 0) {
            return ENCRYPTION_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return ENCRYPTION_STATUS_ENCRYPTED;
        }
        if (i != 2) {
            return null;
        }
        return ENCRYPTION_STATUS_NOT_ENCRYPTED;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
