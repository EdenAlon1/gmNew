package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amxe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amxk b;
    final /* synthetic */ anvc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amxe(amxk amxkVar, anvc anvcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amxkVar;
        this.c = anvcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amxe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl g = ((amhs) this.b.b.b()).g(this.c);
            this.a = 1;
            obj = fgfz.c(g, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        engw<ConversationId> engwVar = (engw) obj;
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        for (ConversationId conversationId : engwVar) {
            conversationId.getClass();
            arrayList.add(new RbmConversationId(((BugleConversationId) conversationId).a));
        }
        return engq.a(arrayList);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amxe(this.b, this.c, ffguVar);
    }
}
