package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgat {
    public static final cgat a;
    public static final cgat b;
    public static final cgat c;
    private static final /* synthetic */ cgat[] d;

    static {
        cgat cgatVar = new cgat("YES", 0);
        a = cgatVar;
        cgat cgatVar2 = new cgat("NO", 1);
        b = cgatVar2;
        cgat cgatVar3 = new cgat("UNKNOWN", 2);
        c = cgatVar3;
        cgat[] cgatVarArr = {cgatVar, cgatVar2, cgatVar3};
        d = cgatVarArr;
        ffhw.a(cgatVarArr);
    }

    private cgat(String str, int i) {
    }

    public static cgat[] values() {
        return (cgat[]) d.clone();
    }
}
