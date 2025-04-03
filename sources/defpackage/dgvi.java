package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgvi {
    private static final long a = TimeUnit.MINUTES.toMillis(15);

    public static void a(Context context, JobParameters jobParameters) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        PersistableBundle persistableBundle = new PersistableBundle(jobParameters.getExtras());
        persistableBundle.putLong("debug_rescheduled_because_non_idle", System.currentTimeMillis());
        long j = persistableBundle.getLong("non_idle_retry_minimum_latency_ms", a);
        JobInfo.Builder minimumLatency = new JobInfo.Builder(jobParameters.getJobId(), new ComponentName(context, "com.google.android.gms.learning.internal.training.InAppJobService")).setRequiredNetworkType(persistableBundle.getInt("job_info_required_network_type", 2)).setRequiresDeviceIdle(persistableBundle.getInt("job_info_requires_device_idle", 1) == 1).setRequiresCharging(persistableBundle.getInt("job_info_requires_charging", 1) == 1).setExtras(persistableBundle).setMinimumLatency(j);
        long j2 = persistableBundle.getLong("job_info_override_deadline_ms", 0L);
        if (j2 > 0) {
            minimumLatency.setOverrideDeadline(j2);
        }
        if (koa.c(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0) {
            minimumLatency.setPersisted(persistableBundle.getInt("job_info_persisted", 1) == 1);
        }
        if (jobScheduler.schedule(minimumLatency.build()) != 1) {
            if (Log.isLoggable("brella.InAppJobSvc", 5)) {
                Log.w("brella.InAppJobSvc", "Failed to reschedule job " + jobParameters.getJobId());
                return;
            }
            return;
        }
        if (Log.isLoggable("brella.InAppJobSvc", 3)) {
            Log.d("brella.InAppJobSvc", "Rescheduled job " + jobParameters.getJobId() + " to run again in " + j + "ms");
        }
    }
}
