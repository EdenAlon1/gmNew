package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
final class ablg {
    public static final ablg a;
    public static final ablg b;
    public static final ablg c;
    private static final /* synthetic */ ablg[] d;

    static {
        ablg ablgVar = new ablg("STARTED", 0);
        a = ablgVar;
        ablg ablgVar2 = new ablg("STOPPED", 1);
        b = ablgVar2;
        ablg ablgVar3 = new ablg("CANCELLED", 2);
        c = ablgVar3;
        ablg[] ablgVarArr = {ablgVar, ablgVar2, ablgVar3};
        d = ablgVarArr;
        ffhw.a(ablgVarArr);
    }

    private ablg(String str, int i) {
    }

    public static ablg[] values() {
        return (ablg[]) d.clone();
    }
}
