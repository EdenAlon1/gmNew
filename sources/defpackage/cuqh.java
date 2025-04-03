package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuqh {
    public static final cuqh a;
    public static final cuqh b;
    public static final cuqh c;
    public static final cuqh d;
    public static final cuqh e;
    private static final /* synthetic */ cuqh[] f;

    static {
        cuqh cuqhVar = new cuqh("UNKNOWN", 0);
        a = cuqhVar;
        cuqh cuqhVar2 = new cuqh("REPORT", 1);
        b = cuqhVar2;
        cuqh cuqhVar3 = new cuqh("DELETE_CONVERSATION", 2);
        c = cuqhVar3;
        cuqh cuqhVar4 = new cuqh("LEAVE_IN_SPAM_FOLDER", 3);
        d = cuqhVar4;
        cuqh cuqhVar5 = new cuqh("BLOCK_WITHOUT_REPORTING", 4);
        e = cuqhVar5;
        cuqh[] cuqhVarArr = {cuqhVar, cuqhVar2, cuqhVar3, cuqhVar4, cuqhVar5};
        f = cuqhVarArr;
        ffhw.a(cuqhVarArr);
    }

    private cuqh(String str, int i) {
    }

    public static cuqh[] values() {
        return (cuqh[]) f.clone();
    }
}
