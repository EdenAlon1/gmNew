package defpackage;

import android.content.Context;
import android.util.SparseArray;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mcj implements lsk {
    public final Context a;
    public final lpo b;
    public final lqg c;
    public final lsj d;
    public final Executor e;
    public final List f;
    public final SparseArray g;
    public final DefaultVideoFrameProcessor$Factory h;
    public final Queue i;
    public final SparseArray j;
    public lsi k;
    public mdl l;
    public boolean m;
    public boolean n;
    public boolean o;
    public long p;
    public volatile boolean q;
    private final lpr r;
    private final ExecutorService s;
    private boolean t;

    protected mcj(Context context, lsg lsgVar, lpo lpoVar, lpr lprVar, lsj lsjVar, Executor executor, List list) {
        lti.a(true);
        this.a = context;
        this.b = lpoVar;
        this.r = lprVar;
        this.d = lsjVar;
        this.e = executor;
        this.f = new ArrayList(list);
        this.p = -9223372036854775807L;
        this.g = new SparseArray();
        ScheduledExecutorService R = lvf.R("Effect:MultipleInputVideoGraph:Thread");
        this.s = R;
        mci mciVar = new mci();
        this.c = mciVar;
        DefaultVideoFrameProcessor$Factory.Builder builder = new DefaultVideoFrameProcessor$Factory.Builder((DefaultVideoFrameProcessor$Factory) lsgVar);
        builder.b = mciVar;
        builder.a = R;
        this.h = builder.build();
        this.i = new ArrayDeque();
        this.j = new SparseArray();
    }

    public final void a(final Exception exc) {
        this.e.execute(new Runnable() { // from class: mbu
            @Override // java.lang.Runnable
            public final void run() {
                mcj.this.d.b((lsf) exc);
            }
        });
    }

    public final void b() {
        mcg mcgVar;
        lti.g(this.k);
        if (this.n && (mcgVar = (mcg) this.i.peek()) != null) {
            lsi lsiVar = this.k;
            lti.f(lsiVar);
            int i = mcgVar.a.b;
            mac macVar = (mac) lsiVar;
            boolean z = true;
            lti.c(!macVar.k);
            if (macVar.j.c()) {
                macVar.d.a().y(i, mcgVar.b);
            } else {
                z = false;
            }
            lti.c(z);
            this.i.remove();
            if (this.o && this.i.isEmpty()) {
                lsi lsiVar2 = this.k;
                lti.f(lsiVar2);
                lsiVar2.f();
            }
        }
    }

    @Override // defpackage.lsk
    public final void f() {
        boolean z = false;
        if (this.g.size() == 0 && this.l == null && this.k == null && !this.t) {
            z = true;
        }
        lti.c(z);
        mac a = this.h.a(this.a, this.r, this.b, true, erpp.a, new mcd(this));
        this.k = a;
        mbv mbvVar = new mbv(this);
        mbo mboVar = a.d;
        lti.c(lvf.T(mboVar.g, 3));
        ((mbn) mboVar.g.get(3)).a.z(mbvVar);
        this.l = new lzm(this.a, this.c, this.s, new mce(this), new mbw(this));
    }

    @Override // defpackage.lsk
    public final void g() {
        if (this.t) {
            return;
        }
        for (int i = 0; i < this.g.size(); i++) {
            SparseArray sparseArray = this.g;
            ((lsi) sparseArray.get(sparseArray.keyAt(i))).d();
        }
        this.g.clear();
        mdl mdlVar = this.l;
        if (mdlVar != null) {
            mdlVar.d();
            this.l = null;
        }
        lsi lsiVar = this.k;
        if (lsiVar != null) {
            lsiVar.d();
            this.k = null;
        }
        this.s.submit(new Runnable() { // from class: mby
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    mcj.this.c.e(ltz.h());
                } catch (Exception e) {
                    luj.d("MultiInputVG", "Error releasing GlObjectsProvider", e);
                }
            }
        });
        this.s.shutdown();
        try {
            this.s.awaitTermination(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            luj.c("MultiInputVG", "Thread interrupted while waiting for executor service termination");
        }
        this.t = true;
    }

    @Override // defpackage.lsk
    public final void h(lrq lrqVar) {
        lsi lsiVar = this.k;
        lti.f(lsiVar);
        lsiVar.e(lrqVar);
    }

    @Override // defpackage.lsk
    public final boolean i() {
        return this.q;
    }
}
