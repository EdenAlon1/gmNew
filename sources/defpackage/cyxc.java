package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyxc {
    public static final cyxc a;
    public static final cyxc b;
    public static final cyxc c;
    public static final cyxc d;
    public static final cyxc e;
    private static final /* synthetic */ cyxc[] f;

    static {
        cyxc cyxcVar = new cyxc("DO_NOT_RENDER", 0);
        a = cyxcVar;
        cyxc cyxcVar2 = new cyxc("DATA_LOADING", 1);
        b = cyxcVar2;
        cyxc cyxcVar3 = new cyxc("VISIBLE", 2);
        c = cyxcVar3;
        cyxc cyxcVar4 = new cyxc("IN_EXIT_TRANSITION", 3);
        d = cyxcVar4;
        cyxc cyxcVar5 = new cyxc("HIDDEN", 4);
        e = cyxcVar5;
        cyxc[] cyxcVarArr = {cyxcVar, cyxcVar2, cyxcVar3, cyxcVar4, cyxcVar5};
        f = cyxcVarArr;
        ffhw.a(cyxcVarArr);
    }

    private cyxc(String str, int i) {
    }

    public static cyxc[] values() {
        return (cyxc[]) f.clone();
    }
}
