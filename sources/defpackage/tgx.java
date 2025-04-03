package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgx {
    public static final tgx a;
    public static final tgx b;
    public static final tgx c;
    public static final tgx d;
    public static final tgx e;
    public static final tgx f;
    public static final tgx g;
    public static final tgx h;
    public static final tgx i;
    private static final /* synthetic */ tgx[] j;

    static {
        tgx tgxVar = new tgx("FLOW_UNSPECIFIED", 0);
        a = tgxVar;
        tgx tgxVar2 = new tgx("HOME_IN_FI_IN", 1);
        b = tgxVar2;
        tgx tgxVar3 = new tgx("HOME_IN_FI_OUT_BNR_IN_FI", 2);
        c = tgxVar3;
        tgx tgxVar4 = new tgx("HOME_IN_FI_OUT_BNR_IN_NOT_FI", 3);
        d = tgxVar4;
        tgx tgxVar5 = new tgx("HOME_IN_FI_OUT_BNR_OUT_FI", 4);
        e = tgxVar5;
        tgx tgxVar6 = new tgx("HOME_IN_FI_OUT_BNR_OUT_NOT_FI", 5);
        f = tgxVar6;
        tgx tgxVar7 = new tgx("LEGACY_MD_ENABLE_FAILED", 6);
        g = tgxVar7;
        tgx tgxVar8 = new tgx("HOME_OUT_FI_IN", 7);
        h = tgxVar8;
        tgx tgxVar9 = new tgx("HOME_OUT_FI_OUT", 8);
        i = tgxVar9;
        tgx[] tgxVarArr = {tgxVar, tgxVar2, tgxVar3, tgxVar4, tgxVar5, tgxVar6, tgxVar7, tgxVar8, tgxVar9};
        j = tgxVarArr;
        ffhw.a(tgxVarArr);
    }

    private tgx(String str, int i2) {
    }

    public static tgx[] values() {
        return (tgx[]) j.clone();
    }
}
