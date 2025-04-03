package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class doxa {
    public static final doxa a;
    public static final doxa b;
    public static final doxa c;
    public static final doxa d;
    private static final /* synthetic */ doxa[] e;

    static {
        doxa doxaVar = new doxa("BACK", 0);
        a = doxaVar;
        doxa doxaVar2 = new doxa("FORWARD", 1);
        b = doxaVar2;
        doxa doxaVar3 = new doxa("RELOAD", 2);
        c = doxaVar3;
        doxa doxaVar4 = new doxa("STOP_LOADING", 3);
        d = doxaVar4;
        doxa[] doxaVarArr = {doxaVar, doxaVar2, doxaVar3, doxaVar4};
        e = doxaVarArr;
        ffhw.a(doxaVarArr);
    }

    private doxa(String str, int i) {
    }

    public static doxa[] values() {
        return (doxa[]) e.clone();
    }
}
