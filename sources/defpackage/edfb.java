package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum edfb implements eyge {
    UPLOAD_FAILURE_UNKNOWN(0),
    UPLOAD_FAILURE_GENERIC_NOT_RETRYABLE_FAILURE(1),
    UPLOAD_FAILURE_NEEDS_STORAGE_QUOTA(2),
    UPLOAD_FAILURE_FILE_NOT_FOUND(3),
    UPLOAD_FAILURE_USER_CANCELLED(4),
    UNRECOGNIZED(-1);

    private final int h;

    edfb(int i) {
        this.h = i;
    }

    public static edfb b(int i) {
        if (i == 0) {
            return UPLOAD_FAILURE_UNKNOWN;
        }
        if (i == 1) {
            return UPLOAD_FAILURE_GENERIC_NOT_RETRYABLE_FAILURE;
        }
        if (i == 2) {
            return UPLOAD_FAILURE_NEEDS_STORAGE_QUOTA;
        }
        if (i == 3) {
            return UPLOAD_FAILURE_FILE_NOT_FOUND;
        }
        if (i != 4) {
            return null;
        }
        return UPLOAD_FAILURE_USER_CANCELLED;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
