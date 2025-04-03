package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfgb {
    public static final cfgb a;
    public static final cfgb b;
    private static final /* synthetic */ cfgb[] c;

    static {
        cfgb cfgbVar = new cfgb("QUICK_CHECK", 0);
        a = cfgbVar;
        cfgb cfgbVar2 = new cfgb("IN_DEPTH", 1);
        b = cfgbVar2;
        cfgb[] cfgbVarArr = {cfgbVar, cfgbVar2};
        c = cfgbVarArr;
        ffhw.a(cfgbVarArr);
    }

    private cfgb(String str, int i) {
    }

    public static cfgb[] values() {
        return (cfgb[]) c.clone();
    }
}
