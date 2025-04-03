package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxi {
    public static final dsxi a;
    public static final dsxi b;
    public static final dsxi c;
    public static final dsxi d;
    private static final /* synthetic */ dsxi[] e;

    static {
        dsxi dsxiVar = new dsxi("MATCHING_KEYBOARD", 0);
        a = dsxiVar;
        dsxi dsxiVar2 = new dsxi("ABOVE_KEYBOARD", 1);
        b = dsxiVar2;
        dsxi dsxiVar3 = new dsxi("EXPANDED", 2);
        c = dsxiVar3;
        dsxi dsxiVar4 = new dsxi("CLOSED", 3);
        d = dsxiVar4;
        dsxi[] dsxiVarArr = {dsxiVar, dsxiVar2, dsxiVar3, dsxiVar4};
        e = dsxiVarArr;
        ffhw.a(dsxiVarArr);
    }

    private dsxi(String str, int i) {
    }

    public static dsxi[] values() {
        return (dsxi[]) e.clone();
    }
}
