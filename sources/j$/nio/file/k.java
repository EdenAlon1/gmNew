package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class k implements n, CopyOption {
    public static final k NOFOLLOW_LINKS;
    private static final /* synthetic */ k[] a;

    static {
        k kVar = new k("NOFOLLOW_LINKS", 0);
        NOFOLLOW_LINKS = kVar;
        a = new k[]{kVar};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) a.clone();
    }
}
