package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
@ffbs
/* loaded from: classes6.dex */
public class ffuq implements ffud, ffro, ffuz {
    private final ffqn a;
    public final ffqn d;

    public ffuq(boolean z) {
        this.d = new ffqn(z ? ffur.g : ffur.f, ffqo.a);
        this.a = new ffqn(null, ffqo.a);
    }

    public static /* synthetic */ CancellationException V(ffuq ffuqVar, Throwable th) {
        return ffuqVar.H(th, null);
    }

    private final boolean W(Throwable th) {
        if (hS()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ffrm I = I();
        return (I == null || I == ffux.a) ? z : I.d(th) || z;
    }

    private static final String X(Object obj) {
        if (!(obj instanceof ffum)) {
            return obj instanceof fftx ? ((fftx) obj).hP() ? "Active" : "New" : obj instanceof ffrt ? "Cancelled" : "Completed";
        }
        ffum ffumVar = (ffum) obj;
        return ffumVar.g() ? "Cancelling" : ffumVar.h() ? "Completing" : "Active";
    }

    private final Object d(Object obj, Object obj2) {
        if (!(obj instanceof fftx)) {
            return ffur.a;
        }
        if (((obj instanceof ffth) || (obj instanceof ffuj)) && !(obj instanceof ffrn) && !(obj2 instanceof ffrt)) {
            fftx fftxVar = (fftx) obj;
            boolean z = ffso.a;
            if (!this.d.d(fftxVar, ffur.a(obj2))) {
                return ffur.c;
            }
            hX(obj2);
            k(fftxVar, obj2);
            return obj2;
        }
        fftx fftxVar2 = (fftx) obj;
        ffuv i = i(fftxVar2);
        if (i == null) {
            return ffur.c;
        }
        Throwable th = null;
        ffum ffumVar = fftxVar2 instanceof ffum ? (ffum) fftxVar2 : null;
        if (ffumVar == null) {
            ffumVar = new ffum(i, null);
        }
        fflb fflbVar = new fflb();
        synchronized (ffumVar) {
            if (ffumVar.h()) {
                return ffur.a;
            }
            ffumVar.b.c = 1;
            if (ffumVar != fftxVar2 && !this.d.d(fftxVar2, ffumVar)) {
                return ffur.c;
            }
            boolean z2 = ffso.a;
            boolean g = ffumVar.g();
            ffrt ffrtVar = obj2 instanceof ffrt ? (ffrt) obj2 : null;
            if (ffrtVar != null) {
                ffumVar.e(ffrtVar.b);
            }
            Throwable d = ffumVar.d();
            boolean z3 = !g;
            Boolean.valueOf(z3).getClass();
            if (true == z3) {
                th = d;
            }
            fflbVar.a = th;
            Throwable th2 = (Throwable) fflbVar.a;
            if (th2 != null) {
                l(i, th2);
            }
            ffrn J = J(i);
            if (J != null && T(ffumVar, J, obj2)) {
                return ffur.b;
            }
            i.j(2);
            ffrn J2 = J(i);
            return (J2 == null || !T(ffumVar, J2, obj2)) ? hY(ffumVar, obj2) : ffur.b;
        }
    }

    private final Throwable f(Object obj) {
        if (obj != null && !(obj instanceof Throwable)) {
            return ((ffuz) obj).G();
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : new ffue(g(), null, this);
    }

    private final ffuv i(fftx fftxVar) {
        ffuv hN = fftxVar.hN();
        if (hN != null) {
            return hN;
        }
        if (fftxVar instanceof ffth) {
            return new ffuv();
        }
        if (fftxVar instanceof ffuj) {
            w((ffuj) fftxVar);
            return null;
        }
        Objects.toString(fftxVar);
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(fftxVar)));
    }

