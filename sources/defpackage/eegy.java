package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eegy {
    public static final eegy a;
    private static final /* synthetic */ eegy[] b;
    private final String c = "IN";

    static {
        eegy eegyVar = new eegy();
        a = eegyVar;
        b = new eegy[]{eegyVar};
    }

    private eegy() {
    }

    public static eegy[] values() {
        return (eegy[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
