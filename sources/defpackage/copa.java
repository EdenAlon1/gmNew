package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class copa implements erqj {
    final /* synthetic */ copc a;

    public copa(copc copcVar) {
        this.a = copcVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((eyhs) obj).getClass();
        copc.a.n().q("Migration is done");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        th.getClass();
        ((ensz) ((ensz) copc.a.j()).g(th)).q("Failed to run migration");
        copc copcVar = this.a;
        synchronized (copcVar) {
            copcVar.j = null;
        }
    }
}
