package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axlc {
    public static final axlc a;
    public static final axlc b;
    public static final axlc c;
    public static final axlc d;
    public static final axlc e;
    public static final axlc f;
    public static final axlc g;
    public static final axlc h;
    private static final /* synthetic */ axlc[] j;
    public final int i;

    static {
        axlc axlcVar = new axlc("UNKNOWN", 0, 0);
        a = axlcVar;
        axlc axlcVar2 = new axlc("OS_INELIGIBLE", 1, 1);
        b = axlcVar2;
        axlc axlcVar3 = new axlc("GMS_CORE_INELIGIBLE", 2, 2);
        c = axlcVar3;
        axlc axlcVar4 = new axlc("MULTI_DEVICE_FEATURE_ON", 3, 3);
        d = axlcVar4;
        axlc axlcVar5 = new axlc("MISSING_LSKF", 4, 4);
        e = axlcVar5;
        axlc axlcVar6 = new axlc("PENDING_RESTART", 5, 5);
        f = axlcVar6;
        axlc axlcVar7 = new axlc("ELIGIBLE", 6, 7);
        g = axlcVar7;
        axlc axlcVar8 = new axlc("FAILURE", 7, 8);
        h = axlcVar8;
        axlc[] axlcVarArr = {axlcVar, axlcVar2, axlcVar3, axlcVar4, axlcVar5, axlcVar6, axlcVar7, axlcVar8};
        j = axlcVarArr;
        ffhw.a(axlcVarArr);
    }

    private axlc(String str, int i, int i2) {
        this.i = i2;
    }

    public static axlc[] values() {
        return (axlc[]) j.clone();
    }
}
