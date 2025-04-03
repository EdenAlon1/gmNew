package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecse extends ThreadLocal {
    final /* synthetic */ ecsf a;

    public ecse(ecsf ecsfVar) {
        this.a = ecsfVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        long id = Thread.currentThread().getId();
        ecrv ecrvVar = new ecrv(Looper.myLooper() == Looper.getMainLooper() ? "UI Thread" : "Thread: ".concat(String.valueOf(Thread.currentThread().getName())), id, 1);
        ArrayDeque arrayDeque = new ArrayDeque();
        ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceData$1", "initialValue", 62, "TraceData.java")).A("Instantiate thread-data, thread:%d name:%s", id, ecrvVar.b);
        arrayDeque.push(ecrvVar);
        this.a.a.incrementAndGet();
        this.a.c.put(ecrvVar, arrayDeque);
        return new WeakReference(arrayDeque);
    }
}
