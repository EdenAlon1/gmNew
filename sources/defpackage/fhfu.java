package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhfu {
    public final ArrayDeque a;
    public final ArrayDeque b;
    private int c;
    private int d;
    private ExecutorService e;
    private final ArrayDeque f;

    public fhfu() {
        this.c = 64;
        this.d = 5;
        this.a = new ArrayDeque();
        this.b = new ArrayDeque();
        this.f = new ArrayDeque();
    }

    private final void g(Deque deque, Object obj) {
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        e();
    }

    public final synchronized ExecutorService a() {
        ExecutorService executorService;
        if (this.e == null) {
            this.e = new ThreadPoolExecutor(0, Alert.DURATION_SHOW_INDEFINITELY, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new fhhk(String.valueOf(fhhl.f).concat(" Dispatcher"), false));
        }
        executorService = this.e;
        executorService.getClass();
        return executorService;
    }

    public final synchronized void b(fhid fhidVar) {
        this.f.add(fhidVar);
    }

    public final void c(fhia fhiaVar) {
        fhiaVar.a.decrementAndGet();
        g(this.b, fhiaVar);
    }

    public final void d(fhid fhidVar) {
        g(this.f, fhidVar);
    }

    public final void e() {
        byte[] bArr = fhhl.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                fhia fhiaVar = (fhia) it.next();
                if (this.b.size() >= this.c) {
                    break;
                }
                if (fhiaVar.a.get() < this.d) {
                    it.remove();
                    fhiaVar.a.incrementAndGet();
                    fhiaVar.getClass();
                    arrayList.add(fhiaVar);
                    this.b.add(fhiaVar);
                }
            }
            f();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fhia) arrayList.get(i)).b(a());
        }
    }

    public final synchronized void f() {
        this.b.size();
        this.f.size();
    }

    public fhfu(ExecutorService executorService) {
        this();
        this.e = executorService;
    }
}
