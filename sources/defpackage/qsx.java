package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class qsx {
    public static final qsx a;
    public static final qsx b;
    public static final qsx c;
    public static final qsx d;
    private static final /* synthetic */ qsx[] e;

    static {
        qsx qsxVar = new qsx("CLEARED", 0);
        a = qsxVar;
        qsx qsxVar2 = new qsx("RUNNING", 1);
        b = qsxVar2;
        qsx qsxVar3 = new qsx("SUCCEEDED", 2);
        c = qsxVar3;
        qsx qsxVar4 = new qsx("FAILED", 3);
        d = qsxVar4;
        qsx[] qsxVarArr = {qsxVar, qsxVar2, qsxVar3, qsxVar4};
        e = qsxVarArr;
        ffhw.a(qsxVarArr);
    }

    private qsx(String str, int i) {
    }

    public static qsx[] values() {
        return (qsx[]) e.clone();
    }
}
