package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvrz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvsa b;
    final /* synthetic */ cvyr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvrz(cvsa cvsaVar, cvyr cvyrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvsaVar;
        this.c = cvyrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvrz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final cvsa cvsaVar = this.b;
            final cvyr cvyrVar = this.c;
            ffix ffixVar = new ffix() { // from class: cvry
                @Override // defpackage.ffix
                public final Object invoke() {
                    cvsa.this.c(cvyrVar);
                    return ffcu.a;
                }
            };
            ConversationId conversationId = cvsaVar.b;
            conversationId.getClass();
            cwir e = cvsaVar.d.e();
            this.a = 1;
            if (cvsaVar.g.a(ffixVar, conversationId, e, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvrz(this.b, this.c, ffguVar);
    }
}
