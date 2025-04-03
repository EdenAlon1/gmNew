package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bejc {
    public static bfki a(final ConversationIdType conversationIdType) {
        bfkk c = c();
        c.e(new Function() { // from class: bejb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bfkp bfkpVar = (bfkp) obj;
                bfkpVar.d(ConversationIdType.this);
                return bfkpVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return c.b();
    }

    public static bfkk b() {
        bfkk b = bfkq.b();
        b.z("+ConversationListFromConversationToParticipantsQueries#getSearchQuery");
        b.r();
        b.c(new bfkh(bfkq.b.b, false));
        b.n(PartsTable.d.c, "SNIPPET_TO_USE");
        b.o(bflb.e, bflb.h);
        b.o(bflb.c, ((Boolean) ((cfup) stl.l.get()).e()).booleanValue() ? bflb.b : "0");
        b.r();
        bfkp bfkpVar = new bfkp();
        bfkpVar.c();
        b.k(new bfkl(bfkpVar));
        b.n(cbem.a, "unread_message_count");
        return b;
    }

    public static bfkk c() {
        bfkk b = bfkq.b();
        b.z("+ConversationListFromConversationToParticipantsQueries#makeBuilder");
        b.v(bfkq.b.a);
        b.n(bsom.c.g, "SNIPPET_TO_USE");
        b.n(bflb.f, "conversation_contains_vsms_participant");
        b.n(bflb.g, "earliest_reminder_trigger_time");
        b.o(bflb.e, bflb.d);
        b.o(bflb.c, ((Boolean) ((cfup) stl.l.get()).e()).booleanValue() ? bflb.b : "0");
        b.r();
        b.n(cbem.a, "unread_message_count");
        if (cgma.a()) {
            b.n(cgly.a, "conversation_contains_matrix_participant");
        }
        return b;
    }
}
