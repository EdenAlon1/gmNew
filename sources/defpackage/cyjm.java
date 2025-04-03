package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyjm extends ffhv implements ffjm {
    final /* synthetic */ cyjq a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ byyt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyjm(cyjq cyjqVar, ConversationId conversationId, byyt byytVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cyjqVar;
        this.b = conversationId;
        this.c = byytVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyjm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.a.a(bdgq.b(this.b.b()), this.c, eoko.CONVERSATION_FROM_CROSS_COUNTRY_USER_ACTION);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyjm(this.a, this.b, this.c, ffguVar);
    }
}
