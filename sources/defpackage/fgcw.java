package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgcw {
    public static final fgcw a;
    public static final fgcw b;
    public static final fgcw c;
    private static final /* synthetic */ fgcw[] d;

    static {
        fgcw fgcwVar = new fgcw("START", 0);
        a = fgcwVar;
        fgcw fgcwVar2 = new fgcw("STOP", 1);
        b = fgcwVar2;
        fgcw fgcwVar3 = new fgcw("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = fgcwVar3;
        fgcw[] fgcwVarArr = {fgcwVar, fgcwVar2, fgcwVar3};
        d = fgcwVarArr;
        ffhw.a(fgcwVarArr);
    }

    private fgcw(String str, int i) {
    }

    public static fgcw[] values() {
        return (fgcw[]) d.clone();
    }
}
