package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cexh {
    public static final cexh a;
    public static final cexh b;
    private static final /* synthetic */ cexh[] c;

    static {
        cexh cexhVar = new cexh("V1", 0);
        a = cexhVar;
        cexh cexhVar2 = new cexh("V2", 1);
        b = cexhVar2;
        cexh[] cexhVarArr = {cexhVar, cexhVar2};
        c = cexhVarArr;
        ffhw.a(cexhVarArr);
    }

    private cexh(String str, int i) {
    }

    public static cexh[] values() {
        return (cexh[]) c.clone();
    }
}
