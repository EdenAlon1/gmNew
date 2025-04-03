package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class hbh {
    public static final hbh a;
    public static final hbh b;
    public static final hbh c;
    private static final /* synthetic */ hbh[] d;

    static {
        hbh hbhVar = new hbh("Focused", 0);
        a = hbhVar;
        hbh hbhVar2 = new hbh("UnfocusedEmpty", 1);
        b = hbhVar2;
        hbh hbhVar3 = new hbh("UnfocusedNotEmpty", 2);
        c = hbhVar3;
        hbh[] hbhVarArr = {hbhVar, hbhVar2, hbhVar3};
        d = hbhVarArr;
        ffhw.a(hbhVarArr);
    }

    private hbh(String str, int i) {
    }

    public static hbh[] values() {
        return (hbh[]) d.clone();
    }
}
