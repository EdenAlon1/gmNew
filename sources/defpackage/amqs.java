package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amqs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amqw b;
    final /* synthetic */ Optional c;
    final /* synthetic */ engw d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqs(amqw amqwVar, Optional optional, engw engwVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amqwVar;
        this.c = optional;
        this.d = engwVar;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amqs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            amqw amqwVar = this.b;
            elfl m = amqwVar.c.m(this.c, this.d, this.e);
            m.getClass();
            this.a = 1;
            obj = fgfz.c(m, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        amqw amqwVar2 = this.b;
        Conversation conversation = (Conversation) obj;
        conversation.getClass();
        return amqwVar2.b.a((BugleConversation) conversation);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amqs(this.b, this.c, this.d, this.e, ffguVar);
    }
}
