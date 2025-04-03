package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfs {
    public static final dlfs a;
    public static final dlfs b;
    public static final dlfs c;
    public static final dlfs d;
    public static final dlfs e;
    public static final dlfs f;
    private static final /* synthetic */ dlfs[] g;

    static {
        dlfs dlfsVar = new dlfs("NONE", 0);
        a = dlfsVar;
        dlfs dlfsVar2 = new dlfs("WARN", 1);
        b = dlfsVar2;
        dlfs dlfsVar3 = new dlfs("HIDE", 2);
        c = dlfsVar3;
        dlfs dlfsVar4 = new dlfs("UNKNOWN", 3);
        d = dlfsVar4;
        dlfs dlfsVar5 = new dlfs("NOT_AVAILABLE", 4);
        e = dlfsVar5;
        dlfs dlfsVar6 = new dlfs("DELETE", 5);
        f = dlfsVar6;
        dlfs[] dlfsVarArr = {dlfsVar, dlfsVar2, dlfsVar3, dlfsVar4, dlfsVar5, dlfsVar6};
        g = dlfsVarArr;
        ffhw.a(dlfsVarArr);
    }

    private dlfs(String str, int i) {
    }

    public static dlfs[] values() {
        return (dlfs[]) g.clone();
    }
}
