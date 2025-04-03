package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class D {
    public static final D LENIENT;
    public static final D SMART;
    public static final D STRICT;
    private static final /* synthetic */ D[] a;

    static {
        D d = new D("STRICT", 0);
        STRICT = d;
        D d2 = new D("SMART", 1);
        SMART = d2;
        D d3 = new D("LENIENT", 2);
        LENIENT = d3;
        a = new D[]{d, d2, d3};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) a.clone();
    }
}
