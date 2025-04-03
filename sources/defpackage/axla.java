package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axla {
    public static final axla a;
    public static final axla b;
    public static final axla c;
    public static final axla d;
    public static final axla e;
    public static final axla f;
    public static final axla g;
    public static final axla h;
    public static final axla i;
    public static final axla j;
    public static final axla k;
    public static final axla l;
    public static final axla m;
    public static final axla n;
    private static final /* synthetic */ axla[] o;

    static {
        axla axlaVar = new axla("READINESS_UNSPECIFIED", 0);
        a = axlaVar;
        axla axlaVar2 = new axla("READY", 1);
        b = axlaVar2;
        axla axlaVar3 = new axla("OS_INELIGIBLE", 2);
        c = axlaVar3;
        axla axlaVar4 = new axla("GMS_CORE_INELIGIBLE", 3);
        d = axlaVar4;
        axla axlaVar5 = new axla("LOCAL_MULTI_DEVICE_FEATURE_ON", 4);
        e = axlaVar5;
        axla axlaVar6 = new axla("LOCAL_BACKUP_AND_RESTORE_FEATURE_OFF", 5);
        f = axlaVar6;
        axla axlaVar7 = new axla("LOCAL_MISSING_FOLSOM_CONSENT", 6);
        g = axlaVar7;
        axla axlaVar8 = new axla("LOCAL_SETTING_ENCRYPTED", 7);
        h = axlaVar8;
        axla axlaVar9 = new axla("LOCAL_INITIAL_SYNC_NOT_COMPLETE", 8);
        i = axlaVar9;
        axla axlaVar10 = new axla("CMS_SERVER_MULTI_DEVICE_FEATURE_ON", 9);
        j = axlaVar10;
        axla axlaVar11 = new axla("CMS_SERVER_MISSING_BACKUP_KEY", 10);
        k = axlaVar11;
        axla axlaVar12 = new axla("FOLSOM_KEYS_NOT_SYNCED", 11);
        l = axlaVar12;
        axla axlaVar13 = new axla("FOLSOM_KEYS_EMPTY_KEY_MATERIAL", 12);
        m = axlaVar13;
        axla axlaVar14 = new axla("FOLSOM_KEYS_NOT_RETRIEVABLE", 13);
        n = axlaVar14;
        axla[] axlaVarArr = {axlaVar, axlaVar2, axlaVar3, axlaVar4, axlaVar5, axlaVar6, axlaVar7, axlaVar8, axlaVar9, axlaVar10, axlaVar11, axlaVar12, axlaVar13, axlaVar14};
        o = axlaVarArr;
        ffhw.a(axlaVarArr);
    }

    private axla(String str, int i2) {
    }

    public static axla[] values() {
        return (axla[]) o.clone();
    }
}
