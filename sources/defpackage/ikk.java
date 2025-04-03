package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikk {
    public static final ikk a;
    public static final ikk b;
    public static final ikk c;
    private static final /* synthetic */ ikk[] d;

    static {
        ikk ikkVar = new ikk("Initial", 0);
        a = ikkVar;
        ikk ikkVar2 = new ikk("Main", 1);
        b = ikkVar2;
        ikk ikkVar3 = new ikk("Final", 2);
        c = ikkVar3;
        ikk[] ikkVarArr = {ikkVar, ikkVar2, ikkVar3};
        d = ikkVarArr;
        ffhw.a(ikkVarArr);
    }

    private ikk(String str, int i) {
    }

    public static ikk[] values() {
        return (ikk[]) d.clone();
    }
}
