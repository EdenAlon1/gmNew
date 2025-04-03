package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clcn extends ffhv implements ffjm {
    final /* synthetic */ clcv a;
    final /* synthetic */ awxk b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clcn(clcv clcvVar, awxk awxkVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = clcvVar;
        this.b = awxkVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clcn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean b = ekxi.b(u());
        awxk awxkVar = this.b;
        clcv clcvVar = this.a;
        ConversationIdType conversationIdType = this.c;
        if (!b) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        ekzz f = eleg.f("IncomingRcsMessageProcessor#clearTypingIndicator");
        try {
            eiem eiemVar = new eiem();
            eiemVar.c(eigd.STOP);
            ((awpq) clcvVar.r.b()).b(eiemVar.a(), awxkVar, conversationIdType);
            ffig.a(f, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new clcn(this.a, this.b, this.c, ffguVar);
    }
}
