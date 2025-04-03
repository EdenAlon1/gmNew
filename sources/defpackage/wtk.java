package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wtk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wto b;
    final /* synthetic */ ConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtk(wto wtoVar, ConversationId conversationId, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wtoVar;
        this.c = conversationId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wtk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            wto wtoVar = this.b;
            elfl C = wtoVar.c.C(this.c, eoko.CONVERSATION_FROM_MORE_BUTTON);
            C.getClass();
            this.a = 1;
            if (fgfz.c(C, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        wto wtoVar2 = this.b;
        wtoVar2.f.i();
        wtoVar2.i.h(aiji.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wtk(this.b, this.c, ffguVar);
    }
}
