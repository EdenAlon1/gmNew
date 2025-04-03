package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwc implements ellh {
    final /* synthetic */ vvn a;

    public vwc(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final vvn vvnVar = this.a;
        final dedl dedlVar = (dedl) ellfVar;
        dedq.a(vvnVar.p(), new Runnable() { // from class: vqe
            @Override // java.lang.Runnable
            public final void run() {
                dedl dedlVar2 = dedlVar;
                vvn.this.N.startActivityForResult(deds.a(dedlVar2.d(), dedlVar2.c(), dedlVar2.b(), dedlVar2.a()), 501);
            }
        });
        return elli.a;
    }
}
