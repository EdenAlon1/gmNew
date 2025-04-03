package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drat {
    public static final drat a;
    public static final drat b;
    public static final drat c;
    private static final /* synthetic */ drat[] d;

    static {
        drat dratVar = new drat("CANCELED", 0);
        a = dratVar;
        drat dratVar2 = new drat("ERROR", 1);
        b = dratVar2;
        drat dratVar3 = new drat("SENT", 2);
        c = dratVar3;
        drat[] dratVarArr = {dratVar, dratVar2, dratVar3};
        d = dratVarArr;
        ffhw.a(dratVarArr);
    }

    private drat(String str, int i) {
    }

    public static drat[] values() {
        return (drat[]) d.clone();
    }
}
