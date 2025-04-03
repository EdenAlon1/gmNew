package defpackage;

import com.android.vcard.VCardConfig;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lyc implements lxw {
    public final lxz[] a;
    public int b;
    private final Thread c;
    private final lya[] g;
    private int h;
    private lxz i;
    private lxx j;
    private boolean k;
    private boolean l;
    private int m;
    private final Object d = new Object();
    private long n = -9223372036854775807L;
    private final ArrayDeque e = new ArrayDeque();
    private final ArrayDeque f = new ArrayDeque();

    protected lyc(lxz[] lxzVarArr, lya[] lyaVarArr) {
        this.a = lxzVarArr;
        this.b = lxzVarArr.length;
        for (int i = 0; i < this.b; i++) {
            this.a[i] = i();
        }
        this.g = lyaVarArr;
        this.h = lyaVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.g[i2] = k();
        }
        lyb lybVar = new lyb(this);
        this.c = lybVar;
        lybVar.start();
    }

    private final void p() {
        if (s()) {
            this.d.notify();
        }
    }

    private final void r(lxz lxzVar) {
        lxzVar.eO();
        int i = this.b;
        this.b = i + 1;
        this.a[i] = lxzVar;
    }

    private final boolean s() {
        return !this.e.isEmpty() && this.h > 0;
    }

    private final void t() {
        lxx lxxVar = this.j;
        if (lxxVar != null) {
            throw lxxVar;
        }
    }

    @Override // defpackage.lxw
    public final void c() {
        synchronized (this.d) {
            this.k = true;
            this.m = 0;
            lxz lxzVar = this.i;
            if (lxzVar != null) {
                r(lxzVar);
                this.i = null;
            }
            while (!this.e.isEmpty()) {
                r((lxz) this.e.removeFirst());
            }
            while (!this.f.isEmpty()) {
                ((lya) this.f.removeFirst()).h();
            }
        }
    }

    @Override // defpackage.lxw
    public final void e() {
        synchronized (this.d) {
            this.l = true;
            this.d.notify();
        }
        try {
            this.c.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.lxw
    public final void f(long j) {
        synchronized (this.d) {
            boolean z = true;
            if (this.b != this.a.length && !this.k) {
                z = false;
            }
            lti.c(z);
            this.n = j;
        }
    }

    protected abstract lxx g(Throwable th);

    protected abstract lxx h(lxz lxzVar, lya lyaVar, boolean z);

    protected abstract lxz i();

    @Override // defpackage.lxw
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final lxz a() {
        lxz lxzVar;
        synchronized (this.d) {
            t();
            lti.c(this.i == null);
            int i = this.b;
            if (i == 0) {
                lxzVar = null;
            } else {
                lxz[] lxzVarArr = this.a;
                int i2 = i - 1;
                this.b = i2;
                lxzVar = lxzVarArr[i2];
            }
            this.i = lxzVar;
        }
        return lxzVar;
    }

    protected abstract lya k();

    @Override // defpackage.lxw
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final lya b() {
        synchronized (this.d) {
            t();
            if (this.f.isEmpty()) {
                return null;
            }
            return (lya) this.f.removeFirst();
        }
    }

    @Override // defpackage.lxw
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void d(lxz lxzVar) {
        synchronized (this.d) {
            t();
            lti.a(lxzVar == this.i);
            this.e.addLast(lxzVar);
            p();
            this.i = null;
        }
    }

    public final void n(lya lyaVar) {
        synchronized (this.d) {
            lyaVar.eO();
            lya[] lyaVarArr = this.g;
            int i = this.h;
            this.h = i + 1;
            lyaVarArr[i] = lyaVar;
            p();
        }
    }

    public final boolean o() {
        boolean z;
        lxx g;
        synchronized (this.d) {
            while (!this.l && !s()) {
                this.d.wait();
            }
            if (this.l) {
                return false;
            }
            lxz lxzVar = (lxz) this.e.removeFirst();
            lya[] lyaVarArr = this.g;
            int i = this.h - 1;
            this.h = i;
            lya lyaVar = lyaVarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (lxzVar.eR()) {
                lyaVar.eP(4);
            } else {
                lyaVar.b = lxzVar.f;
                if (lxzVar.eQ(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)) {
                    lyaVar.eP(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
                }
                long j = lxzVar.f;
                synchronized (this.d) {
                    long j2 = this.n;
                    if (j2 != -9223372036854775807L && j < j2) {
                        z = false;
                    }
                    z = true;
                }
                if (!z) {
                    lyaVar.d = true;
                }
                try {
                    g = h(lxzVar, lyaVar, z2);
                } catch (OutOfMemoryError e) {
                    g = g(e);
                } catch (RuntimeException e2) {
                    g = g(e2);
                }
                if (g != null) {
                    synchronized (this.d) {
                        this.j = g;
                    }
                    return false;
                }
            }
            synchronized (this.d) {
                if (this.k) {
                    lyaVar.h();
                } else if (lyaVar.d) {
                    this.m++;
                    lyaVar.h();
                } else {
                    lyaVar.c = this.m;
                    this.m = 0;
                    this.f.addLast(lyaVar);
                }
                r(lxzVar);
            }
            return true;
        }
    }
}
