package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cst {
    public static final cst a;
    public static final cst b;
    public static final cst c;
    private static final /* synthetic */ cst[] d;

    static {
        cst cstVar = new cst("PreEnter", 0);
        a = cstVar;
        cst cstVar2 = new cst("Visible", 1);
        b = cstVar2;
        cst cstVar3 = new cst("PostExit", 2);
        c = cstVar3;
        cst[] cstVarArr = {cstVar, cstVar2, cstVar3};
        d = cstVarArr;
        ffhw.a(cstVarArr);
    }

    private cst(String str, int i) {
    }

    public static cst[] values() {
        return (cst[]) d.clone();
    }
}
