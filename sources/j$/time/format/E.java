package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class E {
    public static final E ALWAYS;
    public static final E EXCEEDS_PAD;
    public static final E NEVER;
    public static final E NORMAL;
    public static final E NOT_NEGATIVE;
    private static final /* synthetic */ E[] a;

    static {
        E e = new E("NORMAL", 0);
        NORMAL = e;
        E e2 = new E("ALWAYS", 1);
        ALWAYS = e2;
        E e3 = new E("NEVER", 2);
        NEVER = e3;
        E e4 = new E("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = e4;
        E e5 = new E("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = e5;
        a = new E[]{e, e2, e3, e4, e5};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) a.clone();
    }
}
