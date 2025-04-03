package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kez<V> implements ListenableFuture<V> {
    static final a b;
    private static final Object d;
    volatile d listeners;
    public volatile Object value;
    volatile h waiters;
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger c = Logger.getLogger(kez.class.getName());

    /* compiled from: PG */
    abstract class a {
        public abstract void a(h hVar, h hVar2);

        public abstract void b(h hVar, Thread thread);

        public abstract boolean c(kez kezVar, d dVar, d dVar2);

        public abstract boolean d(kez kezVar, Object obj, Object obj2);

        public abstract boolean e(kez kezVar, h hVar, h hVar2);
    }

    /* compiled from: PG */
    public final class b {
        static final b a;
        static final b b;
        public final boolean c;
        final Throwable d;

        static {
            if (kez.a) {
                b = null;
                a = null;
            } else {
                b = new b(false, null);
                a = new b(true, null);
            }
        }

        public b(boolean z, Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    /* compiled from: PG */
    final class c {
        static final c a = new c(new Throwable() { // from class: kez.c.1
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable b;

        public c(Throwable th) {
            kez.i(th);
            this.b = th;
        }
    }

    /* compiled from: PG */
    final class d {
        static final d a = new d(null, null);
        final Runnable b;
        final Executor c;
        d next;

        public d(Runnable runnable, Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    /* compiled from: PG */
    final class e extends a {
        final AtomicReferenceFieldUpdater<h, Thread> a;
        final AtomicReferenceFieldUpdater<h, h> b;
        final AtomicReferenceFieldUpdater<kez, h> c;
        final AtomicReferenceFieldUpdater<kez, d> d;
        final AtomicReferenceFieldUpdater<kez, Object> e;

        public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // kez.a
        public final void a(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // kez.a
        public final void b(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }

        @Override // kez.a
        public final boolean c(kez kezVar, d dVar, d dVar2) {
            return kfa.a(this.d, kezVar, dVar, dVar2);
        }

        @Override // kez.a
        public final boolean d(kez kezVar, Object obj, Object obj2) {
            return kfa.a(this.e, kezVar, obj, obj2);
        }

        @Override // kez.a
        public final boolean e(kez kezVar, h hVar, h hVar2) {
            return kfa.a(this.c, kezVar, hVar, hVar2);
        }
    }

    /* compiled from: PG */
    final class f<V> implements Runnable {
        final kez<V> a;
        final ListenableFuture<? extends V> b;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: PG */
    final class g extends a {
        @Override // kez.a
        public final void a(h hVar, h hVar2) {
            hVar.next = hVar2;
        }

        @Override // kez.a
        public final void b(h hVar, Thread thread) {
            hVar.thread = thread;
        }

        @Override // kez.a
        public final boolean c(kez kezVar, d dVar, d dVar2) {
            synchronized (kezVar) {
                if (kezVar.listeners != dVar) {
                    return false;
                }
                kezVar.listeners = dVar2;
                return true;
            }
        }

        @Override // kez.a
        public final boolean d(kez kezVar, Object obj, Object obj2) {
            synchronized (kezVar) {
                if (kezVar.value != obj) {
                    return false;
                }
                kezVar.value = obj2;
                return true;
            }
        }

        @Override // kez.a
        public final boolean e(kez kezVar, h hVar, h hVar2) {
            synchronized (kezVar) {
                if (kezVar.waiters != hVar) {
                    return false;
                }
                kezVar.waiters = hVar2;
                return true;
            }
        }
    }

    /* compiled from: PG */
    final class h {
        static final h a = new h(null);
        volatile h next;
        volatile Thread thread;

        public h(byte[] bArr) {
        }

        final void a(h hVar) {
            kez.b.a(this, hVar);
        }

        public h() {
            kez.b.b(this, Thread.currentThread());
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "next"), AtomicReferenceFieldUpdater.newUpdater(kez.class, h.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(kez.class, d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(kez.class, Object.class, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        b = gVar;
        if (th != null) {
            c.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        d = new Object();
    }

    protected kez() {
    }

    static Object a(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof kez) {
            Object obj = ((kez) listenableFuture).value;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            if (!bVar.c) {
                return obj;
            }
            Throwable th = bVar.d;
            return th != null ? new b(false, th) : b.b;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!a) && isCancelled) {
            return b.b;
        }
        try {
            Object c2 = c(listenableFuture);
            return c2 == null ? d : c2;
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new b(false, e2);
            }
            Objects.toString(listenableFuture);
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e2));
        } catch (ExecutionException e3) {
            return new c(e3.getCause());
        } catch (Throwable th2) {
            return new c(th2);
        }
    }

    static Object c(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    static void f(kez kezVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = kezVar.waiters;
            if (b.e(kezVar, hVar, h.a)) {
                while (hVar != null) {
                    Thread thread = hVar.thread;
                    if (thread != null) {
                        hVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.next;
                }
                kezVar.e();
                do {
                    dVar = kezVar.listeners;
                } while (!b.c(kezVar, dVar, d.a));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.next;
                    dVar3.next = dVar2;
                }
                while (dVar2 != null) {
                    Runnable runnable = dVar2.b;
                    d dVar4 = dVar2.next;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        kezVar = fVar.a;
                        if (kezVar.value == fVar) {
                            if (b.d(kezVar, fVar, a(fVar.b))) {
                                dVar3 = dVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        l(runnable, dVar2.c);
                    }
                    dVar2 = dVar4;
                }
                return;
            }
        }
    }

    static void i(Object obj) {
        obj.getClass();
    }

    private final String j(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private final void k(StringBuilder sb) {
        try {
            Object c2 = c(this);
            sb.append("SUCCESS, result=[");
            sb.append(j(c2));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private static void l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            c.log(Level.SEVERE, defpackage.a.j(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e2);
        }
    }

    private final void m(h hVar) {
        hVar.thread = null;
        while (true) {
            h hVar2 = this.waiters;
            if (hVar2 != h.a) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.next;
                    if (hVar2.thread != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.next = hVar4;
                        if (hVar3.thread == null) {
                            break;
                        }
                    } else if (!b.e(this, hVar2, hVar4)) {
                        break;
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object n(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).b);
        }
        if (obj == d) {
            return null;
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        i(runnable);
        i(executor);
        d dVar = this.listeners;
        if (dVar != d.a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.next = dVar;
                if (b.c(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.listeners;
                }
            } while (dVar != d.a);
        }
        l(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.value;
        if (!(obj instanceof f) && !(obj == null)) {
            return false;
        }
        b bVar = a ? new b(z, new CancellationException("Future.cancel() was called.")) : z ? b.a : b.b;
        kez<V> kezVar = this;
        boolean z2 = false;
        while (true) {
            if (b.d(kezVar, obj, bVar)) {
                f(kezVar);
                if (!(obj instanceof f)) {
                    break;
                }
                ListenableFuture<? extends V> listenableFuture = ((f) obj).b;
                if (!(listenableFuture instanceof kez)) {
                    listenableFuture.cancel(z);
                    break;
                }
                kezVar = (kez) listenableFuture;
                obj = kezVar.value;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = kezVar.value;
                if (!(obj instanceof f)) {
                    return z2;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String d() {
        Object obj = this.value;
        if (obj instanceof f) {
            return "setFuture=[" + j(((f) obj).b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final boolean g(Object obj) {
        if (obj == null) {
            obj = d;
        }
        if (!b.d(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return n(obj2);
        }
        h hVar = this.waiters;
        if (hVar != h.a) {
            h hVar2 = new h();
            do {
                hVar2.a(hVar);
                if (b.e(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return n(obj);
                }
                hVar = this.waiters;
            } while (hVar != h.a);
        }
        return n(this.value);
    }

    public final boolean h(Throwable th) {
        i(th);
        if (!b.d(this, null, new c(th))) {
            return false;
        }
        f(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.value != null) & (!(r0 instanceof f));
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            k(sb);
        } else {
            try {
                concat = d();
            } catch (RuntimeException e2) {
                Class<?> cls = e2.getClass();
                Objects.toString(cls);
                concat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            } else if (isDone()) {
                k(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof f))) {
                return n(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                h hVar = this.waiters;
                if (hVar != h.a) {
                    h hVar2 = new h();
                    do {
                        hVar2.a(hVar);
                        if (b.e(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof f))) {
                                        return n(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m(hVar2);
                        } else {
                            hVar = this.waiters;
                        }
                    } while (hVar != h.a);
                }
                return n(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) & (!(obj3 instanceof f))) {
                    return n(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String kezVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(defpackage.a.w(kezVar, str, " for "));
        }
        throw new InterruptedException();
    }

    protected void e() {
    }
}
