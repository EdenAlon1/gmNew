package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzs implements lsj {
    public static final Executor a = new Executor() { // from class: mzf
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };
    public final Context b;
    public final lvb c = new lvb();
    public final lrp d;
    public final SparseArray e;
    public final List f;
    public final lse g;
    public final nat h;
    public final ltn i;
    public final CopyOnWriteArraySet j;
    public lua k;
    public long l;
    public Pair m;
    public int n;
    public int o;
    public long p;
    public long q;
    public boolean r;
    public long s;
    public int t;
    public int u;
    public mcm v;
    private final nar w;
    private lqc x;

    public mzs(mzh mzhVar) {
        this.b = mzhVar.a;
        lrp lrpVar = mzhVar.d;
        lti.g(lrpVar);
        this.d = lrpVar;
        this.e = new SparseArray();
        this.f = mzhVar.e;
        this.g = mzhVar.f;
        ltn ltnVar = mzhVar.g;
        this.i = ltnVar;
        this.h = new myr(mzhVar.b, ltnVar);
        this.w = new mzg(this);
        this.j = new CopyOnWriteArraySet();
        this.x = new lqc(new lqb());
        this.p = -9223372036854775807L;
        this.q = -9223372036854775807L;
        this.t = -1;
        this.o = 0;
    }

    public static lpo f(lpo lpoVar) {
        return (lpoVar == null || !lpoVar.g()) ? lpo.a : lpoVar;
    }

    @Override // defpackage.lsj
    public final void b(lsf lsfVar) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((mzo) it.next()).n(lsfVar);
        }
    }

    @Override // defpackage.lsj
    public final void d(float f) {
        lqb lqbVar = new lqb(this.x);
        lqbVar.v = f;
        lqc lqcVar = new lqc(lqbVar);
        this.x = lqcVar;
        int i = engw.d;
        this.h.k(lqcVar, enou.a);
    }

    @Override // defpackage.lsj
    public final void e(int i, int i2) {
        lqb lqbVar = new lqb(this.x);
        lqbVar.t = i;
        lqbVar.u = i2;
        lqc lqcVar = new lqc(lqbVar);
        this.x = lqcVar;
        int i3 = engw.d;
        this.h.k(lqcVar, enou.a);
    }

    public final void g(Surface surface, int i, int i2) {
        mcm mcmVar = this.v;
        if (mcmVar == null) {
            return;
        }
        if (surface == null) {
            mcmVar.h(null);
            myr myrVar = (myr) this.h;
            myrVar.d = null;
            myrVar.a.k(null);
            return;
        }
        mcmVar.h(new lrq(surface, i, i2, 0, false));
        nat natVar = this.h;
        new lux(i, i2);
        myr myrVar2 = (myr) natVar;
        myrVar2.d = surface;
        myrVar2.a.k(surface);
    }

    @Override // defpackage.lsj
    public final void k(long j) {
        if (this.n > 0) {
            return;
        }
        long j2 = j - this.s;
        this.p = j2;
        Long l = (Long) this.c.d(j2);
        if (l != null && l.longValue() != this.l) {
            this.h.f(l.longValue(), this.s);
            this.l = l.longValue();
        }
        long j3 = this.q;
        boolean z = false;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            z = true;
        }
        myr myrVar = (myr) this.h;
        myrVar.c.add(this.w);
        long j4 = j - myrVar.f;
        nad nadVar = myrVar.b;
        nadVar.e.c(j4);
        nadVar.f = j4;
        nadVar.h = -9223372036854775807L;
        if (z) {
            this.h.i();
            this.r = true;
        }
    }

    @Override // defpackage.lsj
    public final void a(long j) {
    }
}
