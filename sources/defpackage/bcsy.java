package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcsy {
    public final bigl a;

    public bcsy(bigl biglVar) {
        this.a = biglVar;
    }

    public final bifx a(MessageIdType messageIdType) {
        bifz e = this.a.e(new MessageIdType[]{messageIdType});
        e.z("ConversationMessageDataQueryHelperV2::getMessageByIdQuery");
        return e.b();
    }

    public final bifz b(boolean z, final bmpr bmprVar) {
        buxo d = MessagesTable.d();
        d.c(MessagesTable.c.a);
        d.h(new Function() { // from class: bcsr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.t(bmpr.this);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bifz f = this.a.f(z, d);
        f.z("ConversationMessageDataQueryHelperV2::getConversationMessagesByIdsQuerySql");
        return f;
    }

    public final bifz c(ConversationIdType conversationIdType, int i, int i2) {
        return d(conversationIdType, i, i2, false);
    }

    public final bifz d(final ConversationIdType conversationIdType, int i, int i2, boolean z) {
        dtyq b;
        if (z) {
            bmwn g = blyg.g(conversationIdType, i);
            g.d(new Function() { // from class: bcss
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bmwp bmwpVar = (bmwp) obj;
                    bmwpVar.b();
                    return bmwpVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            g.c(new bmwk(bmwq.b.b), new bmwk(bmwq.b.a));
            g.x(i);
            g.A(i2);
            b = g.b();
        } else {
            bmpt e = blyg.e(conversationIdType, i);
            e.d(new Function() { // from class: bcst
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bmpx bmpxVar = (bmpx) obj;
                    bmpxVar.b(ConversationIdType.this);
                    bmpxVar.c();
                    return bmpxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.c(new bmpq(bmpy.b.b), new bmpq(bmpy.b.a));
            e.x(i);
            e.A(i2);
            b = e.b();
        }
        bifz d = this.a.d(b);
        d.z("ConversationMessageDataQueryHelperV2::getLastSentAndReceivedMessagesQuerySql");
        return d;
    }

    public final bifz e(ConversationIdType conversationIdType, int i, int i2) {
        return d(conversationIdType, i, i2, true);
    }

    public final bifx f(final MessageIdType[] messageIdTypeArr) {
        buxo d = MessagesTable.d();
        d.c(MessagesTable.c.a);
        d.h(new Function() { // from class: bcsx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.v(messageIdTypeArr);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bifz f = this.a.f(true, d);
        f.z("ConversationMessageDataQueryHelperV2::getConversationMessagesByIdsQuerySql");
        return f.b();
    }
}
