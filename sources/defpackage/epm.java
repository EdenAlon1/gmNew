package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epm extends hvh implements jhw, its {
    public final epg a;
    private boolean b;

    public epm(epg epgVar) {
        this.a = epgVar;
    }

    public static final iam a(epm epmVar, ioc iocVar, ffix ffixVar) {
        Object invoke;
        if (epmVar.z && epmVar.b) {
            ioc b = isx.b(epmVar);
            if (true != iocVar.t()) {
                iocVar = null;
            }
            if (iocVar != null && (invoke = ffixVar.invoke()) != null) {
                return ((iam) invoke).f(b.n(iocVar, false).c());
            }
        }
        return null;
    }

    @Override // defpackage.jhw
    public final Object b(ioc iocVar, ffix ffixVar, ffgu ffguVar) {
        Object a = ffsl.a(new epk(this, iocVar, ffixVar, new epl(this, iocVar, ffixVar), null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    @Override // defpackage.its
    public final void dY(ioc iocVar) {
        this.b = true;
    }

    @Override // defpackage.its
    public final /* synthetic */ void i(long j) {
    }
}
