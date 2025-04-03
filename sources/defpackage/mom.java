package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mom implements mpa {
    public final List a;
    public final mps b;
    public final UUID c;
    public final mok d;
    public int e;
    public byte[] f;
    public mpr g;
    public final mot h;
    public final mpw i;
    private final boolean j = true;
    private final boolean k;
    private final HashMap l;
    private final ltt m;
    private final mlu n;
    private final Looper o;
    private int p;
    private HandlerThread q;
    private moi r;
    private lxt s;
    private moz t;
    private byte[] u;
    private mpq v;
    private final mov w;

    public mom(UUID uuid, mps mpsVar, mot motVar, mov movVar, List list, boolean z, boolean z2, byte[] bArr, HashMap hashMap, mpw mpwVar, Looper looper, mlu mluVar) {
        this.c = uuid;
        this.h = motVar;
        this.w = movVar;
        this.b = mpsVar;
        this.k = z2;
        if (bArr != null) {
            this.u = bArr;
            this.a = null;
        } else {
            lti.f(list);
            this.a = DesugarCollections.unmodifiableList(list);
        }
        this.l = hashMap;
        this.i = mpwVar;
        this.m = new ltt();
        this.n = mluVar;
        this.e = 2;
        this.o = looper;
        this.d = new mok(this, looper);
    }

    private final void p(lts ltsVar) {
        Set set;
        ltt lttVar = this.m;
        synchronized (lttVar.a) {
            set = lttVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ltsVar.a((mph) it.next());
        }
    }

    private final void q(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || mpn.a(th)) {
            this.h.b(this);
        } else {
            g(th, true != z ? 2 : 1);
        }
    }

    private final void r(byte[] bArr, int i, boolean z) {
        try {
            this.v = this.b.c(bArr, this.a, i, this.l);
            moi moiVar = this.r;
            int i2 = lvf.a;
            mpq mpqVar = this.v;
            lti.f(mpqVar);
            moiVar.a(2, mpqVar, z);
        } catch (Exception | NoSuchMethodError e) {
            q(e, true);
        }
    }

    private final boolean s() {
        try {
            this.b.i(this.f, this.u);
            return true;
        } catch (Exception | NoSuchMethodError e) {
            g(e, 1);
            return false;
        }
    }

    @Override // defpackage.mpa
    public final int a() {
        k();
        return this.e;
    }

    @Override // defpackage.mpa
    public final lxt b() {
        k();
        return this.s;
    }

    @Override // defpackage.mpa
    public final moz c() {
        k();
        if (this.e == 1) {
            return this.t;
        }
        return null;
    }

    @Override // defpackage.mpa
    public final UUID d() {
        k();
        return this.c;
    }

    @Override // defpackage.mpa
    public final void e(mph mphVar) {
        k();
        int i = this.p;
        if (i < 0) {
            luj.c("DefaultDrmSession", a.h(i, "Session reference count less than zero: "));
            this.p = 0;
        }
        if (mphVar != null) {
            ltt lttVar = this.m;
            synchronized (lttVar.a) {
                ArrayList arrayList = new ArrayList(lttVar.d);
                arrayList.add(mphVar);
                lttVar.d = DesugarCollections.unmodifiableList(arrayList);
                Integer num = (Integer) lttVar.b.get(mphVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(lttVar.c);
                    hashSet.add(mphVar);
                    lttVar.c = DesugarCollections.unmodifiableSet(hashSet);
                }
                lttVar.b.put(mphVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i2 = this.p + 1;
        this.p = i2;
        if (i2 == 1) {
            lti.c(this.e == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new moi(this, this.q.getLooper());
            if (m()) {
                f(true);
            }
        } else if (mphVar != null && l() && this.m.a(mphVar) == 1) {
            mphVar.c(this.e);
        }
        mov movVar = this.w;
        movVar.a.e.remove(this);
        Handler handler = movVar.a.j;
        lti.f(handler);
        handler.removeCallbacksAndMessages(this);
    }

    public final void f(boolean z) {
        long min;
        if (this.k) {
            return;
        }
        byte[] bArr = this.f;
        int i = lvf.a;
        if (this.u == null) {
            r(bArr, 1, z);
            return;
        }
        if (this.e == 4 || s()) {
            if (lpn.d.equals(this.c)) {
                k();
                byte[] bArr2 = this.f;
                Map e = bArr2 == null ? null : this.b.e(bArr2);
                Pair pair = e != null ? new Pair(Long.valueOf(mqa.a(e, "LicenseDurationRemaining")), Long.valueOf(mqa.a(e, "PlaybackDurationRemaining"))) : null;
                lti.f(pair);
                min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
            } else {
                min = Long.MAX_VALUE;
            }
            if (min <= 60) {
                luj.b("DefaultDrmSession", a.s(min, "Offline license has expired or will expire soon. Remaining seconds: "));
                r(bArr, 2, z);
            } else {
                this.e = 4;
                p(new lts() { // from class: moh
                    @Override // defpackage.lts
                    public final void a(Object obj) {
                        ((mph) obj).b();
                    }
                });
            }
        }
    }

    public final void g(final Throwable th, int i) {
        int i2;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            i2 = lvf.j(lvf.k(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else {
            int i3 = lvf.a;
            if (!(th instanceof MediaDrmResetException)) {
                if (!(th instanceof NotProvisionedException) && !mpn.a(th)) {
                    if (th instanceof DeniedByServerException) {
                        i2 = 6007;
                    } else if (th instanceof mpz) {
                        i2 = 6001;
                    } else if (th instanceof mop) {
                        i2 = 6003;
                    } else if (th instanceof mpx) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.t = new moz(th, i2);
        luj.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            p(new lts() { // from class: mog
                @Override // defpackage.lts
                public final void a(Object obj) {
                    ((mph) obj).d((Exception) th);
                }
            });
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!mpn.b(th) && !mpn.a(th)) {
                throw ((Error) th);
            }
        }
        if (this.e != 4) {
            this.e = 1;
        }
    }

    public final void h(Object obj, Object obj2) {
        if (obj == this.v && l()) {
            this.v = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                q((Throwable) obj2, false);
                return;
            }
            try {
                byte[] m = this.b.m(this.f, (byte[]) obj2);
                if (this.u != null && m != null && m.length != 0) {
                    this.u = m;
                }
                this.e = 4;
                p(new lts() { // from class: mof
                    @Override // defpackage.lts
                    public final void a(Object obj3) {
                        ((mph) obj3).a();
                    }
                });
            } catch (Exception | NoSuchMethodError e) {
                q(e, true);
            }
        }
    }

    final void i() {
        this.g = this.b.d();
        moi moiVar = this.r;
        int i = lvf.a;
        mpr mprVar = this.g;
        lti.f(mprVar);
        moiVar.a(1, mprVar, true);
    }

    @Override // defpackage.mpa
    public final void j(mph mphVar) {
        k();
        int i = this.p;
        if (i <= 0) {
            luj.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.p = i2;
        if (i2 == 0) {
            this.e = 0;
            mok mokVar = this.d;
            int i3 = lvf.a;
            mokVar.removeCallbacksAndMessages(null);
            this.r.b();
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.v = null;
            this.g = null;
            byte[] bArr = this.f;
            if (bArr != null) {
                this.b.f(bArr);
                this.f = null;
            }
        }
        if (mphVar != null) {
            ltt lttVar = this.m;
            synchronized (lttVar.a) {
                Integer num = (Integer) lttVar.b.get(mphVar);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(lttVar.d);
                    arrayList.remove(mphVar);
                    lttVar.d = DesugarCollections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        lttVar.b.remove(mphVar);
                        HashSet hashSet = new HashSet(lttVar.c);
                        hashSet.remove(mphVar);
                        lttVar.c = DesugarCollections.unmodifiableSet(hashSet);
                    } else {
                        lttVar.b.put(mphVar, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
            if (this.m.a(mphVar) == 0) {
                mphVar.e();
            }
        }
        mov movVar = this.w;
        int i4 = this.p;
        if (i4 == 1) {
            mow mowVar = movVar.a;
            if (mowVar.f > 0) {
                mowVar.e.add(this);
                Handler handler = movVar.a.j;
                lti.f(handler);
                handler.postAtTime(new Runnable() { // from class: mou
                    @Override // java.lang.Runnable
                    public final void run() {
                        mom.this.j(null);
                    }
                }, this, SystemClock.uptimeMillis() + movVar.a.b);
            }
        } else if (i4 == 0) {
            movVar.a.c.remove(this);
            mow mowVar2 = movVar.a;
            if (mowVar2.g == this) {
                mowVar2.g = null;
            }
            if (mowVar2.h == this) {
                mowVar2.h = null;
            }
            mot motVar = mowVar2.a;
            motVar.a.remove(this);
            if (motVar.b == this) {
                motVar.b = null;
                if (!motVar.a.isEmpty()) {
                    motVar.b = (mom) motVar.a.iterator().next();
                    motVar.b.i();
                }
            }
            Handler handler2 = movVar.a.j;
            lti.f(handler2);
            handler2.removeCallbacksAndMessages(this);
            movVar.a.e.remove(this);
        }
        movVar.a.e();
    }

    public final void k() {
        if (Thread.currentThread() != this.o.getThread()) {
            luj.g("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.o.getThread().getName(), new IllegalStateException());
        }
    }

    public final boolean l() {
        int i = this.e;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m() {
        /*
            r4 = this;
            boolean r0 = r4.l()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            mps r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r0.l()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            mps r2 = r4.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            mlu r3 = r4.n     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.j(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            mps r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r2 = r4.f     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            lxt r0 = r0.b(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.s = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0 = 3
            r4.e = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            moe r0 = new moe     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0.<init>()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.p(r0)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r4.f     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            defpackage.lti.f(r0)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            return r1
        L32:
            r0 = move-exception
            goto L35
        L34:
            r0 = move-exception
        L35:
            boolean r2 = defpackage.mpn.a(r0)
            if (r2 == 0) goto L41
            mot r0 = r4.h
            r0.b(r4)
            goto L4a
        L41:
            r4.g(r0, r1)
            goto L4a
        L45:
            mot r0 = r4.h
            r0.b(r4)
        L4a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mom.m():boolean");
    }

    @Override // defpackage.mpa
    public final boolean n() {
        k();
        return true;
    }

    @Override // defpackage.mpa
    public final boolean o(String str) {
        k();
        byte[] bArr = this.f;
        lti.g(bArr);
        return this.b.k(bArr, str);
    }
}
