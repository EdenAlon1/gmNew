package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ewof implements eyge {
    UNKNOWN(0),
    ENFORCE(1),
    DO_NOT_ENFORCE(2);

    public final int d;

    ewof(int i) {
        this.d = i;
    }

    public static ewof b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ENFORCE;
        }
        if (i != 2) {
            return null;
        }
        return DO_NOT_ENFORCE;
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
