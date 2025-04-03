package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum clqb implements eyge {
    FALLBACK_UNKNOWN(0),
    FALLBACK_DEFAULT(1),
    FALLBACK_REQUIRED(2),
    FALLBACK_NOT_ALLOWED(3);

    public final int e;

    clqb(int i) {
        this.e = i;
    }

    public static clqb b(int i) {
        if (i == 0) {
            return FALLBACK_UNKNOWN;
        }
        if (i == 1) {
            return FALLBACK_DEFAULT;
        }
        if (i == 2) {
            return FALLBACK_REQUIRED;
        }
        if (i != 3) {
            return null;
        }
        return FALLBACK_NOT_ALLOWED;
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
