package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtjb {
    public static final dtjb a;
    public static final dtjb b;
    public static final dtjb c;
    private static final /* synthetic */ dtjb[] d;

    static {
        dtjb dtjbVar = new dtjb("PRE_RECORDING", 0);
        a = dtjbVar;
        dtjb dtjbVar2 = new dtjb("RECORDING", 1);
        b = dtjbVar2;
        dtjb dtjbVar3 = new dtjb("PLAYBACK", 2);
        c = dtjbVar3;
        dtjb[] dtjbVarArr = {dtjbVar, dtjbVar2, dtjbVar3};
        d = dtjbVarArr;
        ffhw.a(dtjbVarArr);
    }

    private dtjb(String str, int i) {
    }

    public static dtjb[] values() {
        return (dtjb[]) d.clone();
    }
}
