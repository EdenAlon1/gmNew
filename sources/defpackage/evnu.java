package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evnu extends evns {
    private final evmw a;

    public evnu(evmw evmwVar, evnv evnvVar) {
        super(evnvVar);
        this.a = evmwVar;
    }

    @Override // defpackage.evns
    public final Object c() {
        return this.a.a();
    }

    @Override // defpackage.evns
    public final void f(Object obj, evpl evplVar, evnt evntVar) {
        evntVar.b(evplVar, obj);
    }

    @Override // defpackage.evns
    public final Object e(Object obj) {
        return obj;
    }
}
