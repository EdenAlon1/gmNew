package defpackage;

import j$.time.Instant;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duoa implements Runnable {
    public final dunv a;
    final /* synthetic */ duob b;
    private final Runnable c;
    private final String d;
    private final long e;

    public duoa(duob duobVar, Runnable runnable, int i) {
        this.b = duobVar;
        this.c = runnable;
        String str = runnable.getClass().getSimpleName() + "@" + Long.toHexString(System.identityHashCode(runnable)) + "/" + i;
        this.d = str;
        this.e = System.nanoTime();
        dunv dunvVar = new dunv(str, duobVar.getQueue().size(), Instant.now().toEpochMilli());
        this.a = dunvVar;
        duobVar.b.a(dunvVar);
        ((enrr) ((enrr) duob.a.g()).h("com/google/android/libraries/inputmethod/concurrent/ThreadPoolExecutorWrapper$RecordingRunnable", "<init>", 123, "ThreadPoolExecutorWrapper.java")).t("Enqueue: %s", dunvVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        long nanoTime = System.nanoTime();
        duny dunyVar = new duny(currentThread.getName(), this.d, this.b.getQueue().size(), Instant.now().toEpochMilli(), nanoTime - this.e);
        this.b.b.a(dunyVar);
        duob duobVar = this.b;
        dunr dunrVar = duobVar.c;
        if (dunrVar != null) {
            dunrVar.c.put(this, dunrVar.b.schedule(new dunq(this.a, dunyVar, duobVar, dunrVar.d), 60000L, TimeUnit.MILLISECONDS));
        }
        ((enrr) ((enrr) duob.a.g()).h("com/google/android/libraries/inputmethod/concurrent/ThreadPoolExecutorWrapper$RecordingRunnable", "run", 141, "ThreadPoolExecutorWrapper.java")).t("Start: %s", dunyVar);
        try {
            this.c.run();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        Throwable th2 = th;
        dunw dunwVar = new dunw(currentThread.getName(), this.d, this.b.getQueue().size(), Instant.now().toEpochMilli(), System.nanoTime() - nanoTime, th2);
        this.b.b.a(dunwVar);
        dunr dunrVar2 = this.b.c;
        if (dunrVar2 != null) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) dunrVar2.c.remove(this);
            if (scheduledFuture == null) {
                ((enrr) dunr.a.a(duwj.a).h("com/google/android/libraries/inputmethod/concurrent/StalledTaskDetector", "onFinish", 123, "StalledTaskDetector.java")).q("Finished runnable is not registered (unregistered twice?");
            } else {
                scheduledFuture.cancel(false);
            }
        }
        ((enrr) ((enrr) duob.a.g()).h("com/google/android/libraries/inputmethod/concurrent/ThreadPoolExecutorWrapper$RecordingRunnable", "run", 163, "ThreadPoolExecutorWrapper.java")).t("Finish: %s", dunwVar);
        if (th2 != null) {
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
        }
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.a(this.d);
        b.a(this.c);
        return b.toString();
    }
}
