package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import defpackage.altk;
import defpackage.asqx;
import defpackage.baee;
import defpackage.bajq;
import defpackage.bane;
import defpackage.bbfm;
import defpackage.bbfp;
import defpackage.bbgg;
import defpackage.bdhg;
import defpackage.bdvi;
import defpackage.cins;
import defpackage.cisl;
import defpackage.ckam;
import defpackage.cqoh;
import defpackage.crga;
import defpackage.csix;
import defpackage.csux;
import defpackage.ctvb;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.emxe;
import defpackage.emyl;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eogt;
import defpackage.epxv;
import defpackage.epyb;
import defpackage.eyfc;
import defpackage.eyjv;
import defpackage.ffbr;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ProcessFileTransferAction extends Action<Void> {
    public final bbgg b;
    public final ffbr c;
    public final ffbr d;
    public final cqoh e;
    public final altk f;
    public final ctvb g;
    public final Optional h;
    public final ffbr i;
    private final cisl j;
    private final bdvi k;
    private final dtuu l;
    private final crga m;
    private final ffbr n;
    private final ffbr o;
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/action/ProcessFileTransferAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bane();

    /* compiled from: PG */
    public interface a {
        bbfm bf();
    }

    /* compiled from: PG */
    public interface b {
        cins cb();
    }

    public ProcessFileTransferAction(bdvi bdviVar, bbgg bbggVar, cisl cislVar, ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar, altk altkVar, ctvb ctvbVar, dtuu dtuuVar, Optional optional, crga crgaVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, Event event) {
        super(eogt.PROCESS_FILE_TRANSFER_ACTION);
        this.k = bdviVar;
        this.b = bbggVar;
        this.j = cislVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = cqohVar;
        this.f = altkVar;
        this.g = ctvbVar;
        this.l = dtuuVar;
        this.h = optional;
        this.m = crgaVar;
        this.i = ffbrVar3;
        this.o = ffbrVar4;
        this.n = ffbrVar5;
        if (event instanceof FileTransferEvent) {
            this.t.t("key_rcs_file_transfer_event", event);
        } else {
            csix.c("ProcessFileTransferAction: unexpected event ".concat(event.toString()));
        }
    }

    public static boolean l(MessageCoreData messageCoreData, long j) {
        int i = (int) j;
        return (i == 11 || i == 201 || i == 202 || messageCoreData.a() >= ((Integer) baee.a.e()).intValue()) ? false : true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ProcessFileTransferAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        final FileTransferEvent fileTransferEvent = (FileTransferEvent) this.t.h("key_rcs_file_transfer_event");
        ekzz f = eleg.f("ProcessFileTransferAction.executeAction");
        try {
            final bdhg a2 = bdhg.a(fileTransferEvent.a);
            MessageCoreData messageCoreData = (MessageCoreData) ((Optional) this.l.c("ProcessFileTransferAction#processResult", new emyl() { // from class: band
                /* JADX WARN: Code restructure failed: missing block: B:50:0x0152, code lost:
                
                    if (r1 != r2.k()) goto L56;
                 */
                @Override // defpackage.emyl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object get() {
                    /*
                        Method dump skipped, instructions count: 809
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.band.get():java.lang.Object");
                }
            })).orElse(null);
            if (messageCoreData != null) {
                ConversationIdType z = messageCoreData.z();
                int d = messageCoreData.d();
                if (messageCoreData.cD()) {
                    this.j.d();
                }
                if (messageCoreData.cD()) {
                    this.k.d(z, false, 0, d, h(messageCoreData), !messageCoreData.cK());
                }
                String aw = messageCoreData.aw();
                ensk h = a.h();
                h.Y(ente.a, "BugleDataModel");
                enrr enrrVar = (enrr) h;
                enrrVar.Y(csux.p, z);
                enrrVar.Y(csux.b, messageCoreData.B());
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/ProcessFileTransferAction", "processResult", 292, "ProcessFileTransferAction.java")).N("process Result. %s %s. eventCode: %d, retryAfter: %s, status: %s, info: %d, autoRetryCounter: %d.", messageCoreData.an(), emxe.b(aw), Integer.valueOf(fileTransferEvent.h), fileTransferEvent.b, messageCoreData.aC(), Long.valueOf(fileTransferEvent.i), Integer.valueOf(messageCoreData.a()));
                if (!messageCoreData.dd() && !messageCoreData.cz()) {
                    bajq.e(bbfp.c(messageCoreData), fileTransferEvent.b, this);
                }
            }
            f.close();
            return null;
        } finally {
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessFileTransfer.ExecuteAction.Latency";
    }

    public final int h(MessageCoreData messageCoreData) {
        if (!((asqx) this.o.b()).a()) {
            return -1;
        }
        return ((ckam) this.n.b()).a(messageCoreData.w());
    }

    public final void k(MessageCoreData messageCoreData) {
        this.m.b(messageCoreData, !this.t.x("key_failed_file_transfer_diagnostics") ? epyb.a : (epyb) ((eyjv) this.t.h("key_failed_file_transfer_diagnostics")).a(epyb.a, eyfc.a()), !this.t.x("key_failed_file_transfer_details") ? epxv.a : (epxv) ((eyjv) this.t.h("key_failed_file_transfer_details")).a(epxv.a, eyfc.a()), Optional.empty());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ProcessFileTransferAction(bdvi bdviVar, bbgg bbggVar, cisl cislVar, ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar, altk altkVar, ctvb ctvbVar, dtuu dtuuVar, Optional optional, ffbr ffbrVar3, crga crgaVar, ffbr ffbrVar4, ffbr ffbrVar5, Parcel parcel) {
        super(parcel, eogt.PROCESS_FILE_TRANSFER_ACTION);
        this.k = bdviVar;
        this.b = bbggVar;
        this.j = cislVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = cqohVar;
        this.f = altkVar;
        this.g = ctvbVar;
        this.l = dtuuVar;
        this.h = optional;
        this.i = ffbrVar3;
        this.m = crgaVar;
        this.o = ffbrVar4;
        this.n = ffbrVar5;
    }
}
