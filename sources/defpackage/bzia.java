package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzia {
    public static final bzia a;
    public static final bzia b;
    public static final bzia c;
    private static final /* synthetic */ bzia[] d;

    static {
        bzia bziaVar = new bzia("NONE", 0);
        a = bziaVar;
        bzia bziaVar2 = new bzia("ANONYMOUS", 1);
        b = bziaVar2;
        bzia bziaVar3 = new bzia("GAIA", 2);
        c = bziaVar3;
        bzia[] bziaVarArr = {bziaVar, bziaVar2, bziaVar3};
        d = bziaVarArr;
        ffhw.a(bziaVarArr);
    }

    private bzia(String str, int i) {
    }

    public static bzia[] values() {
        return (bzia[]) d.clone();
    }
}
