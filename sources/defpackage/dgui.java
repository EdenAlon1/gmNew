package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.util.Log;
import j$.time.Instant;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dgui extends JobService {
    public static final long a = TimeUnit.DAYS.toMillis(1);

    protected abstract dgur a(Context context);

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (Log.isLoggable("ExampleStrDataTtlSvc", 3)) {
            Log.d("ExampleStrDataTtlSvc", "onStartJob");
        }
        dgur a2 = a(this);
        final long millis = TimeUnit.DAYS.toMillis(30L);
        erqt.r(a2.b.a(new emwl() { // from class: dgun
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dguv dguvVar = (dguv) obj;
                dlpw dlpwVar = dguvVar.b;
                long epochMilli = Instant.now().toEpochMilli() - millis;
                dguw.b(String.format("Cleared %s records older than %s", Integer.valueOf(dguvVar.a.delete("collections", a.s(epochMilli, "time< "), new String[0])), SimpleDateFormat.getDateTimeInstance().format(new Date(epochMilli))));
                return null;
            }
        }), new dguh(this, jobParameters), erpp.a);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        if (!Log.isLoggable("ExampleStrDataTtlSvc", 3)) {
            return true;
        }
        Log.d("ExampleStrDataTtlSvc", "onStopJob");
        return true;
    }
}
