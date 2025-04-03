package defpackage;

import androidx.car.app.model.Alert;
import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyg implements fekh, fexl, feys {
    private static final Map G;
    public static final Logger a;
    public long A;
    public final Runnable B;
    public final int C;
    public final fevw D;
    final fdzl E;
    int F;
    private final fdzv H;
    private int I;
    private final feuf J;
    private final ScheduledExecutorService K;
    private final int L;
    private boolean M;
    private boolean N;
    private final fenk O;
    public final InetSocketAddress b;
    public final String c;
    public final String d;
    public final Random e = new Random();
    public final int f;
    public feqq g;
    public fexm h;
    public feyu i;
    public final Object j;
    public final Map k;
    public final Executor l;
    public int m;
    public feyf n;
    public fdxd o;
    public Status p;
    public fenj q;
    public boolean r;
    public final SocketFactory s;
    public SSLSocketFactory t;
    public int u;
    public final Deque v;
    public final feyy w;
    public feop x;
    public boolean y;
    public long z;

    static {
        EnumMap enumMap = new EnumMap(fezm.class);
        enumMap.put((EnumMap) fezm.NO_ERROR, (fezm) Status.o.withDescription("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) fezm.PROTOCOL_ERROR, (fezm) Status.o.withDescription("Protocol error"));
        enumMap.put((EnumMap) fezm.INTERNAL_ERROR, (fezm) Status.o.withDescription("Internal error"));
        enumMap.put((EnumMap) fezm.FLOW_CONTROL_ERROR, (fezm) Status.o.withDescription("Flow control error"));
        enumMap.put((EnumMap) fezm.STREAM_CLOSED, (fezm) Status.o.withDescription("Stream closed"));
        enumMap.put((EnumMap) fezm.FRAME_TOO_LARGE, (fezm) Status.o.withDescription("Frame too large"));
        enumMap.put((EnumMap) fezm.REFUSED_STREAM, (fezm) Status.p.withDescription("Refused stream"));
        enumMap.put((EnumMap) fezm.CANCEL, (fezm) Status.c.withDescription("Cancelled"));
        enumMap.put((EnumMap) fezm.COMPRESSION_ERROR, (fezm) Status.o.withDescription("Compression error"));
        enumMap.put((EnumMap) fezm.CONNECT_ERROR, (fezm) Status.o.withDescription("Connect error"));
        enumMap.put((EnumMap) fezm.ENHANCE_YOUR_CALM, (fezm) Status.k.withDescription("Enhance your calm"));
        enumMap.put((EnumMap) fezm.INADEQUATE_SECURITY, (fezm) Status.i.withDescription("Inadequate security"));
        G = DesugarCollections.unmodifiableMap(enumMap);
        a = Logger.getLogger(feyg.class.getName());
    }

    public feyg(fexu fexuVar, InetSocketAddress inetSocketAddress, String str, String str2, fdxd fdxdVar, emyl emylVar, fdzl fdzlVar, Runnable runnable) {
        Object obj = new Object();
        this.j = obj;
        this.k = new HashMap();
        this.u = 0;
        this.v = new LinkedList();
        this.O = new feya(this);
        this.F = 30000;
        inetSocketAddress.getClass();
        this.b = inetSocketAddress;
        this.c = str;
        this.L = fexuVar.f;
        this.f = fexuVar.g;
        Executor executor = fexuVar.a;
        executor.getClass();
        this.l = executor;
        this.J = new feuf(fexuVar.a);
        ScheduledExecutorService scheduledExecutorService = fexuVar.b;
        scheduledExecutorService.getClass();
        this.K = scheduledExecutorService;
        this.I = 3;
        this.s = SocketFactory.getDefault();
        this.t = fexuVar.d;
        feyy feyyVar = fexuVar.e;
        feyyVar.getClass();
        this.w = feyyVar;
        emylVar.getClass();
        this.d = fend.e("okhttp", str2);
        this.E = fdzlVar;
        this.B = runnable;
        this.C = fexuVar.h;
        this.D = fexuVar.c.a();
        this.H = fdzv.a(getClass(), inetSocketAddress.toString());
        fdxd fdxdVar2 = fdxd.a;
        fdxb fdxbVar = new fdxb(fdxd.a);
        fdxbVar.b(femv.b, fdxdVar);
        this.o = fdxbVar.a();
        synchronized (obj) {
        }
    }

    static Status b(fezm fezmVar) {
        Status status = (Status) G.get(fezmVar);
        if (status != null) {
            return status;
        }
        return Status.d.withDescription("Unknown http2 error code: " + fezmVar.s);
    }

    public static String f(fhnv fhnvVar) {
        fhmt fhmtVar = new fhmt();
        while (fhnvVar.b(fhmtVar, 1L) != -1) {
            if (fhmtVar.c(fhmtVar.b - 1) == 10) {
                long i = fhmtVar.i((byte) 10, 0L, Long.MAX_VALUE);
                if (i != -1) {
                    return fhnz.b(fhmtVar, i);
                }
                fhmt fhmtVar2 = new fhmt();
                fhmtVar.H(fhmtVar2, 0L, Math.min(32L, fhmtVar.b));
                throw new EOFException("\\n not found: limit=" + Math.min(fhmtVar.b, Long.MAX_VALUE) + " content=" + fhmtVar2.t().d() + "…");
            }
        }
        throw new EOFException("\\n not found: ".concat(fhmtVar.t().d()));
    }

    private final void t() {
        if (this.p == null || !this.k.isEmpty() || !this.v.isEmpty() || this.r) {
            return;
        }
        this.r = true;
        feop feopVar = this.x;
        if (feopVar != null) {
            feopVar.e();
        }
        fenj fenjVar = this.q;
        if (fenjVar != null) {
            Throwable g = g();
            synchronized (fenjVar) {
                if (!fenjVar.d) {
                    fenjVar.d = true;
                    fenjVar.e = g;
                    Map map = fenjVar.c;
                    fenjVar.c = null;
                    for (Map.Entry entry : map.entrySet()) {
                        fenj.b((feon) entry.getKey(), (Executor) entry.getValue());
                    }
                }
            }
            this.q = null;
        }
        if (!this.M) {
            this.M = true;
            this.h.i(fezm.NO_ERROR, new byte[0]);
        }
        this.h.close();
    }

    @Override // defpackage.fexl
    public final void a(Throwable th) {
        l(0, fezm.INTERNAL_ERROR, Status.p.d(th));
    }

    @Override // defpackage.feab
    public final fdzv c() {
        return this.H;
    }

    @Override // defpackage.fejv
    public final /* bridge */ /* synthetic */ fejs d(febs febsVar, febo feboVar, fdxj fdxjVar, fdxt[] fdxtVarArr) {
        fexz fexzVar;
        fevo l = fevo.l(fdxtVarArr, this.o);
        synchronized (this.j) {
            fexzVar = new fexz(febsVar, feboVar, this.h, this, this.i, this.j, this.L, this.f, this.c, this.d, l, this.D, fdxjVar);
        }
        return fexzVar;
    }

    @Override // defpackage.feqr
    public final Runnable e(feqq feqqVar) {
        this.g = feqqVar;
        if (this.y) {
            feop feopVar = new feop(new feoo(this), this.K, this.z, this.A);
            this.x = feopVar;
            feopVar.d();
        }
        fexk fexkVar = new fexk(this.J, this);
        fexi fexiVar = new fexi(fexkVar, new fezv(fhnf.a(fexkVar)));
        synchronized (this.j) {
            try {
                this.h = new fexm(this, fexiVar);
                this.i = new feyu(this, this.h);
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        this.J.execute(new feyc(this, countDownLatch, cyclicBarrier, fexkVar, countDownLatch2));
        this.l.execute(new feyd(cyclicBarrier, countDownLatch2));
        try {
            synchronized (this.j) {
                fexm fexmVar = this.h;
                try {
                    ((fexn) fexmVar.b).b.b();
                } catch (IOException e) {
                    fexmVar.a.a(e);
                }
                fezz fezzVar = new fezz();
                fezzVar.d(7, this.f);
                fexm fexmVar2 = this.h;
                fexmVar2.c.f(2, fezzVar);
                try {
                    ((fexn) fexmVar2.b).b.g(fezzVar);
                } catch (IOException e2) {
                    fexmVar2.a.a(e2);
                }
            }
            countDownLatch.countDown();
            this.J.execute(new feye(this));
            return null;
        } catch (Throwable th3) {
            countDownLatch.countDown();
            throw th3;
        }
    }

    public final Throwable g() {
        synchronized (this.j) {
            Status status = this.p;
            if (status != null) {
                return status.asException();
            }
            return Status.p.withDescription("Connection closed").asException();
        }
    }

    final void h(int i, Status status, fejt fejtVar, boolean z, fezm fezmVar, febo feboVar) {
        synchronized (this.j) {
            fexz fexzVar = (fexz) this.k.remove(Integer.valueOf(i));
            if (fexzVar != null) {
                if (fezmVar != null) {
                    this.h.f(i, fezm.CANCEL);
                }
                if (status != null) {
                    fexy fexyVar = fexzVar.f;
                    if (feboVar == null) {
                        feboVar = new febo();
                    }
                    fexyVar.k(status, fejtVar, z, feboVar);
                }
                if (!r()) {
                    t();
                }
                i(fexzVar);
            }
        }
    }

    public final void i(fexz fexzVar) {
        if (this.N && this.v.isEmpty() && this.k.isEmpty()) {
            this.N = false;
            feop feopVar = this.x;
            if (feopVar != null) {
                feopVar.c();
            }
        }
        if (fexzVar.s) {
            this.O.c(fexzVar, false);
        }
    }

    public final void j(fezm fezmVar, String str) {
        l(0, fezmVar, b(fezmVar).b(str));
    }

    public final void k(fexz fexzVar) {
        if (!this.N) {
            this.N = true;
            feop feopVar = this.x;
            if (feopVar != null) {
                feopVar.b();
            }
        }
        if (fexzVar.s) {
            this.O.c(fexzVar, true);
        }
    }

    public final void l(int i, fezm fezmVar, Status status) {
        synchronized (this.j) {
            if (this.p == null) {
                this.p = status;
                this.g.c(status);
            }
            if (fezmVar != null && !this.M) {
                this.M = true;
                this.h.i(fezmVar, new byte[0]);
            }
            Iterator it = this.k.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((fexz) entry.getValue()).f.k(status, fejt.REFUSED, false, new febo());
                    i((fexz) entry.getValue());
                }
            }
            for (fexz fexzVar : this.v) {
                fexzVar.f.k(status, fejt.MISCARRIED, true, new febo());
                i(fexzVar);
            }
            this.v.clear();
            t();
        }
    }

    public final void m(fexz fexzVar) {
        emxf.m(fexzVar.f.x == -1, "StreamId already assigned");
        this.k.put(Integer.valueOf(this.I), fexzVar);
        k(fexzVar);
        fexy fexyVar = fexzVar.f;
        int i = this.I;
        emxf.n(fexyVar.x == -1, "the stream has been started with id %s", i);
        fexyVar.x = i;
        feyu feyuVar = fexyVar.h;
        fexyVar.w = new feyr(feyuVar, i, feyuVar.c, fexyVar);
        fexyVar.y.f.d();
        if (fexyVar.u) {
            fexm fexmVar = fexyVar.g;
            fexz fexzVar2 = fexyVar.y;
            try {
                ((fexn) fexmVar.b).b.j(false, fexyVar.x, fexyVar.b);
            } catch (IOException e) {
                fexmVar.a.a(e);
            }
            fexyVar.y.d.a();
            fexyVar.b = null;
            fhmt fhmtVar = fexyVar.c;
            if (fhmtVar.b > 0) {
                fexyVar.h.a(fexyVar.d, fexyVar.w, fhmtVar, fexyVar.e);
            }
            fexyVar.u = false;
        }
        if (fexzVar.s() == febr.UNARY || fexzVar.s() == febr.SERVER_STREAMING) {
            boolean z = fexzVar.g;
        } else {
            this.h.d();
        }
        int i2 = this.I;
        if (i2 < 2147483645) {
            this.I = i2 + 2;
        } else {
            this.I = Alert.DURATION_SHOW_INDEFINITELY;
            l(Alert.DURATION_SHOW_INDEFINITELY, fezm.NO_ERROR, Status.p.withDescription("Stream ids exhausted"));
        }
    }

    @Override // defpackage.feqr
    public final void n(Status status) {
        synchronized (this.j) {
            if (this.p != null) {
                return;
            }
            this.p = status;
            this.g.c(status);
            t();
        }
    }

    @Override // defpackage.feqr
    public final void o(Status status) {
        n(status);
        synchronized (this.j) {
            Iterator it = this.k.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((fexz) entry.getValue()).f.j(status, false, new febo());
                i((fexz) entry.getValue());
            }
            for (fexz fexzVar : this.v) {
                fexzVar.f.k(status, fejt.MISCARRIED, true, new febo());
                i(fexzVar);
            }
            this.v.clear();
            t();
        }
    }

    final boolean p(int i) {
        boolean z;
        synchronized (this.j) {
            z = false;
            if (i < this.I && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.fekh
    public final fdxd q() {
        return this.o;
    }

    public final boolean r() {
        boolean z = false;
        while (!this.v.isEmpty() && this.k.size() < this.u) {
            m((fexz) this.v.poll());
            z = true;
        }
        return z;
    }

    @Override // defpackage.feys
    public final feyr[] s() {
        feyr[] feyrVarArr;
        synchronized (this.j) {
            feyrVarArr = new feyr[this.k.size()];
            Iterator it = this.k.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                feyrVarArr[i] = ((fexz) it.next()).f.f();
                i++;
            }
        }
        return feyrVarArr;
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.g("logId", this.H.a);
        b.b("address", this.b);
        return b.toString();
    }
}
