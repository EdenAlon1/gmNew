package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vti extends txv<Optional<SuggestionData>> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vti(vvn vvnVar) {
        super("Conversation suggestions to accept");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$12", "onNewData", 2343, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Pending conversation suggestions");
        if (optional.isPresent()) {
            vvn vvnVar = this.a;
            vvnVar.T.e(vvnVar.M, (SuggestionData) optional.get());
            this.a.ad();
        }
    }
}
