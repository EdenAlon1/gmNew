package defpackage;

import com.google.android.apps.messaging.shared.reportissue.ReportIssueReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnne implements erqj {
    final /* synthetic */ ephx a;
    final /* synthetic */ ReportIssueReceiver b;

    public cnne(ReportIssueReceiver reportIssueReceiver, ephx ephxVar) {
        this.a = ephxVar;
        this.b = reportIssueReceiver;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((alsi) this.b.e.b()).a(this.a);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ReportIssueReceiver.a.s("Failed to start feedback from ReportIssueReceiver", th);
    }
}
