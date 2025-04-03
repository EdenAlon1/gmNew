package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ephd implements eyge {
    UNKNOWN_RCS_GROUP_TELEPHONY_DATA_FAILURE_REASON(0),
    NO_RECIPIENT_IDS_FOR_THREAD_ID(1),
    MULTIPLE_RECIPIENT_IDS_RETURNED(2),
    MULTIPLE_RECIPIENTS_PARSED(3),
    INVALID_RECIPIENT_ADDRESS_FORMAT(4);

    public final int f;

    ephd(int i) {
        this.f = i;
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
