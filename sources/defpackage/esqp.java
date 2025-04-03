package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqp {
    public static final esqp a;
    public static final esqp b;
    public static final esqp c;
    private static final /* synthetic */ esqp[] d;

    static {
        esqp esqpVar = new esqp("UNKNOWN_RENAMING_POLICY", 0);
        a = esqpVar;
        esqp esqpVar2 = new esqp("NO_RENAMING_ALLOWED", 1);
        b = esqpVar2;
        esqp esqpVar3 = new esqp("RENAMING_ALLOWED", 2);
        c = esqpVar3;
        esqp[] esqpVarArr = {esqpVar, esqpVar2, esqpVar3};
        d = esqpVarArr;
        ffhw.a(esqpVarArr);
    }

    private esqp(String str, int i) {
    }

    public static esqp[] values() {
        return (esqp[]) d.clone();
    }
}
