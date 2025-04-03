package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjcm {
    public static final cjcm a;
    public static final cjcm b;
    public static final cjcm c;
    public static final cjcm d;
    public static final cjcm e;
    private static final /* synthetic */ cjcm[] f;

    static {
        cjcm cjcmVar = new cjcm("NONE", 0);
        a = cjcmVar;
        cjcm cjcmVar2 = new cjcm("ONE_HOUR", 1);
        b = cjcmVar2;
        cjcm cjcmVar3 = new cjcm("EIGHT_HOURS", 2);
        c = cjcmVar3;
        cjcm cjcmVar4 = new cjcm("TWENTY_FOUR_HOURS", 3);
        d = cjcmVar4;
        cjcm cjcmVar5 = new cjcm("INDEFINITE", 4);
        e = cjcmVar5;
        cjcm[] cjcmVarArr = {cjcmVar, cjcmVar2, cjcmVar3, cjcmVar4, cjcmVar5};
        f = cjcmVarArr;
        ffhw.a(cjcmVarArr);
    }

    private cjcm(String str, int i) {
    }

    public static cjcm[] values() {
        return (cjcm[]) f.clone();
    }
}
