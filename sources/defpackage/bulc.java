package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bulc extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bukz(this);
    }

    public final void b(ConversationIdType conversationIdType) {
        int intValue = buld.c().intValue();
        if (intValue < 59460) {
            dtub.w("conversation_id", intValue);
        }
        aq(new dtrt("message_spam.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void c(MessageIdType messageIdType) {
        aq(new dtrt("message_spam.message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
    }

    public final void d(erer... ererVarArr) {
        int intValue = buld.c().intValue();
        if (intValue < 58030) {
            dtub.w("outcome", intValue);
        }
        aq(new dtrw("message_spam.outcome", 3, at((Iterable) DesugarArrays.stream(ererVarArr).map(new Function() { // from class: bula
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((erer) obj).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: bulb
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }))), true));
    }
}
