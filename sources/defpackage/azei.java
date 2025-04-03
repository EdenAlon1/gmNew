package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azei {
    private final ffbr a;
    private final ffsk b;
    private final List c;
    private final ReentrantLock d;

    public azei(ffbr ffbrVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = ffskVar;
        this.c = ffdx.am(ffel.a);
        this.d = new ReentrantLock();
    }

    public final elfl a(Function function) {
        elfl c;
        c = axol.c(this.b, ffhe.a, ffsm.a, new azeh(this, function, null));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffjm r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.azef
            if (r0 == 0) goto L13
            r0 = r6
            azef r0 = (defpackage.azef) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            azef r0 = new azef
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.ffci.b(r6)
            goto L40
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            java.util.Collection r6 = r4.c()
            java.util.Iterator r6 = r6.iterator()
            r2 = r5
            r5 = r6
        L40:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L57
            java.lang.Object r6 = r5.next()
            r0.a = r2
            r0.b = r5
            r0.e = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L40
            return r1
        L57:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azei.b(ffjm, ffgu):java.lang.Object");
    }

    public final Collection c() {
        Object b = this.a.b();
        b.getClass();
        Set set = (Set) b;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            List list = this.c;
            reentrantLock.unlock();
            return fffi.g(set, list);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(Consumer consumer) {
        Iterator it = c().iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public final void e(Object obj) {
        obj.getClass();
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            this.c.add(obj);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(Object obj) {
        obj.getClass();
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            this.c.remove(obj);
        } finally {
            reentrantLock.unlock();
        }
    }
}
