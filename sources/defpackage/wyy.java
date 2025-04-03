package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wyy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Recipient b;
    final /* synthetic */ alxj c;
    final /* synthetic */ wza d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyy(Recipient recipient, alxj alxjVar, wza wzaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = recipient;
        this.c = alxjVar;
        this.d = wzaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wyy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ConversationId d;
        Recipient recipient;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        boolean z = true;
        ffci.b(obj);
        if (i == 0) {
            Recipient recipient2 = this.b;
            if (recipient2 == null) {
                d = this.c.c();
                ConversationId conversationId = d;
                conversationId.getClass();
                recipient = this.b;
                if ((recipient != null || !recipient.D()) && this.c.b() != alxi.RBM) {
                    z = false;
                }
                aijp aijpVar = new aijp(conversationId, false, true, 6, null, null, null, z, false, 998);
                wza wzaVar = this.d;
                wzaVar.c.h(new aijn(aijpVar));
                return ffcu.a;
            }
            wza wzaVar2 = this.d;
            elfl k = wzaVar2.d.k(engw.r(recipient2), null);
            k.getClass();
            this.a = 1;
            obj = fgfz.c(k, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        d = ((Conversation) obj).d();
        ConversationId conversationId2 = d;
        conversationId2.getClass();
        recipient = this.b;
        if (recipient != null) {
        }
        z = false;
        aijp aijpVar2 = new aijp(conversationId2, false, true, 6, null, null, null, z, false, 998);
        wza wzaVar3 = this.d;
        wzaVar3.c.h(new aijn(aijpVar2));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wyy(this.b, this.c, this.d, ffguVar);
    }
}
