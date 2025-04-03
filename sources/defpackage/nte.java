package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nte implements npc {
    public final int a;
    public final nql b;
    public final npq c;
    public final nsl d;
    public final lsg e;
    public final nrj f;
    public final lpr g;
    public long h;
    final /* synthetic */ ntf i;
    public final nps j;

    /* JADX WARN: Multi-variable type inference failed */
    public nte(ntf ntfVar, int i, npq npqVar, nsl nslVar, nps npsVar, lsg lsgVar, nrj nrjVar, lpr lprVar) {
        this.i = ntfVar;
        this.a = i;
        this.b = (nql) ((nqn) npqVar.a.get(i)).a.get(0);
        this.c = npqVar;
        this.d = nslVar;
        this.j = npsVar;
        this.e = lsgVar;
        this.f = nrjVar;
        this.g = lprVar;
    }

    @Override // defpackage.npc
    public final void b(nrd nrdVar) {
        this.i.b(nrdVar);
    }

    @Override // defpackage.npc
    public final void c(int i) {
        throw null;
    }

    @Override // defpackage.npc
    public final boolean d(lqc lqcVar, int i) {
        throw null;
    }

    @Override // defpackage.npc
    public final void a(long j) {
    }
}
