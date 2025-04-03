package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eijy implements eiko {
    private final eikp a;

    public eijy(eikp eikpVar) {
        this.a = eikpVar;
    }

    @Override // defpackage.eiko
    public final eihn a(eijp eijpVar) {
        return this.a.a(eijpVar.a()).a(eijpVar);
    }

    @Override // defpackage.eiko
    public final eijp b(eihn eihnVar) {
        eijx eijxVar = new eijx(this.a);
        eihnVar.hz(eijxVar);
        boolean z = true;
        if (!eijxVar.a() && !eijxVar.b.isPresent()) {
            z = false;
        }
        emxf.l(z);
        if (eijxVar.a()) {
            return (eijp) eijxVar.a.get();
        }
        throw new eikm("Error serializing message.", (Throwable) eijxVar.b.get());
    }
}
