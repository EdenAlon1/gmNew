package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vua extends txv<avji> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vua(vvn vvnVar) {
        super("RBM Metadata");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ParticipantsTable.BindData a;
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$24", "onNewData", 2843, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: RBM Metadata");
        ((bcqs) this.a.cA.a()).o = (avji) obj;
        if (!((bcqs) this.a.cA.a()).p() || (a = ((bcqs) this.a.cA.a()).g.a()) == null) {
            return;
        }
        this.a.aF(a);
    }
}
