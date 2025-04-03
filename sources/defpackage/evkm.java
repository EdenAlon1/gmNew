package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evkm extends evnx {
    public evlf a = null;

    private final evlf e() {
        evlf evlfVar = this.a;
        if (evlfVar != null) {
            return evlfVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // defpackage.evlf
    public final Object a(evpl evplVar) {
        return e().a(evplVar);
    }

    @Override // defpackage.evlf
    public final void b(evpn evpnVar, Object obj) {
        e().b(evpnVar, obj);
    }

    @Override // defpackage.evnx
    public final evlf c() {
        return e();
    }
}
