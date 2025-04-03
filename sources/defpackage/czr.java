package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class czr {
    public static final czr a;
    public static final czr b;
    public static final czr c;
    private static final /* synthetic */ czr[] d;

    static {
        czr czrVar = new czr("Default", 0);
        a = czrVar;
        czr czrVar2 = new czr("UserInput", 1);
        b = czrVar2;
        czr czrVar3 = new czr("PreventUserInput", 2);
        c = czrVar3;
        czr[] czrVarArr = {czrVar, czrVar2, czrVar3};
        d = czrVarArr;
        ffhw.a(czrVarArr);
    }

    private czr(String str, int i) {
    }

    public static czr[] values() {
        return (czr[]) d.clone();
    }
}