    private final void k(fftx fftxVar, Object obj) {
        ffrm I = I();
        if (I != null) {
            I.hO();
            O(ffux.a);
        }
        ffru ffruVar = null;
        ffrt ffrtVar = obj instanceof ffrt ? (ffrt) obj : null;
        Throwable th = ffrtVar != null ? ffrtVar.b : null;
        if (fftxVar instanceof ffuj) {
            try {
                ((ffuj) fftxVar).a(th);
                return;
            } catch (Throwable th2) {
                hW(new ffru(a.j(this, fftxVar, "Exception in completion handler ", " for "), th2));
                return;
            }
        }
        ffuv hN = fftxVar.hN();
        if (hN != null) {
            hN.j(1);
            Object f = hN.f();
            f.getClass();
            for (fghc fghcVar = (fghc) f; !ffkj.e(fghcVar, hN); fghcVar = fghcVar.h()) {
                if (fghcVar instanceof ffuj) {
                    try {
                        ((ffuj) fghcVar).a(th);
                    } catch (Throwable th3) {
                        if (ffruVar != null) {
                            ffbt.a(ffruVar, th3);
                        } else {
                            ffruVar = new ffru(a.j(this, fghcVar, "Exception in completion handler ", " for "), th3);
                        }
                    }
                }
            }
            if (ffruVar != null) {
                hW(ffruVar);
            }
        }
    }

