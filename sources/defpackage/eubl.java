package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eubl {
    public static final eubl a = new eubl("SHA256");
    public static final eubl b = new eubl("SHA384");
    public static final eubl c = new eubl("SHA512");
    public final String d;

    private eubl(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
