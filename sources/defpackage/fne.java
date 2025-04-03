package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class fne {
    public static final fne a;
    public static final fne b;
    public static final fne c;
    public static final fne d;
    public static final fne e;
    private static final /* synthetic */ fne[] f;

    static {
        fne fneVar = new fne("TopBar", 0);
        a = fneVar;
        fne fneVar2 = new fne("MainContent", 1);
        b = fneVar2;
        fne fneVar3 = new fne("Snackbar", 2);
        c = fneVar3;
        fne fneVar4 = new fne("Fab", 3);
        d = fneVar4;
        fne fneVar5 = new fne("BottomBar", 4);
        e = fneVar5;
        fne[] fneVarArr = {fneVar, fneVar2, fneVar3, fneVar4, fneVar5};
        f = fneVarArr;
        ffhw.a(fneVarArr);
    }

    private fne(String str, int i) {
    }

    public static fne[] values() {
        return (fne[]) f.clone();
    }
}
