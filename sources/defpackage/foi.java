package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class foi {
    public static final foi a;
    public static final foi b;
    private static final /* synthetic */ foi[] c;

    static {
        foi foiVar = new foi("Dismissed", 0);
        a = foiVar;
        foi foiVar2 = new foi("ActionPerformed", 1);
        b = foiVar2;
        foi[] foiVarArr = {foiVar, foiVar2};
        c = foiVarArr;
        ffhw.a(foiVarArr);
    }

    private foi(String str, int i) {
    }

    public static foi[] values() {
        return (foi[]) c.clone();
    }
}
