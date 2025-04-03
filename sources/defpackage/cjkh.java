package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjkh {
    public static final cjkh a;
    public static final cjkh b;
    public static final cjkh c;
    public static final cjkh d;
    public static final cjkh e;
    public static final /* synthetic */ ffhx g;
    private static final /* synthetic */ cjkh[] h;
    public final int f;

    static {
        cjkh cjkhVar = new cjkh("UnknownPipeline", 0, 0);
        a = cjkhVar;
        cjkh cjkhVar2 = new cjkh("SmsReceivePipeline", 1, 1);
        b = cjkhVar2;
        cjkh cjkhVar3 = new cjkh("SendingPipeline", 2, 2);
        c = cjkhVar3;
        cjkh cjkhVar4 = new cjkh("SendingRcsReportPipeline", 3, 3);
        d = cjkhVar4;
        cjkh cjkhVar5 = new cjkh("ReceivingRcsPipeline", 4, 4);
        e = cjkhVar5;
        cjkh[] cjkhVarArr = {cjkhVar, cjkhVar2, cjkhVar3, cjkhVar4, cjkhVar5};
        h = cjkhVarArr;
        g = ffhw.a(cjkhVarArr);
    }

    private cjkh(String str, int i, int i2) {
        this.f = i2;
    }

    public static cjkh[] values() {
        return (cjkh[]) h.clone();
    }
}
