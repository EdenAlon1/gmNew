package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmuj {
    public static final dmuj a;
    public static final dmuj b;
    private static final /* synthetic */ dmuj[] c;

    static {
        dmuj dmujVar = new dmuj("PICKING_DATE", 0);
        a = dmujVar;
        dmuj dmujVar2 = new dmuj("PICKING_TIME", 1);
        b = dmujVar2;
        dmuj[] dmujVarArr = {dmujVar, dmujVar2};
        c = dmujVarArr;
        ffhw.a(dmujVarArr);
    }

    private dmuj(String str, int i) {
    }

    public static dmuj[] values() {
        return (dmuj[]) c.clone();
    }
}
