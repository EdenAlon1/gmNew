package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class oks {
    public static final oks a;
    public static final oks b;
    private static final /* synthetic */ oks[] c;

    static {
        oks oksVar = new oks("LAUNCH_INITIAL_REFRESH", 0);
        a = oksVar;
        oks oksVar2 = new oks("SKIP_INITIAL_REFRESH", 1);
        b = oksVar2;
        oks[] oksVarArr = {oksVar, oksVar2};
        c = oksVarArr;
        ffhw.a(oksVarArr);
    }

    private oks(String str, int i) {
    }

    public static oks[] values() {
        return (oks[]) c.clone();
    }
}
