package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqb {
    public static final fqb a;
    public static final fqb b;
    private static final /* synthetic */ fqb[] c;

    static {
        fqb fqbVar = new fqb("Filled", 0);
        a = fqbVar;
        fqb fqbVar2 = new fqb("Outlined", 1);
        b = fqbVar2;
        fqb[] fqbVarArr = {fqbVar, fqbVar2};
        c = fqbVarArr;
        ffhw.a(fqbVarArr);
    }

    private fqb(String str, int i) {
    }

    public static fqb[] values() {
        return (fqb[]) c.clone();
    }
}
