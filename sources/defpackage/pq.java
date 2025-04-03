package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pq implements op {
    final /* synthetic */ pt a;

    public pq(pt ptVar) {
        this.a = ptVar;
    }

    @Override // defpackage.op
    public final void a(od odVar, boolean z) {
        if (odVar instanceof oy) {
            odVar.a().i(false);
        }
        op opVar = this.a.e;
        if (opVar != null) {
            opVar.a(odVar, z);
        }
    }

    @Override // defpackage.op
    public final boolean b(od odVar) {
        pt ptVar = this.a;
        if (odVar == ptVar.c) {
            return false;
        }
        ptVar.n = ((oy) odVar).m.a;
        op opVar = ptVar.e;
        if (opVar != null) {
            return opVar.b(odVar);
        }
        return false;
    }
}
