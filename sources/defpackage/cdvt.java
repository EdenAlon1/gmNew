package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdvt {
    public static final cskc a = cskc.g("BugleCms", "CmsObjectNotificationResolver");
    public final dtuu b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final cbgf g;
    public final axkm h;
    public final cesu i;
    public final cdmm j;

    public cdvt(dtuu dtuuVar, cdmm cdmmVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, axkm axkmVar, cbgf cbgfVar, cesu cesuVar) {
        this.b = dtuuVar;
        this.j = cdmmVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = cbgfVar;
        this.h = axkmVar;
        this.i = cesuVar;
    }

    public static cdvu a(String str, String str2) {
        return new cdvu(csgx.NO_RETRY, String.format("MMS transactionId is not in the expected format. trId:%s, contentLoc: %s", str, str2));
    }
}
