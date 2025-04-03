package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqef {
    public static final dqef a;
    public static final dqef b;
    public static final dqef c;
    private static final /* synthetic */ dqef[] d;

    static {
        dqef dqefVar = new dqef("NONE", 0);
        a = dqefVar;
        dqef dqefVar2 = new dqef("PARTIAL", 1);
        b = dqefVar2;
        dqef dqefVar3 = new dqef("FULL", 2);
        c = dqefVar3;
        dqef[] dqefVarArr = {dqefVar, dqefVar2, dqefVar3};
        d = dqefVarArr;
        ffhw.a(dqefVarArr);
    }

    private dqef(String str, int i) {
    }

    public static dqef[] values() {
        return (dqef[]) d.clone();
    }
}
