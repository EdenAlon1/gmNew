package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.o3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC0129o3 {
    public static final EnumC0129o3 DOUBLE_VALUE;
    public static final EnumC0129o3 INT_VALUE;
    public static final EnumC0129o3 LONG_VALUE;
    public static final EnumC0129o3 REFERENCE;
    private static final /* synthetic */ EnumC0129o3[] a;

    static {
        EnumC0129o3 enumC0129o3 = new EnumC0129o3("REFERENCE", 0);
        REFERENCE = enumC0129o3;
        EnumC0129o3 enumC0129o32 = new EnumC0129o3("INT_VALUE", 1);
        INT_VALUE = enumC0129o32;
        EnumC0129o3 enumC0129o33 = new EnumC0129o3("LONG_VALUE", 2);
        LONG_VALUE = enumC0129o33;
        EnumC0129o3 enumC0129o34 = new EnumC0129o3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC0129o34;
        a = new EnumC0129o3[]{enumC0129o3, enumC0129o32, enumC0129o33, enumC0129o34};
    }

    public static EnumC0129o3 valueOf(String str) {
        return (EnumC0129o3) Enum.valueOf(EnumC0129o3.class, str);
    }

    public static EnumC0129o3[] values() {
        return (EnumC0129o3[]) a.clone();
    }
}
