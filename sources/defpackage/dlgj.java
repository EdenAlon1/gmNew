package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlgj {
    public static final dlgj a;
    public static final dlgj b;
    public static final dlgj c;
    public static final dlgj d;
    private static final /* synthetic */ dlgj[] e;

    static {
        dlgj dlgjVar = new dlgj("RESULT_UNKNOWN", 0);
        a = dlgjVar;
        dlgj dlgjVar2 = new dlgj("RESULT_MODEL_INFERENCE", 1);
        b = dlgjVar2;
        dlgj dlgjVar3 = new dlgj("RESULT_BLOCKLIST_PROCESS", 2);
        c = dlgjVar3;
        dlgj dlgjVar4 = new dlgj("RESULT_HEURISTIC_SCORE", 3);
        d = dlgjVar4;
        dlgj[] dlgjVarArr = {dlgjVar, dlgjVar2, dlgjVar3, dlgjVar4};
        e = dlgjVarArr;
        ffhw.a(dlgjVarArr);
    }

    private dlgj(String str, int i) {
    }

    public static dlgj[] values() {
        return (dlgj[]) e.clone();
    }
}
