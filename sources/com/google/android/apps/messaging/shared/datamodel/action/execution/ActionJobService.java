package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.app.job.JobParameters;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionJobService;
import defpackage.bbbz;
import defpackage.bbci;
import defpackage.bbcj;
import defpackage.bbdv;
import defpackage.bbeh;
import defpackage.csix;
import defpackage.cskc;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ActionJobService extends bbeh {
    private static final cskc d = cskc.g("BugleDataModel", "ActionJobService");
    public bbdv a;
    public elbx b;
    public ffbr c;

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        ekzm b = this.b.b("ActionJobService::StartJob");
        try {
            Action d2 = this.a.d(jobParameters.getExtras());
            boolean z = false;
            if (d2 == null) {
                jobFinished(jobParameters, false);
                csix.c("failed to unparcel scheduled Action");
            } else {
                bbcj bbcjVar = new bbcj(d2.s, jobParameters.getJobId(), new bbci() { // from class: bbcx
                    @Override // defpackage.bbci
                    public final void a() {
                        ActionJobService.this.jobFinished(jobParameters, false);
                    }
                }, null, true);
                bbcjVar.b = toString();
                try {
                    ((bbbz) this.c.b()).a(bbcjVar, d2);
                    z = true;
                } catch (RuntimeException e) {
                    d.o("RuntimeException when starting job.", e);
                }
            }
            b.close();
            return z;
        } finally {
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        ekzm b = this.b.b("ActionJobService::StopJob");
        try {
            ((bbbz) this.c.b()).c(jobParameters.getJobId());
            b.close();
            return false;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
