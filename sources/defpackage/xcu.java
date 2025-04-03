package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xcu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ampf b;
    final /* synthetic */ engw c;
    final /* synthetic */ alxj d;
    final /* synthetic */ alxl e;
    final /* synthetic */ ConversationId f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcu(ffgu ffguVar, ampf ampfVar, engw engwVar, alxj alxjVar, alxl alxlVar, ConversationId conversationId) {
        super(2, ffguVar);
        this.b = ampfVar;
        this.c = engwVar;
        this.d = alxjVar;
        this.e = alxlVar;
        this.f = conversationId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xcu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ampf ampfVar = this.b;
        engw engwVar = this.c;
        alxj alxjVar = this.d;
        alxl alxlVar = this.e;
        ConversationId conversationId = this.f;
        this.a = 1;
        a = ampfVar.a(engwVar, alxjVar, alxlVar, conversationId, false, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xcu xcuVar = new xcu(ffguVar, this.b, this.c, this.d, this.e, this.f);
        xcuVar.g = obj;
        return xcuVar;
    }
}
