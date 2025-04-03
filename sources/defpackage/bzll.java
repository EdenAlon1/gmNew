package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzll {
    public static final bzll a;
    public static final bzll b;
    private static final /* synthetic */ bzll[] c;

    static {
        bzll bzllVar = new bzll("THROTTLED", 0);
        a = bzllVar;
        bzll bzllVar2 = new bzll("NOT_THROTTLED", 1);
        b = bzllVar2;
        bzll[] bzllVarArr = {bzllVar, bzllVar2};
        c = bzllVarArr;
        ffhw.a(bzllVarArr);
    }

    private bzll(String str, int i) {
    }

    public static bzll[] values() {
        return (bzll[]) c.clone();
    }
}
