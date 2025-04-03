package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edhl {
    public static final edhl a;
    private static final /* synthetic */ edhl[] b;

    static {
        edhl edhlVar = new edhl();
        a = edhlVar;
        b = new edhl[]{edhlVar};
    }

    private edhl() {
    }

    public static edhl valueOf(String str) {
        return (edhl) Enum.valueOf(edhl.class, str);
    }

    public static edhl[] values() {
        return (edhl[]) b.clone();
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        return ordinal() != 0 ? super.toString() : "routing_summaries";
    }
}
