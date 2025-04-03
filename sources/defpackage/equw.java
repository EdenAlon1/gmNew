package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum equw implements eyge {
    MESSAGE_TYPE_UNKNOWN(0),
    MESSAGE_TYPE_SMS(1),
    MESSAGE_TYPE_RCS(2),
    MESSAGE_TYPE_MMS(3),
    MESSAGE_TYPE_HYBRID(4),
    MESSAGE_TYPE_BUSINESS_MESSAGE(5);

    public final int g;

    equw(int i) {
        this.g = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
