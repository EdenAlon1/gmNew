package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqmi extends ffhv implements ffjm {
    final /* synthetic */ BugleConversationId a;
    final /* synthetic */ engw b;
    final /* synthetic */ aqmk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqmi(BugleConversationId bugleConversationId, engw engwVar, aqmk aqmkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = bugleConversationId;
        this.b = engwVar;
        this.c = aqmkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqmi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        engw<Recipient> engwVar = this.b;
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        for (Recipient recipient : engwVar) {
            recipient.getClass();
            arrayList.add(((aqkx) recipient).n());
        }
        BugleConversationId bugleConversationId = this.a;
        int size = arrayList.size();
        ConversationIdType conversationIdType = bugleConversationId.a;
        if (size == 1) {
            ((bdso) this.c.c.b()).b((ParticipantsTable.BindData) arrayList.get(0), conversationIdType);
        } else {
            ((bdso) this.c.c.b()).c(conversationIdType, arrayList, bdsp.b);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqmi(this.a, this.b, this.c, ffguVar);
    }
}
