package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudc {
    public static final eudc a = new eudc("SHA256");
    public static final eudc b = new eudc("SHA384");
    public static final eudc c = new eudc("SHA512");
    private final String d;

    private eudc(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
