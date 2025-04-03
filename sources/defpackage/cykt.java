package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cykt extends ffhv implements ffjm {
    final /* synthetic */ cyku a;
    final /* synthetic */ ConversationId b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cykt(cyku cykuVar, ConversationId conversationId, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cykuVar;
        this.b = conversationId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cykt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.d.a(bdgq.b(this.b.b()), byyt.UNARCHIVED, eoko.CONVERSATION_FROM_UNSPAM_ACTION);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cykt(this.a, this.b, ffguVar);
    }
}
