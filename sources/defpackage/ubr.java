package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ubr extends txv<bctw> {
    final /* synthetic */ ucd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubr(ucd ucdVar) {
        super("Conversation participants");
        this.a = ucdVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ucd ucdVar = this.a;
        bctw bctwVar = (bctw) obj;
        ucdVar.C = bctwVar;
        ucj ucjVar = ucdVar.N;
        ucjVar.e = bctwVar;
        if (((Boolean) ((cfup) uck.a.get()).e()).booleanValue()) {
            ucjVar.a();
        }
        this.a.z.H().A(bctwVar.e);
        if (((Boolean) ((cfup) uck.a.get()).e()).booleanValue()) {
            this.a.x("onConversationParticipantsDataUpdated");
        }
    }
}
