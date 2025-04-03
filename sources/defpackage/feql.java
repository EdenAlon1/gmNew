package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feql extends WeakReference {
    public static final /* synthetic */ int b = 0;
    private static final boolean c = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException d;
    public final AtomicBoolean a;
    private final ReferenceQueue e;
    private final ConcurrentMap f;
    private final String g;
    private final Reference h;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        d = runtimeException;
    }

    public feql(feqm feqmVar, feau feauVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(feqmVar, referenceQueue);
        this.a = new AtomicBoolean();
        this.h = new SoftReference(c ? new RuntimeException("ManagedChannel allocation site") : d);
        this.g = feauVar.toString();
        this.e = referenceQueue;
        this.f = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    static void a(ReferenceQueue referenceQueue) {
        while (true) {
            feql feqlVar = (feql) referenceQueue.poll();
            if (feqlVar == null) {
                return;
            }
            RuntimeException runtimeException = (RuntimeException) feqlVar.h.get();
            feqlVar.b();
            if (!feqlVar.a.get()) {
                Level level = Level.SEVERE;
                if (feqm.b.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(feqm.b.getName());
                    logRecord.setParameters(new Object[]{feqlVar.g});
                    logRecord.setThrown(runtimeException);
                    feqm.b.log(logRecord);
                }
            }
        }
    }

    private final void b() {
        super.clear();
        this.f.remove(this);
        this.h.clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        b();
        a(this.e);
    }
}
