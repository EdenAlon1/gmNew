package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyj {
    public static final djyj a;
    public static final djyj b;
    public static final djyj c;
    private static final /* synthetic */ djyj[] d;

    static {
        djyj djyjVar = new djyj("FULL_LAUNCH", 0);
        a = djyjVar;
        djyj djyjVar2 = new djyj("DARK_LAUNCH", 1);
        b = djyjVar2;
        djyj djyjVar3 = new djyj("NOT_LAUNCHED", 2);
        c = djyjVar3;
        djyj[] djyjVarArr = {djyjVar, djyjVar2, djyjVar3};
        d = djyjVarArr;
        ffhw.a(djyjVarArr);
    }

    private djyj(String str, int i) {
    }

    public static djyj[] values() {
        return (djyj[]) d.clone();
    }
}
