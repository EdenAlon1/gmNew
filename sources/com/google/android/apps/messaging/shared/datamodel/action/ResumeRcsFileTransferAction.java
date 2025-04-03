package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ResumeRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akzt;
import defpackage.awah;
import defpackage.bavm;
import defpackage.bbgc;
import defpackage.bdhb;
import defpackage.cqoh;
import defpackage.cqos;
import defpackage.cqvy;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.enru;
import defpackage.eogt;
import defpackage.erog;
import defpackage.eroh;
import defpackage.errl;
import defpackage.ffbr;
import j$.time.Instant;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ResumeRcsFileTransferAction extends Action<Void> implements Parcelable {
    public final ffbr b;
    public final cqoh c;
    public final akzt d;
    public final errl e;
    public final errl f;
    public final cqvy g;
    public final ffbr h;
    public final ffbr i;
    public final cqos j;
    public final awah k;
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bavm();

    /* compiled from: PG */
    public interface a {
        bbgc bq();
    }

    public ResumeRcsFileTransferAction(ffbr ffbrVar, cqoh cqohVar, akzt akztVar, errl errlVar, errl errlVar2, cqos cqosVar, cqvy cqvyVar, ffbr ffbrVar2, awah awahVar, ffbr ffbrVar3, MessageIdType messageIdType) {
        super(eogt.RESUME_RCS_FILE_TRANSFER_ACTION);
        this.b = ffbrVar;
        this.c = cqohVar;
        this.d = akztVar;
        this.e = errlVar;
        this.f = errlVar2;
        this.j = cqosVar;
        this.g = cqvyVar;
        this.h = ffbrVar2;
        this.k = awahVar;
        this.i = ffbrVar3;
        this.t.v("message_id", messageIdType.b());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ResumeRcsFileTransferAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ResumeRcsFileTransferAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        ekzz f = eleg.f("ResumeRcsFileTransferAction.executeAction");
        try {
            final MessageIdType b = bdhb.b(this.t.l("message_id"));
            elfl h = elfo.h(new erog() { // from class: bauz
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    ResumeRcsFileTransferAction resumeRcsFileTransferAction = ResumeRcsFileTransferAction.this;
                    bdmq bdmqVar = (bdmq) resumeRcsFileTransferAction.b.b();
                    MessageIdType messageIdType = b;
                    MessageCoreData v = bdmqVar.v(messageIdType);
                    if (v == null) {
                        ensk i = ResumeRcsFileTransferAction.a.i();
                        i.Y(ente.a, "BugleDataModel");
                        enrr enrrVar = (enrr) i;
                        enrrVar.Y(csux.b, messageIdType);
                        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileTransferAsync", 173, "ResumeRcsFileTransferAction.java")).q("Message is not found.");
                        return elfo.e(null);
                    }
                    ensk e = ResumeRcsFileTransferAction.a.e();
                    e.Y(ente.a, "BugleDataModel");
                    enrr enrrVar2 = (enrr) e;
                    enrrVar2.Y(csux.b, messageIdType);
                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileTransferAsync", 177, "ResumeRcsFileTransferAction.java")).q("resumeFileTransfer");
                    if (!((asnv) resumeRcsFileTransferAction.h.b()).a() || !v.cS()) {
                        return resumeRcsFileTransferAction.h(v).h(new emwl() { // from class: bavd
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                return null;
                            }
                        }, resumeRcsFileTransferAction.f);
                    }
                    MessagePartCoreData G = v.G();
                    if (G == null) {
                        ensk i2 = ResumeRcsFileTransferAction.a.i();
                        i2.Y(ente.a, "BugleDataModel");
                        enrr enrrVar3 = (enrr) i2;
                        enrrVar3.Y(csux.b, v.B());
                        enrrVar3.Y(csux.f, v.E());
                        ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileProcessingPipeline", 214, "ResumeRcsFileTransferAction.java")).q("Attachment is null. Nothing to resume for outgoing message.");
                        return elfo.e(null);
                    }
                    awap z = G.z();
                    if (z == null) {
                        ensk j = ResumeRcsFileTransferAction.a.j();
                        j.Y(ente.a, "BugleDataModel");
                        enrr enrrVar4 = (enrr) j;
                        enrrVar4.Y(csux.b, v.B());
                        enrrVar4.Y(csux.f, v.E());
                        ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileProcessingPipeline", 222, "ResumeRcsFileTransferAction.java")).q("ProcessingId is null for outgoing message to resume.");
                        return resumeRcsFileTransferAction.h(v).h(new emwl() { // from class: bavl
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                return null;
                            }
                        }, resumeRcsFileTransferAction.f);
                    }
                    ensk h2 = ResumeRcsFileTransferAction.a.h();
                    h2.Y(ente.a, "BugleDataModel");
                    enrr enrrVar5 = (enrr) h2;
                    enrrVar5.Y(csux.b, v.B());
                    enrrVar5.Y(csux.f, v.E());
                    enrrVar5.Y(cqpo.j, G.z());
                    ((enrr) enrrVar5.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileProcessingPipeline", 230, "ResumeRcsFileTransferAction.java")).q("Resuming processing.");
                    awah awahVar = resumeRcsFileTransferAction.k;
                    return axol.i(awahVar.b, new awag(awahVar, z, v.a() + 1, null));
                }
            }, this.e);
            f.b(h);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fV() {
        return false;
    }

    public final elfl h(final MessageCoreData messageCoreData) {
        return elfo.g(new Callable() { // from class: bava
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqte b = cqtj.b();
                b.z("resumeFileTransferAsyncForChatApi");
                cqsn cqsnVar = cqtj.c;
                b.c(cqsnVar.b, cqsnVar.c, cqsnVar.e);
                cqti cqtiVar = new cqti();
                cqtiVar.b(MessageCoreData.this.B());
                b.d(cqtiVar);
                return (cqrs) ((cqsp) b.b().o()).cS();
            }
        }, this.e).i(new eroh() { // from class: bavb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final MessageCoreData messageCoreData2 = messageCoreData;
                cqrs cqrsVar = (cqrs) obj;
                if (cqrsVar == null) {
                    ensk j = ResumeRcsFileTransferAction.a.j();
                    j.Y(ente.a, "BugleDataModel");
                    enrr enrrVar = (enrr) j;
                    enrrVar.Y(csux.b, messageCoreData2.B());
                    enrrVar.Y(csux.f, messageCoreData2.E());
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileTransferAsyncForChatApi", 264, "ResumeRcsFileTransferAction.java")).q("No file transfer bind data found. Cannot resume file transfer.");
                    return elfo.e(bavn.NO_FILE_TRANSFER_BIND_DATA);
                }
                final ResumeRcsFileTransferAction resumeRcsFileTransferAction = ResumeRcsFileTransferAction.this;
                final String r = cqrsVar.r();
                if (cqtk.DOWNLOAD.equals(cqrsVar.o()) && "".equals(r)) {
                    final awvb k = cqrsVar.k();
                    if (k == null) {
                        ensk j2 = ResumeRcsFileTransferAction.a.j();
                        j2.Y(ente.a, "BugleDataModel");
                        enrr enrrVar2 = (enrr) j2;
                        enrrVar2.Y(csux.b, messageCoreData2.B());
                        enrrVar2.Y(csux.f, messageCoreData2.E());
                        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileTransferAsyncForChatApi", 276, "ResumeRcsFileTransferAction.java")).q("File transfer bind data for manual download does not have file information");
                        return elfo.e(bavn.NO_FILE_TRANSFER_BIND_DATA);
                    }
                    ensk e = ResumeRcsFileTransferAction.a.e();
                    e.Y(ente.a, "BugleDataModel");
                    enrr enrrVar3 = (enrr) e;
                    enrrVar3.Y(csux.b, messageCoreData2.B());
                    enrrVar3.Y(csux.f, messageCoreData2.E());
                    ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "startDownloadForChatApi", 395, "ResumeRcsFileTransferAction.java")).q("Starting manual download.");
                    cqxm cqxmVar = (cqxm) cqxn.a.createBuilder();
                    String f = messageCoreData2.E().f();
                    cqxmVar.copyOnWrite();
                    ((cqxn) cqxmVar.instance).b = f;
                    final cqxn cqxnVar = (cqxn) cqxmVar.build();
                    eifi c = ((FileInformation) new avtz().fP(k)).c();
                    c.d(eifj.FILE);
                    final FileInformation i = c.i();
                    final cqvc a2 = resumeRcsFileTransferAction.j.a();
                    return elfo.f(new Runnable() { // from class: bavg
                        @Override // java.lang.Runnable
                        public final void run() {
                            ResumeRcsFileTransferAction resumeRcsFileTransferAction2 = ResumeRcsFileTransferAction.this;
                            awvb awvbVar = k;
                            MessageCoreData messageCoreData3 = messageCoreData2;
                            if (messageCoreData3.ct()) {
                                resumeRcsFileTransferAction2.g.d(messageCoreData3, 4, awvbVar.f);
                            } else {
                                resumeRcsFileTransferAction2.g.d(messageCoreData3, 3, awvbVar.f);
                            }
                        }
                    }, resumeRcsFileTransferAction.e).i(new eroh() { // from class: bavh
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return cqvc.this.a(messageCoreData2.B(), i, cqxnVar.toByteString());
                        }
                    }, resumeRcsFileTransferAction.e).h(new emwl() { // from class: bavi
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            ensk e2 = ResumeRcsFileTransferAction.a.e();
                            e2.Y(ente.a, "BugleDataModel");
                            enrr enrrVar4 = (enrr) e2;
                            MessageCoreData messageCoreData3 = MessageCoreData.this;
                            enrrVar4.Y(csux.b, messageCoreData3.B());
                            enrrVar4.Y(csux.f, messageCoreData3.E());
                            enrrVar4.Y(cqpo.a, ((cqum) obj2).a());
                            ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "startDownloadForChatApi", 404, "ResumeRcsFileTransferAction.java")).q("Manual download successfully queued.");
                            return bavn.DOWNLOAD_START_SUCCESS;
                        }
                    }, resumeRcsFileTransferAction.f).e(cquo.class, new emwl() { // from class: bavj
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            ensk j3 = ResumeRcsFileTransferAction.a.j();
                            j3.Y(ente.a, "BugleDataModel");
                            enrr enrrVar4 = (enrr) ((enrr) j3).g((cquo) obj2);
                            MessageCoreData messageCoreData3 = MessageCoreData.this;
                            enrrVar4.Y(csux.b, messageCoreData3.B());
                            enrrVar4.Y(csux.f, messageCoreData3.E());
                            ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "startDownloadForChatApi", 415, "ResumeRcsFileTransferAction.java")).q("Cannot start manual download.");
                            return bavn.DOWNLOAD_START_FAILED;
                        }
                    }, resumeRcsFileTransferAction.f);
                }
                if (emxe.c(r)) {
                    ensk j3 = ResumeRcsFileTransferAction.a.j();
                    j3.Y(ente.a, "BugleDataModel");
                    enrr enrrVar4 = (enrr) j3;
                    enrrVar4.Y(csux.b, messageCoreData2.B());
                    enrrVar4.Y(csux.f, messageCoreData2.E());
                    ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeFileTransferAsyncForChatApi", 288, "ResumeRcsFileTransferAction.java")).q("File transfer bind data does not have transfer ID. Cannot resume file transfer.");
                    return elfo.e(bavn.NO_FILE_TRANSFER_BIND_DATA);
                }
                if (cqtk.UPLOAD.equals(cqrsVar.o())) {
                    ensk e2 = ResumeRcsFileTransferAction.a.e();
                    e2.Y(ente.a, "BugleDataModel");
                    enrr enrrVar5 = (enrr) e2;
                    enrrVar5.Y(csux.b, messageCoreData2.B());
                    enrrVar5.Y(csux.f, messageCoreData2.E());
                    enrrVar5.Y(cqpo.a, r);
                    ((enrr) enrrVar5.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeUploadForChatApi", 323, "ResumeRcsFileTransferAction.java")).q("Resuming upload.");
                    return resumeRcsFileTransferAction.j.b().b(r).h(new emwl() { // from class: bavk
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            enru enruVar = ResumeRcsFileTransferAction.a;
                            boolean equals = ((ckbx) obj2).equals(ckbx.i);
                            MessageCoreData messageCoreData3 = MessageCoreData.this;
                            String str = r;
                            if (equals) {
                                ensk j4 = ResumeRcsFileTransferAction.a.j();
                                j4.Y(ente.a, "BugleDataModel");
                                enrr enrrVar6 = (enrr) j4;
                                enrrVar6.Y(csux.b, messageCoreData3.B());
                                enrrVar6.Y(csux.f, messageCoreData3.E());
                                enrrVar6.Y(cqpo.a, str);
                                ((enrr) enrrVar6.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeUploadForChatApi", 335, "ResumeRcsFileTransferAction.java")).q("Resume upload successfully queued.");
                                return bavn.UPLOAD_RESUME_SUCCESS;
                            }
                            ensk e3 = ResumeRcsFileTransferAction.a.e();
                            e3.Y(ente.a, "BugleDataModel");
                            enrr enrrVar7 = (enrr) e3;
                            enrrVar7.Y(csux.b, messageCoreData3.B());
                            enrrVar7.Y(csux.f, messageCoreData3.E());
                            enrrVar7.Y(cqpo.a, str);
                            ((enrr) enrrVar7.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeUploadForChatApi", 343, "ResumeRcsFileTransferAction.java")).q("Resume upload not successfully queued.");
                            return bavn.UPLOAD_RESUME_FAILED;
                        }
                    }, resumeRcsFileTransferAction.f);
                }
                ensk e3 = ResumeRcsFileTransferAction.a.e();
                e3.Y(ente.a, "BugleDataModel");
                enrr enrrVar6 = (enrr) e3;
                enrrVar6.Y(csux.b, messageCoreData2.B());
                enrrVar6.Y(csux.f, messageCoreData2.E());
                enrrVar6.Y(cqpo.a, r);
                ((enrr) enrrVar6.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeDownloadForChatApi", 355, "ResumeRcsFileTransferAction.java")).q("Resuming download.");
                return resumeRcsFileTransferAction.j.a().c(r).h(new emwl() { // from class: bave
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cqum cqumVar = (cqum) obj2;
                        ensk e4 = ResumeRcsFileTransferAction.a.e();
                        e4.Y(ente.a, "BugleDataModel");
                        enrr enrrVar7 = (enrr) e4;
                        MessageCoreData messageCoreData3 = MessageCoreData.this;
                        enrrVar7.Y(csux.b, messageCoreData3.B());
                        enrrVar7.Y(csux.f, messageCoreData3.E());
                        enrrVar7.Y(cqpo.a, r);
                        ((enrr) enrrVar7.h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeDownloadForChatApi", 366, "ResumeRcsFileTransferAction.java")).q("Resume download successfully queued.");
                        return cqumVar != null ? bavn.DOWNLOAD_RESUME_SUCCESS : bavn.DOWNLOAD_RESUME_FAILED;
                    }
                }, resumeRcsFileTransferAction.f).e(cquo.class, new emwl() { // from class: bavf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ensk j4 = ResumeRcsFileTransferAction.a.j();
                        j4.Y(ente.a, "BugleDataModel");
                        enrr enrrVar7 = (enrr) j4;
                        MessageCoreData messageCoreData3 = MessageCoreData.this;
                        enrrVar7.Y(csux.b, messageCoreData3.B());
                        enrrVar7.Y(csux.f, messageCoreData3.E());
                        ((enrr) ((enrr) enrrVar7.g((cquo) obj2)).h("com/google/android/apps/messaging/shared/datamodel/action/ResumeRcsFileTransferAction", "resumeDownloadForChatApi", 383, "ResumeRcsFileTransferAction.java")).q("Cannot resume download for rcs file transfer.");
                        return bavn.DOWNLOAD_RESUME_FAILED;
                    }
                }, resumeRcsFileTransferAction.f);
            }
        }, this.e).h(new emwl() { // from class: bavc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bavn bavnVar = (bavn) obj;
                bavn bavnVar2 = bavn.NO_FILE_TRANSFER_BIND_DATA;
                boolean z = bavnVar.h;
                ResumeRcsFileTransferAction resumeRcsFileTransferAction = ResumeRcsFileTransferAction.this;
                MessageCoreData messageCoreData2 = messageCoreData;
                if (!z) {
                    if (bdjs.s(messageCoreData2.k())) {
                        resumeRcsFileTransferAction.d.c("Bugle.Rcs.Files.Transfer.Outgoing.Resumed.Counts");
                    }
                    return bavnVar;
                }
                Instant f = resumeRcsFileTransferAction.c.f();
                if (messageCoreData2.a() < ((Integer) baee.a.e()).intValue()) {
                    messageCoreData2.aX(f);
                } else {
                    messageCoreData2.bb(f.toEpochMilli());
                }
                bdmq bdmqVar = (bdmq) resumeRcsFileTransferAction.b.b();
                ConversationIdType z2 = messageCoreData2.z();
                MessageIdType B = messageCoreData2.B();
                String[] strArr = MessagesTable.a;
                buxr buxrVar = new buxr();
                buxrVar.ap("ResumeRcsFileTransferAction#updateMessageRow");
                buxrVar.U(messageCoreData2.k());
                buxrVar.O(messageCoreData2.r());
                buxrVar.D(messageCoreData2.n());
                buxrVar.t(messageCoreData2.l());
                bdmqVar.Q(z2, B, buxrVar);
                bajq.d(bbfp.c(messageCoreData2), resumeRcsFileTransferAction);
                return bavnVar;
            }
        }, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ResumeRcsFileTransferAction(ffbr ffbrVar, cqoh cqohVar, akzt akztVar, errl errlVar, errl errlVar2, cqos cqosVar, cqvy cqvyVar, ffbr ffbrVar2, ffbr ffbrVar3, awah awahVar, Parcel parcel) {
        super(parcel, eogt.RESUME_RCS_FILE_TRANSFER_ACTION);
        this.b = ffbrVar;
        this.c = cqohVar;
        this.d = akztVar;
        this.e = errlVar;
        this.f = errlVar2;
        this.j = cqosVar;
        this.g = cqvyVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.k = awahVar;
    }
}
