package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum cajj implements eyge {
    UNKNOWN_RECEIPT_ERROR(0),
    SUCCESS(1),
    FAILED_TO_DECRYPT(2),
    OTK_NOT_TARGETED_TO_ME(3),
    UNRECOGNIZED(-1);

    private final int g;

    cajj(int i) {
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
