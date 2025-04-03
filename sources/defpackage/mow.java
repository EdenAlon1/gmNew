package defpackage;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mow implements mpm {
    public final mot a;
    public final long b;
    public final List c;
    public final Set d;
    public final Set e;
    public int f;
    public mom g;
    public mom h;
    public Looper i;
    public Handler j;
    public byte[] k;
    volatile moo l;
    private final UUID n;
    private final HashMap o;
    private final int[] p;
    private final mov q;
    private mps r;
    private mlu s;
    private final mpw t;

    public mow(UUID uuid, mpw mpwVar, HashMap hashMap, int[] iArr) {
        lti.b(!lpn.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.n = uuid;
        this.t = mpwVar;
        this.o = hashMap;
        this.p = iArr;
        this.a = new mot();
        this.q = new mov(this);
        this.c = new ArrayList();
        this.d = enpw.j();
        this.e = enpw.j();
        this.b = 300000L;
    }

    private final mom i(List list, boolean z, mph mphVar) {
        lti.f(this.r);
        mps mpsVar = this.r;
        byte[] bArr = this.k;
        Looper looper = this.i;
        lti.f(looper);
        mlu mluVar = this.s;
        lti.f(mluVar);
        HashMap hashMap = this.o;
        mpw mpwVar = this.t;
        mom momVar = new mom(this.n, mpsVar, this.a, this.q, list, true, z, bArr, hashMap, mpwVar, looper, mluVar);
        momVar.e(mphVar);
        momVar.e(null);
        return momVar;
    }

    private final mom j(List list, boolean z, mph mphVar, boolean z2) {
        mom i = i(list, z, mphVar);
        if (p(i) && !this.e.isEmpty()) {
            m();
            q(i, mphVar);
            i = i(list, z, mphVar);
        }
        if (!p(i) || !z2 || this.d.isEmpty()) {
            return i;
        }
        n();
        if (!this.e.isEmpty()) {
            m();
        }
        q(i, mphVar);
        return i(list, z, mphVar);
    }

    private static List k(lpw lpwVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(lpwVar.b);
        for (int i = 0; i < lpwVar.b; i++) {
            lpv a = lpwVar.a(i);
            if ((a.a(uuid) || (lpn.c.equals(uuid) && a.a(lpn.b))) && (a.d != null || z)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    private final synchronized void l(Looper looper) {
        Looper looper2 = this.i;
        if (looper2 == null) {
            this.i = looper;
            this.j = new Handler(looper);
        } else {
            lti.c(looper2 == looper);
            lti.f(this.j);
        }
    }

    private final void m() {
        enqu listIterator = enip.o(this.e).listIterator();
        while (listIterator.hasNext()) {
            ((mpa) listIterator.next()).j(null);
        }
    }

    private final void n() {
        enqu listIterator = enip.o(this.d).listIterator();
        while (listIterator.hasNext()) {
            ((mos) listIterator.next()).a();
        }
    }

    private final void o(boolean z) {
        if (z && this.i == null) {
            luj.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.i;
        lti.f(looper);
        if (currentThread != looper.getThread()) {
            luj.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.i.getThread().getName(), new IllegalStateException());
        }
    }

    private static boolean p(mpa mpaVar) {
        if (mpaVar.a() != 1) {
            return false;
        }
        moz c = mpaVar.c();
        lti.f(c);
        Throwable cause = c.getCause();
        return (cause instanceof ResourceBusyException) || mpn.b(cause);
    }

    private static final void q(mpa mpaVar, mph mphVar) {
        mpaVar.j(mphVar);
        mpaVar.j(null);
    }

    @Override // defpackage.mpm
    public final int a(lqc lqcVar) {
        o(false);
        mps mpsVar = this.r;
        lti.f(mpsVar);
        int a = mpsVar.a();
        lpw lpwVar = lqcVar.s;
        if (lpwVar == null) {
            if (lvf.p(this.p, lre.b(lqcVar.o)) == -1) {
                return 0;
            }
        } else if (this.k == null) {
            if (k(lpwVar, this.n, true).isEmpty()) {
                if (lpwVar.b == 1 && lpwVar.a(0).a(lpn.b)) {
                    luj.f("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: ".concat(this.n.toString()));
                }
                return 1;
            }
            String str = lpwVar.a;
            if (str != null && !"cenc".equals(str)) {
                if ("cbcs".equals(str)) {
                    int i = lvf.a;
                    return a;
                }
                if ("cbc1".equals(str) || "cens".equals(str)) {
                    return 1;
                }
            }
        }
        return a;
    }

    @Override // defpackage.mpm
    public final mpa b(mph mphVar, lqc lqcVar) {
        o(false);
        lti.c(this.f > 0);
        lti.g(this.i);
        return c(this.i, mphVar, lqcVar, true);
    }

    public final mpa c(Looper looper, mph mphVar, lqc lqcVar, boolean z) {
        if (this.l == null) {
            this.l = new moo(this, looper);
        }
        lpw lpwVar = lqcVar.s;
        List list = null;
        if (lpwVar != null) {
            if (this.k == null) {
                list = k(lpwVar, this.n, false);
                if (list.isEmpty()) {
                    mop mopVar = new mop(this.n);
                    luj.d("DefaultDrmSessionMgr", "DRM error", mopVar);
                    mphVar.d(mopVar);
                    return new mpp(new moz(mopVar, 6003));
                }
            }
            mom momVar = this.h;
            if (momVar != null) {
                momVar.e(mphVar);
                return momVar;
            }
            mom j = j(list, false, mphVar, z);
            this.h = j;
            this.c.add(j);
            return j;
        }
        int b = lre.b(lqcVar.o);
        mps mpsVar = this.r;
        lti.f(mpsVar);
        if ((mpsVar.a() == 2 && mpt.a) || lvf.p(this.p, b) == -1 || mpsVar.a() == 1) {
            return null;
        }
        mom momVar2 = this.g;
        if (momVar2 == null) {
            int i = engw.d;
            mom j2 = j(enou.a, true, null, z);
            this.c.add(j2);
            this.g = j2;
        } else {
            momVar2.e(null);
        }
        return this.g;
    }

    @Override // defpackage.mpm
    public final mpl d(mph mphVar, final lqc lqcVar) {
        lti.c(this.f > 0);
        lti.g(this.i);
        final mos mosVar = new mos(this, mphVar);
        Handler handler = mosVar.d.j;
        lti.f(handler);
        handler.post(new Runnable() { // from class: moq
            @Override // java.lang.Runnable
            public final void run() {
                mos mosVar2 = mos.this;
                mow mowVar = mosVar2.d;
                if (mowVar.f == 0 || mosVar2.c) {
                    return;
                }
                lqc lqcVar2 = lqcVar;
                Looper looper = mowVar.i;
                lti.f(looper);
                mosVar2.b = mowVar.c(looper, mosVar2.a, lqcVar2, false);
                mosVar2.d.d.add(mosVar2);
            }
        });
        return mosVar;
    }

    public final void e() {
        if (this.r != null && this.f == 0 && this.c.isEmpty() && this.d.isEmpty()) {
            mps mpsVar = this.r;
            lti.f(mpsVar);
            mpsVar.h();
            this.r = null;
        }
    }

    @Override // defpackage.mpm
    public final void f() {
        mps mpoVar;
        o(true);
        int i = this.f;
        this.f = i + 1;
        if (i != 0) {
            return;
        }
        if (this.r != null) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                ((mom) this.c.get(i2)).e(null);
            }
            return;
        }
        UUID uuid = this.n;
        try {
            mpoVar = mpv.o(uuid);
        } catch (mpz unused) {
            luj.c("FrameworkMediaDrm", a.b(uuid, "Failed to instantiate a FrameworkMediaDrm for uuid: ", "."));
            mpoVar = new mpo();
        }
        this.r = mpoVar;
        mpoVar.n(new mon(this));
    }

    @Override // defpackage.mpm
    public final void g() {
        o(true);
        int i = this.f - 1;
        this.f = i;
        if (i != 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.c);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((mom) arrayList.get(i2)).j(null);
        }
        n();
        e();
    }

    @Override // defpackage.mpm
    public final void h(Looper looper, mlu mluVar) {
        l(looper);
        this.s = mluVar;
    }
}
