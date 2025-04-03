package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cogw {
    public static final dtzj a;

    static {
        coin b = ScheduledSendTable.b();
        b.z("SCHEDULED_MESSAGES_COUNT_SUBQUERY");
        b.c(ScheduledSendTable.c.a);
        b.e(new Function() { // from class: cogr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                coit coitVar = (coit) obj;
                dtzj dtzjVar = cogw.a;
                coitVar.b(bsom.c.a);
                return coitVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a = b.b().u();
    }

    public static cogl a(final ConversationIdType conversationIdType) {
        cogn a2 = cogq.a();
        a2.z("getScheduledMessagesForConversation1");
        a2.c(new Function() { // from class: cogt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cogp cogpVar = (cogp) obj;
                dtzj dtzjVar = cogw.a;
                cogpVar.aq(new dtrt("scheduled_send.conversation_id", 1, Long.valueOf(bdgq.a(ConversationIdType.this))));
                return cogpVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a2.c(new Function() { // from class: cogu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cogp cogpVar = (cogp) obj;
                dtzj dtzjVar = cogw.a;
                coiu coiuVar = coiu.SENDING;
                cogpVar.aq(new dtwe("scheduled_send.status", 2, Integer.valueOf(coiuVar == null ? 0 : coiuVar.ordinal())));
                return cogpVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cogg coggVar = cogq.b;
        a2.C((String) DesugarArrays.stream(new cogk[]{new cogk(coggVar.a), new cogk(coggVar.b)}).map(new Function() { // from class: cogm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cogk) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        return a2.b();
    }
}
