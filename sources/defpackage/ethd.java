package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethd {
    public static final ethd a = new ethd("SHA1");
    public static final ethd b = new ethd("SHA224");
    public static final ethd c = new ethd("SHA256");
    public static final ethd d = new ethd("SHA384");
    public static final ethd e = new ethd("SHA512");
    private final String f;

    private ethd(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
