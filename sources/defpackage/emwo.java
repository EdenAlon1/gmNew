package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emwo implements emwl {
    public static final emwo a;
    private static final /* synthetic */ emwo[] b;

    static {
        emwo emwoVar = new emwo();
        a = emwoVar;
        b = new emwo[]{emwoVar};
    }

    private emwo() {
    }

    public static emwo[] values() {
        return (emwo[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.identity()";
    }

    @Override // defpackage.emwl
    public final Object apply(Object obj) {
        return obj;
    }
}
