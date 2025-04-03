package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ICancelToken;
import defpackage.dfre;
import defpackage.dfrf;
import defpackage.dfrg;
import defpackage.dfri;
import defpackage.dfrl;
import defpackage.dfrm;
import defpackage.dfsj;
import defpackage.dfsk;
import defpackage.dfsl;
import defpackage.dfte;
import defpackage.dfuq;
import defpackage.dfur;
import defpackage.dfwv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class BasePendingResult<R extends dfrl> extends dfrg<R> {
    public static final ThreadLocal b = new dfsj();
    private final CountDownLatch a;
    public final Object c;
    protected final dfsk d;
    public dfrl e;
    public ICancelToken f;
    public boolean g;
    private final ArrayList h;
    private dfrm i;
    private final AtomicReference j;
    private Status k;
    private volatile boolean l;
    private boolean m;
    private boolean n;
    private volatile dfuq o;
    private dfsl resultGuardian;

    @Deprecated
    BasePendingResult() {
        this.c = new Object();
        this.a = new CountDownLatch(1);
        this.h = new ArrayList();
        this.j = new AtomicReference();
        this.g = false;
        this.d = new dfsk(Looper.getMainLooper());
        new WeakReference(null);
    }

    private final dfrl b() {
        dfrl dfrlVar;
        synchronized (this.c) {
            dfwv.j(!this.l, "Result has already been consumed.");
            dfwv.j(m(), "Result is not ready.");
            dfrlVar = this.e;
            this.e = null;
            this.i = null;
            this.l = true;
        }
        dfur dfurVar = (dfur) this.j.getAndSet(null);
        if (dfurVar != null) {
            dfurVar.a();
        }
        dfwv.n(dfrlVar);
        return dfrlVar;
    }

    public static void k(dfrl dfrlVar) {
        if (dfrlVar instanceof dfri) {
            try {
                ((dfri) dfrlVar).b();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(dfrlVar))), e);
            }
        }
    }

    private final void o(dfrl dfrlVar) {
        this.e = dfrlVar;
        this.k = dfrlVar.a();
        this.f = null;
        this.a.countDown();
        if (this.m) {
            this.i = null;
        } else {
            dfrm dfrmVar = this.i;
            if (dfrmVar != null) {
                this.d.removeMessages(2);
                this.d.a(dfrmVar, b());
            } else if (this.e instanceof dfri) {
                this.resultGuardian = new dfsl(this);
            }
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dfrf) arrayList.get(i)).a(this.k);
        }
        this.h.clear();
    }

    protected abstract dfrl a(Status status);

    @Override // defpackage.dfrg
    public final void d(dfrf dfrfVar) {
        dfwv.b(true, "Callback cannot be null.");
        synchronized (this.c) {
            if (m()) {
                dfrfVar.a(this.k);
            } else {
                this.h.add(dfrfVar);
            }
        }
    }

    @Override // defpackage.dfrg
    public final void e() {
        synchronized (this.c) {
            if (!this.m && !this.l) {
                ICancelToken iCancelToken = this.f;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                k(this.e);
                this.m = true;
                o(a(Status.e));
            }
        }
    }

    @Override // defpackage.dfrg
    public final dfrl f(TimeUnit timeUnit) {
        dfwv.j(!this.l, "Result has already been consumed.");
        dfwv.j(true, "Cannot await if then() has been called.");
        try {
            if (!this.a.await(0L, timeUnit)) {
                j(Status.d);
            }
        } catch (InterruptedException unused) {
            j(Status.b);
        }
        dfwv.j(m(), "Result is not ready.");
        return b();
    }

    @Override // defpackage.dfrg
    public final void g(dfrm dfrmVar, TimeUnit timeUnit) {
        boolean z;
        synchronized (this.c) {
            dfwv.j(!this.l, "Result has already been consumed.");
            dfwv.j(true, "Cannot set callbacks if then() has been called.");
            synchronized (this.c) {
                z = this.m;
            }
            if (z) {
                return;
            }
            if (m()) {
                this.d.a(dfrmVar, b());
            } else {
                this.i = dfrmVar;
                dfsk dfskVar = this.d;
                dfskVar.sendMessageDelayed(dfskVar.obtainMessage(2, this), timeUnit.toMillis(3L));
            }
        }
    }

    @Deprecated
    public final void j(Status status) {
        synchronized (this.c) {
            if (!m()) {
                l(a(status));
                this.n = true;
            }
        }
    }

    public final void l(dfrl dfrlVar) {
        synchronized (this.c) {
            if (this.n || this.m) {
                k(dfrlVar);
                return;
            }
            m();
            dfwv.j(!m(), "Results have already been set");
            dfwv.j(!this.l, "Result has already been consumed");
            o(dfrlVar);
        }
    }

    public final boolean m() {
        return this.a.getCount() == 0;
    }

    protected BasePendingResult(dfre dfreVar) {
        this.c = new Object();
        this.a = new CountDownLatch(1);
        this.h = new ArrayList();
        this.j = new AtomicReference();
        this.g = false;
        this.d = new dfsk(dfreVar != null ? ((dfte) dfreVar).a.i : Looper.getMainLooper());
        new WeakReference(dfreVar);
    }
}
