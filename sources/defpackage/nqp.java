package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nqp extends nsc implements nrl {
    private static final ByteBuffer e = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    private final lqc f;
    private final AtomicLong g;
    private final Queue h;
    private final Queue i;
    private volatile boolean j;
    private long k;
    private boolean l;
    private long m;
    private lxz n;

    public nqp(lqc lqcVar, nsl nslVar, nrx nrxVar, nrj nrjVar) {
        super(lqcVar, nrxVar);
        this.f = lqcVar;
        this.g = new AtomicLong();
        this.h = new ConcurrentLinkedQueue();
        this.i = new ConcurrentLinkedQueue();
        nrjVar.a(nslVar);
    }

    @Override // defpackage.nsb
    public final /* synthetic */ int a() {
        return nsa.b();
    }

    @Override // defpackage.nsb
    public final /* synthetic */ Surface b() {
        return nsa.a();
    }

    @Override // defpackage.nsb
    public final lxz c() {
        if (this.n == null) {
            lxz lxzVar = (lxz) this.h.poll();
            this.n = lxzVar;
            if (!this.l) {
                if (lxzVar == null) {
                    lxz lxzVar2 = new lxz(2);
                    this.n = lxzVar2;
                    lxzVar2.d = e;
                } else {
                    long j = this.m;
                    lti.f(lxzVar.d);
                    this.m = j - r0.capacity();
                }
            }
        }
        return this.n;
    }

    @Override // defpackage.nry
    public final void e(nql nqlVar, long j, lqc lqcVar, boolean z) {
        this.k = this.g.get();
        this.g.addAndGet(j);
    }

    @Override // defpackage.nsb
    public final /* synthetic */ void f() {
        nsa.e();
    }

    @Override // defpackage.nsb
    public final /* synthetic */ int h(Bitmap bitmap, ltr ltrVar) {
        return nsa.c();
    }

    @Override // defpackage.nsb
    public final /* synthetic */ boolean i() {
        return nsa.d();
    }

    @Override // defpackage.nsb
    public final void j() {
        lxz lxzVar = this.n;
        lti.f(lxzVar);
        this.n = null;
        boolean z = true;
        if (lxzVar.eR()) {
            this.j = true;
        } else {
            lxzVar.f += this.k;
            this.i.add(lxzVar);
        }
        if (this.l) {
            return;
        }
        int size = this.h.size() + this.i.size();
        long j = this.m;
        lti.f(lxzVar.d);
        long capacity = j + r0.capacity();
        this.m = capacity;
        if (size < 10 || (size < 200 && capacity < 2097152)) {
            z = false;
        }
        this.l = z;
    }

    @Override // defpackage.nsc
    protected final lqc p() {
        return this.f;
    }

    @Override // defpackage.nsc
    protected final lxz q() {
        return (lxz) this.i.peek();
    }

    @Override // defpackage.nsc
    protected final void s() {
        lxz lxzVar = (lxz) this.i.remove();
        lxzVar.eO();
        lxzVar.f = 0L;
        this.h.add(lxzVar);
    }

    @Override // defpackage.nsc
    protected final boolean t() {
        return this.j && this.i.isEmpty();
    }

    @Override // defpackage.nsc
    public final void d() {
    }

    @Override // defpackage.nsc
    public final nrl r(nql nqlVar, lqc lqcVar, int i) {
        return this;
    }
}
