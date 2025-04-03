package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ucg implements ellh {
    final /* synthetic */ ucd a;

    public ucg(ucd ucdVar) {
        this.a = ucdVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        ajuo ajuoVar = (ajuo) ellfVar;
        csjy.d("BugleReplies", "DraftEditorFragmentPeer.onDismissReplyClicked %s", ajuoVar.a);
        ucd ucdVar = this.a;
        ajth ajthVar = ucdVar.Y;
        if (ajthVar != null) {
            ajuoVar.getClass();
            axol.k(ajthVar.a, null, new ajtf(ajthVar, ajuoVar, null), 3);
        }
        ucdVar.I.N();
        ucdVar.z.H().E();
        return elli.a;
    }
}
