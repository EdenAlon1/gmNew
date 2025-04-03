package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyi {
    public static final jyi a;
    public static final jyi b;
    private static final /* synthetic */ jyi[] c;

    static {
        jyi jyiVar = new jyi("Ltr", 0);
        a = jyiVar;
        jyi jyiVar2 = new jyi("Rtl", 1);
        b = jyiVar2;
        jyi[] jyiVarArr = {jyiVar, jyiVar2};
        c = jyiVarArr;
        ffhw.a(jyiVarArr);
    }

    private jyi(String str, int i) {
    }

    public static jyi[] values() {
        return (jyi[]) c.clone();
    }
}
