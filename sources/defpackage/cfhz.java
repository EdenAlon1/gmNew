package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfhz {
    public static final cfhz a;
    public static final cfhz b;
    private static final /* synthetic */ cfhz[] c;

    static {
        cfhz cfhzVar = new cfhz("WORK_MANAGER", 0);
        a = cfhzVar;
        cfhz cfhzVar2 = new cfhz("EAGER_EVALUATION", 1);
        b = cfhzVar2;
        cfhz[] cfhzVarArr = {cfhzVar, cfhzVar2};
        c = cfhzVarArr;
        ffhw.a(cfhzVarArr);
    }

    private cfhz(String str, int i) {
    }

    public static cfhz[] values() {
        return (cfhz[]) c.clone();
    }
}
