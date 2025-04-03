package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwef extends dwei {
    final /* synthetic */ dweh a;

    public dwef(dweh dwehVar) {
        this.a = dwehVar;
    }

    @Override // defpackage.dwei
    public final void b(dwee dweeVar) {
        if (((Boolean) this.a.b.get(dweeVar)).booleanValue()) {
            return;
        }
        this.a.b.put(dweeVar, true);
        dweh dwehVar = this.a;
        dwehVar.c++;
        dwehVar.a();
    }
}
