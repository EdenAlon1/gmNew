package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etfu {
    public static final etfu a = new etfu("ENABLED");
    public static final etfu b = new etfu("DISABLED");
    public static final etfu c = new etfu("DESTROYED");
    private final String d;

    private etfu(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
