package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azzz {
    private static final entd b = entd.c("BugleDataModel");
    public final ffbr a;
    private final ConcurrentHashMap c = new ConcurrentHashMap();
    private final ffbr d;
    private final errl e;

    public azzz(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        this.d = ffbrVar;
        this.a = ffbrVar2;
        this.e = errlVar;
    }

    public final elfl a(final ConversationIdType conversationIdType) {
        ekzz f = eleg.f("SendingContext::populateSendingContext");
        try {
            elfl f2 = elfo.f(new Runnable() { // from class: azzy
                @Override // java.lang.Runnable
                public final void run() {
                    azzz azzzVar = azzz.this;
                    azzzVar.b(conversationIdType);
                    azwh azwhVar = (azwh) azzzVar.a.b();
                    ekzz f3 = eleg.f("BugleDbOperationsCached::populateExistingConversation");
                    try {
                        f3.close();
                    } catch (Throwable th) {
                        try {
                            f3.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.e);
            f.close();
            return f2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(final ConversationIdType conversationIdType) {
        ekzz f = eleg.f("SendingContext::populatePendingMessages");
        try {
            buxo b2 = bajq.b();
            b2.h(new Function() { // from class: bajl
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
            buuo buuoVar = (buuo) b2.b().o();
            while (buuoVar.moveToNext()) {
                try {
                    MessageCoreData a = ((byzp) this.d.b()).a();
                    a.aN(buuoVar);
                    if (a.cW() || a.dd()) {
                        this.c.put(conversationIdType, true);
                        break;
                    }
                } finally {
                }
            }
            this.c.put(conversationIdType, false);
            ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/shared/datamodel/SendingContext", "populateFirstPendingMessage", 76, "SendingContext.java")).t("Conversation(id:%s) has no pending messages & using fast path message sending cache", conversationIdType);
            buuoVar.close();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean c(ConversationIdType conversationIdType) {
        Boolean bool = (Boolean) this.c.put(conversationIdType, true);
        return (bool == null || bool.booleanValue()) ? false : true;
    }
}
