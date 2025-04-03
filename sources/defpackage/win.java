package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
final class win {
    public static final win a;
    public static final win b;
    public static final win c;
    private static final /* synthetic */ win[] d;

    static {
        win winVar = new win("EMPTY", 0);
        a = winVar;
        win winVar2 = new win("SHORT", 1);
        b = winVar2;
        win winVar3 = new win("LONG", 2);
        c = winVar3;
        win[] winVarArr = {winVar, winVar2, winVar3};
        d = winVarArr;
        ffhw.a(winVarArr);
    }

    private win(String str, int i) {
    }

    public static win[] values() {
        return (win[]) d.clone();
    }
}
