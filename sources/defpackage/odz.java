package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class odz {
    public static final odz a;
    public static final odz b;
    public static final odz c;
    private static final /* synthetic */ odz[] d;

    static {
        odz odzVar = new odz("ITEM_TO_PLACEHOLDER", 0);
        a = odzVar;
        odz odzVar2 = new odz("PLACEHOLDER_TO_ITEM", 1);
        b = odzVar2;
        odz odzVar3 = new odz("PLACEHOLDER_POSITION_CHANGE", 2);
        c = odzVar3;
        odz[] odzVarArr = {odzVar, odzVar2, odzVar3};
        d = odzVarArr;
        ffhw.a(odzVarArr);
    }

    private odz(String str, int i) {
    }

    public static odz[] values() {
        return (odz[]) d.clone();
    }
}
