package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class qgh {
    public static final qgh a;
    public static final qgh b;
    private static final /* synthetic */ qgh[] c;

    static {
        qgh qghVar = new qgh("Immediately", 0);
        a = qghVar;
        qgh qghVar2 = new qgh("OnIterationFinish", 1);
        b = qghVar2;
        qgh[] qghVarArr = {qghVar, qghVar2};
        c = qghVarArr;
        ffhw.a(qghVarArr);
    }

    private qgh(String str, int i) {
    }

    public static qgh[] values() {
        return (qgh[]) c.clone();
    }
}
