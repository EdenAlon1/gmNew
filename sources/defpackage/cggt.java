package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cggt {
    public static final cggt a;
    public static final cggt b;
    public static final cggt c;
    public static final /* synthetic */ ffhx d;
    private static final /* synthetic */ cggt[] e;

    static {
        cggt cggtVar = new cggt("UNKNOWN", 0);
        a = cggtVar;
        cggt cggtVar2 = new cggt("UNDER_SUPERVISION", 1);
        b = cggtVar2;
        cggt cggtVar3 = new cggt("SUPERVISION_DISABLED", 2);
        c = cggtVar3;
        cggt[] cggtVarArr = {cggtVar, cggtVar2, cggtVar3};
        e = cggtVarArr;
        d = ffhw.a(cggtVarArr);
    }

    private cggt(String str, int i) {
    }

    public static cggt[] values() {
        return (cggt[]) e.clone();
    }
}
