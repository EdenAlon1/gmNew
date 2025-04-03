package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbk extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ xbl c;
    final /* synthetic */ ConversationId d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbk(ffgu ffguVar, xbl xblVar, ConversationId conversationId) {
        super(3, ffguVar);
        this.c = xblVar;
        this.d = conversationId;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xbk xbkVar = new xbk((ffgu) obj3, this.c, this.d);
        xbkVar.e = (ffxy) obj;
        xbkVar.b = obj2;
        return xbkVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r4 = this.e;
            ffxx ffygVar = ((Boolean) this.b).booleanValue() ? ((xaz) this.c.a).c : this.d instanceof RbmConversationId ? ((xbj) this.c.b).c : new ffyg(null);
            this.a = 1;
            if (ffyk.c(r4, ffygVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
