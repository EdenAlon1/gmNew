package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudo {
    public static final eudo a = new eudo("SHA256");
    public static final eudo b = new eudo("SHA384");
    public static final eudo c = new eudo("SHA512");
    private final String d;

    private eudo(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
