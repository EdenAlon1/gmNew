package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bcxk extends cslh {
    final /* synthetic */ bcvr a;
    final /* synthetic */ String b;
    final /* synthetic */ PendingAttachmentData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcxk(PendingAttachmentData pendingAttachmentData, long j, bcvr bcvrVar, String str) {
        super("Bugle.Async.PendingAttachmentData.loadAttachmentForDraft.Duration", j, true);
        this.a = bcvrVar;
        this.b = str;
        this.c = pendingAttachmentData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
    
        if ("mms".equals(r6) != false) goto L36;
     */
    @Override // defpackage.cslh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* synthetic */ java.lang.Object a(java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcxk.a(java.lang.Object[]):java.lang.Object");
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        final MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
        if (this.c.l != this || isCancelled()) {
            return;
        }
        this.c.l = null;
        if (messagePartCoreData == null) {
            this.c.k = 3;
            if (this.a.j(this.b)) {
                this.a.f.fs();
                this.a.an(this.c);
                return;
            }
            return;
        }
        PendingAttachmentData pendingAttachmentData = this.c;
        pendingAttachmentData.k = 2;
        messagePartCoreData.an(pendingAttachmentData.h);
        if (!this.a.j(this.b)) {
            messagePartCoreData.ak();
            return;
        }
        final bcvr bcvrVar = this.a;
        PendingAttachmentData pendingAttachmentData2 = this.c;
        for (PendingAttachmentData pendingAttachmentData3 : bcvrVar.t) {
            if (pendingAttachmentData3.bH(pendingAttachmentData2)) {
                Uri t = pendingAttachmentData3.t();
                int i = 0;
                while (true) {
                    if (i >= bcvrVar.v.size()) {
                        i = -1;
                        break;
                    } else if (((MessagePartCoreData) bcvrVar.v.get(i)).bG(t)) {
                        break;
                    } else {
                        i++;
                    }
                }
                bcvrVar.t.remove(pendingAttachmentData2);
                if (pendingAttachmentData2.bk()) {
                    messagePartCoreData.aJ(pendingAttachmentData2.p());
                    messagePartCoreData.az(pendingAttachmentData2.Y());
                }
                bcvrVar.r.add(messagePartCoreData);
                bcvrVar.v.set(i, messagePartCoreData);
                if (bcvrVar.ah(messagePartCoreData)) {
                    elfo.f(new Runnable() { // from class: bcuq
                        @Override // java.lang.Runnable
                        public final void run() {
                            MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                            ContentType e = awuq.e(messagePartCoreData2.V());
                            ensk h = bcvr.a.h();
                            h.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/data/DraftMessageData", "updatePendingAttachment", 1530, "DraftMessageData.java")).D("Original content type: %s. Converted to %s", messagePartCoreData2.V(), e);
                            cbit cbitVar = (cbit) bcvr.this.G.b();
                            Uri t2 = messagePartCoreData2.t();
                            t2.getClass();
                            cbitVar.a(t2, r2.C.b(-1), e);
                        }
                    }, (Executor) bcvrVar.H.b());
                }
                bcvrVar.J(1);
                return;
            }
        }
        messagePartCoreData.ak();
    }

    @Override // android.os.AsyncTask
    protected final void onCancelled() {
        PendingAttachmentData pendingAttachmentData = this.c;
        if (pendingAttachmentData.l != this) {
            return;
        }
        pendingAttachmentData.l = null;
        PendingAttachmentData.i.r("Timeout while retrieving media.");
        this.c.k = 3;
        if (this.a.j(this.b)) {
            this.a.an(this.c);
        }
    }
}
