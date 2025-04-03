package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebdq extends eays {
    final /* synthetic */ ebds a;

    public ebdq(ebds ebdsVar) {
        this.a = ebdsVar;
    }

    @Override // defpackage.eays
    public final void b(final Object obj) {
        ebpa.a(new Runnable() { // from class: ebdp
            @Override // java.lang.Runnable
            public final void run() {
                ebdq.this.a.F(obj);
            }
        });
    }
}
