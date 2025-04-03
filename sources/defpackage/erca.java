package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum erca implements eyge {
    VIDEO_CALLING_SERVICE_TYPE_UNKNOWN(0),
    VIDEO_CALLING_SERVICE_TYPE_WHATSAPP(1),
    UNRECOGNIZED(-1);

    private final int e;

    erca(int i) {
        this.e = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
