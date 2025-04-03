package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import io.grpc.Status;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feqc extends feau implements fdzu {
    static final Logger a = Logger.getLogger(feqc.class.getName());
    static final Status b;
    static final Status c;
    public static final feqp d;
    public static final fdzs e;
    public static final feaj f;
    public static final fdxo g;
    public final feqb A;
    public final AtomicBoolean B;
    public boolean C;
    public volatile boolean D;
    public final fejf E;
    public final fejg F;
    public final feji G;
    public final fdxm H;
    public final fdzq I;
    public final fepw J;
    public feqp K;
    public final feqp L;
    public boolean M;
    public final boolean N;
    public final fetd O;
    public final long P;
    public final long Q;
    public final boolean R;
    final fenk S;
    public final fepc T;
    public int U;
    private final String V;
    private final URI W;
    private final fecd X;
    private final febv Y;
    private final feiz Z;
    private final ferd aa;
    private final fepg ab;
    private final fepg ac;
    private final long ad;
    private final fdxk ae;
    private volatile feao af;
    private final Set ag;
    private final CountDownLatch ah;
    private final feqq ai;
    private final fesk aj;
    private final ferb ak;
    public final fdzv h;
    public final fejx i;
    public final fepx j;
    public final Executor k;
    public final fevs l;
    final feds m;
    public final fdyv n;
    public final fdxz o;
    public final fekj p;
    public final List q;
    public final String r;
    public fecc s;
    public boolean t;
    public fepl u;
    public boolean v;
    public final Set w;
    public Collection x;
    public final Object y;
    public final feli z;

    static {
        Status.p.withDescription("Channel shutdownNow invoked");
        b = Status.p.withDescription("Channel shutdown invoked");
        c = Status.p.withDescription("Subchannel shutdown invoked");
        d = new feqp(null, new HashMap(), new HashMap(), null, null, null);
        e = new feot();
        f = new feoy();
        g = new fepa();
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public feqc(feqk feqkVar, fejx fejxVar, URI uri, fecd fecdVar, ferd ferdVar, emyl emylVar, List list, fevs fevsVar) {
        feds fedsVar = new feds(new feoz(this));
        this.m = fedsVar;
        this.p = new fekj();
        this.w = new HashSet(16, 0.75f);
        this.y = new Object();
        this.ag = new HashSet(1, 0.75f);
        this.A = new feqb(this);
        this.B = new AtomicBoolean(false);
        this.ah = new CountDownLatch(1);
        this.U = 1;
        this.K = d;
        this.M = false;
        this.O = new fetd();
        fdyq fdyqVar = fdys.a;
        fepf fepfVar = new fepf(this);
        this.ai = fepfVar;
        this.S = new feph(this);
        fepc fepcVar = new fepc(this);
        this.T = fepcVar;
        String str = feqkVar.h;
        str.getClass();
        this.V = str;
        fdzv b2 = fdzv.b("Channel", str);
        this.h = b2;
        fevsVar.getClass();
        this.l = fevsVar;
        ferd ferdVar2 = feqkVar.d;
        ferdVar2.getClass();
        this.aa = ferdVar2;
        ?? a2 = ferdVar2.a();
        a2.getClass();
        this.k = a2;
        ferd ferdVar3 = feqkVar.e;
        ferdVar3.getClass();
        fepg fepgVar = new fepg(ferdVar3);
        this.ac = fepgVar;
        feje fejeVar = new feje(fejxVar, fepgVar);
        this.i = fejeVar;
        new feje(fejxVar, fepgVar);
        fepx fepxVar = new fepx(fejeVar.c());
        this.j = fepxVar;
        feji fejiVar = new feji(b2, fevsVar.a(), "Channel for '" + str + "'");
        this.G = fejiVar;
        fejh fejhVar = new fejh(fejiVar, fevsVar);
        this.H = fejhVar;
        fecp fecpVar = fend.m;
        boolean z = feqkVar.n;
        this.R = z;
        feiz feizVar = new feiz(feat.b());
        this.Z = feizVar;
        this.W = uri;
        this.X = fecdVar;
        feua feuaVar = new feua(z, feizVar);
        febt.a();
        ferb ferbVar = new ferb();
        this.ak = ferbVar;
        febu febuVar = new febu();
        febuVar.a = Integer.valueOf(feqkVar.q.a());
        fecpVar.getClass();
        febuVar.b = fecpVar;
        febuVar.c = fedsVar;
        febuVar.e = fepxVar;
        febuVar.d = feuaVar;
        febuVar.f = fejhVar;
        febuVar.g = fepgVar;
        febuVar.h = ferbVar;
        febv febvVar = new febv(febuVar);
        this.Y = febvVar;
        this.s = p(uri, fecdVar, febvVar);
        this.ab = new fepg(ferdVar);
        feli feliVar = new feli(a2, fedsVar);
        this.z = feliVar;
        feliVar.f = fepfVar;
        feliVar.c = new felc(fepfVar);
        feliVar.d = new feld(fepfVar);
        feliVar.e = new fele(fepfVar);
        Map map = feqkVar.p;
        if (map != null) {
            febw a3 = feuaVar.a(map);
            Status status = a3.a;
            emxf.p(status == null, "Default config is invalid: %s", status);
            feqp feqpVar = (feqp) a3.b;
            this.L = feqpVar;
            fepcVar.a = feqpVar.a;
        } else {
            this.L = null;
        }
        this.N = true;
        fepw fepwVar = new fepw(this, this.s.a());
        this.J = fepwVar;
        this.ae = fdxr.a(fepwVar, list);
        this.q = new ArrayList(feqkVar.g);
        emylVar.getClass();
        long j = feqkVar.m;
        if (j == -1) {
            this.ad = -1L;
        } else {
            emxf.e(j >= feqk.b, "invalid idleTimeoutMillis %s", j);
            this.ad = feqkVar.m;
        }
        this.aj = new fesk(new fepi(this), fedsVar, fejeVar.c(), new emyg());
        fdyv fdyvVar = feqkVar.k;
        fdyvVar.getClass();
        this.n = fdyvVar;
        fdxz fdxzVar = feqkVar.l;
        fdxzVar.getClass();
        this.o = fdxzVar;
        this.r = feqkVar.i;
        this.Q = 16777216L;
        this.P = 1048576L;
        feov feovVar = new feov(fevsVar);
        this.E = feovVar;
        this.F = feovVar.a();
        fdzq fdzqVar = feqkVar.o;
        fdzqVar.getClass();
        this.I = fdzqVar;
        fdzq.b(fdzqVar.d, this);
    }

    static fecc p(URI uri, fecd fecdVar, febv febvVar) {
        fecc a2 = fecdVar.a(uri, febvVar);
        if (a2 == null) {
            throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(String.valueOf(uri))));
        }
        ScheduledExecutorService scheduledExecutorService = febvVar.e;
        if (scheduledExecutorService == null) {
            throw new IllegalStateException("ScheduledExecutorService not set in Builder");
        }
        fejb fejbVar = new fejb(scheduledExecutorService, febvVar.c);
        feds fedsVar = febvVar.c;
        return new fetz(a2, fejbVar);
    }

    @Override // defpackage.fdxk
    public final fdxo a(febs febsVar, fdxj fdxjVar) {
        return this.ae.a(febsVar, fdxjVar);
    }

    @Override // defpackage.fdxk
    public final String b() {
        return this.ae.b();
    }

    @Override // defpackage.feab
    public final fdzv c() {
        return this.h;
    }

    @Override // defpackage.feau
    public final /* bridge */ /* synthetic */ feau d() {
        q();
        return this;
    }

    @Override // defpackage.feau
    public final void e() {
        this.m.execute(new feow(this));
    }

    @Override // defpackage.feau
    public final boolean f(TimeUnit timeUnit) {
        return this.ah.await(2L, timeUnit);
    }

    @Override // defpackage.feau
    public final fdyc g() {
        fdyc fdycVar = this.p.a;
        if (fdycVar != null) {
            return fdycVar;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    public final Executor h(fdxj fdxjVar) {
        Executor executor = fdxjVar.c;
        return executor == null ? this.k : executor;
    }

    public final void i(boolean z) {
        ScheduledFuture scheduledFuture;
        fesk feskVar = this.aj;
        feskVar.e = false;
        if (!z || (scheduledFuture = feskVar.f) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        feskVar.f = null;
    }

    public final void j() {
        n(true);
        this.z.a(null);
        this.H.a(2, "Entering IDLE state");
        this.p.a(fdyc.IDLE);
        Object[] objArr = {this.y, this.z};
        for (int i = 0; i < 2; i++) {
            if (this.S.a.contains(objArr[i])) {
                k();
                return;
            }
        }
    }

    final void k() {
        this.m.d();
        if (this.B.get() || this.v) {
            return;
        }
        if (this.S.a.isEmpty()) {
            m();
        } else {
            i(false);
        }
        if (this.u == null) {
            this.H.a(2, "Exiting idle mode");
            fepl feplVar = new fepl(this);
            feplVar.a = new feiu(this.Z, feplVar);
            this.u = feplVar;
            this.p.a(fdyc.CONNECTING);
            this.s.d(new fepn(this, feplVar, this.s));
            this.t = true;
        }
    }

    public final void l() {
        if (!this.D && this.B.get() && this.w.isEmpty() && this.ag.isEmpty()) {
            this.H.a(2, "Terminated");
            fdzq.c(this.I.d, this);
            this.aa.b(this.k);
            this.ab.b();
            this.ac.b();
            this.i.close();
            this.D = true;
            this.ah.countDown();
        }
    }

    public final void m() {
        long j = this.ad;
        if (j == -1) {
            return;
        }
        fesk feskVar = this.aj;
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long a2 = feskVar.a() + nanos;
        feskVar.e = true;
        if (a2 - feskVar.d < 0 || feskVar.f == null) {
            ScheduledFuture scheduledFuture = feskVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            feskVar.f = feskVar.a.schedule(new fesj(feskVar), nanos, TimeUnit.NANOSECONDS);
        }
        feskVar.d = a2;
    }

    public final void n(boolean z) {
        this.m.d();
        if (z) {
            emxf.m(this.t, "nameResolver is not started");
            emxf.m(this.u != null, "lbHelper is null");
        }
        fecc feccVar = this.s;
        if (feccVar != null) {
            feccVar.c();
            this.t = false;
            if (z) {
                this.s = p(this.W, this.X, this.Y);
            } else {
                this.s = null;
            }
        }
        fepl feplVar = this.u;
        if (feplVar != null) {
            feiu feiuVar = feplVar.a;
            feiuVar.b.e();
            feiuVar.b = null;
            this.u = null;
        }
        this.af = null;
    }

    public final void o(feao feaoVar) {
        this.af = feaoVar;
        this.z.a(feaoVar);
    }

    public final void q() {
        this.H.a(1, "shutdown() called");
        if (this.B.compareAndSet(false, true)) {
            this.m.execute(new feox(this));
            fepw fepwVar = this.J;
            fepwVar.c.m.execute(new fepp(fepwVar));
            this.m.execute(new feou(this));
        }
    }

    public final String toString() {
        emwz b2 = emxa.b(this);
        b2.g("logId", this.h.a);
        b2.b(GroupManagementRequest.TARGET_ATTRIBUTE, this.V);
        return b2.toString();
    }
}
