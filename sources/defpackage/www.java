package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class www extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wxa b;
    final /* synthetic */ ConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public www(wxa wxaVar, ConversationId conversationId, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wxaVar;
        this.c = conversationId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((www) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ((akzt) this.b.g.b()).c("Bugle.UI.PeopleAndOptions.LeaveRcsGroup");
            wxa wxaVar = this.b;
            elfl o = wxaVar.c.o(this.c);
            o.getClass();
            this.a = 1;
            if (fgfz.c(o, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        wxa wxaVar2 = this.b;
        wxaVar2.f.i();
        wxaVar2.j.h(aiji.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new www(this.b, this.c, ffguVar);
    }
}
