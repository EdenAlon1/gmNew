package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evle extends evlf {
    final /* synthetic */ evlf a;

    public evle(evlf evlfVar) {
        this.a = evlfVar;
    }

    @Override // defpackage.evlf
    public final Object a(evpl evplVar) {
        if (evplVar.t() != 9) {
            return this.a.a(evplVar);
        }
        evplVar.p();
        return null;
    }

    @Override // defpackage.evlf
    public final void b(evpn evpnVar, Object obj) {
        if (obj == null) {
            evpnVar.j();
        } else {
            this.a.b(evpnVar, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.a.toString() + "]";
    }
}
