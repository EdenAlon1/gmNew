package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eozj implements eyge {
    UNKNOWN(0),
    SENDERS_IDENTITY_INCORRECT(1),
    IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED(2),
    SENDERS_USER_ID_INCORRECT(3),
    TACHYON_DOWNLOAD_FAILED(4),
    OTHER_EXCEPTION(5),
    SUCCESS(6),
    SENDERS_USER_ID_EMPTY(7);

    public final int i;

    eozj(int i) {
        this.i = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
