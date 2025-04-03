package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ezag implements eyge {
    NETWORK_INTERFACE_AVAILABILITY_UNKNOWN(0),
    NETWORK_INTERFACE_AVAILABILITY_AVAILABLE(1),
    NETWORK_INTERFACE_AVAILABILITY_UNAVAILABLE(2);

    public final int d;

    ezag(int i) {
        this.d = i;
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
