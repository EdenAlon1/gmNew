package defpackage;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fefu implements IBinder.DeathRecipient, fegk {
    public static final Logger e = Logger.getLogger(fefu.class.getName());
    public static final fdxc f = new fdxc("internal:remote-uid");
    public static final fdxc g = new fdxc("internal:server-authority");
    public static final fdxc h = new fdxc("internal:inbound-parcelable-policy");
    private final ferd a;
    private final fdzv b;
    public final ScheduledExecutorService i;
    protected fdxd k;
    protected Status l;
    public fegu m;
    private long p;
    private final LinkedHashSet d = new LinkedHashSet();
    private int q = 1;
    private final fegl c = new fegl(this);
    protected final ConcurrentHashMap j = new ConcurrentHashMap();
    private final fege n = new fege();
    private final AtomicLong o = new AtomicLong();

    public fefu(ferd ferdVar, fdxd fdxdVar, fdzv fdzvVar) {
        this.a = ferdVar;
        this.k = fdxdVar;
        this.b = fdzvVar;
        this.i = (ScheduledExecutorService) ferdVar.a();
    }

    private static Status b(RemoteException remoteException) {
        return ((remoteException instanceof DeadObjectException) || (remoteException instanceof TransactionTooLargeException)) ? Status.p.d(remoteException) : Status.o.d(remoteException);
    }

    private final void e() {
        fegu feguVar = this.m;
        if (feguVar != null) {
            try {
                feguVar.b.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
            try {
                fegy c = fegy.c();
                try {
                    c.a().writeInt(0);
                    this.m.a(2, c);
                    c.close();
                } finally {
                }
            } catch (RemoteException unused2) {
            }
        }
    }

    protected fegj B(int i) {
        return null;
    }

    @Override // defpackage.fegk
    public final boolean C(int i, Parcel parcel) {
        fegy c;
        fegx fegxVar;
        fevr fevrVar;
        try {
            if (i < 1001) {
                synchronized (this) {
                    if (i == 1) {
                        i(parcel);
                    } else if (i == 2) {
                        t(Status.p.withDescription("transport shutdown by peer"), true);
                    } else if (i != 3) {
                        if (i == 4) {
                            int readInt = parcel.readInt();
                            if (this.q == 3) {
                                try {
                                    c = fegy.c();
                                    try {
                                        c.a().writeInt(readInt);
                                        this.m.a(5, c);
                                        c.close();
                                    } finally {
                                    }
                                } catch (RemoteException unused) {
                                }
                            }
                        } else {
                            if (i != 5) {
                                return false;
                            }
                            h(parcel);
                        }
                    } else if (this.n.a(parcel.readLong())) {
                        e.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ".concat(toString()));
                        this.d.addAll(this.j.keySet());
                        Iterator it = this.d.iterator();
                        while (v() && it.hasNext()) {
                            fegj fegjVar = (fegj) this.j.get(it.next());
                            it.remove();
                            if (fegjVar != null) {
                                synchronized (fegjVar) {
                                    fegxVar = fegjVar.e;
                                    fevrVar = fegjVar.g;
                                }
                                if (fevrVar != null) {
                                    fevrVar.e();
                                }
                                if (fegxVar != null) {
                                    try {
                                        synchronized (fegxVar) {
                                            fegxVar.g();
                                        }
                                    } catch (StatusException e2) {
                                        synchronized (fegjVar) {
                                            fegjVar.h(e2.a);
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            } else {
                int dataSize = parcel.dataSize();
                ConcurrentHashMap concurrentHashMap = this.j;
                Integer valueOf = Integer.valueOf(i);
                fegj fegjVar2 = (fegj) concurrentHashMap.get(valueOf);
                if (fegjVar2 == null) {
                    synchronized (this) {
                        if (!w() && (fegjVar2 = B(i)) != null) {
                            fegj fegjVar3 = (fegj) this.j.put(valueOf, fegjVar2);
                            emyw.b(fegjVar3 == null, "impossible appearance of %s", fegjVar3);
                        }
                    }
                }
                if (fegjVar2 != null) {
                    fegjVar2.k(parcel);
                }
                if (this.o.addAndGet(dataSize) - this.p <= 16384) {
                    return true;
                }
                synchronized (this) {
                    fegu feguVar = this.m;
                    feguVar.getClass();
                    long j = this.o.get();
                    this.p = j;
                    try {
                        c = fegy.c();
                    } catch (RemoteException e3) {
                        t(b(e3), true);
                    }
                    try {
                        c.a().writeLong(j);
                        feguVar.a(3, c);
                        c.close();
                    } finally {
                    }
                }
            }
            return true;
        } catch (RuntimeException e4) {
            e.logp(Level.SEVERE, "io.grpc.binder.internal.BinderTransport", "handleTransaction", a.h(i, "Terminating transport for uncaught Exception in transaction "), (Throwable) e4);
            synchronized (this) {
                t(Status.o.d(e4), true);
                return false;
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        t(Status.p.withDescription("Peer process crashed, exited or was killed (binderDied)"), true);
    }

    public final fdzv c() {
        return this.b;
    }

    public abstract void j(Status status);

    public abstract void k();

    public void m() {
        this.a.b(this.i);
    }

    protected void p(fegj fegjVar) {
        u(fegjVar.d);
    }

    public final synchronized fdxd q() {
        return this.k;
    }

    final void r(fegu feguVar) {
        try {
            fegy c = fegy.c();
            try {
                c.a().writeInt(1);
                c.a().writeStrongBinder(this.c);
                feguVar.a(1, c);
                c.close();
            } finally {
            }
        } catch (RemoteException e2) {
            t(b(e2), true);
        }
    }

    final void s(int i, fegy fegyVar) {
        int dataSize = fegyVar.a().dataSize();
        try {
            this.m.a(i, fegyVar);
            if (this.n.b(dataSize)) {
                e.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(toString()));
            }
        } catch (RemoteException e2) {
            throw b(e2).asException();
        }
    }

    final void t(final Status status, boolean z) {
        if (!w()) {
            this.l = status;
            y(4);
            j(status);
        }
        if (z(5)) {
            return;
        }
        if (z || this.j.isEmpty()) {
            this.c.a = null;
            y(5);
            e();
            final ArrayList arrayList = new ArrayList(this.j.values());
            this.j.clear();
            this.i.execute(new Runnable() { // from class: fefn
                @Override // java.lang.Runnable
                public final void run() {
                    Status status2 = status;
                    ArrayList arrayList2 = arrayList;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        fegj fegjVar = (fegj) arrayList2.get(i);
                        synchronized (fegjVar) {
                            fegjVar.h(status2);
                        }
                    }
                    fefu fefuVar = fefu.this;
                    synchronized (fefuVar) {
                        fefuVar.k();
                    }
                    fefuVar.m();
                }
            });
        }
    }

    final void u(int i) {
        if (this.j.remove(Integer.valueOf(i)) == null || !this.j.isEmpty()) {
            return;
        }
        this.i.execute(new Runnable() { // from class: fefm
            @Override // java.lang.Runnable
            public final void run() {
                fefu fefuVar = fefu.this;
                synchronized (fefuVar) {
                    if (fefuVar.z(4)) {
                        fefuVar.t(fefuVar.l, true);
                    }
                }
            }
        });
    }

    final boolean v() {
        return !this.n.a;
    }

    final boolean w() {
        return z(4) || z(5);
    }

    protected final boolean x(fegu feguVar) {
        this.m = feguVar;
        try {
            feguVar.b.linkToDeath(this, 0);
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    final void y(int i) {
        int i2 = this.q;
        int i3 = i - 1;
        if (i3 == 1) {
            emxf.l(i2 == 1);
        } else if (i3 == 2) {
            emxf.l(i2 == 1 || i2 == 2);
        } else if (i3 != 3) {
            emxf.l(i2 == 4);
        } else {
            emxf.l(i2 == 1 || i2 == 2 || i2 == 3);
        }
        this.q = i;
    }

    final boolean z(int i) {
        return this.q == i;
    }

    protected void h(Parcel parcel) {
    }

    protected void i(Parcel parcel) {
    }
}
