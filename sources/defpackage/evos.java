package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evos extends evlf {
    final /* synthetic */ evlf a;
    final /* synthetic */ Class b;

    public evos(evlf evlfVar, Class cls) {
        this.a = evlfVar;
        this.b = cls;
    }

    @Override // defpackage.evlf
    public final Object a(evpl evplVar) {
        Object a = this.a.a(evplVar);
        if (a == null || this.b.isInstance(a)) {
            return a;
        }
        Class cls = this.b;
        Class<?> cls2 = a.getClass();
        throw new evlb("Expected a " + cls.getName() + " but was " + cls2.getName() + "; at path " + evplVar.f());
    }

    @Override // defpackage.evlf
    public final void b(evpn evpnVar, Object obj) {
        this.a.b(evpnVar, obj);
    }
}
