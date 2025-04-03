package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.nio.file.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC0003a {
    public static final EnumC0003a EXECUTE;
    public static final EnumC0003a READ;
    public static final EnumC0003a WRITE;
    private static final /* synthetic */ EnumC0003a[] a;

    static {
        EnumC0003a enumC0003a = new EnumC0003a("READ", 0);
        READ = enumC0003a;
        EnumC0003a enumC0003a2 = new EnumC0003a("WRITE", 1);
        WRITE = enumC0003a2;
        EnumC0003a enumC0003a3 = new EnumC0003a("EXECUTE", 2);
        EXECUTE = enumC0003a3;
        a = new EnumC0003a[]{enumC0003a, enumC0003a2, enumC0003a3};
    }

    public static EnumC0003a valueOf(String str) {
        return (EnumC0003a) Enum.valueOf(EnumC0003a.class, str);
    }

    public static EnumC0003a[] values() {
        return (EnumC0003a[]) a.clone();
    }
}
