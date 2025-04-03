package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eibr {
    UNKNOWN("unknown", new String[0]),
    DELIVERY("delivered", "delivered", "failed", "forbidden", "error"),
    DISPLAY("displayed", "displayed", "forbidden", "error"),
    PROCESSING("processed", "processed", "stored", "forbidden", "error"),
    INTERWORKING("legacy-sms", "legacy-sms", "legacy-mms");

    public final String f;
    public final engw g;

    eibr(String str, String... strArr) {
        this.f = str;
        this.g = engw.p(strArr);
    }
}
