package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eoog implements eyge {
    UNKNOWN_RESEND_ATTEMPT(0),
    RESEND_ATTEMPT(1),
    FIRST_ATTEMPT_TO_SEND(2);

    public final int d;

    eoog(int i) {
        this.d = i;
    }

    public static eoog b(int i) {
        if (i == 0) {
            return UNKNOWN_RESEND_ATTEMPT;
        }
        if (i == 1) {
            return RESEND_ATTEMPT;
        }
        if (i != 2) {
            return null;
        }
        return FIRST_ATTEMPT_TO_SEND;
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
