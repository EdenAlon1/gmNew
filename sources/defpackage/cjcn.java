package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjcn {
    public static final cjcn a;
    public static final cjcn b;
    public static final cjcn c;
    public static final cjcn d;
    public static final cjcn e;
    private static final /* synthetic */ cjcn[] f;

    static {
        cjcn cjcnVar = new cjcn("UNKNOWN", 0);
        a = cjcnVar;
        cjcn cjcnVar2 = new cjcn("MUTE_NONE", 1);
        b = cjcnVar2;
        cjcn cjcnVar3 = new cjcn("MUTE_FEW", 2);
        c = cjcnVar3;
        cjcn cjcnVar4 = new cjcn("MUTE_MOST", 3);
        d = cjcnVar4;
        cjcn cjcnVar5 = new cjcn("MUTE_ALL", 4);
        e = cjcnVar5;
        cjcn[] cjcnVarArr = {cjcnVar, cjcnVar2, cjcnVar3, cjcnVar4, cjcnVar5};
        f = cjcnVarArr;
        ffhw.a(cjcnVarArr);
    }

    private cjcn(String str, int i) {
    }

    public static cjcn[] values() {
        return (cjcn[]) f.clone();
    }
}
