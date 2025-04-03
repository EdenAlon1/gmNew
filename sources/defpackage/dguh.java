package defpackage;

import android.app.job.JobParameters;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dguh implements erqj {
    final /* synthetic */ JobParameters a;
    final /* synthetic */ dgui b;

    public dguh(dgui dguiVar, JobParameters jobParameters) {
        this.a = jobParameters;
        this.b = dguiVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.jobFinished(this.a, false);
    }

    @Override // defpackage.erqj
    public final void hx(final Throwable th) {
        if (!(th instanceof dgux)) {
            dgui dguiVar = this.b;
            dguiVar.a(dguiVar.getApplicationContext()).c.execute(new Runnable() { // from class: dgug
                @Override // java.lang.Runnable
                public final void run() {
                    throw new ersm(th);
                }
            });
        } else if (Log.isLoggable("ExampleStrDataTtlSvc", 4)) {
            Log.i("ExampleStrDataTtlSvc", "Unactionable SQLite exception", th);
        }
    }
}
