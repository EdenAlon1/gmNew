package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alxq {
    public static final alxq a;
    public static final alxq b;
    private static final /* synthetic */ alxq[] c;

    static {
        alxq alxqVar = new alxq("SIMPLE", 0);
        a = alxqVar;
        alxq alxqVar2 = new alxq("RICH", 1);
        b = alxqVar2;
        alxq[] alxqVarArr = {alxqVar, alxqVar2};
        c = alxqVarArr;
        ffhw.a(alxqVarArr);
    }

    private alxq(String str, int i) {
    }

    public static alxq[] values() {
        return (alxq[]) c.clone();
    }
}
