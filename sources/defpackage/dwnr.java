package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dwnr implements eyge {
    UNSPECIFIED(0),
    DOWNLOADED(1),
    PENDING(2),
    PENDING_CUSTOM_VALIDATION(3);

    public final int e;

    dwnr(int i) {
        this.e = i;
    }

    public static dwnr b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return DOWNLOADED;
        }
        if (i == 2) {
            return PENDING;
        }
        if (i != 3) {
            return null;
        }
        return PENDING_CUSTOM_VALIDATION;
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
