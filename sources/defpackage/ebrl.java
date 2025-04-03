package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebrl extends eays {
    final /* synthetic */ ebrp a;

    public ebrl(ebrp ebrpVar) {
        this.a = ebrpVar;
    }

    @Override // defpackage.eays
    public final void a() {
        ebpa.a(new Runnable() { // from class: ebri
            @Override // java.lang.Runnable
            public final void run() {
                ebrl ebrlVar = ebrl.this;
                ebrlVar.a.h(true);
                ebrp ebrpVar = ebrlVar.a;
                ebrpVar.q(((ebpl) ebrpVar.e).b.b(), ((ebpl) ebrlVar.a.e).b.a());
            }
        });
    }

    @Override // defpackage.eays
    public final void b(final Object obj) {
        ebpa.a(new Runnable() { // from class: ebrj
            @Override // java.lang.Runnable
            public final void run() {
                ebrp ebrpVar = ebrl.this.a;
                ebrpVar.q(((ebpl) ebrpVar.e).b.b(), obj);
            }
        });
    }

    @Override // defpackage.eays
    public final void c(final engw engwVar) {
        ebpa.a(new Runnable() { // from class: ebrk
            @Override // java.lang.Runnable
            public final void run() {
                ebrp ebrpVar = ebrl.this.a;
                ebrpVar.q(engwVar, ((ebpl) ebrpVar.e).b.a());
            }
        });
    }
}
