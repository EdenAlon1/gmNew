package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hiu {
    public static final hiu a;
    public static final hiu b;
    public static final hiu c;
    public static final hiu d;
    public static final hiu e;
    public static final hiu f;
    private static final /* synthetic */ hiu[] g;

    static {
        hiu hiuVar = new hiu("ShutDown", 0);
        a = hiuVar;
        hiu hiuVar2 = new hiu("ShuttingDown", 1);
        b = hiuVar2;
        hiu hiuVar3 = new hiu("Inactive", 2);
        c = hiuVar3;
        hiu hiuVar4 = new hiu("InactivePendingWork", 3);
        d = hiuVar4;
        hiu hiuVar5 = new hiu("Idle", 4);
        e = hiuVar5;
        hiu hiuVar6 = new hiu("PendingWork", 5);
        f = hiuVar6;
        hiu[] hiuVarArr = {hiuVar, hiuVar2, hiuVar3, hiuVar4, hiuVar5, hiuVar6};
        g = hiuVarArr;
        ffhw.a(hiuVarArr);
    }

    private hiu(String str, int i) {
    }

    public static hiu[] values() {
        return (hiu[]) g.clone();
    }
}
