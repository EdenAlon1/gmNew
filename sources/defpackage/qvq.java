package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qvq implements Runnable, Comparable, qvj, rkn {
    private qud A;
    private volatile boolean B;
    private boolean C;
    private int D;
    public qpz d;
    public qtp e;
    public qqe f;
    public qwl g;
    public int h;
    public int i;
    public qvx j;
    public qtu k;
    public qvm l;
    public int m;
    public qtp n;
    public volatile qvk o;
    public volatile boolean p;
    public int q;
    public final qwc r;
    private final kst u;
    private long v;
    private Thread w;
    private qtp x;
    private Object y;
    private qsy z;
    public final qvl a = new qvl();
    private final List s = new ArrayList();
    private final rkr t = new rkq();
    public final qvn b = new qvn();
    public final qvo c = new qvo();

    public qvq(qwc qwcVar, kst kstVar) {
        this.r = qwcVar;
        this.u = kstVar;
    }

    private final int g() {
        return this.f.ordinal();
    }

    private final qvk h() {
        int i = this.D;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            return new qww(this.a, this);
        }
        if (i2 == 2) {
            qvl qvlVar = this.a;
            return new qvg(qvlVar.e(), qvlVar, this);
        }
        if (i2 == 3) {
            return new qxb(this.a, this);
        }
        if (i2 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(qvp.a(i)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x022f, code lost:
    
        r0 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0231, code lost:
    
        if (r0 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0233, code lost:
    
        r9.a.b(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0238, code lost:
    
        r15.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0242, code lost:
    
        if (android.util.Log.isLoggable("DecodeJob", 2) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0244, code lost:
    
        j(defpackage.a.G(r0, "Decoded result "), r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x024e, code lost:
    
        r33.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0251, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x025f, code lost:
    
        throw new defpackage.qwp(r9.c, new java.util.ArrayList(r13));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c4 A[Catch: all -> 0x0262, TRY_LEAVE, TryCatch #1 {all -> 0x0262, blocks: (B:99:0x00b9, B:101:0x00c4), top: B:98:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0218 A[LOOP:1: B:100:0x00c2->B:144:0x0218, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022f A[EDGE_INSN: B:145:0x022f->B:146:0x022f BREAK  A[LOOP:1: B:100:0x00c2->B:144:0x0218], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x022b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x007d A[Catch: all -> 0x027a, TryCatch #15 {all -> 0x027a, blocks: (B:80:0x0053, B:82:0x0069, B:86:0x0073, B:88:0x007d, B:95:0x009f, B:204:0x008b), top: B:79:0x0053 }] */
    /* JADX WARN: Type inference failed for: r22v0, types: [qwx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i() {
        /*
            Method dump skipped, instructions count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvq.i():void");
    }

    private final void j(String str, long j, String str2) {
        double a = rka.a(j);
        String valueOf = String.valueOf(this.g);
        String concat = str2 != null ? ", ".concat(str2) : "";
        Log.v("DecodeJob", str + " in " + a + ", load key: " + valueOf + concat + ", thread: " + Thread.currentThread().getName());
    }

    private final void k() {
        m();
        qwp qwpVar = new qwp("Failed to load resource", new ArrayList(this.s));
        qvm qvmVar = this.l;
        synchronized (qvmVar) {
            ((qwj) qvmVar).j = qwpVar;
        }
        synchronized (qvmVar) {
            ((qwj) qvmVar).b.a();
            if (((qwj) qvmVar).m) {
                ((qwj) qvmVar).f();
            } else {
                if (((qwj) qvmVar).a.d()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (((qwj) qvmVar).k) {
                    throw new IllegalStateException("Already failed once");
                }
                ((qwj) qvmVar).k = true;
                qtp qtpVar = ((qwj) qvmVar).e;
                qwi b = ((qwj) qvmVar).a.b();
                ((qwj) qvmVar).e(b.a() + 1);
                qwj qwjVar = (qwj) qvmVar;
                qwjVar.d.c(qwjVar, qtpVar, null);
                Iterator<qwh> it = b.iterator();
                while (it.hasNext()) {
                    qwh next = it.next();
                    next.b.execute(new qwf(qwjVar, next.a));
                }
                qwjVar.d();
            }
        }
        if (this.c.c()) {
            b();
        }
    }

    private final void l() {
        this.w = Thread.currentThread();
        int i = rka.a;
        this.v = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.p && this.o != null && !(z = this.o.b())) {
            this.D = e(this.D);
            this.o = h();
            if (this.D == 4) {
                f(2);
                return;
            }
        }
        if ((this.D == 6 || this.p) && !z) {
            k();
        }
    }

    private final void m() {
        Throwable th;
        this.t.a();
        if (!this.B) {
            this.B = true;
            return;
        }
        if (this.s.isEmpty()) {
            th = null;
        } else {
            th = (Throwable) this.s.get(r0.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    public final void b() {
        this.c.a();
        qvn qvnVar = this.b;
        qvnVar.a = null;
        qvnVar.b = null;
        qvnVar.c = null;
        qvl qvlVar = this.a;
        qvlVar.c = null;
        qvlVar.d = null;
        qvlVar.m = null;
        qvlVar.g = null;
        qvlVar.j = null;
        qvlVar.h = null;
        qvlVar.n = null;
        qvlVar.i = null;
        qvlVar.o = null;
        qvlVar.a.clear();
        qvlVar.k = false;
        qvlVar.b.clear();
        qvlVar.l = false;
        this.B = false;
        this.d = null;
        this.e = null;
        this.k = null;
        this.f = null;
        this.g = null;
        this.l = null;
        this.D = 0;
        this.o = null;
        this.w = null;
        this.n = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.v = 0L;
        this.p = false;
        this.s.clear();
        this.u.b(this);
    }

    @Override // defpackage.qvj
    public final void c(qtp qtpVar, Exception exc, qud qudVar, qsy qsyVar) {
        qudVar.e();
        qwp qwpVar = new qwp("Fetching data failed", Collections.singletonList(exc));
        qwpVar.b(qtpVar, qsyVar, qudVar.a());
        this.s.add(qwpVar);
        if (Thread.currentThread() != this.w) {
            f(2);
        } else {
            l();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        qvq qvqVar = (qvq) obj;
        int g = g() - qvqVar.g();
        return g == 0 ? this.m - qvqVar.m : g;
    }

    @Override // defpackage.qvj
    public final void d(qtp qtpVar, Object obj, qud qudVar, qsy qsyVar, qtp qtpVar2) {
        this.n = qtpVar;
        this.y = obj;
        this.A = qudVar;
        this.z = qsyVar;
        this.x = qtpVar2;
        this.C = qtpVar != this.a.e().get(0);
        if (Thread.currentThread() == this.w) {
            i();
        } else {
            f(3);
        }
    }

    public final int e(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            if (this.j.b()) {
                return 2;
            }
            return e(2);
        }
        if (i2 == 1) {
            if (this.j.a()) {
                return 3;
            }
            return e(3);
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3 || i2 == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(qvp.a(i)));
    }

    @Override // defpackage.rkn
    public final rkr eW() {
        return this.t;
    }

    public final void f(int i) {
        this.q = i;
        ((qwj) this.l).b().execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        qud qudVar = this.A;
        try {
            try {
                if (this.p) {
                    k();
                } else {
                    int i = this.q;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    if (i2 == 0) {
                        this.D = e(1);
                        this.o = h();
                        l();
                    } else if (i2 == 1) {
                        l();
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
                        }
                        i();
                    }
                }
            } finally {
                if (qudVar != null) {
                    qudVar.e();
                }
            }
        } catch (qvf e) {
            throw e;
        } catch (Throwable th) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.p + ", stage: " + qvp.a(this.D), th);
            }
            if (this.D != 5) {
                this.s.add(th);
                k();
            }
            if (!this.p) {
                throw th;
            }
            throw th;
        }
    }
}
