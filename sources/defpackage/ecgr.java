package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecgr implements ecgn {
    final /* synthetic */ emyl a;
    final /* synthetic */ echd b;
    final /* synthetic */ ecgt c;

    public ecgr(ecgt ecgtVar, emyl emylVar, echd echdVar) {
        this.a = emylVar;
        this.b = echdVar;
        this.c = ecgtVar;
    }

    private final void a() {
        ecgm ecgmVar = this.c.b;
        if (ecgmVar != null) {
            this.b.g.remove(ecgmVar);
            this.c.b = null;
        }
    }

    @Override // defpackage.ecgn
    public final void i(ecda ecdaVar) {
        if (((Boolean) this.a.get()).booleanValue()) {
            this.c.c.k(ecdaVar);
        } else {
            a();
        }
    }

    @Override // defpackage.ecgn
    public final void j(ecda ecdaVar) {
        if (((Boolean) this.a.get()).booleanValue()) {
            this.c.c.l(ecdaVar);
        } else {
            a();
        }
    }
}
