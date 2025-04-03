package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eazo extends eays {
    final /* synthetic */ eazq a;

    public eazo(eazq eazqVar) {
        this.a = eazqVar;
    }

    @Override // defpackage.eays
    public final void b(final Object obj) {
        ebpa.a(new Runnable() { // from class: eazn
            @Override // java.lang.Runnable
            public final void run() {
                eazq eazqVar = eazo.this.a;
                eazqVar.e = obj;
                eazqVar.F();
            }
        });
    }

    @Override // defpackage.eays
    public final void c(final engw engwVar) {
        ebpa.a(new Runnable() { // from class: eazm
            @Override // java.lang.Runnable
            public final void run() {
                eazq eazqVar = eazo.this.a;
                eazqVar.g = engwVar;
                eazqVar.F();
            }
        });
    }
}
