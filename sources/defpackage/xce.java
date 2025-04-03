package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xce extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xck b;
    final /* synthetic */ engw c;
    final /* synthetic */ ConversationId d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xce(xck xckVar, engw engwVar, ConversationId conversationId, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xckVar;
        this.c = engwVar;
        this.d = conversationId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xce) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.f.b(2);
            xcl xclVar = (xcl) this.b.h.b();
            engw engwVar = this.c;
            ConversationId conversationId = this.d;
            this.a = 1;
            if (xclVar.a(engwVar, conversationId, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xce(this.b, this.c, this.d, ffguVar);
    }
}
