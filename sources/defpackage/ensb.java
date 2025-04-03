package defpackage;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ensb implements ensk, entl {
    private static final String a = new String();
    private final Level b;
    private final long c;
    private ensa d;
    private ense e;
    private enss f;
    private enup g;
    private Object[] h;

    protected ensb(Level level) {
        long b = Cenum.b();
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        level.getClass();
        this.b = level;
        this.c = b;
    }

    private final void ab(String str, Object... objArr) {
        this.h = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof enrw) {
                objArr[i] = ((enrw) obj).a();
            }
        }
        if (str != a) {
            this.g = new enup(b(), str);
        }
        enwo k = Cenum.k();
        if (!k.b()) {
            enwo enwoVar = (enwo) i().d(enrz.h);
            if (enwoVar != null) {
                k = k.a(enwoVar);
            }
            n(enrz.h, k);
        }
        enrg a2 = a();
        try {
            enxd a3 = enxd.a();
            int i2 = a3.a + 1;
            a3.a = i2;
            if (i2 == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i2 <= 100) {
                    a2.b.b(this);
                } else {
                    enrg.l("unbounded recursion in log statement", this);
                }
                if (a3 != null) {
                    a3.close();
                }
            } finally {
            }
        } catch (RuntimeException e) {
            try {
                a2.b.g(e, this);
            } catch (entp e2) {
                throw e2;
            } catch (RuntimeException e3) {
                enrg.l(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private final boolean ac() {
        ensf ensfVar;
        ensa ensaVar;
        int i;
        if (this.e == null) {
            this.e = Cenum.g().a(ensb.class, 1);
        }
        if (this.e != ense.a) {
            ensfVar = this.e;
            ensa ensaVar2 = this.d;
            if (ensaVar2 != null && (i = ensaVar2.b) > 0) {
                ensfVar.getClass();
                for (int i2 = 0; i2 < i; i2++) {
                    if (enrz.f.equals(ensaVar2.c(i2))) {
                        Object e = ensaVar2.e(i2);
                        ensfVar = e instanceof ensl ? ((ensl) e).b() : new ensw(ensfVar, e);
                    }
                }
            }
        } else {
            ensfVar = null;
        }
        boolean c = c(ensfVar);
        enss enssVar = this.f;
        if (enssVar == null) {
            return c;
        }
        ensr ensrVar = (ensr) ensr.a.b(ensfVar, this.d);
        int incrementAndGet = ensrVar.c.incrementAndGet();
        int i3 = -1;
        if (enssVar != enss.c && ensrVar.b.compareAndSet(false, true)) {
            try {
                enssVar.a();
                ensrVar.b.set(false);
                ensrVar.c.addAndGet(-incrementAndGet);
                i3 = (-1) + incrementAndGet;
            } catch (Throwable th) {
                ensrVar.b.set(false);
                throw th;
            }
        }
        if (c && i3 > 0 && (ensaVar = this.d) != null) {
            ensaVar.f(enrz.e, Integer.valueOf(i3));
        }
        return c & (i3 >= 0);
    }

    @Override // defpackage.ensk
    public final void A(String str, long j, Object obj) {
        if (ac()) {
            ab(str, Long.valueOf(j), obj);
        }
    }

    @Override // defpackage.ensk
    public final void B(String str, Object obj, int i) {
        if (ac()) {
            ab(str, obj, Integer.valueOf(i));
        }
    }

    @Override // defpackage.ensk
    public final void C(String str, Object obj, long j) {
        if (ac()) {
            ab(str, obj, Long.valueOf(j));
        }
    }

    @Override // defpackage.ensk
    public final void D(String str, Object obj, Object obj2) {
        if (ac()) {
            ab(str, obj, obj2);
        }
    }

    @Override // defpackage.ensk
    public final void E(String str, Object obj, boolean z) {
        if (ac()) {
            ab(str, obj, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.ensk
    public final void F(String str, boolean z, int i) {
        if (ac()) {
            ab(str, Boolean.valueOf(z), Integer.valueOf(i));
        }
    }

    @Override // defpackage.ensk
    public final void G(String str, boolean z, long j) {
        if (ac()) {
            ab(str, Boolean.valueOf(z), Long.valueOf(j));
        }
    }

    @Override // defpackage.ensk
    public final void H(String str, boolean z, Object obj) {
        if (ac()) {
            ab(str, Boolean.valueOf(z), obj);
        }
    }

    @Override // defpackage.ensk
    public final void I(String str, boolean z, boolean z2) {
        if (ac()) {
            ab(str, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    @Override // defpackage.ensk
    public final void J(String str, Object obj, Object obj2, Object obj3) {
        if (ac()) {
            ab(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.ensk
    public final void K(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (ac()) {
            ab(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.ensk
    public final void L(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (ac()) {
            ab(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // defpackage.ensk
    public final void M(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (ac()) {
            ab(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // defpackage.ensk
    public final void N(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (ac()) {
            ab(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // defpackage.ensk
    public final void O(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (ac()) {
            ab(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    @Override // defpackage.ensk
    public final void P(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object... objArr) {
        if (ac()) {
            int length = objArr.length;
            Object[] objArr2 = new Object[length + 10];
            objArr2[0] = obj;
            objArr2[1] = obj2;
            objArr2[2] = obj3;
            objArr2[3] = obj4;
            objArr2[4] = obj5;
            objArr2[5] = obj6;
            objArr2[6] = obj7;
            objArr2[7] = obj8;
            objArr2[8] = obj9;
            objArr2[9] = obj10;
            System.arraycopy(objArr, 0, objArr2, 10, length);
            ab(str, objArr2);
        }
    }

    @Override // defpackage.ensk
    public final void Q(String str, Object[] objArr) {
        if (ac()) {
            ab(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.ensk
    public final boolean R() {
        return S() || a().m(this.b);
    }

    @Override // defpackage.entl
    public final boolean S() {
        return this.d != null && Boolean.TRUE.equals(this.d.d(enrz.g));
    }

    @Override // defpackage.entl
    public final Object[] T() {
        enxb.b(this.g != null, "cannot get arguments unless a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr;
        }
        throw new IllegalStateException("cannot get arguments before calling log()");
    }

    @Override // defpackage.ensk
    public final void U(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (ac()) {
            ab("Transition threw:\n   from: %s (%s)\n   from target: %s (%s)\n   to: %s (%s)\n   to target: %s (%s)\n   requestId: %s", obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        }
    }

    @Override // defpackage.ensk
    public final void V(Object obj) {
        if (ac()) {
            ab("Result of audio playback (volume: %f) : %s", Float.valueOf(0.25f), obj);
        }
    }

    @Override // defpackage.ensk
    public final void W(int i, TimeUnit timeUnit) {
        if (S()) {
            return;
        }
        ensn ensnVar = enrz.d;
        ensh enshVar = enrl.a;
        n(ensnVar, new enrk(i, timeUnit));
    }

    @Override // defpackage.ensk
    public final void X(int i) {
        ensn ensnVar = enrz.b;
        if (S()) {
            return;
        }
        if (i <= 0) {
            throw new IllegalArgumentException("rate limit count must be positive");
        }
        if (i > 1) {
            n(ensnVar, Integer.valueOf(i));
        }
    }

    @Override // defpackage.ensk
    public final void Y(ensn ensnVar, Object obj) {
        ensnVar.getClass();
        if (obj != null) {
            n(ensnVar, obj);
        }
    }

    @Override // defpackage.ensk
    public final void Z(ense enseVar) {
        if (this.e == null) {
            this.e = enseVar;
        }
    }

    protected abstract enrg a();

    @Override // defpackage.ensk
    public final void aa(ensy ensyVar) {
        ensyVar.getClass();
        if (ensyVar != ensy.NONE) {
            n(enrz.i, ensyVar);
        }
    }

    protected abstract enwx b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [enss] */
    /* JADX WARN: Type inference failed for: r14v10, types: [enss] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [enss] */
    /* JADX WARN: Type inference failed for: r14v9, types: [ensv] */
    /* JADX WARN: Type inference failed for: r3v9, types: [enss] */
    protected boolean c(ensf ensfVar) {
        int a2;
        int i;
        enrl enrlVar;
        enri enriVar;
        ?? r14;
        ensa ensaVar = this.d;
        if (ensaVar != null) {
            if (ensfVar != null) {
                long j = this.c;
                ensh enshVar = enrl.a;
                enrk enrkVar = (enrk) ensaVar.d(enrz.d);
                if (enrkVar == null) {
                    enrlVar = null;
                } else {
                    enrl enrlVar2 = (enrl) enrl.a.b(ensfVar, ensaVar);
                    enxb.a(j >= 0, "timestamp cannot be negative");
                    long j2 = enrlVar2.b.get();
                    if (j2 >= 0) {
                        long nanos = enrkVar.b.toNanos(enrkVar.a) + j2;
                        if (nanos < 0 || j < nanos) {
                            enrlVar = enrl.c;
                        }
                    }
                    enrlVar2.b.compareAndSet(j2, -j);
                    enrlVar = enrlVar2;
                }
                ensa ensaVar2 = this.d;
                ensh enshVar2 = enri.a;
                if (((Integer) ensaVar2.d(enrz.b)) == null) {
                    enriVar = null;
                } else {
                    enri enriVar2 = (enri) enri.a.b(ensfVar, ensaVar2);
                    AtomicLong atomicLong = enriVar2.b;
                    enriVar = enriVar2;
                    if (atomicLong.incrementAndGet() < r4.intValue()) {
                        enriVar = enri.c;
                    }
                }
                enss b = enss.b(enrlVar, enriVar);
                ensa ensaVar3 = this.d;
                ensh enshVar3 = ensv.a;
                Integer num = (Integer) ensaVar3.d(enrz.c);
                if (num == null || num.intValue() <= 0) {
                    r14 = 0;
                } else {
                    r14 = (ensv) ensv.a.b(ensfVar, ensaVar3);
                    if ((((Random) ensv.b.get()).nextInt(num.intValue()) == 0 ? r14.e.incrementAndGet() : r14.e.get()) <= 0) {
                        r14 = ensv.c;
                    }
                }
                enss b2 = enss.b(b, r14);
                this.f = b2;
                if (b2 == enss.c) {
                    return false;
                }
            }
            ensy ensyVar = (ensy) this.d.d(enrz.i);
            if (ensyVar != null) {
                ensn ensnVar = enrz.i;
                ensa ensaVar4 = this.d;
                if (ensaVar4 != null && (a2 = ensaVar4.a(ensnVar)) >= 0) {
                    int i2 = a2 + a2;
                    int i3 = i2 + 2;
                    while (true) {
                        i = ensaVar4.b;
                        if (i3 >= i + i) {
                            break;
                        }
                        Object obj = ensaVar4.a[i3];
                        if (!obj.equals(ensnVar)) {
                            Object[] objArr = ensaVar4.a;
                            objArr[i2] = obj;
                            objArr[i2 + 1] = objArr[i3 + 1];
                            i2 += 2;
                        }
                        i3 += 2;
                    }
                    ensaVar4.b = i - ((i3 - i2) >> 1);
                    while (i2 < i3) {
                        ensaVar4.a[i2] = null;
                        i2++;
                    }
                }
                n(enrz.a, new ensi((Throwable) i().d(enrz.a), ensyVar, enxa.b(ensb.class, ensyVar.f, 1)));
            }
        }
        return true;
    }

    @Override // defpackage.entl
    public final long d() {
        return this.c;
    }

    @Override // defpackage.entl
    public final ense e() {
        ense enseVar = this.e;
        if (enseVar != null) {
            return enseVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // defpackage.ensk
    public final ensk f(String str) {
        Y(enrz.f, str);
        return this;
    }

    @Override // defpackage.ensk
    public final ensk g(Throwable th) {
        Y(enrz.a, th);
        return this;
    }

    @Override // defpackage.ensk
    public final ensk h(String str, String str2, int i, String str3) {
        ense enseVar = ense.a;
        Z(new ensd(str, str2, i, str3));
        return this;
    }

    @Override // defpackage.entl
    public final ents i() {
        ensa ensaVar = this.d;
        return ensaVar != null ? ensaVar : entr.a;
    }

    @Override // defpackage.entl
    public final enup j() {
        return this.g;
    }

    @Override // defpackage.entl
    public final Object k() {
        enxb.b(this.g == null, "cannot get literal argument if a template context exists");
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr[0];
        }
        throw new IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override // defpackage.entl
    public final String l() {
        return a().b.d();
    }

    @Override // defpackage.entl
    public final Level m() {
        return this.b;
    }

    protected final void n(ensn ensnVar, Object obj) {
        if (this.d == null) {
            this.d = new ensa();
        }
        this.d.f(ensnVar, obj);
    }

    @Override // defpackage.ensk
    public final void o() {
        if (ac()) {
            ab(a, "");
        }
    }

    @Override // defpackage.ensk
    public final void p(Object obj) {
        if (ac()) {
            ab("%s", obj);
        }
    }

    @Override // defpackage.ensk
    public final void q(String str) {
        if (ac()) {
            ab(a, str);
        }
    }

    @Override // defpackage.ensk
    public final void r(String str, int i) {
        if (ac()) {
            ab(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.ensk
    public final void s(String str, long j) {
        if (ac()) {
            ab(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.ensk
    public final void t(String str, Object obj) {
        if (ac()) {
            ab(str, obj);
        }
    }

    @Override // defpackage.ensk
    public final void u(String str, int i, int i2) {
        if (ac()) {
            ab(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // defpackage.ensk
    public final void v(String str, int i, long j) {
        if (ac()) {
            ab(str, Integer.valueOf(i), Long.valueOf(j));
        }
    }

    @Override // defpackage.ensk
    public final void w(String str, int i, Object obj) {
        if (ac()) {
            ab(str, Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.ensk
    public final void x(String str, int i, boolean z) {
        if (ac()) {
            ab(str, Integer.valueOf(i), Boolean.valueOf(z));
        }
    }

    @Override // defpackage.ensk
    public final void y(String str, long j, int i) {
        if (ac()) {
            ab(str, Long.valueOf(j), Integer.valueOf(i));
        }
    }

    @Override // defpackage.ensk
    public final void z(String str, long j, long j2) {
        if (ac()) {
            ab(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }
}
