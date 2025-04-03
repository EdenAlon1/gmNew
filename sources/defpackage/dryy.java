package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dryy {
    public static final dryy a;
    public static final dryy b;
    private static final /* synthetic */ dryy[] c;

    static {
        dryy dryyVar = new dryy("SEARCH", 0);
        a = dryyVar;
        dryy dryyVar2 = new dryy("BACK", 1);
        b = dryyVar2;
        dryy[] dryyVarArr = {dryyVar, dryyVar2};
        c = dryyVarArr;
        ffhw.a(dryyVarArr);
    }

    private dryy(String str, int i) {
    }

    public static dryy[] values() {
        return (dryy[]) c.clone();
    }
}
