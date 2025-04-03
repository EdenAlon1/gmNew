package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amxf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amxk b;
    final /* synthetic */ azcr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amxf(amxk amxkVar, azcr azcrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amxkVar;
        this.c = azcrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amxf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl h = ((amhs) this.b.b.b()).h(this.c);
            this.a = 1;
            obj = fgfz.c(h, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ConversationId conversationId = (ConversationId) obj;
        if (conversationId != null) {
            return RbmConversationId.d(conversationId.b());
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amxf(this.b, this.c, ffguVar);
    }
}
