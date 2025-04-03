package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhx extends ffkk implements ffix {
    final /* synthetic */ ffix a;
    final /* synthetic */ ioc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhx(ffix ffixVar, ioc iocVar) {
        super(0);
        this.a = ffixVar;
        this.b = iocVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        iam iamVar;
        ffix ffixVar = this.a;
        if (ffixVar != null && (iamVar = (iam) ffixVar.invoke()) != null) {
            return iamVar;
        }
        ioc iocVar = this.b;
        if (true != iocVar.t()) {
            iocVar = null;
        }
        if (iocVar != null) {
            return ias.c(kag.d(iocVar.g()));
        }
        return null;
    }
}
