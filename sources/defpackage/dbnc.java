package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbnc implements cevu {
    final /* synthetic */ dbne a;

    public dbnc(dbne dbneVar) {
        this.a = dbneVar;
    }

    @Override // defpackage.cevu
    public final void a() {
        final dbne dbneVar = this.a;
        cslq.e(new Runnable() { // from class: dbnb
            @Override // java.lang.Runnable
            public final void run() {
                dbne.this.k.b("Wear sync deduped to existing queue", true);
            }
        });
    }

    @Override // defpackage.cevu
    public final void b() {
        final dbne dbneVar = this.a;
        cslq.e(new Runnable() { // from class: dbna
            @Override // java.lang.Runnable
            public final void run() {
                dbne.this.k.b("Wear sync queued", true);
            }
        });
    }
}
