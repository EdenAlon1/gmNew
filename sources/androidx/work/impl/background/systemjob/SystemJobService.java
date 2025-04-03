package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.Log;
import defpackage.a;
import defpackage.ppt;
import defpackage.pre;
import defpackage.prh;
import defpackage.prv;
import defpackage.psb;
import defpackage.psd;
import defpackage.pse;
import defpackage.ptc;
import defpackage.pte;
import defpackage.pxs;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements prh {
    private static final String a = ppt.d("SystemJobService");
    private pte b;
    private final Map c = new HashMap();
    private final pse d = psd.a(false);
    private ptc e;

    private static pxs b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new pxs(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private static void c(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a.a(str, "Cannot invoke ", " on a background thread"));
        }
    }

    @Override // defpackage.prh
    public final void a(pxs pxsVar, boolean z) {
        c("onExecuted");
        ppt.c().a(a, pxsVar.a.concat(" executed on JobScheduler"));
        JobParameters jobParameters = (JobParameters) this.c.remove(pxsVar);
        this.d.a(pxsVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            pte m = pte.m(getApplicationContext());
            this.b = m;
            prv prvVar = m.g;
            this.e = new ptc(prvVar, m.m);
            prvVar.c(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            ppt.c();
            Log.w(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        pte pteVar = this.b;
        if (pteVar != null) {
            pteVar.g.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Uri[] triggeredContentUris;
        String[] triggeredContentAuthorities;
        String[] triggeredContentAuthorities2;
        Uri[] triggeredContentUris2;
        c("onStartJob");
        if (this.b == null) {
            ppt.c().a(a, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        pxs b = b(jobParameters);
        if (b == null) {
            ppt.c();
            Log.e(a, "WorkSpec id not found!");
            return false;
        }
        if (this.c.containsKey(b)) {
            ppt c = ppt.c();
            String str = a;
            Objects.toString(b);
            c.a(str, "Job is already being executed by SystemJobService: ".concat(b.toString()));
            return false;
        }
        ppt c2 = ppt.c();
        String str2 = a;
        Objects.toString(b);
        c2.a(str2, "onStartJob for ".concat(b.toString()));
        this.c.put(b, jobParameters);
        pre preVar = new pre();
        triggeredContentUris = jobParameters.getTriggeredContentUris();
        if (triggeredContentUris != null) {
            triggeredContentUris2 = jobParameters.getTriggeredContentUris();
            preVar.a = Arrays.asList(triggeredContentUris2);
        }
        triggeredContentAuthorities = jobParameters.getTriggeredContentAuthorities();
        if (triggeredContentAuthorities != null) {
            triggeredContentAuthorities2 = jobParameters.getTriggeredContentAuthorities();
            Arrays.asList(triggeredContentAuthorities2);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            jobParameters.getNetwork();
        }
        this.e.b(this.d.b(b), preVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        int stopReason;
        c("onStopJob");
        if (this.b == null) {
            ppt.c().a(a, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        pxs b = b(jobParameters);
        if (b == null) {
            ppt.c();
            Log.e(a, "WorkSpec id not found!");
            return false;
        }
        ppt c = ppt.c();
        String str = a;
        Objects.toString(b);
        c.a(str, "onStopJob for ".concat(b.toString()));
        this.c.remove(b);
        psb a2 = this.d.a(b);
        if (a2 != null) {
            int i = -512;
            if (Build.VERSION.SDK_INT >= 31) {
                stopReason = jobParameters.getStopReason();
                switch (stopReason) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        i = stopReason;
                        break;
                }
            }
            this.e.c(a2, i);
        }
        prv prvVar = this.b.g;
        String str2 = b.a;
        synchronized (prvVar.j) {
            contains = prvVar.h.contains(str2);
        }
        return !contains;
    }
}
