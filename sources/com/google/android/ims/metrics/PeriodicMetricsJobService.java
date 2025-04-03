package com.google.android.ims.metrics;

import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.dipo;
import defpackage.djit;
import defpackage.dkty;
import defpackage.errl;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class PeriodicMetricsJobService extends JobService {
    public static final /* synthetic */ int d = 0;
    public ffbr a;
    public ffbr b;
    ffbr c;

    @Override // android.app.Service
    public final void onCreate() {
        djit djitVar = new djit(dipo.a(this));
        this.a = djitVar.b;
        this.b = djitVar.c;
        this.c = djitVar.d;
        super.onCreate();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        dkty.o("Reporting periodic metrics.", new Object[0]);
        if (jobParameters.getJobId() != 30000) {
            dkty.q("Periodic metrics service started with unexpected job ID! Ignoring!", new Object[0]);
            jobFinished(jobParameters, false);
            return false;
        }
        ((errl) this.c.b()).submit(new Runnable() { // from class: djiu
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x0110, code lost:
            
                if (r2.equals("DisabledState") != false) goto L107;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 874
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.djiu.run():void");
            }
        });
        jobFinished(jobParameters, false);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
