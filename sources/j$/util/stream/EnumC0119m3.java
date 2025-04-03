package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.m3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class EnumC0119m3 {
    public static final EnumC0119m3 OP;
    public static final EnumC0119m3 SPLITERATOR;
    public static final EnumC0119m3 STREAM;
    public static final EnumC0119m3 TERMINAL_OP;
    public static final EnumC0119m3 UPSTREAM_TERMINAL_OP;
    private static final /* synthetic */ EnumC0119m3[] a;

    static {
        EnumC0119m3 enumC0119m3 = new EnumC0119m3("SPLITERATOR", 0);
        SPLITERATOR = enumC0119m3;
        EnumC0119m3 enumC0119m32 = new EnumC0119m3("STREAM", 1);
        STREAM = enumC0119m32;
        EnumC0119m3 enumC0119m33 = new EnumC0119m3("OP", 2);
        OP = enumC0119m33;
        EnumC0119m3 enumC0119m34 = new EnumC0119m3("TERMINAL_OP", 3);
        TERMINAL_OP = enumC0119m34;
        EnumC0119m3 enumC0119m35 = new EnumC0119m3("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC0119m35;
        a = new EnumC0119m3[]{enumC0119m3, enumC0119m32, enumC0119m33, enumC0119m34, enumC0119m35};
    }

    public static EnumC0119m3 valueOf(String str) {
        return (EnumC0119m3) Enum.valueOf(EnumC0119m3.class, str);
    }

    public static EnumC0119m3[] values() {
        return (EnumC0119m3[]) a.clone();
    }
}
