package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqlx {
    public static final aqlx a;
    public static final aqlx b;
    public static final aqlx c;
    private static final /* synthetic */ aqlx[] d;

    static {
        aqlx aqlxVar = new aqlx("UNKNOWN", 0);
        a = aqlxVar;
        aqlx aqlxVar2 = new aqlx("NOT_APPROVED", 1);
        b = aqlxVar2;
        aqlx aqlxVar3 = new aqlx("APPROVED", 2);
        c = aqlxVar3;
        aqlx[] aqlxVarArr = {aqlxVar, aqlxVar2, aqlxVar3};
        d = aqlxVarArr;
        ffhw.a(aqlxVarArr);
    }

    private aqlx(String str, int i) {
    }

    public static aqlx[] values() {
        return (aqlx[]) d.clone();
    }
}
