package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drhu {
    public static final drhu a;
    public static final drhu b;
    public static final drhu c;
    private static final /* synthetic */ drhu[] d;

    static {
        drhu drhuVar = new drhu("LOADING", 0);
        a = drhuVar;
        drhu drhuVar2 = new drhu("ONBOARDED", 1);
        b = drhuVar2;
        drhu drhuVar3 = new drhu("NOT_ONBOARDED", 2);
        c = drhuVar3;
        drhu[] drhuVarArr = {drhuVar, drhuVar2, drhuVar3};
        d = drhuVarArr;
        ffhw.a(drhuVarArr);
    }

    private drhu(String str, int i) {
    }

    public static drhu[] values() {
        return (drhu[]) d.clone();
    }
}
