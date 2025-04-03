package defpackage;

import android.media.MediaFormat;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class myr implements nat {
    public final mzy a;
    public final nad b;
    public final Queue c;
    public Surface d;
    public lqc e;
    public long f;
    public naq g;
    public Executor h;
    public mzv i;
    private long j;

    public myr(mzy mzyVar, ltn ltnVar) {
        this.a = mzyVar;
        mzyVar.b = ltnVar;
        this.b = new nad(new myq(this), mzyVar);
        this.c = new ArrayDeque();
        this.e = new lqc(new lqb());
        this.j = -9223372036854775807L;
        this.g = naq.b;
        this.h = new Executor() { // from class: myl
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
            }
        };
        this.i = new mzv() { // from class: mym
            @Override // defpackage.mzv
            public final void c(long j, long j2, lqc lqcVar, MediaFormat mediaFormat) {
            }
        };
    }

    @Override // defpackage.nat
    public final void a(boolean z) {
        throw null;
    }

    @Override // defpackage.nat
    public final void b(boolean z) {
        throw null;
    }

    @Override // defpackage.nat
    public final void c(int i) {
        throw null;
    }

    @Override // defpackage.nat
    public final void d(Surface surface, lux luxVar) {
        throw null;
    }

    @Override // defpackage.nat
    public final void e(float f) {
        throw null;
    }

    @Override // defpackage.nat
    public final void f(long j, long j2) {
        if (j != this.j) {
            nad nadVar = this.b;
            long j3 = nadVar.f;
            nadVar.d.e(j3 == -9223372036854775807L ? 0L : j3 + 1, Long.valueOf(j));
            this.j = j;
        }
        this.f = j2;
    }

    @Override // defpackage.nat
    public final void g(List list) {
        throw null;
    }

    @Override // defpackage.nat
    public final void h(mzv mzvVar) {
        throw null;
    }

    @Override // defpackage.nat
    public final void i() {
        nad nadVar = this.b;
        nadVar.h = nadVar.f;
    }

    @Override // defpackage.nat
    public final boolean j() {
        throw null;
    }

    @Override // defpackage.nat
    public final void k(lqc lqcVar, List list) {
        lti.c(list.isEmpty());
        int i = lqcVar.v;
        lqc lqcVar2 = this.e;
        if (i != lqcVar2.v || lqcVar.w != lqcVar2.w) {
            nad nadVar = this.b;
            int i2 = lqcVar.w;
            long j = nadVar.f;
            nadVar.c.e(j == -9223372036854775807L ? 0L : j + 1, new lsl(i, i2));
        }
        float f = lqcVar.x;
        if (f != this.e.x) {
            this.a.j(f);
        }
        this.e = lqcVar;
    }
}
