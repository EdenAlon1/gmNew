package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnyl {
    public static final dnyl a;
    public static final dnyl b;
    public static final dnyl c;
    private static final /* synthetic */ dnyl[] d;

    static {
        dnyl dnylVar = new dnyl("CIRCLE", 0);
        a = dnylVar;
        dnyl dnylVar2 = new dnyl("RECTANGLE", 1);
        b = dnylVar2;
        dnyl dnylVar3 = new dnyl("ROUNDED_RECTANGLE", 2);
        c = dnylVar3;
        dnyl[] dnylVarArr = {dnylVar, dnylVar2, dnylVar3};
        d = dnylVarArr;
        ffhw.a(dnylVarArr);
    }

    private dnyl(String str, int i) {
    }

    public static dnyl[] values() {
        return (dnyl[]) d.clone();
    }
}
