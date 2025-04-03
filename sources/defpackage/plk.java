package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class plk {
    public static final plk a = new plk("FLAT");
    public static final plk b = new plk("HALF_OPENED");
    private final String c;

    private plk(String str) {
        this.c = str;
    }

    public final String toString() {
        return this.c;
    }
}
