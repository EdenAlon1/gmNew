package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apbf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffji b;
    final /* synthetic */ apbk c;
    final /* synthetic */ MessageId d;
    final /* synthetic */ apui e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apbf(ffji ffjiVar, apbk apbkVar, MessageId messageId, apui apuiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjiVar;
        this.c = apbkVar;
        this.d = messageId;
        this.e = apuiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apbf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffji ffjiVar = this.b;
            this.a = 1;
            if (ffjiVar.invoke(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        apuj apujVar = (apuj) this.c.a.b();
        BugleConversationId S = this.c.S();
        S.getClass();
        apujVar.d(S, this.d, this.e.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apbf(this.b, this.c, this.d, this.e, ffguVar);
    }
}
