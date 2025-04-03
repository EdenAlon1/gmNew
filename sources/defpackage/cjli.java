package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjli {
    public static final cjli a;
    public static final cjli b;
    private static final /* synthetic */ cjli[] c;

    static {
        cjli cjliVar = new cjli("ACTIVE", 0);
        a = cjliVar;
        cjli cjliVar2 = new cjli("PAUSED", 1);
        b = cjliVar2;
        cjli[] cjliVarArr = {cjliVar, cjliVar2};
        c = cjliVarArr;
        ffhw.a(cjliVarArr);
    }

    private cjli(String str, int i) {
    }

    public static cjli[] values() {
        return (cjli[]) c.clone();
    }
}
