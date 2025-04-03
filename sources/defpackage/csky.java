package defpackage;

import android.os.AsyncTask;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class csky {
    static {
        long j = cslb.e;
    }

    public static Executor a() {
        return csix.n() ? erpp.a : AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public static void b(cslb cslbVar, RejectedExecutionException rejectedExecutionException) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS aa", Locale.US);
        StringBuilder sb = new StringBuilder();
        synchronized (cslb.f) {
            String format = cslb.f.containsKey(cslbVar) ? simpleDateFormat.format(new Date(((Long) cslb.f.get(cslbVar)).longValue())) : "unknown time";
            ensk i = csla.a.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i).g(rejectedExecutionException)).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncExecutable", "dumpCrashInfo", 85, "SafeAsyncExecutable.java")).D("Failed to run %s, enqueued for execution at %s", cslbVar, format);
            sb.append("\nTHREAD_POOL_EXECUTOR executing list and enqueuing times: ");
            sb.append(cslb.f.size());
            sb.append(" tasks(s) or runnable(s)");
            for (Object obj : cslb.f.keySet()) {
                csjy.r(sb, String.format("\n %s, %s", obj, simpleDateFormat.format(new Date(((Long) cslb.f.get(obj)).longValue()))), "\nTHREAD_POOL_EXECUTOR executing list (continued):");
            }
        }
        csjy.i("Bugle", sb.toString());
        sb.setLength(0);
        BlockingQueue<Runnable> queue = ((ThreadPoolExecutor) AsyncTask.THREAD_POOL_EXECUTOR).getQueue();
        synchronized (queue) {
            sb.append("THREAD_POOL_EXECUTOR queued list: ");
            sb.append(queue.size());
            sb.append(" runnable(s)");
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                csjy.r(sb, "\n " + String.valueOf((Runnable) it.next()), "\nTHREAD_POOL_EXECUTOR queued list (continued):");
            }
        }
        csjy.i("Bugle", sb.toString());
    }
}
