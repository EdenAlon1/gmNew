package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzhs {
    public static final bzhs a;
    public static final bzhs b;
    public static final bzhs c;
    private static final /* synthetic */ bzhs[] e;
    public final int d;

    static {
        bzhs bzhsVar = new bzhs("UNKNOWN", 0, 0);
        a = bzhsVar;
        bzhs bzhsVar2 = new bzhs("SATELLITE_MODE", 1, 1);
        b = bzhsVar2;
        bzhs bzhsVar3 = new bzhs("TRUSTED_CONTACTS", 2, 2);
        c = bzhsVar3;
        bzhs[] bzhsVarArr = {bzhsVar, bzhsVar2, bzhsVar3};
        e = bzhsVarArr;
        ffhw.a(bzhsVarArr);
    }

    private bzhs(String str, int i, int i2) {
        this.d = i2;
    }

    public static bzhs[] values() {
        return (bzhs[]) e.clone();
    }
}
