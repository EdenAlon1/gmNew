package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum fayp implements eyge {
    UNKNOWN(0),
    SUCCESS(1),
    FAILED_TO_DECRYPT(2),
    NOT_INTENDED_RECIPIENT(3),
    READ(4);

    public final int f;

    fayp(int i) {
        this.f = i;
    }

    public static fayp b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return FAILED_TO_DECRYPT;
        }
        if (i == 3) {
            return NOT_INTENDED_RECIPIENT;
        }
        if (i != 4) {
            return null;
        }
        return READ;
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
