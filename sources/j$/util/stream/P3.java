package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
final class P3 {
    public static final P3 MAYBE_MORE;
    public static final P3 NO_MORE;
    public static final P3 UNLIMITED;
    private static final /* synthetic */ P3[] a;

    static {
        P3 p3 = new P3("NO_MORE", 0);
        NO_MORE = p3;
        P3 p32 = new P3("MAYBE_MORE", 1);
        MAYBE_MORE = p32;
        P3 p33 = new P3("UNLIMITED", 2);
        UNLIMITED = p33;
        a = new P3[]{p3, p32, p33};
    }

    public static P3 valueOf(String str) {
        return (P3) Enum.valueOf(P3.class, str);
    }

    public static P3[] values() {
        return (P3[]) a.clone();
    }
}
