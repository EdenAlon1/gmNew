package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cowx {
    public static final cowx a;
    public static final cowx b;
    public static final cowx c;
    private static final /* synthetic */ cowx[] d;

    static {
        cowx cowxVar = new cowx("SUCCEEDED", 0);
        a = cowxVar;
        cowx cowxVar2 = new cowx("FAILED", 1);
        b = cowxVar2;
        cowx cowxVar3 = new cowx("SKIPPED", 2);
        c = cowxVar3;
        cowx[] cowxVarArr = {cowxVar, cowxVar2, cowxVar3};
        d = cowxVarArr;
        ffhw.a(cowxVarArr);
    }

    private cowx(String str, int i) {
    }

    public static cowx[] values() {
        return (cowx[]) d.clone();
    }
}
