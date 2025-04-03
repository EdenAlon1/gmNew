package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crab {
    public static final entd a = entd.c("BugleFileTransfer");
    public final ffbr b;
    private final errl c;
    private final crak d;

    public crab(errl errlVar, ffbr ffbrVar, crak crakVar) {
        this.c = errlVar;
        this.b = ffbrVar;
        this.d = crakVar;
    }

    final elfl a(final bdhg bdhgVar) {
        if (!((Boolean) ((cfup) avyb.a.get()).e()).booleanValue()) {
            return elfo.g(new Callable() { // from class: craa
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bdmq bdmqVar = (bdmq) crab.this.b.b();
                    bdhg bdhgVar2 = bdhgVar;
                    MessageCoreData w = bdmqVar.w(bdhgVar2);
                    if (w == null) {
                        ensz enszVar = (ensz) crab.a.j();
                        enszVar.Y(csux.e, bdhgVar2.b);
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataLegacy", 105, "MessageCoreDataGetter.java")).q("Message does not exist");
                        throw new cquo(false, cqpn.FILE_TRANSFER_FAILURE_REASON_MESSAGE_NOT_FOUND, "Message does not exist");
                    }
                    if (w.G() == null) {
                        ensz enszVar2 = (ensz) crab.a.j();
                        enszVar2.Y(csux.e, bdhgVar2.b);
                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataLegacy", 117, "MessageCoreDataGetter.java")).q("Message has no attachments");
                        throw new cquo(false, cqpn.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, "Message has no attachments");
                    }
                    if (w.u() == null) {
                        ensz enszVar3 = (ensz) crab.a.j();
                        enszVar3.Y(csux.e, bdhgVar2.b);
                        ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataLegacy", 133, "MessageCoreDataGetter.java")).q("Message SMS URI is null");
                        throw new cquo(true, cqpn.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, "Message SMS URI is null");
                    }
                    ensz enszVar4 = (ensz) crab.a.h();
                    enszVar4.Y(csux.e, bdhgVar2.b);
                    enszVar4.Y(csux.o, w.z().toString());
                    enszVar4.Y(csux.a, String.valueOf(w.B().a));
                    ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataLegacy", 149, "MessageCoreDataGetter.java")).q("MessageCoreData found for incoming file transfer");
                    return Optional.of(w);
                }
            }, this.c);
        }
        crak crakVar = this.d;
        ensz enszVar = (ensz) crak.a.h();
        enszVar.Y(csux.e, bdhgVar.b);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/incoming/TelephonyInsertionFutureRepository", "getfutureForRcsMessage", 67, "TelephonyInsertionFutureRepository.java")).q("Retrieving Telephony insertion future for finalizing file transfer.");
        elfl elflVar = (elfl) crakVar.b.get(bdhgVar);
        if (elflVar == null) {
            ensz enszVar2 = (ensz) crak.a.h();
            enszVar2.Y(csux.e, bdhgVar.b);
            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/TelephonyInsertionFutureRepository", "getfutureForRcsMessage", 81, "TelephonyInsertionFutureRepository.java")).q("No Telephony insertion future found.");
            elflVar = elfo.e(null);
        }
        return elflVar.h(new emwl() { // from class: cqzz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bdmq bdmqVar = (bdmq) crab.this.b.b();
                bdhg bdhgVar2 = bdhgVar;
                MessageCoreData w = bdmqVar.w(bdhgVar2);
                if (w == null) {
                    ensz enszVar3 = (ensz) crab.a.j();
                    enszVar3.Y(csux.e, bdhgVar2.b);
                    ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataAndCheckFirstAttachment", 69, "MessageCoreDataGetter.java")).q("Message does not exist");
                    return Optional.empty();
                }
                if (w.G() == null) {
                    ensz enszVar4 = (ensz) crab.a.j();
                    enszVar4.Y(csux.e, bdhgVar2.b);
                    ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataAndCheckFirstAttachment", 78, "MessageCoreDataGetter.java")).q("Message has no attachments");
                    return Optional.empty();
                }
                if (w.u() != null) {
                    return Optional.of(w);
                }
                ensz enszVar5 = (ensz) crab.a.j();
                enszVar5.Y(csux.e, bdhgVar2.b);
                ((ensz) enszVar5.h("com/google/android/apps/messaging/shared/transfer/incoming/MessageCoreDataGetter", "getMessageCoreDataAndCheckFirstAttachment", 86, "MessageCoreDataGetter.java")).q("Message SMS URI is null");
                return Optional.empty();
            }
        }, this.c);
    }
}
