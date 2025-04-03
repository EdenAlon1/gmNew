package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vth extends txv<engw<SuggestionData>> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vth(vvn vvnVar) {
        super("Conversation suggestions");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$11", "onNewData", 2319, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Conversation suggestions");
        vvn vvnVar = this.a;
        vvnVar.ba.a = (engw) obj;
        vvnVar.aq();
    }
}
