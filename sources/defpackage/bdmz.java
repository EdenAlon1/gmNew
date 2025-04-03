package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdmz {
    public final ffbr a;
    public final ffbr b;
    public ConversationIdType c = bdgq.a;
    public elfl d = null;
    private final ffbr e;
    private final Executor f;

    public bdmz(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar) {
        this.a = ffbrVar;
        this.e = ffbrVar2;
        this.b = ffbrVar3;
        this.f = new ersb(errlVar);
    }

    public final elfl a(final ConversationIdType conversationIdType, final MessageIdType messageIdType, final int i) {
        return elfo.g(eldl.m(d(new Callable() { // from class: bdmw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List b;
                bdmz bdmzVar = bdmz.this;
                bdjk bdjkVar = (bdjk) bdmzVar.a.b();
                ekzz f = eleg.f("ConversationMessageListDatabaseOperations#loadConversationMessagesAround");
                int i2 = i;
                try {
                    csix.h();
                    csix.q(i2);
                    csjb a = bdjk.a.a();
                    a.I("ConversationMessageListDatabaseOperations loadConversationMessagesAround starts.");
                    a.r();
                    boolean a2 = bdjkVar.e.a();
                    MessageIdType messageIdType2 = messageIdType;
                    ConversationIdType conversationIdType2 = conversationIdType;
                    if (a2) {
                        bcsy bcsyVar = (bcsy) bdjkVar.d.b();
                        final bmjq a3 = blyg.a(conversationIdType2, messageIdType2, i2 / 2);
                        bigl biglVar = bcsyVar.a;
                        buxo d = MessagesTable.d();
                        d.c(MessagesTable.c.a);
                        d.h(new Function() { // from class: bcsu
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar = (buxz) obj;
                                buxzVar.t(bmjq.this);
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bifz f2 = biglVar.f(true, d);
                        f2.z("ConversationMessageDataQueryHelperV2::getConversationMessagesByIdsQuerySql");
                        f2.z("ConversationMessageDataQueryHelperV2::getSurroundingMessageChunkQuerySql");
                        bifu bifuVar = (bifu) f2.b().o();
                        try {
                            b = bdjk.a(bdjkVar.b, bifuVar);
                            bifuVar.close();
                        } finally {
                        }
                    } else {
                        bjjd bjjdVar = (bjjd) ((bcsq) bdjkVar.c.b()).a.b(true, false, bdgq.a, blyg.a(conversationIdType2, messageIdType2, i2 / 2)).b().o();
                        try {
                            b = bdjk.b(bdjkVar.b, bjjdVar);
                            bjjdVar.close();
                        } finally {
                        }
                    }
                    f.close();
                    return (List) Collection.EL.stream(b).map(new bdmt(bdmzVar)).collect(Collectors.toCollection(new bdmu()));
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        })), e());
    }

    public final elfl b(final ConversationIdType conversationIdType, final int i) {
        return elfo.g(eldl.m(d(new Callable() { // from class: bdmy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List b;
                bdmz bdmzVar = bdmz.this;
                bdjk bdjkVar = (bdjk) bdmzVar.a.b();
                ekzz f = eleg.f("ConversationMessageListDatabaseOperations#loadLatestConversationMessages");
                int i2 = i;
                try {
                    csix.h();
                    csix.q(i2);
                    csjb a = bdjk.a.a();
                    a.I("ConversationMessageListDatabaseOperations loadLatestConversationMessages starts.");
                    a.r();
                    boolean a2 = bdjkVar.e.a();
                    ConversationIdType conversationIdType2 = conversationIdType;
                    if (a2) {
                        bifz b2 = ((bcsy) bdjkVar.d.b()).b(true, blyg.e(conversationIdType2, i2).b());
                        b2.z("ConversationMessageDataQueryHelperV2::getRecentConversationMessagesChunkQuerySql");
                        bifu bifuVar = (bifu) b2.b().o();
                        try {
                            b = bdjk.a(bdjkVar.b, bifuVar);
                            bifuVar.close();
                        } finally {
                        }
                    } else {
                        bjjd bjjdVar = (bjjd) ((bcsq) bdjkVar.c.b()).c(true, blyg.e(conversationIdType2, i2).b()).b().o();
                        try {
                            b = bdjk.b(bdjkVar.b, bjjdVar);
                            bjjdVar.close();
                        } finally {
                        }
                    }
                    f.close();
                    return (List) Collection.EL.stream(b).map(new bdmt(bdmzVar)).collect(Collectors.toCollection(new bdmu()));
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        })), e());
    }

    public final elfl c(ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        efbd.c();
        elfl elflVar = this.d;
        if (!conversationIdType.equals(this.c) || elflVar == null) {
            csjy.d("Bugle", "return %s", messageIdType != null ? "getLoadConversationMessagesAroundFuture" : "getLoadLatestConversationMessagesFuture");
            return !messageIdType.c() ? a(conversationIdType, messageIdType, i) : b(conversationIdType, i);
        }
        csjy.c("Bugle", "return preloadedMessagesFuture");
        this.c = bdgq.a;
        this.d = null;
        return elflVar;
    }

    public final Callable d(final Callable callable) {
        final alrv alrvVar = (alrv) this.e.b();
        if (alrvVar == null) {
            return callable;
        }
        final ecri a = alrvVar.a();
        return new Callable() { // from class: bdms
            @Override // java.util.concurrent.Callable
            public final Object call() {
                alrv alrvVar2 = alrvVar;
                ecri ecriVar = a;
                Object call = callable.call();
                alrvVar2.h(ecriVar, alrv.b);
                return call;
            }
        };
    }

    public final Executor e() {
        efbd.c();
        return this.f;
    }
}
