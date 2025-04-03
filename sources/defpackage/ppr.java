package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ppr {
    public Context a;
    public WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public ppr(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.a = context;
        this.b = workerParameters;
    }

    public ListenableFuture a() {
        return kfg.a(new kfd() { // from class: ppm
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                kfbVar.c(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
                return "default failing getForegroundInfoAsync";
            }
        });
    }

    public abstract ListenableFuture b();

    public final int e() {
        return this.b.e;
    }

    public final pot f() {
        return this.b.b;
    }

    public final UUID g() {
        return this.b.a;
    }

    public final Executor h() {
        return this.b.f;
    }

    public final void i(int i) {
        if (this.c.compareAndSet(-256, i)) {
            d();
        }
    }

    public final boolean j() {
        return this.c.get() != -256;
    }

    public void d() {
    }
}
