package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etnr {
    public static final etnr a = new etnr("COMPRESSED");
    public static final etnr b = new etnr("UNCOMPRESSED");
    public static final etnr c = new etnr("LEGACY_UNCOMPRESSED");
    private final String d;

    private etnr(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
