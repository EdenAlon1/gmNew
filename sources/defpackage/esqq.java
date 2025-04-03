package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqq {
    public static final esqq a;
    public static final esqq b;
    public static final esqq c;
    public static final esqq d;
    private static final /* synthetic */ esqq[] e;

    static {
        esqq esqqVar = new esqq("UNKNOWN_REMOVAL_POLICY", 0);
        a = esqqVar;
        esqq esqqVar2 = new esqq("NO_USER_REMOVAL_ALLOWED", 1);
        b = esqqVar2;
        esqq esqqVar3 = new esqq("REMOVAL_ALLOWED_FOR_ALL", 2);
        c = esqqVar3;
        esqq esqqVar4 = new esqq("REMOVAL_ALLOWED_FOR_ADMINS", 3);
        d = esqqVar4;
        esqq[] esqqVarArr = {esqqVar, esqqVar2, esqqVar3, esqqVar4};
        e = esqqVarArr;
        ffhw.a(esqqVarArr);
    }

    private esqq(String str, int i) {
    }

    public static esqq[] values() {
        return (esqq[]) e.clone();
    }
}
