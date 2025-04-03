package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqps {
    public static final entd a = entd.c("BugleFileTransfer");
    public final ffbr b;
    public final cqoh c;
    private final errl d;
    private final errl e;
    private final cqrl f;

    public cqps(errl errlVar, errl errlVar2, ffbr ffbrVar, cqrl cqrlVar, cqoh cqohVar) {
        this.d = errlVar;
        this.e = errlVar2;
        this.b = ffbrVar;
        this.f = cqrlVar;
        this.c = cqohVar;
    }

    private final elfl d(final String str, final Optional optional) {
        return this.f.c(str, Optional.empty()).h(new emwl() { // from class: cqpq
            /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cqrn cqrnVar = (cqrn) obj;
                boolean isEmpty = cqrnVar.b().isEmpty();
                String str2 = str;
                if (isEmpty || cqrnVar.a().isEmpty()) {
                    ensz enszVar = (ensz) cqps.a.j();
                    enszVar.Y(cqpo.a, str2);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/FileTransferPausedCallbackHandler", "markMessagePaused", 105, "FileTransferPausedCallbackHandler.java")).q("Could not find a valid FileTransferMessageCoreData to handle file transfer paused callback.");
                    return null;
                }
                Optional optional2 = optional;
                cqps cqpsVar = cqps.this;
                final ?? r6 = cqrnVar.b().get();
                r6.aV(cqpsVar.c.f().toEpochMilli(), ((cqrs) cqrnVar.a().get()).o());
                optional2.ifPresent(new Consumer() { // from class: cqpr
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        MessageCoreData.this.bL(((Integer) obj2).intValue());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ensz enszVar2 = (ensz) cqps.a.h();
                enszVar2.Y(cqpo.a, str2);
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/FileTransferPausedCallbackHandler", "markMessagePaused", 120, "FileTransferPausedCallbackHandler.java")).q("File transfer paused. Marking message paused.");
                bdmq bdmqVar = (bdmq) cqpsVar.b.b();
                ConversationIdType z = r6.z();
                MessageIdType B = r6.B();
                String[] strArr = MessagesTable.a;
                buxr buxrVar = new buxr();
                buxrVar.ap("updateFileTransferMessagePaused");
                buxrVar.G(r6.o());
                buxrVar.O(r6.r());
                buxrVar.U(r6.k());
                buxrVar.B(r6.f());
                bdmqVar.U(z, B, buxrVar);
                return null;
            }
        }, this.d);
    }

    public final elfl a(String str) {
        return d(str, Optional.of(10007));
    }

    public final elfl b(String str) {
        return d(str, Optional.empty());
    }

    public final elfl c(final awap awapVar, final MessageCoreData messageCoreData) {
        final long epochMilli = this.c.f().toEpochMilli();
        messageCoreData.aV(epochMilli, cqtk.UPLOAD);
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cqpo.j, awapVar);
        enszVar.Y(csux.b, messageCoreData.B());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/FileTransferPausedCallbackHandler", "markMessagePaused", 69, "FileTransferPausedCallbackHandler.java")).q("File transfer paused. Marking message paused.");
        return elfo.f(new Runnable() { // from class: cqpp
            @Override // java.lang.Runnable
            public final void run() {
                bdmq bdmqVar = (bdmq) cqps.this.b.b();
                MessageCoreData messageCoreData2 = messageCoreData;
                ConversationIdType z = messageCoreData2.z();
                MessageIdType B = messageCoreData2.B();
                String[] strArr = MessagesTable.a;
                buxr buxrVar = new buxr();
                buxrVar.ap("updateFileTransferMessagePaused");
                buxrVar.O(epochMilli);
                buxrVar.U(messageCoreData2.k());
                if (bdmqVar.U(z, B, buxrVar)) {
                    return;
                }
                awap awapVar2 = awapVar;
                ensz enszVar2 = (ensz) cqps.a.j();
                enszVar2.Y(cqpo.j, awapVar2);
                enszVar2.Y(csux.b, messageCoreData2.B());
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/FileTransferPausedCallbackHandler", "markMessagePaused", 88, "FileTransferPausedCallbackHandler.java")).q("Failed to update message status for paused message.");
            }
        }, this.e);
    }
}
