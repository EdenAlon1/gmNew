package defpackage;

import io.grpc.Status;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feid implements fekh {
    public final String a;
    public feqq b;
    public final Object c = new Object();
    public final Set d = Collections.newSetFromMap(new IdentityHashMap());
    public final Executor e;
    public final int f;
    public final fevw g;
    public fdxd h;
    public final feht i;
    public boolean j;
    public Status k;
    public boolean l;
    private final fdzv m;
    private final InetSocketAddress n;
    private final String o;
    private boolean p;
    private boolean q;

    public feid(feht fehtVar, InetSocketAddress inetSocketAddress, String str, String str2, fdxd fdxdVar, Executor executor, int i, fevw fevwVar) {
        inetSocketAddress.getClass();
        this.n = inetSocketAddress;
        this.m = fdzv.a(getClass(), inetSocketAddress.toString());
        this.o = str;
        this.a = fend.e("cronet", str2);
        this.f = i;
        this.e = executor;
        this.i = fehtVar;
        this.g = fevwVar;
        fdxd fdxdVar2 = fdxd.a;
        fdxb fdxbVar = new fdxb(fdxd.a);
        fdxbVar.b(femv.a, fecq.PRIVACY_AND_INTEGRITY);
        fdxbVar.b(femv.b, fdxdVar);
        this.h = fdxbVar.a();
    }

    final void a(feia feiaVar, Status status) {
        synchronized (this.c) {
            if (this.d.remove(feiaVar)) {
                boolean z = true;
                if (status.getCode() != Status.Code.CANCELLED && status.getCode() != Status.Code.DEADLINE_EXCEEDED) {
                    z = false;
                }
                feiaVar.o.j(status, z, new febo());
                b();
            }
        }
    }

    final void b() {
        synchronized (this.c) {
            if (this.j && !this.q && this.d.isEmpty()) {
                this.q = true;
                this.b.d();
            }
        }
    }

    @Override // defpackage.feab
    public final fdzv c() {
        return this.m;
    }

    @Override // defpackage.fejv
    public final /* bridge */ /* synthetic */ fejs d(febs febsVar, febo feboVar, fdxj fdxjVar, fdxt[] fdxtVarArr) {
        return new feic(this, "https://" + this.o + "/".concat(febsVar.b), feboVar, febsVar, fevo.l(fdxtVarArr, this.h), fdxjVar).a;
    }

    @Override // defpackage.feqr
    public final Runnable e(feqq feqqVar) {
        this.b = feqqVar;
        synchronized (this.c) {
            this.l = true;
        }
        return new feib(this);
    }

    @Override // defpackage.feqr
    public final void n(Status status) {
        synchronized (this.c) {
            if (this.j) {
                return;
            }
            synchronized (this.c) {
                if (this.p) {
                    return;
                }
                this.p = true;
                this.b.c(status);
                synchronized (this.c) {
                    this.j = true;
                    this.k = status;
                }
                b();
            }
        }
    }

    @Override // defpackage.feqr
    public final void o(Status status) {
        throw null;
    }

    @Override // defpackage.fekh
    public final fdxd q() {
        return this.h;
    }

    public final String toString() {
        InetSocketAddress inetSocketAddress = this.n;
        return super.toString() + "(" + inetSocketAddress.toString() + ")";
    }
}
