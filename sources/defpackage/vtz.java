package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vtz extends txv<engw<ParticipantsTable.BindData>> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtz(vvn vvnVar) {
        super("Subscription");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        engw engwVar = (engw) obj;
        if (((Boolean) bdsz.a.e()).booleanValue()) {
            return;
        }
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$23", "onNewData", 2829, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Subscription");
        bcqs bcqsVar = (bcqs) this.a.cA.a();
        bcqsVar.h.j(engwVar);
        bcqsVar.j = bcqsVar.c.a(bcqsVar.h.h());
        this.a.an();
    }
}
