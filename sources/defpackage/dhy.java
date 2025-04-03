package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhy {
    public static final dhy a;
    public static final dhy b;
    public static final dhy c;
    private static final /* synthetic */ dhy[] d;

    static {
        dhy dhyVar = new dhy("Default", 0);
        a = dhyVar;
        dhy dhyVar2 = new dhy("UserInput", 1);
        b = dhyVar2;
        dhy dhyVar3 = new dhy("PreventUserInput", 2);
        c = dhyVar3;
        dhy[] dhyVarArr = {dhyVar, dhyVar2, dhyVar3};
        d = dhyVarArr;
        ffhw.a(dhyVarArr);
    }

    private dhy(String str, int i) {
    }

    public static dhy[] values() {
        return (dhy[]) d.clone();
    }
}
