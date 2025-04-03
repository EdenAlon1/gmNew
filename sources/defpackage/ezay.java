package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ezay implements eyge {
    SIP_TRANSPORT_EVENT_TYPE_UNKNOWN(0),
    SIP_TRANSPORT_EVENT_TYPE_ERROR(1);

    public final int c;

    ezay(int i) {
        this.c = i;
    }

    public static ezay b(int i) {
        if (i == 0) {
            return SIP_TRANSPORT_EVENT_TYPE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return SIP_TRANSPORT_EVENT_TYPE_ERROR;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
