package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class gqp {
    public static final gqp a;
    public static final gqp b;
    public static final gqp c;
    private static final /* synthetic */ gqp[] d;

    static {
        gqp gqpVar = new gqp("Tabs", 0);
        a = gqpVar;
        gqp gqpVar2 = new gqp("Divider", 1);
        b = gqpVar2;
        gqp gqpVar3 = new gqp("Indicator", 2);
        c = gqpVar3;
        gqp[] gqpVarArr = {gqpVar, gqpVar2, gqpVar3};
        d = gqpVarArr;
        ffhw.a(gqpVarArr);
    }

    private gqp(String str, int i) {
    }

    public static gqp[] values() {
        return (gqp[]) d.clone();
    }
}
