package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amxi extends ffhv implements ffjm {
    final /* synthetic */ amxk a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ avji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amxi(amxk amxkVar, ConversationId conversationId, avji avjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = amxkVar;
        this.b = conversationId;
        this.c = avjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((amxi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((avjw) this.a.c.b()).e(bdgq.b(this.b.b()), this.c, true);
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amxi(this.a, this.b, this.c, ffguVar);
    }
}
