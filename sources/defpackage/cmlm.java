package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmlm implements bdnz {
    private static final entd f = entd.c("Bugle");
    public final ffbr a;
    public final cqoh b;
    public final ffbr c;
    public final ffbr d;
    public final attl e;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public cmlm(ffbr ffbrVar, cqoh cqohVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, attl attlVar) {
        this.a = ffbrVar;
        this.b = cqohVar;
        this.g = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.e = attlVar;
    }

    @Override // defpackage.bdnz
    public final ekzz a() {
        return eleg.f("RcsFallbackTrackerManager");
    }

    @Override // defpackage.bdnz
    public final void b(MessageCoreData messageCoreData) {
        emxf.l(!efbd.g());
        ekzz a = a();
        try {
            bseh r = ((bczy) this.g.b()).r(messageCoreData.z());
            if (r != null && r.k() != 2) {
                ((cmlu) this.d.b()).e(messageCoreData.B());
                final MessageIdType C = messageCoreData.C();
                ConversationIdType z = messageCoreData.z();
                if (C != null && !C.c() && z != null && !z.b()) {
                    final ConversationIdType z2 = messageCoreData.z();
                    ekzz f2 = eleg.f("MessageDatabaseOperations#getAllPendingMessagesForOriginalMessageId");
                    try {
                        buxo d = MessagesTable.d();
                        d.z("getAllPendingMessagesForOriginalMessageId");
                        d.h(new Function() { // from class: bdjv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                buxz buxzVar = (buxz) obj;
                                cskc cskcVar = bdmq.a;
                                buxzVar.m(ConversationIdType.this);
                                buxzVar.K(3);
                                int intValue = MessagesTable.g().intValue();
                                if (intValue < 48030) {
                                    dtub.w("original_message_id", intValue);
                                }
                                buxzVar.aq(new dtrt("messages.original_message_id", 1, Long.valueOf(bdhb.a(C))));
                                return buxzVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        Stream D = d.b().D();
                        try {
                            List list = (List) D.map(new bdjt()).collect(Collectors.toCollection(new bdjw()));
                            if (D != null) {
                                D.close();
                            }
                            f2.close();
                            Iterable$EL.forEach(list, new Consumer() { // from class: cmll
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    ((cmlu) cmlm.this.d.b()).e((MessageIdType) obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            ((cmlu) this.d.b()).e(C);
                        } finally {
                        }
                    } finally {
                    }
                }
            }
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Duration c(ConversationIdType conversationIdType) {
        return ((bczy) this.g.b()).ad(conversationIdType) ? Duration.ofSeconds(((Long) this.i.b()).longValue()) : Duration.ZERO;
    }

    public final void d(MessageCoreData messageCoreData) {
        if (f(messageCoreData)) {
            ensz enszVar = (ensz) f.h();
            enszVar.Y(csux.b, messageCoreData.B());
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/rcsmessagetracking/RcsFallbackTrackerManager", "startRcsMessageTrackerOnRcsNotReady", 106, "RcsFallbackTrackerManager.java")).q("RcsStillSendingMessageTracker starts tracking in case of RCS not ready");
            if (this.e.a()) {
                ((cmmg) this.a.b()).c(messageCoreData.B(), this.b.f(), c(messageCoreData.z()));
            } else {
                ((cmmg) this.a.b()).a(messageCoreData.B(), this.b.f());
            }
        }
    }

    public final void e(MessageCoreData messageCoreData) {
        if (f(messageCoreData)) {
            if (((aqgl) this.c.b()).d() && messageCoreData.cY()) {
                return;
            }
            if (this.e.a()) {
                ((cmmg) this.a.b()).c(messageCoreData.B(), this.b.f(), c(messageCoreData.z()));
            } else {
                ((cmmg) this.a.b()).a(messageCoreData.B(), this.b.f());
            }
        }
    }

    public final boolean f(MessageCoreData messageCoreData) {
        bseh r = ((bczy) this.g.b()).r(messageCoreData.z());
        return r != null && messageCoreData.cX() && r.k() == 0 && !r.am();
    }
}
