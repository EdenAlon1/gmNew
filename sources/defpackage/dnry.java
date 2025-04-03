package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnry {
    public static final dnry a;
    public static final dnry b;
    public static final dnry c;
    public static final dnry d;
    private static final /* synthetic */ dnry[] e;

    static {
        dnry dnryVar = new dnry("SINGLE", 0);
        a = dnryVar;
        dnry dnryVar2 = new dnry("TOP", 1);
        b = dnryVar2;
        dnry dnryVar3 = new dnry("MIDDLE", 2);
        c = dnryVar3;
        dnry dnryVar4 = new dnry("BOTTOM", 3);
        d = dnryVar4;
        dnry[] dnryVarArr = {dnryVar, dnryVar2, dnryVar3, dnryVar4};
        e = dnryVarArr;
        ffhw.a(dnryVarArr);
    }

    private dnry(String str, int i) {
    }

    public static dnry[] values() {
        return (dnry[]) e.clone();
    }
}
