package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.PauseRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.awah;
import defpackage.bajb;
import defpackage.bajc;
import defpackage.cqos;
import defpackage.csix;
import defpackage.ctid;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.enru;
import defpackage.eogt;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.errl;
import defpackage.ffbr;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class PauseRcsFileTransferAction extends Action<Void> {
    public final errl b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final cqos f;
    public final awah g;
    private final Context h;
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bajb();

    /* compiled from: PG */
    public interface a {
        bajc hV();
    }

    public PauseRcsFileTransferAction(Context context, errl errlVar, ffbr ffbrVar, cqos cqosVar, ffbr ffbrVar2, awah awahVar, ffbr ffbrVar3, Parcel parcel) {
        super(parcel, eogt.PAUSE_RCS_FILE_TRANSFER_ACTION);
        this.h = context;
        this.b = errlVar;
        this.c = ffbrVar;
        this.f = cqosVar;
        this.d = ffbrVar2;
        this.g = awahVar;
        this.e = ffbrVar3;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("PauseRcsFileTransferAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.PauseFileTransfer.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        if (!ctid.h(this.h)) {
            return elfo.g(new Callable() { // from class: baiz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    PauseRcsFileTransferAction pauseRcsFileTransferAction = PauseRcsFileTransferAction.this;
                    MessageIdType b = bdhb.b(pauseRcsFileTransferAction.t.l("rcs_ft_message_id"));
                    return ((asnv) pauseRcsFileTransferAction.d.b()).a() ? ((bdmq) pauseRcsFileTransferAction.c.b()).v(b) : ((bdmq) pauseRcsFileTransferAction.c.b()).z(b);
                }
            }, this.b).i(new eroh() { // from class: baja
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final MessageCoreData messageCoreData = (MessageCoreData) obj;
                    if (messageCoreData == null) {
                        return elfo.e(null);
                    }
                    final PauseRcsFileTransferAction pauseRcsFileTransferAction = PauseRcsFileTransferAction.this;
                    if (((asnv) pauseRcsFileTransferAction.d.b()).a() && messageCoreData.cS()) {
                        MessagePartCoreData G = messageCoreData.G();
                        if (G == null) {
                            ensk i = PauseRcsFileTransferAction.a.i();
                            i.Y(ente.a, "BugleDataModel");
                            enrr enrrVar = (enrr) i;
                            enrrVar.Y(csux.b, messageCoreData.B());
                            enrrVar.Y(csux.f, messageCoreData.E());
                            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction", "pauseFileTransferForChatApi", 164, "PauseRcsFileTransferAction.java")).q("Attachment is null. Nothing to pause for outgoing message.");
                            return elfo.e(null);
                        }
                        awap z = G.z();
                        if (z != null) {
                            ensk h = PauseRcsFileTransferAction.a.h();
                            h.Y(ente.a, "BugleDataModel");
                            enrr enrrVar2 = (enrr) h;
                            enrrVar2.Y(csux.b, messageCoreData.B());
                            enrrVar2.Y(csux.f, messageCoreData.E());
                            enrrVar2.Y(cqpo.j, z);
                            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction", "pauseFileTransferForChatApi", 173, "PauseRcsFileTransferAction.java")).q("Pausing processing for outgoing message.");
                            if (((atxa) pauseRcsFileTransferAction.e.b()).a()) {
                                awah awahVar = pauseRcsFileTransferAction.g;
                                return axol.i(awahVar.b, new awae(awahVar, z, messageCoreData, null));
                            }
                            awah awahVar2 = pauseRcsFileTransferAction.g;
                            return axol.i(awahVar2.b, new awad(awahVar2, z, null));
                        }
                        ensk j = PauseRcsFileTransferAction.a.j();
                        j.Y(ente.a, "BugleDataModel");
                        enrr enrrVar3 = (enrr) j;
                        enrrVar3.Y(csux.b, messageCoreData.B());
                        enrrVar3.Y(csux.f, messageCoreData.E());
                        ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction", "pauseFileTransferForChatApi", 183, "PauseRcsFileTransferAction.java")).q("ProcessingId is null for outgoing message to pause.");
                    }
                    cqte b = cqtj.b();
                    b.z("pauseFileTransferForChatApi");
                    cqsn cqsnVar = cqtj.c;
                    b.c(cqsnVar.b, cqsnVar.c);
                    b.e(new Function() { // from class: baiw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cqti cqtiVar = (cqti) obj2;
                            cqtiVar.b(MessageCoreData.this.B());
                            return cqtiVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    cqrs cqrsVar = (cqrs) ((cqsp) b.b().o()).cS();
                    if (cqrsVar == null) {
                        ensk j2 = PauseRcsFileTransferAction.a.j();
                        j2.Y(ente.a, "BugleDataModel");
                        enrr enrrVar4 = (enrr) j2;
                        enrrVar4.Y(csux.b, messageCoreData.B());
                        enrrVar4.Y(csux.f, messageCoreData.E());
                        ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction", "pauseFileTransferForChatApi", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "PauseRcsFileTransferAction.java")).q("No file transfer bind data found. Cannot pause file transfer.");
                        return elfo.e(null);
                    }
                    if (cqtk.UPLOAD.equals(cqrsVar.o())) {
                        crdb b2 = pauseRcsFileTransferAction.f.b();
                        String r = cqrsVar.r();
                        r.getClass();
                        return b2.a(r);
                    }
                    cqvc a2 = pauseRcsFileTransferAction.f.a();
                    String r2 = cqrsVar.r();
                    r2.getClass();
                    return a2.b(r2).f(cquo.class, new eroh() { // from class: baix
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return elfo.e(false);
                        }
                    }, erpp.a).h(new emwl() { // from class: baiy
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            if (((Boolean) obj2).booleanValue()) {
                                return null;
                            }
                            MessageCoreData messageCoreData2 = messageCoreData;
                            PauseRcsFileTransferAction pauseRcsFileTransferAction2 = PauseRcsFileTransferAction.this;
                            ensk h2 = PauseRcsFileTransferAction.a.h();
                            h2.Y(ente.a, "BugleDataModel");
                            enrr enrrVar5 = (enrr) h2;
                            enrrVar5.Y(csux.b, messageCoreData2.B());
                            enrrVar5.Y(csux.f, messageCoreData2.E());
                            ((enrr) enrrVar5.h("com/google/android/apps/messaging/shared/datamodel/action/PauseRcsFileTransferAction", "updateMessageStatusForFailedPause", 238, "PauseRcsFileTransferAction.java")).q("No ongoing file transfer to pause so changing to manual download.");
                            messageCoreData2.bV(110);
                            ((bdmq) pauseRcsFileTransferAction2.c.b()).T(messageCoreData2);
                            return null;
                        }
                    }, pauseRcsFileTransferAction.b);
                }
            }, erpp.a);
        }
        csix.c("PauseRcsFileTransferAction. Secondary user can't pause a file transfer");
        return elfo.e(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public PauseRcsFileTransferAction(Context context, errl errlVar, ffbr ffbrVar, cqos cqosVar, ffbr ffbrVar2, awah awahVar, ffbr ffbrVar3, MessageIdType messageIdType) {
        super(eogt.PAUSE_RCS_FILE_TRANSFER_ACTION);
        this.h = context;
        this.b = errlVar;
        this.c = ffbrVar;
        this.f = cqosVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.g = awahVar;
        this.t.v("rcs_ft_message_id", messageIdType.b());
    }
}
