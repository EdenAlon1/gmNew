package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdyg extends fdyn implements Closeable {
    public final fdys a;
    public ScheduledFuture b;
    private final fdyn h;
    private ArrayList i;
    private fdyh j;
    private Throwable k;
    private boolean l;

    public fdyg(fdyn fdynVar) {
        super(fdynVar, fdynVar.f);
        this.a = fdynVar.b();
        this.h = new fdyn(this, this.f);
    }

    @Override // defpackage.fdyn
    public final fdyn a() {
        return this.h.a();
    }

    @Override // defpackage.fdyn
    public final fdys b() {
        return this.a;
    }

    @Override // defpackage.fdyn
    public final Throwable c() {
        if (i()) {
            return this.k;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j(null);
    }

    @Override // defpackage.fdyn
    public final void d(fdyh fdyhVar, Executor executor) {
        m(executor, "executor");
        e(new fdyj(executor, fdyhVar, this));
    }

    public final void e(fdyj fdyjVar) {
        synchronized (this) {
            if (i()) {
                fdyjVar.a();
            } else {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.i = arrayList2;
                    arrayList2.add(fdyjVar);
                    fdyg fdygVar = this.e;
                    if (fdygVar != null) {
                        this.j = new fdye(this);
                        fdygVar.e(new fdyj(fdyi.a, this.j, this));
                    }
                } else {
                    arrayList.add(fdyjVar);
                }
            }
        }
    }

    @Override // defpackage.fdyn
    public final void f(fdyn fdynVar) {
        this.h.f(fdynVar);
    }

    @Override // defpackage.fdyn
    public final void g(fdyh fdyhVar) {
        h(fdyhVar, this);
    }

    public final void h(fdyh fdyhVar, fdyn fdynVar) {
        synchronized (this) {
            ArrayList arrayList = this.i;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    fdyj fdyjVar = (fdyj) this.i.get(size);
                    if (fdyjVar.a == fdyhVar && fdyjVar.b == fdynVar) {
                        this.i.remove(size);
                        break;
                    }
                }
                if (this.i.isEmpty()) {
                    fdyg fdygVar = this.e;
                    if (fdygVar != null) {
                        fdygVar.h(this.j, fdygVar);
                    }
                    this.j = null;
                    this.i = null;
                }
            }
        }
    }

    @Override // defpackage.fdyn
    public final boolean i() {
        synchronized (this) {
            if (this.l) {
                return true;
            }
            if (!super.i()) {
                return false;
            }
            j(super.c());
            return true;
        }
    }

    public final void j(Throwable th) {
        int i;
        boolean z;
        ScheduledFuture scheduledFuture;
        synchronized (this) {
            if (this.l) {
                z = false;
                scheduledFuture = null;
            } else {
                z = true;
                this.l = true;
                scheduledFuture = this.b;
                if (scheduledFuture != null) {
                    this.b = null;
                } else {
                    scheduledFuture = null;
                }
                this.k = th;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (z) {
            synchronized (this) {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                fdyh fdyhVar = this.j;
                this.j = null;
                this.i = null;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    fdyj fdyjVar = (fdyj) arrayList.get(i2);
                    if (fdyjVar.b == this) {
                        fdyjVar.a();
                    }
                }
                int size2 = arrayList.size();
                for (i = 0; i < size2; i++) {
                    fdyj fdyjVar2 = (fdyj) arrayList.get(i);
                    if (fdyjVar2.b != this) {
                        fdyjVar2.a();
                    }
                }
                fdyg fdygVar = this.e;
                if (fdygVar != null) {
                    fdygVar.h(fdyhVar, fdygVar);
                }
            }
        }
    }

    public fdyg(fdyn fdynVar, fdys fdysVar) {
        super(fdynVar, fdynVar.f);
        this.a = fdysVar;
        this.h = new fdyn(this, this.f);
    }
}
