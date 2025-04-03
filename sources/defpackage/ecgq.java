package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecgq implements ecgn {
    final /* synthetic */ emyl a;
    final /* synthetic */ ecgx b;
    final /* synthetic */ ecgt c;

    public ecgq(ecgt ecgtVar, emyl emylVar, ecgx ecgxVar) {
        this.a = emylVar;
        this.b = ecgxVar;
        this.c = ecgtVar;
    }

    private final void a() {
        ecgu ecguVar = this.c.a;
        if (ecguVar != null) {
            this.b.b(ecguVar);
            this.c.a = null;
        }
    }

    @Override // defpackage.ecgn
    public final void i(ecda ecdaVar) {
        if (((Boolean) this.a.get()).booleanValue()) {
            a();
        } else {
            this.c.c.k(ecdaVar);
        }
    }

    @Override // defpackage.ecgn
    public final void j(ecda ecdaVar) {
        if (((Boolean) this.a.get()).booleanValue()) {
            a();
        } else {
            this.c.c.l(ecdaVar);
        }
    }
}
