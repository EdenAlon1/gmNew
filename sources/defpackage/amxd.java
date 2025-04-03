package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amxd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amxk b;
    final /* synthetic */ engw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amxd(amxk amxkVar, engw engwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amxkVar;
        this.c = engwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amxd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl i2 = ((amhs) this.b.b.b()).i(this.c);
            i2.getClass();
            this.a = 1;
            obj = fgfz.c(i2, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        final ffji ffjiVar = new ffji() { // from class: amxb
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                ConversationId conversationId = (ConversationId) obj2;
                conversationId.getClass();
                return new RbmConversationId(((BugleConversationId) conversationId).a);
            }
        };
        Optional map = ((Optional) obj).map(new Function() { // from class: amxc
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
        return new amxd(this.b, this.c, ffguVar);
    }
}