    private final void l(ffuv ffuvVar, Throwable th) {
        ffuvVar.j(4);
        Object f = ffuvVar.f();
        f.getClass();
        ffru ffruVar = null;
        for (fghc fghcVar = (fghc) f; !ffkj.e(fghcVar, ffuvVar); fghcVar = fghcVar.h()) {
            if (fghcVar instanceof ffuj) {
                ffuj ffujVar = (ffuj) fghcVar;
                if (ffujVar.b()) {
                    try {
                        ffujVar.a(th);
                    } catch (Throwable th2) {
                        if (ffruVar != null) {
                            ffbt.a(ffruVar, th2);
                        } else {
                            ffruVar = new ffru(a.j(this, fghcVar, "Exception in completion handler ", " for "), th2);
                        }
                    }
                }
            }
        }
        if (ffruVar != null) {
            hW(ffruVar);
        }
        W(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [fftw] */
    private final void u(ffth ffthVar) {
        ffuv ffuvVar = new ffuv();
        if (!ffthVar.a) {
            ffuvVar = new fftw(ffuvVar);
        }
        this.d.d(ffthVar, ffuvVar);
    }

    private final void w(ffuj ffujVar) {
        ffuv ffuvVar = new ffuv();
        ffuvVar.f.b(ffujVar);
        ffuvVar.e.b(ffujVar);
        while (true) {
            if (ffujVar.f() != ffujVar) {
                break;
            } else if (ffujVar.e.d(ffujVar, ffuvVar)) {
                ffuvVar.k(ffujVar);
                break;
            }
        }
        this.d.d(ffujVar, ffujVar.h());
    }

    public final int A(Object obj) {
        if (obj instanceof ffth) {
            if (((ffth) obj).a) {
                return 0;
            }
            if (!this.d.d(obj, ffur.g)) {
                return -1;
            }
            N();
            return 1;
        }
        if (!(obj instanceof fftw)) {
            return 0;
        }
        if (!this.d.d(obj, ((fftw) obj).a)) {
            return -1;
        }
        N();
        return 1;
    }

    public final Object B(ffgu ffguVar) {
        Object E;
        ffte b;
        do {
            E = E();
            if (!(E instanceof fftx)) {
                if (!(E instanceof ffrt)) {
                    return ffur.b(E);
                }
                Throwable th = ((ffrt) E).b;
                if (!ffso.b) {
                    throw th;
                }
                if (ffguVar instanceof ffhs) {
                    throw fghn.a(th, (ffhs) ffguVar);
                }
                throw th;
            }
        } while (A(E) < 0);
        ffuk ffukVar = new ffuk(ffhi.c(ffguVar), this);
        ffukVar.B();
        b = ffui.b(this, true, new ffva(ffukVar));
        ffrj.b(ffukVar, b);
        Object m = ffukVar.m();
        if (m == ffhh.a) {
            ffguVar.getClass();
        }
        return m;
    }

    public final Object D() {
        Object E = E();
        if (E instanceof fftx) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (E instanceof ffrt) {
            throw ((ffrt) E).b;
        }
        return ffur.b(E);
    }

    public final Object E() {
        return this.d.a;
    }

    public final Object F(Object obj) {
        Object d;
        do {
            d = d(E(), obj);
            if (d == ffur.a) {
                String j = a.j(obj, this, "Job ", " is already complete or completing, but is being completed with ");
                ffrt ffrtVar = obj instanceof ffrt ? (ffrt) obj : null;
                throw new IllegalStateException(j, ffrtVar != null ? ffrtVar.b : null);
            }
        } while (d == ffur.c);
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // defpackage.ffuz
    public final CancellationException G() {
        CancellationException cancellationException;
        Object E = E();
        if (E instanceof ffum) {
            cancellationException = ((ffum) E).d();
        } else if (E instanceof ffrt) {
            cancellationException = ((ffrt) E).b;
        } else {
            if (E instanceof fftx) {
                Objects.toString(E);
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(E)));
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new ffue("Parent job is ".concat(X(E)), cancellationException, this) : cancellationException2;
    }

    protected final CancellationException H(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = g();
            }
            cancellationException = new ffue(str, th, this);
        }
        return cancellationException;
    }

    public final ffrm I() {
        return (ffrm) this.a.a;
    }

    public final ffrn J(fghc fghcVar) {
        while (fghcVar.hQ()) {
            fghcVar = fghcVar.i();
        }
        while (true) {
            fghcVar = fghcVar.h();
            if (!fghcVar.hQ()) {
                if (fghcVar instanceof ffrn) {
                    return (ffrn) fghcVar;
                }
                if (fghcVar instanceof ffuv) {
                    return null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ffte K(boolean r5, defpackage.ffuj r6) {
        /*
            r4 = this;
            r6.d = r4
        L2:
            java.lang.Object r0 = r4.E()
            boolean r1 = r0 instanceof defpackage.ffth
            if (r1 == 0) goto L1e
            r1 = r0
            ffth r1 = (defpackage.ffth) r1
            boolean r2 = r1.a
            if (r2 == 0) goto L1a
            ffqn r1 = r4.d
            boolean r0 = r1.d(r0, r6)
            if (r0 == 0) goto L2
            goto L5e
        L1a:
            r4.u(r1)
            goto L2
        L1e:
            boolean r1 = r0 instanceof defpackage.fftx
            r2 = 0
            if (r1 == 0) goto L5f
            r1 = r0
            fftx r1 = (defpackage.fftx) r1
            ffuv r3 = r1.hN()
            if (r3 != 0) goto L35
            r0.getClass()
            ffuj r0 = (defpackage.ffuj) r0
            r4.w(r0)
            goto L2
        L35:
            boolean r0 = r6.b()
            if (r0 == 0) goto L57
            boolean r0 = r1 instanceof defpackage.ffum
            if (r0 == 0) goto L42
            ffum r1 = (defpackage.ffum) r1
            goto L43
        L42:
            r1 = r2
        L43:
            if (r1 == 0) goto L49
            java.lang.Throwable r2 = r1.d()
        L49:
            if (r2 != 0) goto L51
            r0 = 5
            boolean r0 = r3.l(r6, r0)
            goto L5c
        L51:
            if (r5 == 0) goto L74
            r6.a(r2)
            goto L74
        L57:
            r0 = 1
            boolean r0 = r3.l(r6, r0)
        L5c:
            if (r0 == 0) goto L2
        L5e:
            return r6
        L5f:
            if (r5 == 0) goto L74
            java.lang.Object r5 = r4.E()
            boolean r0 = r5 instanceof defpackage.ffrt
            if (r0 == 0) goto L6c
            ffrt r5 = (defpackage.ffrt) r5
            goto L6d
        L6c:
            r5 = r2
        L6d:
            if (r5 == 0) goto L71
            java.lang.Throwable r2 = r5.b
        L71:
            r6.a(r2)
        L74:
            ffux r5 = defpackage.ffux.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffuq.K(boolean, ffuj):ffte");
    }

    public void L(Throwable th) {
        P(th);
    }

    protected final void M(ffud ffudVar) {
        boolean z = ffso.a;
        if (ffudVar == null) {
            O(ffux.a);
            return;
        }
        ffudVar.z();
        ffrm q = ffudVar.q(this);
        O(q);
        if (y()) {
            q.hO();
            O(ffux.a);
        }
    }

    public final void O(ffrm ffrmVar) {
        this.a.c(ffrmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0064, code lost:
    
        if (r1 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffuq.P(java.lang.Object):boolean");
    }

    public boolean Q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return P(th) && hM();
    }

    protected boolean R(Throwable th) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean S(java.lang.Object r4) {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3.E()
            java.lang.Object r0 = r3.d(r0, r4)
            fgho r1 = defpackage.ffur.a
            if (r0 != r1) goto Le
            r4 = 0
            return r4
        Le:
            fgho r1 = defpackage.ffur.b
            r2 = 1
            if (r0 == r1) goto L1a
            fgho r1 = defpackage.ffur.c
            if (r0 == r1) goto L0
            r3.hR(r0)
        L1a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffuq.S(java.lang.Object):boolean");
    }

    public final boolean T(ffum ffumVar, ffrn ffrnVar, Object obj) {
        while (ffui.b(ffrnVar.a, false, new fful(this, ffumVar, ffrnVar, obj)) == ffux.a) {
            ffrnVar = J(ffrnVar);
            if (ffrnVar == null) {
                return false;
            }
        }
        return true;
    }

    public final fgis U() {
        ffuo ffuoVar = ffuo.a;
        fflf.e(ffuoVar, 3);
        ffup ffupVar = ffup.a;
        fflf.e(ffupVar, 3);
        return new fgis(this, ffuoVar, ffupVar);
    }

    @Override // defpackage.ffhd
    public final <R> R fold(R r, ffjm<? super R, ? super ffha, ? extends R> ffjmVar) {
        return (R) ffgz.a(this, r, ffjmVar);
    }

    protected String g() {
        return "Job was cancelled";
    }

    @Override // defpackage.ffha, defpackage.ffhd
    public final <E extends ffha> E get(ffhb<E> ffhbVar) {
        return (E) ffgz.b(this, ffhbVar);
    }

    @Override // defpackage.ffha
    public final ffhb<?> getKey() {
        return ffud.c;
    }

    public String h() {
        return ffsp.a(this);
    }

    public boolean hM() {
        return true;
    }

    protected boolean hS() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6 A[Catch: all -> 0x013a, TryCatch #0 {, blocks: (B:8:0x0013, B:10:0x001d, B:11:0x0037, B:13:0x003e, B:15:0x0043, B:17:0x0049, B:18:0x004c, B:20:0x0057, B:22:0x005d, B:25:0x00ad, B:28:0x00b5, B:31:0x00cc, B:32:0x00d0, B:34:0x00d6, B:36:0x00e0, B:41:0x00e8, B:44:0x00ec, B:47:0x00f2, B:55:0x00c8, B:69:0x0068, B:70:0x006c, B:72:0x0072, B:76:0x007f, B:78:0x0083, B:80:0x008d, B:81:0x0091, B:83:0x0097, B:86:0x00a0, B:90:0x00a5, B:101:0x0023, B:103:0x0027, B:104:0x0031, B:106:0x0035, B:107:0x0127, B:108:0x0139), top: B:7:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8 A[Catch: all -> 0x013a, TryCatch #0 {, blocks: (B:8:0x0013, B:10:0x001d, B:11:0x0037, B:13:0x003e, B:15:0x0043, B:17:0x0049, B:18:0x004c, B:20:0x0057, B:22:0x005d, B:25:0x00ad, B:28:0x00b5, B:31:0x00cc, B:32:0x00d0, B:34:0x00d6, B:36:0x00e0, B:41:0x00e8, B:44:0x00ec, B:47:0x00f2, B:55:0x00c8, B:69:0x0068, B:70:0x006c, B:72:0x0072, B:76:0x007f, B:78:0x0083, B:80:0x008d, B:81:0x0091, B:83:0x0097, B:86:0x00a0, B:90:0x00a5, B:101:0x0023, B:103:0x0027, B:104:0x0031, B:106:0x0035, B:107:0x0127, B:108:0x0139), top: B:7:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hY(defpackage.ffum r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffuq.hY(ffum, java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffud
    public final ffte hZ(ffji ffjiVar) {
        return K(true, new ffua(ffjiVar));
    }

    public boolean ia() {
        return false;
    }

    @Override // defpackage.ffhd
    public final ffhd minusKey(ffhb<?> ffhbVar) {
        return ffgz.c(this, ffhbVar);
    }

    @Override // defpackage.ffro
    public final void n(ffuz ffuzVar) {
        P(ffuzVar);
    }

    @Override // defpackage.ffud
    public final Object o(ffgu ffguVar) {
        Object E;
        ffte b;
        do {
            E = E();
            if (!(E instanceof fftx)) {
                ffui.f(ffguVar.u());
                return ffcu.a;
            }
        } while (A(E) < 0);
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        b = ffui.b(this, true, new ffvb(ffrhVar));
        ffrj.b(ffrhVar, b);
        Object m = ffrhVar.m();
        ffhh ffhhVar = ffhh.a;
        if (m == ffhhVar) {
            ffguVar.getClass();
        }
        if (m != ffhhVar) {
            m = ffcu.a;
        }
        return m == ffhhVar ? m : ffcu.a;
    }

    @Override // defpackage.ffud
    public final CancellationException p() {
        Object E = E();
        if (!(E instanceof ffum)) {
            if (!(E instanceof fftx)) {
                return E instanceof ffrt ? V(this, ((ffrt) E).b) : new ffue(String.valueOf(ffsp.a(this)).concat(" has completed normally"), null, this);
            }
            toString();
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        Throwable d = ((ffum) E).d();
        if (d != null) {
            return H(d, String.valueOf(ffsp.a(this)).concat(" is cancelling"));
        }
        toString();
        throw new IllegalStateException("Job is still new or active: ".concat(toString()));
    }

    @Override // defpackage.ffhd
    public final ffhd plus(ffhd ffhdVar) {
        return ffgz.d(this, ffhdVar);
    }

    @Override // defpackage.ffud
    public final ffrm q(ffro ffroVar) {
        ffrn ffrnVar = new ffrn(ffroVar);
        ffrnVar.d = this;
        while (true) {
            Object E = E();
            if (E instanceof ffth) {
                ffth ffthVar = (ffth) E;
                if (!ffthVar.a) {
                    u(ffthVar);
                } else if (this.d.d(E, ffrnVar)) {
                    break;
                }
            } else {
                if (!(E instanceof fftx)) {
                    Object E2 = E();
                    ffrt ffrtVar = E2 instanceof ffrt ? (ffrt) E2 : null;
                    ffrnVar.a(ffrtVar != null ? ffrtVar.b : null);
                    return ffux.a;
                }
                ffuv hN = ((fftx) E).hN();
                if (hN == null) {
                    E.getClass();
                    w((ffuj) E);
                } else if (!hN.l(ffrnVar, 7)) {
                    boolean l = hN.l(ffrnVar, 3);
                    Object E3 = E();
                    if (E3 instanceof ffum) {
                        r2 = ((ffum) E3).d();
                    } else {
                        boolean z = ffso.a;
                        ffrt ffrtVar2 = E3 instanceof ffrt ? (ffrt) E3 : null;
                        if (ffrtVar2 != null) {
                            r2 = ffrtVar2.b;
                        }
                    }
                    ffrnVar.a(r2);
                    if (!l) {
                        return ffux.a;
                    }
                    boolean z2 = ffso.a;
                    return ffrnVar;
                }
            }
        }
        return ffrnVar;
    }

    @Override // defpackage.ffud
    public final ffte s(boolean z, boolean z2, ffji ffjiVar) {
        return K(z2, z ? new fftz(ffjiVar) : new ffua(ffjiVar));
    }

    @Override // defpackage.ffud
    public void t(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new ffue(g(), null, this);
        }
        L(cancellationException);
    }

    public final String toString() {
        return (h() + "{" + X(E()) + "}") + "@" + ffsp.b(this);
    }

    @Override // defpackage.ffud
    public final boolean v() {
        Object E = E();
        return (E instanceof fftx) && ((fftx) E).hP();
    }

    @Override // defpackage.ffud
    public final boolean x() {
        Object E = E();
        if (E instanceof ffrt) {
            return true;
        }
        return (E instanceof ffum) && ((ffum) E).g();
    }

    @Override // defpackage.ffud
    public final boolean y() {
        return !(E() instanceof fftx);
    }

    @Override // defpackage.ffud
    public final boolean z() {
        int A;
        do {
            A = A(E());
            if (A == 0) {
                return false;
            }
        } while (A != 1);
        return true;
    }

    protected void N() {
    }

    protected void hR(Object obj) {
    }

    public void hW(Throwable th) {
        throw th;
    }

    protected void hX(Object obj) {
    }
}
