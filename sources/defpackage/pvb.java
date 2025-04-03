package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pvb extends ffkk implements ffix {
    final /* synthetic */ pvf a;
    final /* synthetic */ pvd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvb(pvf pvfVar, pvd pvdVar) {
        super(0);
        this.a = pvfVar;
        this.b = pvdVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ppt.c().a(pvq.a, "NetworkRequestConstraintController unregister callback");
        this.a.a.unregisterNetworkCallback(this.b);
        return ffcu.a;
    }
}
