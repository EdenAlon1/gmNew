package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufy {
    public static final eufy a = new eufy("SHA1");
    public static final eufy b = new eufy("SHA256");
    public static final eufy c = new eufy("SHA512");
    private final String d;

    private eufy(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
