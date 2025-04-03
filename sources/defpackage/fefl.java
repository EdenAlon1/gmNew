package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fefl implements fenp, fegk {
    public static final Logger a = Logger.getLogger(fefl.class.getName());
    public final feef b;
    public final fegl c;
    private final ferd d;
    private final ferd e;
    private final engw f;
    private final feeq g;
    private fevb h;
    private ScheduledExecutorService i;
    private Executor j;
    private boolean k;
    private final feel l;

    public fefl(fefj fefjVar) {
        feef feefVar = fefjVar.a;
        feefVar.getClass();
        this.b = feefVar;
        ferd ferdVar = fefjVar.c;
        ferdVar.getClass();
        this.e = ferdVar;
        this.d = fefjVar.d;
        List list = fefjVar.b;
        list.getClass();
        this.f = engw.n(list);
        fefa fefaVar = fefjVar.e;
        fefaVar.getClass();
        this.l = new feel(fefaVar);
        this.g = fefjVar.f;
        this.c = new fegl(this);
    }

    @Override // defpackage.fegk
    public final synchronized boolean C(int i, Parcel parcel) {
        IBinder readStrongBinder;
        if (i == 1) {
            if (this.k) {
                fefk.a.C(1, parcel);
                return false;
            }
            if (parcel.readInt() > 0 && (readStrongBinder = parcel.readStrongBinder()) != null) {
                int callingUid = Binder.getCallingUid();
                fdxd fdxdVar = fdxd.a;
                fdxb fdxbVar = new fdxb(fdxd.a);
                fdxbVar.b(fdzi.b, this.b);
                fdxbVar.b(fdzi.a, new fegd(callingUid));
                fdxbVar.b(fefu.f, Integer.valueOf(callingUid));
                fdxbVar.b(fefu.g, this.b.d());
                fdxbVar.b(fefu.h, this.g);
                feel feelVar = this.l;
                Executor executor = this.j;
                executor.getClass();
                fdxbVar.b(fega.a, new fefz(callingUid, feelVar, executor));
                fdxbVar.b(femv.a, fecq.PRIVACY_AND_INTEGRITY);
                ferd ferdVar = this.d;
                fdxd a2 = fdxbVar.a();
                engw engwVar = this.f;
                Logger logger = fegu.a;
                feft feftVar = new feft(ferdVar, a2, engwVar, readStrongBinder);
                fevb fevbVar = this.h;
                synchronized (fevbVar) {
                    emxf.m(!((fefd) fevbVar).b, "Illegal transportCreated() after serverShutdown()");
                    ((fefd) fevbVar).c++;
                }
                fevb fevbVar2 = ((fefd) fevbVar).a;
                synchronized (((feuq) fevbVar2).a.l) {
                    ((feuq) fevbVar2).a.n.add(feftVar);
                }
                feux feuxVar = new feux(((feuq) fevbVar2).a, feftVar);
                long j = feuxVar.c.i;
                if (j != Long.MAX_VALUE) {
                    feuxVar.b = ((fefu) feuxVar.a).i.schedule(new feuv(feuxVar), j, TimeUnit.MILLISECONDS);
                } else {
                    feuxVar.b = new FutureTask(new feur(), null);
                }
                feuy feuyVar = feuxVar.c;
                fdzq.b((fdzp) feuyVar.q.g.get(Long.valueOf(fdzq.a(feuyVar))), feuxVar.a);
                feftVar.e(new fefc((fefd) fevbVar, feuxVar));
                return true;
            }
        }
        return false;
    }

    public final synchronized void b() {
        this.e.b(this.j);
        this.j = null;
    }

    @Override // defpackage.fenp
    public final synchronized void c() {
        Runnable a2;
        if (this.k) {
            return;
        }
        this.k = true;
        this.c.a = fefk.a;
        fevb fevbVar = this.h;
        fevb fevbVar2 = ((fefd) fevbVar).a;
        synchronized (((feuq) fevbVar2).a.l) {
            feuy feuyVar = ((feuq) fevbVar2).a;
            if (!feuyVar.k) {
                ArrayList arrayList = new ArrayList(feuyVar.n);
                feuy feuyVar2 = ((feuq) fevbVar2).a;
                Status status = feuyVar2.j;
                feuyVar2.k = true;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    feve feveVar = (feve) arrayList.get(i);
                    if (status == null) {
                        feveVar.f();
                    } else {
                        feveVar.g(status);
                    }
                }
                synchronized (((feuq) fevbVar2).a.l) {
                    feuy feuyVar3 = ((feuq) fevbVar2).a;
                    feuyVar3.m = true;
                    feuyVar3.d();
                }
            }
        }
        synchronized (fevbVar) {
            ((fefd) fevbVar).b = true;
            a2 = ((fefd) fevbVar).a();
        }
        if (a2 != null) {
            a2.run();
        }
        this.d.b(this.i);
        this.i = null;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.fenp
    public final synchronized void d(fevb fevbVar) {
        this.h = new fefd(fevbVar, new Runnable() { // from class: fefi
            @Override // java.lang.Runnable
            public final void run() {
                fefl.this.b();
            }
        });
        this.i = (ScheduledExecutorService) this.d.a();
        this.j = this.e.a();
    }

    public final String toString() {
        return "BinderServer[" + this.b.toString() + "]";
    }
}
