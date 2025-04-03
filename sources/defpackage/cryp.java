package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cryp {
    public static final cryp a;
    public static final cryp b;
    public static final cryp c;
    public static final cryp d;
    public static final cryp e;
    public static final cryp f;
    public static final cryp g;
    public static final cryp h;
    public static final cryp i;
    private static final /* synthetic */ cryp[] k;
    public final int j;

    static {
        cryp crypVar = new cryp("ELIGIBLE", 0, 1);
        a = crypVar;
        cryp crypVar2 = new cryp("NO_PREVIOUS_D2D_TRANSFER", 1, 2);
        b = crypVar2;
        cryp crypVar3 = new cryp("ACTIVE_D2D_TRANSFER", 2, 3);
        c = crypVar3;
        cryp crypVar4 = new cryp("GAIA_ID_NOT_MATCH", 3, 4);
        d = crypVar4;
        cryp crypVar5 = new cryp("PRIOR_TO_DEVICE_ID_EMPTY", 4, 5);
        e = crypVar5;
        cryp crypVar6 = new cryp("DELTA_SYNC_TIMESTAMP_MISSING", 5, 6);
        f = crypVar6;
        cryp crypVar7 = new cryp("PRIOR_TO_DEVICE_ID_NOT_MATCH", 6, 7);
        g = crypVar7;
        cryp crypVar8 = new cryp("RESET_BOX_AFTER_DELTA_SYNC_TIMESTAMP", 7, 8);
        h = crypVar8;
        cryp crypVar9 = new cryp("DELTA_SYNC_TIMESTAMP_STALE", 8, 9);
        i = crypVar9;
        cryp[] crypVarArr = {crypVar, crypVar2, crypVar3, crypVar4, crypVar5, crypVar6, crypVar7, crypVar8, crypVar9};
        k = crypVarArr;
        ffhw.a(crypVarArr);
    }

    private cryp(String str, int i2, int i3) {
        this.j = i3;
    }

    public static cryp[] values() {
        return (cryp[]) k.clone();
    }
}
