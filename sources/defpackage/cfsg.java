package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfsg {
    public static final cfsg a;
    public static final cfsg b;
    private static final /* synthetic */ cfsg[] c;

    static {
        cfsg cfsgVar = new cfsg("UNSET", 0);
        a = cfsgVar;
        cfsg cfsgVar2 = new cfsg("INCOMING_ZINNIA_PROCESSED", 1);
        b = cfsgVar2;
        cfsg[] cfsgVarArr = {cfsgVar, cfsgVar2};
        c = cfsgVarArr;
        ffhw.a(cfsgVarArr);
    }

    private cfsg(String str, int i) {
    }

    public static cfsg[] values() {
        return (cfsg[]) c.clone();
    }
}
