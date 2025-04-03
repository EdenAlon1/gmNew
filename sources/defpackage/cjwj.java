package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjwj {
    public static final cjwj a;
    public static final cjwj b;
    public static final cjwj c;
    public static final cjwj d;
    public static final cjwj e;
    public static final cjwj f;
    public static final cjwj g;
    public static final cjwj h;
    public static final cjwj i;
    public static final cjwj j;
    public static final cjwj k;
    public static final cjwj l;
    public static final cjwj m;
    public static final cjwj n;
    public static final cjwj o;
    public static final cjwj p;
    public static final cjwj q;
    private static final /* synthetic */ cjwj[] s;
    public final int r;

    static {
        cjwj cjwjVar = new cjwj("UNKNOWN", 0, 0);
        a = cjwjVar;
        cjwj cjwjVar2 = new cjwj("CAN_SHARE", 1, 1);
        b = cjwjVar2;
        cjwj cjwjVar3 = new cjwj("FLAGS_DISABLED", 2, 2);
        c = cjwjVar3;
        cjwj cjwjVar4 = new cjwj("INVALID_SELF_IDENTITY", 3, 3);
        d = cjwjVar4;
        cjwj cjwjVar5 = new cjwj("MISSING_SELF_RCS", 4, 4);
        e = cjwjVar5;
        cjwj cjwjVar6 = new cjwj("MISSING_SELF_E2EE", 5, 5);
        f = cjwjVar6;
        cjwj cjwjVar7 = new cjwj("INVALID_SELF_TOKEN", 6, 6);
        g = cjwjVar7;
        cjwj cjwjVar8 = new cjwj("NOT_SIGNED_IN", 7, 7);
        h = cjwjVar8;
        cjwj cjwjVar9 = new cjwj("INVALID_PERSON_ID", 8, 8);
        i = cjwjVar9;
        cjwj cjwjVar10 = new cjwj("NO_ELIGIBLE_RECIPIENTS", 9, 9);
        j = cjwjVar10;
        cjwj cjwjVar11 = new cjwj("INVALID_SELF_PROFILE", 10, 10);
        k = cjwjVar11;
        cjwj cjwjVar12 = new cjwj("DIRECT_SHARE_LIMIT_EXCEEDED", 11, 11);
        l = cjwjVar12;
        cjwj cjwjVar13 = new cjwj("COMPOSE_DISABLED", 12, 12);
        m = cjwjVar13;
        cjwj cjwjVar14 = new cjwj("SHARING_DISABLED_BY_SETTINGS", 13, 13);
        n = cjwjVar14;
        cjwj cjwjVar15 = new cjwj("MAX_GROUP_SIZE_REACHED", 14, 14);
        o = cjwjVar15;
        cjwj cjwjVar16 = new cjwj("MISSING_CONVERSATION_E2EE", 15, 15);
        p = cjwjVar16;
        cjwj cjwjVar17 = new cjwj("MISSING_CONVERSATION_RCS", 16, 16);
        q = cjwjVar17;
        cjwj[] cjwjVarArr = {cjwjVar, cjwjVar2, cjwjVar3, cjwjVar4, cjwjVar5, cjwjVar6, cjwjVar7, cjwjVar8, cjwjVar9, cjwjVar10, cjwjVar11, cjwjVar12, cjwjVar13, cjwjVar14, cjwjVar15, cjwjVar16, cjwjVar17};
        s = cjwjVarArr;
        ffhw.a(cjwjVarArr);
    }

    private cjwj(String str, int i2, int i3) {
        this.r = i3;
    }

    public static cjwj[] values() {
        return (cjwj[]) s.clone();
    }
}
