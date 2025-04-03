package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amqq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amqw b;
    final /* synthetic */ engw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqq(amqw amqwVar, engw engwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amqwVar;
        this.c = engwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amqq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            amqw amqwVar = this.b;
            elfl i2 = amqwVar.c.i(this.c);
            i2.getClass();
            this.a = 1;
            obj = fgfz.c(i2, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        final ffji ffjiVar = new ffji() { // from class: amqo
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                ConversationId conversationId = (ConversationId) obj2;
                conversationId.getClass();
                return new EmergencyConversationId(((BugleConversationId) conversationId).a);
            }
        };
        Optional map = ((Optional) obj).map(new Function() { // from class: amqp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ffji.this.invoke(obj2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        return map;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amqq(this.b, this.c, ffguVar);
    }
}
