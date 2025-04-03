package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwk {
    public static final dnwk a;
    public static final dnwk b;
    private static final /* synthetic */ dnwk[] c;

    static {
        dnwk dnwkVar = new dnwk("NONE", 0);
        a = dnwkVar;
        dnwk dnwkVar2 = new dnwk("VERIFIED", 1);
        b = dnwkVar2;
        dnwk[] dnwkVarArr = {dnwkVar, dnwkVar2};
        c = dnwkVarArr;
        ffhw.a(dnwkVarArr);
    }

    private dnwk(String str, int i) {
    }

    public static dnwk[] values() {
        return (dnwk[]) c.clone();
    }
}
