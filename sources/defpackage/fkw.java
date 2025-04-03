package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class fkw {
    public static final fkw a;
    public static final fkw b;
    public static final fkw c;
    private static final /* synthetic */ fkw[] d;

    static {
        fkw fkwVar = new fkw("Focused", 0);
        a = fkwVar;
        fkw fkwVar2 = new fkw("UnfocusedEmpty", 1);
        b = fkwVar2;
        fkw fkwVar3 = new fkw("UnfocusedNotEmpty", 2);
        c = fkwVar3;
        fkw[] fkwVarArr = {fkwVar, fkwVar2, fkwVar3};
        d = fkwVarArr;
        ffhw.a(fkwVarArr);
    }

    private fkw(String str, int i) {
    }

    public static fkw[] values() {
        return (fkw[]) d.clone();
    }
}
