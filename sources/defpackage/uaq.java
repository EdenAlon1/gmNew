package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uaq implements eknz {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ uar d;

    public uaq(uar uarVar, ConversationIdType conversationIdType, ConversationId conversationId, MessageIdType messageIdType) {
        this.a = conversationIdType;
        this.b = conversationId;
        this.c = messageIdType;
        this.d = uarVar;
    }

    @Override // defpackage.eknz
    public final emxc a() {
        return emux.a;
    }

    @Override // defpackage.eknz
    public final ListenableFuture c() {
        if (!((Boolean) uak.a.e()).booleanValue()) {
            return elfo.e(eknx.a("Deeplink by conversation_id is not enabled yet"));
        }
        final ConversationIdType conversationIdType = this.a;
        final ConversationId conversationId = this.b;
        final MessageIdType messageIdType = this.c;
        return elfo.g(new Callable() { // from class: uap
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final ConversationIdType conversationIdType2 = conversationIdType;
                if (!conversationIdType2.b()) {
                    ekzz f = eleg.f("ConversationDeeplinkGatewayHandler#hasConversation");
                    try {
                        bsob e = bsom.e();
                        e.z("hasConversation");
                        e.i(new Function() { // from class: ual
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsol bsolVar = (bsol) obj;
                                bsolVar.q(ConversationIdType.this);
                                return bsolVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        boolean T = e.b().T();
                        f.close();
                        if (T) {
                            ConversationId conversationId2 = conversationId;
                            if (conversationId2 == null) {
                                conversationId2 = new BugleConversationId(conversationIdType2);
                            }
                            return uaq.this.d.a(conversationId2, messageIdType);
                        }
                    } catch (Throwable th) {
                        try {
                            f.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return eknx.a("Cannot find conversation by conversation_id");
            }
        }, this.d.a);
    }

    @Override // defpackage.eknz
    public final /* synthetic */ eknx e() {
        return ekny.a();
    }

    @Override // defpackage.eknz
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.eknz
    public final /* synthetic */ void d() {
    }
}
