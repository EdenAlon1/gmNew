package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqbz implements aqbs {
    public final aqcc a;
    public final cbgf b;
    private final errl c;
    private final errl d;

    public aqbz(aqcc aqccVar, errl errlVar, errl errlVar2, cbgf cbgfVar) {
        this.a = aqccVar;
        this.c = errlVar;
        this.d = errlVar2;
        this.b = cbgfVar;
    }

    public static cvqb h(ConversationId conversationId, MessageIdType messageIdType, String str, int i) {
        cvqa createBuilder = cvqb.a.createBuilder();
        String b = conversationId.b();
        createBuilder.copyOnWrite();
        cvqb cvqbVar = (cvqb) createBuilder.instance;
        b.getClass();
        cvqbVar.b = b;
        String b2 = messageIdType.b();
        createBuilder.copyOnWrite();
        cvqb cvqbVar2 = (cvqb) createBuilder.instance;
        b2.getClass();
        cvqbVar2.c = b2;
        createBuilder.copyOnWrite();
        ((cvqb) createBuilder.instance).e = emxe.b(str);
        createBuilder.copyOnWrite();
        ((cvqb) createBuilder.instance).d = cvpz.b(i);
        return createBuilder.build();
    }

    @Override // defpackage.aqbs
    public final elfl a() {
        String[] strArr = bumm.a;
        bumh bumhVar = new bumh(bumm.a);
        bumhVar.z("getCountOfStarredMessages");
        bumhVar.r();
        return elfl.g(bumhVar.b().B());
    }

    @Override // defpackage.aqbs
    public final elfl b(ConversationId conversationId) {
        final ConversationIdType b = bdgq.b(conversationId.b());
        String[] strArr = bumm.a;
        bumh bumhVar = new bumh(bumm.a);
        buxo d = MessagesTable.d();
        d.c(MessagesTable.c.a);
        d.h(new Function() { // from class: aqbv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.m(ConversationIdType.this);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bumhVar.D(dtvz.i(d.b(), MessagesTable.c.a, bumm.c.b).g());
        bumhVar.z("getCountOfStarredMessagesByConversation");
        return elfl.g(bumhVar.b().B());
    }

    @Override // defpackage.aqbs
    public final elfl c(ConversationId conversationId, final MessageIdType messageIdType) {
        emxf.a(conversationId instanceof BugleConversationId);
        final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
        return elfo.f(new Runnable() { // from class: aqbw
            @Override // java.lang.Runnable
            public final void run() {
                aqbz.this.g(messageIdType, bugleConversationId);
            }
        }, this.c);
    }

    @Override // defpackage.aqbs
    public final elfl d(ConversationId conversationId, final MessageIdType messageIdType) {
        emxf.a(conversationId instanceof BugleConversationId);
        final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
        return elfo.f(new Runnable() { // from class: aqbu
            @Override // java.lang.Runnable
            public final void run() {
                Object apply;
                String[] strArr = bumm.a;
                bumc bumcVar = new bumc();
                bumcVar.f("unstarMessage");
                final MessageIdType messageIdType2 = messageIdType;
                apply = new Function() { // from class: aqbt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buml bumlVar = (buml) obj;
                        bumlVar.b(MessageIdType.this);
                        return bumlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new buml());
                bumcVar.b = new bumk((buml) apply);
                if (bumcVar.d() > 0) {
                    aqbz.this.b.l(bugleConversationId.a, messageIdType2, new String[0]);
                }
            }
        }, this.c);
    }

    @Override // defpackage.aqbs
    public final elfl e(ConversationId conversationId, MessageIdType messageIdType, String str, int i) {
        return c(conversationId, messageIdType).h(new aqbx(this, conversationId, messageIdType, str, i), this.d);
    }

    @Override // defpackage.aqbs
    public final elfl f(ConversationId conversationId, MessageIdType messageIdType, String str, int i) {
        return d(conversationId, messageIdType).h(new aqby(this, conversationId, messageIdType, str, i), this.d);
    }

    public final /* synthetic */ void g(MessageIdType messageIdType, BugleConversationId bugleConversationId) {
        try {
            String[] strArr = bumm.a;
            bulp bulpVar = new bulp();
            bulpVar.b(messageIdType);
            final bulm a = bulpVar.a();
            final dtve a2 = bumm.a();
            long b = dtub.b(bumm.a(), "message_star", a, new Function() { // from class: buli
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dtve.this.S("message_star", (ContentValues) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bulj
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    bulm.this.l((Long) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Long.valueOf(b).getClass();
            if (b > 0) {
                this.b.l(bugleConversationId.a, messageIdType, new String[0]);
            }
        } catch (SQLiteConstraintException unused) {
        }
    }
}
