package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amxh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amxk b;
    final /* synthetic */ azcr c;
    final /* synthetic */ aqux d;
    final /* synthetic */ amer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amxh(amxk amxkVar, azcr azcrVar, aqux aquxVar, amer amerVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amxkVar;
        this.c = azcrVar;
        this.d = aquxVar;
        this.e = amerVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amxh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl l = ((amhs) this.b.b.b()).l(this.c, this.d, this.e);
            this.a = 1;
            obj = fgfz.c(l, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return RbmConversationId.d(((ConversationId) obj).b());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amxh(this.b, this.c, this.d, this.e, ffguVar);
    }
}
