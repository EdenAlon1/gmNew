package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dilt {
    PENDING("pending", 1),
    DIALING_OUT("dialing-out", 2),
    DIALING_IN("dialing-in", 3),
    ALERTING("alerting", 4),
    ON_HOLD("on-hold", 5),
    CONNECTED("connected", 6),
    MUTED_VIA_FOCUS("muted-via-focus", 7),
    DISCONNECTING("disconnecting", 8),
    DISCONNECTED("disconnected", 9),
    NONE("none", 10);

    public final String k;
    public final int l;

    dilt(String str, int i) {
        this.k = str;
        this.l = i;
    }

    public final boolean a() {
        return this == CONNECTED || this == ON_HOLD || this == MUTED_VIA_FOCUS;
    }

    public final boolean b() {
        return this == DISCONNECTED;
    }
}
