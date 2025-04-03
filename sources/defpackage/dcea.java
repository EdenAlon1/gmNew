package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcea implements ellh {
    final /* synthetic */ dcdk a;

    public dcea(dcdk dcdkVar) {
        this.a = dcdkVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final dcdk dcdkVar = this.a;
        final dedl dedlVar = (dedl) ellfVar;
        dedq.a(dcdkVar.l.G(), new Runnable() { // from class: dcdi
            @Override // java.lang.Runnable
            public final void run() {
                dedl dedlVar2 = dedlVar;
                dcdk.this.l.startActivityForResult(deds.a(dedlVar2.d(), dedlVar2.c(), dedlVar2.b(), dedlVar2.a()), 501);
            }
        });
        return elli.a;
    }
}
