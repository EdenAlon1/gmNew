package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecgt {
    public ecgu a;
    public ecgm b;
    final ecgs c = new ecgs();

    public ecgt(ecgx ecgxVar, echd echdVar, final ffbr ffbrVar) {
        ffbrVar.getClass();
        emyl a = emys.a(new emyl() { // from class: ecgp
            @Override // defpackage.emyl
            public final Object get() {
                return (Boolean) ffbr.this.b();
            }
        });
        ecgu ecguVar = new ecgu(new ecgq(this, a, ecgxVar));
        this.a = ecguVar;
        ecgxVar.a(ecguVar);
        ecgm ecgmVar = new ecgm(new ecgr(this, a, echdVar));
        this.b = ecgmVar;
        echdVar.g.add(ecgmVar);
    }

    public final void a(ecgn ecgnVar) {
        this.c.b.add(ecgnVar);
    }

    public final void b(ecgn ecgnVar) {
        this.c.b.remove(ecgnVar);
    }
}
