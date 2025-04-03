package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.ditto.workers.PreUploadAttachmentsRecurringWorker;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzoq {
    private static final cskc a = cskc.g("BugleJobs", "PreUploadAttachmentsWorkerScheduler");
    private final Context b;

    public bzoq(Context context) {
        this.b = context;
    }

    public final void a() {
        a.m("Canceling pre-upload jobs.");
        pqr.a(this.b).a("pre_upload_attachments_recurring_worker_unique");
        pqr.a(this.b).a("pre_upload_attachments_recurring_worker");
    }

    public final void b() {
        pqr.a(this.b).a("pre_upload_attachments_recurring_worker");
        a.m("Scheduling pre-upload jobs.");
        Context context = this.b;
        pqs a2 = pqr.a(context);
        poz pozVar = poz.KEEP;
        Duration duration = PreUploadAttachmentsRecurringWorker.e;
        ((PreUploadAttachmentsRecurringWorker.b) ekhw.a(context, PreUploadAttachmentsRecurringWorker.b.class)).iy().a();
        pqh pqhVar = new pqh(PreUploadAttachmentsRecurringWorker.class, PreUploadAttachmentsRecurringWorker.e);
        pqhVar.d("pre_upload_attachments_recurring_worker_unique");
        poh pohVar = new poh();
        pohVar.c(3);
        pohVar.c = true;
        pohVar.b = true;
        pqhVar.g(pohVar.a());
        a2.f("pre_upload_attachments_worker_unique_name", pozVar, (pqi) pqhVar.b());
    }
}
