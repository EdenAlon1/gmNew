package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wru extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wrv b;
    final /* synthetic */ ConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wru(wrv wrvVar, ConversationId conversationId, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wrvVar;
        this.c = conversationId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wru) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            wrv wrvVar = this.b;
            elfl y = wrvVar.c.y(this.c, eoko.CONVERSATION_FROM_MORE_BUTTON);
            y.getClass();
            this.a = 1;
            if (fgfz.c(y, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wru(this.b, this.c, ffguVar);
    }
}
