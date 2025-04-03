package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epl extends ffkk implements ffix {
    final /* synthetic */ epm a;
    final /* synthetic */ ioc b;
    final /* synthetic */ ffix c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epl(epm epmVar, ioc iocVar, ffix ffixVar) {
        super(0);
        this.a = epmVar;
        this.b = iocVar;
        this.c = ffixVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        iam a = epm.a(this.a, this.b, this.c);
        if (a == null) {
            return null;
        }
        dmt dmtVar = (dmt) this.a.a;
        if (kaf.e(dmtVar.i, 0L)) {
            dwv.d("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return a.f(dmtVar.b(a, dmtVar.i) ^ (-9223372034707292160L));
    }
}
