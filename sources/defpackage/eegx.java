package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eegx {
    UNKNOWN("unknown"),
    SEND_RECEIVE("sendrecv"),
    SEND_ONLY("sendonly"),
    RECEIVE_ONLY("recvonly"),
    INACTIVE("inactive");

    public final String f;
    public final eegu g;

    eegx(String str) {
        this.f = str;
        this.g = new eegu(str, null);
    }
}
