package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ezar implements eyge {
    SIP_REGISTRATION_EVENT_TYPE_UNKNOWN(0),
    SIP_REGISTRATION_EVENT_TYPE_REGISTERED(1),
    SIP_REGISTRATION_EVENT_TYPE_UNREGISTERED(2),
    SIP_REGISTRATION_EVENT_TYPE_REGISTERING(3),
    SIP_REGISTRATION_EVENT_TYPE_UNREGISTERING(4),
    SIP_REGISTRATION_EVENT_TYPE_REREGISTERING(5);

    public final int g;

    ezar(int i) {
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
