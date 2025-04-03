package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffhh {
    public static final ffhh a;
    public static final ffhh b;
    public static final ffhh c;
    private static final /* synthetic */ ffhh[] d;

    static {
        ffhh ffhhVar = new ffhh("COROUTINE_SUSPENDED", 0);
        a = ffhhVar;
        ffhh ffhhVar2 = new ffhh("UNDECIDED", 1);
        b = ffhhVar2;
        ffhh ffhhVar3 = new ffhh("RESUMED", 2);
        c = ffhhVar3;
        ffhh[] ffhhVarArr = {ffhhVar, ffhhVar2, ffhhVar3};
        d = ffhhVarArr;
        ffhw.a(ffhhVarArr);
    }

    private ffhh(String str, int i) {
    }

    public static ffhh[] values() {
        return (ffhh[]) d.clone();
    }
}
