package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ernr;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
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
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ernr<V> extends erso implements ListenableFuture<V> {
    private static final Object a;
    static final boolean k;
    static final erri l;
    public static final a m;
    public volatile e listeners;
    public volatile Object value;
    public volatile k waiters;

    /* compiled from: PG */
    abstract class a {
        public abstract e a(ernr ernrVar, e eVar);

        public abstract k b(ernr ernrVar, k kVar);

        public abstract void c(k kVar, k kVar2);

        public abstract void d(k kVar, Thread thread);

        public abstract boolean e(ernr ernrVar, e eVar, e eVar2);

        public abstract boolean f(ernr ernrVar, Object obj, Object obj2);

        public abstract boolean g(ernr ernrVar, k kVar, k kVar2);
    }

    /* compiled from: PG */
    final class b extends a {
        private static final AtomicReferenceFieldUpdater<k, Thread> a = AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<k, k> b = AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "next");
        private static final AtomicReferenceFieldUpdater<? super ernr<?>, k> c;
        private static final AtomicReferenceFieldUpdater<? super ernr<?>, e> d;
        private static final AtomicReferenceFieldUpdater<? super ernr<?>, Object> e;

        static {
            a aVar = ernr.m;
            c = AtomicReferenceFieldUpdater.newUpdater(ernr.class, k.class, "waiters");
            d = AtomicReferenceFieldUpdater.newUpdater(ernr.class, e.class, "listeners");
            e = AtomicReferenceFieldUpdater.newUpdater(ernr.class, Object.class, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE);
        }

        @Override // ernr.a
        public final e a(ernr ernrVar, e eVar) {
            return d.getAndSet(ernrVar, eVar);
        }

        @Override // ernr.a
        public final k b(ernr ernrVar, k kVar) {
            return c.getAndSet(ernrVar, kVar);
        }

        @Override // ernr.a
        public final void c(k kVar, k kVar2) {
            b.lazySet(kVar, kVar2);
        }

        @Override // ernr.a
        public final void d(k kVar, Thread thread) {
            a.lazySet(kVar, thread);
        }

        @Override // ernr.a
        public final boolean e(ernr ernrVar, e eVar, e eVar2) {
            return erns.a(d, ernrVar, eVar, eVar2);
        }

        @Override // ernr.a
        public final boolean f(ernr ernrVar, Object obj, Object obj2) {
            return erns.a(e, ernrVar, obj, obj2);
        }

        @Override // ernr.a
        public final boolean g(ernr ernrVar, k kVar, k kVar2) {
            return erns.a(c, ernrVar, kVar, kVar2);
        }
    }

    /* compiled from: PG */
    final class c {
        static final c a;
        static final c b;
        final boolean c;
        final Throwable d;

        static {
            if (ernr.k) {
                b = null;
                a = null;
            } else {
                b = new c(false, null);
                a = new c(true, null);
            }
        }

        public c(boolean z, Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    /* compiled from: PG */
    final class d {
        static final d a = new d(new Throwable() { // from class: ernr.d.1
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable b;

        public d(Throwable th) {
            th.getClass();
            this.b = th;
        }
    }

    /* compiled from: PG */
    final class e {
        static final e a = new e();
        final Runnable b;
        final Executor c;
        e next;

        public e() {
            this.b = null;
            this.c = null;
        }

        public e(Runnable runnable, Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    /* compiled from: PG */
    final class f<V> implements Runnable {
        final ernr<V> a;
        final ListenableFuture<? extends V> b;

        public f(ernr ernrVar, ListenableFuture listenableFuture) {
            this.a = ernrVar;
            this.b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = ernr.m;
            if (this.a.value != this) {
                return;
            }
            ListenableFuture<? extends V> listenableFuture = this.b;
            if (ernr.m.f(this.a, this, ernr.h(listenableFuture))) {
                ernr.j(this.a, false);
            }
        }
    }

    /* compiled from: PG */
    final class g extends a {
        @Override // ernr.a
        public final e a(ernr ernrVar, e eVar) {
            e eVar2;
            synchronized (ernrVar) {
                eVar2 = ernrVar.listeners;
                if (eVar2 != eVar) {
                    ernrVar.listeners = eVar;
                }
            }
            return eVar2;
        }

        @Override // ernr.a
        public final k b(ernr ernrVar, k kVar) {
            k kVar2;
            synchronized (ernrVar) {
                kVar2 = ernrVar.waiters;
                if (kVar2 != kVar) {
                    ernrVar.waiters = kVar;
                }
            }
            return kVar2;
        }

        @Override // ernr.a
        public final void c(k kVar, k kVar2) {
            kVar.next = kVar2;
        }

        @Override // ernr.a
        public final void d(k kVar, Thread thread) {
            kVar.thread = thread;
        }

        @Override // ernr.a
        public final boolean e(ernr ernrVar, e eVar, e eVar2) {
            synchronized (ernrVar) {
                if (ernrVar.listeners != eVar) {
                    return false;
                }
                ernrVar.listeners = eVar2;
                return true;
            }
        }

        @Override // ernr.a
        public final boolean f(ernr ernrVar, Object obj, Object obj2) {
            synchronized (ernrVar) {
                if (ernrVar.value != obj) {
                    return false;
                }
                ernrVar.value = obj2;
                return true;
            }
        }

        @Override // ernr.a
        public final boolean g(ernr ernrVar, k kVar, k kVar2) {
            synchronized (ernrVar) {
                if (ernrVar.waiters != kVar) {
                    return false;
                }
                ernrVar.waiters = kVar2;
                return true;
            }
        }
    }

    /* compiled from: PG */
    interface h<V> extends ListenableFuture<V> {
    }

    /* compiled from: PG */
    public abstract class i<V> extends ernr<V> implements h<V> {
    }

    /* compiled from: PG */
    final class j extends a {
        static final Unsafe a;
        static final long b;
        static final long c;
        static final long d;
        static final long e;
        static final long f;
        public static final /* synthetic */ int g = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ernu
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() {
                        int i = ernr.j.g;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                c = unsafe.objectFieldOffset(ernr.class.getDeclaredField("waiters"));
                b = unsafe.objectFieldOffset(ernr.class.getDeclaredField("listeners"));
                d = unsafe.objectFieldOffset(ernr.class.getDeclaredField(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE));
                e = unsafe.objectFieldOffset(k.class.getDeclaredField("thread"));
                f = unsafe.objectFieldOffset(k.class.getDeclaredField("next"));
                a = unsafe;
            } catch (NoSuchFieldException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // ernr.a
        public final e a(ernr ernrVar, e eVar) {
            e eVar2;
            do {
                eVar2 = ernrVar.listeners;
                if (eVar == eVar2) {
                    break;
                }
            } while (!e(ernrVar, eVar2, eVar));
            return eVar2;
        }

        @Override // ernr.a
        public final k b(ernr ernrVar, k kVar) {
            k kVar2;
            do {
                kVar2 = ernrVar.waiters;
                if (kVar == kVar2) {
                    break;
                }
            } while (!g(ernrVar, kVar2, kVar));
            return kVar2;
        }

        @Override // ernr.a
        public final void c(k kVar, k kVar2) {
            a.putObject(kVar, f, kVar2);
        }

        @Override // ernr.a
        public final void d(k kVar, Thread thread) {
            a.putObject(kVar, e, thread);
        }

        @Override // ernr.a
        public final boolean e(ernr ernrVar, e eVar, e eVar2) {
            return ernt.a(a, ernrVar, b, eVar, eVar2);
        }

        @Override // ernr.a
        public final boolean f(ernr ernrVar, Object obj, Object obj2) {
            return ernt.a(a, ernrVar, d, obj, obj2);
        }

        @Override // ernr.a
        public final boolean g(ernr ernrVar, k kVar, k kVar2) {
            return ernt.a(a, ernrVar, c, kVar, kVar2);
        }
    }

    /* compiled from: PG */
    final class k {
        static final k a = new k(null);
        volatile k next;
        volatile Thread thread;

        public k(byte[] bArr) {
        }

        final void a(k kVar) {
            ernr.m.c(this, kVar);
        }

        public k() {
            ernr.m.d(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        a gVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        k = z;
        l = new erri(ernr.class);
        Throwable th3 = null;
        try {
            gVar = new j();
            th = null;
            th2 = null;
        } catch (Error | Exception e2) {
            try {
                gVar = new b();
            } catch (Error | Exception e3) {
                th3 = e3;
                gVar = new g();
            }
            th = th3;
            th2 = e2;
        }
        m = gVar;
        if (th != null) {
            erri erriVar = l;
            erriVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            erriVar.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
        a = new Object();
    }

    protected ernr() {
    }

    private static Object d(Future future) {
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

    private final void e(StringBuilder sb) {
        try {
            Object d2 = d(this);
            sb.append("SUCCESS, result=[");
            if (d2 == null) {
                sb.append("null");
            } else if (d2 == this) {
                sb.append("this future");
            } else {
                sb.append(d2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(d2)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void f(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof f) {
            sb.append(", setFuture=[");
            g(sb, ((f) obj).b);
            sb.append("]");
        } else {
            try {
                concat = emxe.a(gP());
            } catch (Exception | StackOverflowError e2) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(e2.getClass())));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            e(sb);
        }
    }

    private final void g(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(ListenableFuture listenableFuture) {
        Throwable i2;
        if (listenableFuture instanceof h) {
            Object obj = ((ernr) listenableFuture).value;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.c) {
                    Throwable th = cVar.d;
                    obj = th != null ? new c(false, th) : c.b;
                }
            }
            obj.getClass();
            return obj;
        }
        if ((listenableFuture instanceof erso) && (i2 = ((erso) listenableFuture).i()) != null) {
            return new d(i2);
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!k) && isCancelled) {
            c cVar2 = c.b;
            cVar2.getClass();
            return cVar2;
        }
        try {
            Object d2 = d(listenableFuture);
            return isCancelled ? new c(false, new IllegalArgumentException(defpackage.a.C(listenableFuture, "get() did not throw CancellationException, despite reporting isCancelled() == true: "))) : d2 == null ? a : d2;
        } catch (Error | Exception e2) {
            return new d(e2);
        } catch (CancellationException e3) {
            return !isCancelled ? new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(listenableFuture))), e3)) : new c(false, e3);
        } catch (ExecutionException e4) {
            return isCancelled ? new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(listenableFuture))), e4)) : new d(e4.getCause());
        }
    }

    public static void j(ernr ernrVar, boolean z) {
        e eVar = null;
        while (true) {
            for (k b2 = m.b(ernrVar, k.a); b2 != null; b2 = b2.next) {
                Thread thread = b2.thread;
                if (thread != null) {
                    b2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                ernrVar.k();
            }
            ernrVar.gQ();
            e eVar2 = eVar;
            e a2 = m.a(ernrVar, e.a);
            e eVar3 = eVar2;
            while (a2 != null) {
                e eVar4 = a2.next;
                a2.next = eVar3;
                eVar3 = a2;
                a2 = eVar4;
            }
            while (eVar3 != null) {
                eVar = eVar3.next;
                Runnable runnable = eVar3.b;
                runnable.getClass();
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    ernrVar = fVar.a;
                    if (ernrVar.value == fVar) {
                        if (m.f(ernrVar, fVar, h(fVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVar3.c;
                    executor.getClass();
                    o(runnable, executor);
                }
                eVar3 = eVar;
            }
            return;
            z = false;
        }
    }

    private static void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            l.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", defpackage.a.c(executor, runnable, "RuntimeException while executing runnable ", " with executor "), (Throwable) e2);
        }
    }

    private final void p(k kVar) {
        kVar.thread = null;
        while (true) {
            k kVar2 = this.waiters;
            if (kVar2 != k.a) {
                k kVar3 = null;
                while (kVar2 != null) {
                    k kVar4 = kVar2.next;
                    if (kVar2.thread != null) {
                        kVar3 = kVar2;
                    } else if (kVar3 != null) {
                        kVar3.next = kVar4;
                        if (kVar3.thread == null) {
                            break;
                        }
                    } else if (!m.g(this, kVar2, kVar4)) {
                        break;
                    }
                    kVar2 = kVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object q(Object obj) {
        if (obj instanceof c) {
            Throwable th = ((c) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).b);
        }
        if (obj == a) {
            return null;
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void b(Runnable runnable, Executor executor) {
        e eVar;
        runnable.getClass();
        executor.getClass();
        if (!isDone() && (eVar = this.listeners) != e.a) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.next = eVar;
                if (m.e(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.listeners;
                }
            } while (eVar != e.a);
        }
        o(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof ernr.f
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = defpackage.ernr.k
            if (r1 == 0) goto L1f
            ernr$c r1 = new ernr$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            ernr$c r1 = ernr.c.a
            goto L26
        L24:
            ernr$c r1 = ernr.c.b
        L26:
            r1.getClass()
        L29:
            r4 = r7
            r5 = r2
        L2b:
            ernr$a r6 = defpackage.ernr.m
            boolean r6 = r6.f(r4, r0, r1)
            if (r6 == 0) goto L58
            j(r4, r8)
            boolean r4 = r0 instanceof ernr.f
            if (r4 == 0) goto L57
            ernr$f r0 = (ernr.f) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.b
            boolean r4 = r0 instanceof ernr.h
            if (r4 == 0) goto L54
            r4 = r0
            ernr r4 = (defpackage.ernr) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof ernr.f
            r5 = r5 | r6
            if (r5 == 0) goto L53
            r5 = r3
            goto L2b
        L53:
            return r3
        L54:
            r0.cancel(r8)
        L57:
            return r3
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof ernr.f
            if (r6 != 0) goto L2b
            return r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ernr.cancel(boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String gP() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return q(obj2);
        }
        k kVar = this.waiters;
        if (kVar != k.a) {
            k kVar2 = new k();
            do {
                kVar2.a(kVar);
                if (m.g(this, kVar, kVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            p(kVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return q(obj);
                }
                kVar = this.waiters;
            } while (kVar != k.a);
        }
        Object obj3 = this.value;
        obj3.getClass();
        return q(obj3);
    }

    @Override // defpackage.erso
    public final Throwable i() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof d) {
            return ((d) obj).b;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.value != null) & (!(r0 instanceof f));
    }

    final void l(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(n());
        }
    }

    public final boolean m(ListenableFuture listenableFuture) {
        d dVar;
        listenableFuture.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!m.f(this, null, h(listenableFuture))) {
                    return false;
                }
                j(this, false);
                return true;
            }
            f fVar = new f(this, listenableFuture);
            if (m.f(this, null, fVar)) {
                try {
                    listenableFuture.b(fVar, erpp.a);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Error | Exception unused) {
                        dVar = d.a;
                    }
                    m.f(this, fVar, dVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof c) {
            listenableFuture.cancel(((c) obj).c);
        }
        return false;
    }

    protected final boolean n() {
        Object obj = this.value;
        return (obj instanceof c) && ((c) obj).c;
    }

    public boolean set(V v) {
        if (v == null) {
            v = (V) a;
        }
        if (!m.f(this, null, v)) {
            return false;
        }
        j(this, false);
        return true;
    }

    public boolean setException(Throwable th) {
        th.getClass();
        if (!m.f(this, null, new d(th))) {
            return false;
        }
        j(this, false);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            f(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    protected void gQ() {
    }

    protected void k() {
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof f))) {
                return q(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                k kVar = this.waiters;
                if (kVar != k.a) {
                    k kVar2 = new k();
                    do {
                        kVar2.a(kVar);
                        if (m.g(this, kVar, kVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof f))) {
                                        return q(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    p(kVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            p(kVar2);
                        } else {
                            kVar = this.waiters;
                        }
                    } while (kVar != k.a);
                }
                Object obj3 = this.value;
                obj3.getClass();
                return q(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof f))) {
                    return q(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String ernrVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
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
            throw new TimeoutException(defpackage.a.w(ernrVar, str, " for "));
        }
        throw new InterruptedException();
    }
}
