package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum awuc implements eyge {
    UNKNOWN_STATUS(0),
    OK(1),
    PENDING(2),
    FAILED_TRANSIENTLY(3),
    FAILED_PERMANENTLY(4);

    public final int f;

    awuc(int i) {
        this.f = i;
    }

    public static awuc b(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return OK;
        }
        if (i == 2) {
            return PENDING;
        }
        if (i == 3) {
            return FAILED_TRANSIENTLY;
        }
        if (i != 4) {
            return null;
        }
        return FAILED_PERMANENTLY;
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
