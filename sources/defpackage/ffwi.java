package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffwi implements ffwm {
    public static final /* synthetic */ int e = 0;
    public final ffqm a;
    public final ffqm b;
    public final ffqn c;
    public final ffqn d;
    private final int g;
    private final ffqm h;
    private final ffqm i;
    private final ffqn j;
    private final ffqn k;
    private final ffqn l;

    public ffwi(int i) {
        this.g = i;
        if (i < 0) {
            throw new IllegalArgumentException(a.f(i, "Invalid channel capacity: ", ", should be >=0"));
        }
        this.a = new ffqm(0L, ffqo.a);
        this.b = new ffqm(0L, ffqo.a);
        ffwt ffwtVar = ffwk.a;
        this.h = new ffqm(i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L, ffqo.a);
        this.i = new ffqm(F(), ffqo.a);
        ffwt ffwtVar2 = new ffwt(0L, null, this, 3);
        this.c = new ffqn(ffwtVar2, ffqo.a);
        this.d = new ffqn(ffwtVar2, ffqo.a);
        if (Q()) {
            ffwtVar2 = ffwk.a;
            ffwtVar2.getClass();
        }
        ffqo ffqoVar = ffqo.a;
        this.j = new ffqn(ffwtVar2, ffqoVar);
        this.k = new ffqn(ffwk.s, ffqoVar);
        this.l = new ffqn(null, ffqoVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0000 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int E(defpackage.ffwt r6, int r7, java.lang.Object r8, long r9, java.lang.Object r11, boolean r12) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r6.d(r7)
            r1 = 4
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L35
            boolean r0 = r5.N(r9)
            r4 = 0
            if (r0 == 0) goto L1b
            if (r12 != 0) goto L29
            fgho r0 = defpackage.ffwk.d
            boolean r0 = r6.k(r7, r4, r0)
            if (r0 == 0) goto L0
            return r3
        L1b:
            if (r12 != 0) goto L29
            if (r11 != 0) goto L21
            r6 = 3
            return r6
        L21:
            boolean r0 = r6.k(r7, r4, r11)
            if (r0 == 0) goto L0
            r6 = 2
            return r6
        L29:
            fgho r0 = defpackage.ffwk.j
            boolean r0 = r6.k(r7, r4, r0)
            if (r0 == 0) goto L0
            r6.h(r7, r2)
            return r1
        L35:
            fgho r4 = defpackage.ffwk.e
            if (r0 != r4) goto L42
            fgho r1 = defpackage.ffwk.d
            boolean r0 = r6.k(r7, r0, r1)
            if (r0 == 0) goto L0
            return r3
        L42:
            fgho r9 = defpackage.ffwk.k
            r10 = 5
            if (r0 == r9) goto L82
            fgho r9 = defpackage.ffwk.h
            if (r0 == r9) goto L7e
            fgho r9 = defpackage.ffwk.l
            if (r0 != r9) goto L56
            r6.g(r7)
            r5.f()
            return r1
        L56:
            boolean r9 = defpackage.ffso.a
            r6.g(r7)
            boolean r9 = r0 instanceof defpackage.ffxj
            if (r9 == 0) goto L63
            ffxj r0 = (defpackage.ffxj) r0
            ffvq r0 = r0.a
        L63:
            boolean r8 = r5.R(r0, r8)
            if (r8 == 0) goto L6f
            fgho r8 = defpackage.ffwk.i
            r6.j(r7, r8)
            return r2
        L6f:
            fgho r8 = defpackage.ffwk.k
            java.lang.Object r8 = r6.b(r7, r8)
            fgho r9 = defpackage.ffwk.k
            if (r8 != r9) goto L7a
            return r10
        L7a:
            r6.h(r7, r3)
            return r10
        L7e:
            r6.g(r7)
            return r10
        L82:
            r6.g(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffwi.E(ffwt, int, java.lang.Object, long, java.lang.Object, boolean):int");
    }

    private final long F() {
        return this.h.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x00e6, code lost:
    
        r1 = (defpackage.ffwt) r1.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007d, code lost:
    
        r1 = (defpackage.ffwt) r1.o();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.ffwt G(long r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffwi.G(long):ffwt");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffwi.H():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(long j) {
        if ((this.i.a(j) & 4611686018427387904L) != 0) {
            while ((this.i.c & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J(long r5, defpackage.ffwt r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.b
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            fgge r0 = r7.n()
            ffwt r0 = (defpackage.ffwt) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.r()
            if (r5 == 0) goto L22
            fgge r5 = r7.n()
            ffwt r5 = (defpackage.ffwt) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            ffqn r5 = r4.j
        L24:
            java.lang.Object r6 = r5.a
            fghl r6 = (defpackage.fghl) r6
            long r0 = r6.b
            long r2 = r7.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L31
            goto L46
        L31:
            boolean r0 = r7.v()
            if (r0 == 0) goto L11
            boolean r0 = r5.d(r6, r7)
            if (r0 == 0) goto L47
            boolean r5 = r6.u()
            if (r5 == 0) goto L46
            r6.q()
        L46:
            return
        L47:
            boolean r6 = r7.u()
            if (r6 == 0) goto L24
            r7.q()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffwi.J(long, ffwt):void");
    }

    private final void K(ffvq ffvqVar) {
        M(ffvqVar, true);
    }

    private final void L(ffvq ffvqVar) {
        M(ffvqVar, false);
    }

    private final void M(ffvq ffvqVar, boolean z) {
        if (ffvqVar instanceof ffwd) {
            throw null;
        }
        if (ffvqVar instanceof ffrf) {
            ((ffgu) ffvqVar).w(ffci.a(z ? p() : q()));
            return;
        }
        if (ffvqVar instanceof ffxf) {
            ((ffxf) ffvqVar).a.w(new ffws(new ffwq(o())));
            return;
        }
        if (!(ffvqVar instanceof ffwc)) {
            if (ffvqVar instanceof fgix) {
                ((fgix) ffvqVar).j(this, ffwk.l);
                return;
            } else {
                Objects.toString(ffvqVar);
                throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(ffvqVar)));
            }
        }
        ffwc ffwcVar = (ffwc) ffvqVar;
        ffrh ffrhVar = ffwcVar.b;
        ffrhVar.getClass();
        ffwcVar.b = null;
        ffwcVar.a = ffwk.l;
        Throwable o = ffwcVar.c.o();
        if (o == null) {
            ffrhVar.w(false);
            return;
        }
        if (ffso.b) {
            o = fghn.a(o, ffrhVar);
        }
        ffrhVar.w(ffci.a(o));
    }

    private final boolean N(long j) {
        return j < F() || j < g() + ((long) this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0108, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x009d, code lost:
    
        r9 = (defpackage.ffwt) r9.o();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean O(long r9, boolean r11) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffwi.O(long, boolean):boolean");
    }

    private final boolean P(long j) {
        return O(j, true);
    }

    private final boolean Q() {
        long F = F();
        return F == 0 || F == Long.MAX_VALUE;
    }

    private final boolean R(Object obj, Object obj2) {
        if (obj instanceof fgix) {
            return ((fgix) obj).j(this, obj2);
        }
        if (obj instanceof ffxf) {
            obj.getClass();
            return ffwk.c(((ffxf) obj).a, new ffws(obj2));
        }
        if (!(obj instanceof ffwc)) {
            if (obj instanceof ffrf) {
                obj.getClass();
                return ffwk.c((ffrf) obj, obj2);
            }
            Objects.toString(obj);
            throw new IllegalStateException("Unexpected receiver type: ".concat(String.valueOf(obj)));
        }
        obj.getClass();
        ffwc ffwcVar = (ffwc) obj;
        ffrh ffrhVar = ffwcVar.b;
        ffrhVar.getClass();
        ffwcVar.b = null;
        ffwcVar.a = obj2;
        return ffwk.c(ffrhVar, true);
    }

    private final boolean S(Object obj, ffwt ffwtVar, int i) {
        if (obj instanceof ffrf) {
            obj.getClass();
            return ffwk.c((ffrf) obj, ffcu.a);
        }
        if (!(obj instanceof fgix)) {
            if (obj instanceof ffwd) {
                throw null;
            }
            Objects.toString(obj);
            throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(obj)));
        }
        obj.getClass();
        int c = ((fgiw) obj).c(this, ffcu.a);
        char c2 = c != 0 ? c != 1 ? c != 2 ? (char) 4 : (char) 3 : (char) 2 : (char) 1;
        if (c2 != 2) {
            return c2 == 1;
        }
        ffwtVar.g(i);
        return false;
    }

    private static final void T(ffvq ffvqVar, ffwt ffwtVar, int i) {
        ffvqVar.C(ffwtVar, i + ffwk.b);
    }

    private final Object U(ffgu ffguVar) {
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        Throwable q = q();
        if (ffso.b) {
            q = fghn.a(q, ffrhVar);
        }
        ffrhVar.w(ffci.a(q));
        Object m = ffrhVar.m();
        ffhh ffhhVar = ffhh.a;
        if (m == ffhhVar) {
            ffguVar.getClass();
        }
        return m == ffhhVar ? m : ffcu.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void V(ffrf ffrfVar) {
        Throwable q = q();
        if (ffso.b) {
            q = fghn.a(q, ffrfVar);
        }
        ffrfVar.w(ffci.a(q));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object k(defpackage.ffwi r13, defpackage.ffgu r14) {
        /*
            boolean r0 = r14 instanceof defpackage.ffwg
            if (r0 == 0) goto L13
            r0 = r14
            ffwg r0 = (defpackage.ffwg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ffwg r0 = new ffwg
            r0.<init>(r13, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            defpackage.ffci.b(r14)
            ffws r14 = (defpackage.ffws) r14
            java.lang.Object r13 = r14.b
            return r13
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            defpackage.ffci.b(r14)
            ffqn r14 = r13.d
            java.lang.Object r14 = r14.a
            ffwt r14 = (defpackage.ffwt) r14
        L3d:
            boolean r1 = r13.z()
            if (r1 == 0) goto L4d
            java.lang.Throwable r13 = r13.o()
            ffwq r14 = new ffwq
            r14.<init>(r13)
            return r14
        L4d:
            ffqm r1 = r13.b
            long r4 = r1.b()
            int r1 = defpackage.ffwk.b
            long r7 = (long) r1
            long r7 = r4 / r7
            int r1 = defpackage.ffwk.b
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.b
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L6c
            ffwt r1 = r13.s(r7, r14)
            if (r1 == 0) goto L3d
            r8 = r1
            goto L6d
        L6c:
            r8 = r14
        L6d:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.n(r8, r9, r10, r12)
            r1 = r7
            fgho r14 = defpackage.ffwk.m
            if (r13 == r14) goto L9f
            fgho r14 = defpackage.ffwk.o
            if (r13 != r14) goto L8c
            long r13 = r1.h()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L89
            r8.p()
        L89:
            r13 = r1
            r14 = r8
            goto L3d
        L8c:
            fgho r14 = defpackage.ffwk.n
            if (r13 != r14) goto L9b
            r6.c = r2
            r2 = r8
            java.lang.Object r13 = r1.l(r2, r3, r4, r6)
            if (r13 != r0) goto L9a
            return r0
        L9a:
            return r13
        L9b:
            r8.p()
            return r13
        L9f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffwi.k(ffwi, ffgu):java.lang.Object");
    }

    public final boolean A(long j) {
        return O(j, false);
    }

    protected boolean B() {
        return false;
    }

    @Override // defpackage.ffxg
    public final fgis C() {
        ffwe ffweVar = ffwe.a;
        fflf.e(ffweVar, 3);
        ffwf ffwfVar = ffwf.a;
        fflf.e(ffwfVar, 3);
        return new fgis(this, ffweVar, ffwfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c A[RETURN] */
    @Override // defpackage.ffxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.Object r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffwi.a(java.lang.Object, ffgu):java.lang.Object");
    }

    @Override // defpackage.ffxi
    public Object b(Object obj) {
        ffwt ffwtVar;
        long j = this.a.c;
        if (!A(j) && !N(j & 1152921504606846975L)) {
            return ffws.a;
        }
        ffqn ffqnVar = this.c;
        fgho fghoVar = ffwk.j;
        ffwt ffwtVar2 = (ffwt) ffqnVar.a;
        while (true) {
            long b = this.a.b();
            long j2 = b & 1152921504606846975L;
            boolean A = A(b);
            long j3 = ffwk.b;
            long j4 = j2 / j3;
            int i = (int) (j2 % j3);
            if (ffwtVar2.b != j4) {
                ffwt u = u(j4, ffwtVar2);
                if (u != null) {
                    ffwtVar = u;
                } else if (A) {
                    return new ffwq(q());
                }
            } else {
                ffwtVar = ffwtVar2;
            }
            Object obj2 = obj;
            int c = c(ffwtVar, i, obj2, j2, fghoVar, A);
            ffwtVar2 = ffwtVar;
            if (c == 0) {
                ffwtVar2.p();
                return ffcu.a;
            }
            if (c == 1) {
                return ffcu.a;
            }
            if (c == 2) {
                if (A) {
                    ffwtVar2.t();
                    return new ffwq(q());
                }
                ffwtVar2.t();
                return ffws.a;
            }
            if (c == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (c == 4) {
                if (j2 < g()) {
                    ffwtVar2.p();
                }
                return new ffwq(q());
            }
            ffwtVar2.p();
            obj = obj2;
        }
    }

    public final int c(ffwt ffwtVar, int i, Object obj, long j, Object obj2, boolean z) {
        ffwtVar.i(i, obj);
        if (z) {
            return E(ffwtVar, i, obj, j, obj2, true);
        }
        Object d = ffwtVar.d(i);
        if (d == null) {
            if (N(j)) {
                if (ffwtVar.k(i, null, ffwk.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (ffwtVar.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (d instanceof ffvq) {
            ffwtVar.g(i);
            if (R(d, obj)) {
                ffwtVar.j(i, ffwk.i);
                return 0;
            }
            if (ffwtVar.b(i, ffwk.k) == ffwk.k) {
                return 5;
            }
            ffwtVar.h(i, true);
            return 5;
        }
        return E(ffwtVar, i, obj, j, obj2, false);
    }

    @Override // defpackage.ffxi
    public final void d(ffji ffjiVar) {
        if (this.l.d(null, ffjiVar)) {
            return;
        }
        ffqn ffqnVar = this.l;
        do {
            Object obj = ffqnVar.a;
            if (obj != ffwk.q) {
                if (obj == ffwk.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                Objects.toString(obj);
                throw new IllegalStateException("Another handler is already registered: ".concat(String.valueOf(obj)));
            }
        } while (!this.l.d(ffwk.q, ffwk.r));
        ffjiVar.invoke(o());
    }

    @Override // defpackage.ffxi
    public final boolean e(Throwable th) {
        return y(th, false);
    }

    @Override // defpackage.ffxi
    public final boolean f() {
        return A(this.a.c);
    }

    public final long g() {
        return this.b.c;
    }

    public final long h() {
        return this.a.c & 1152921504606846975L;
    }

    @Override // defpackage.ffxg
    public final Object i(ffgu ffguVar) {
        ffwt ffwtVar;
        ffwt ffwtVar2;
        ffrh ffrhVar;
        ffwi ffwiVar;
        ffwt ffwtVar3 = (ffwt) this.d.a;
        while (!z()) {
            long b = this.b.b();
            long j = b / ffwk.b;
            int i = (int) (b % ffwk.b);
            if (ffwtVar3.b != j) {
                ffwt s = s(j, ffwtVar3);
                if (s != null) {
                    ffwtVar = s;
                } else {
                    continue;
                }
            } else {
                ffwtVar = ffwtVar3;
            }
            Object n = n(ffwtVar, i, b, null);
            if (n == ffwk.m) {
                throw new IllegalStateException("unexpected");
            }
            if (n == ffwk.o) {
                if (b < h()) {
                    ffwtVar.p();
                }
                ffwtVar3 = ffwtVar;
            } else {
                if (n != ffwk.n) {
                    ffwtVar.p();
                    return n;
                }
                ffrh a = ffrj.a(ffhi.c(ffguVar));
                ffwi ffwiVar2 = this;
                try {
                    Object n2 = ffwiVar2.n(ffwtVar, i, b, a);
                    if (n2 == ffwk.m) {
                        w(a, ffwtVar, i);
                    } else {
                        if (n2 == ffwk.o) {
                            if (b < h()) {
                                ffwtVar.p();
                            }
                            ffwt ffwtVar4 = (ffwt) ffwiVar2.d.a;
                            while (true) {
                                if (z()) {
                                    a.w(ffci.a(p()));
                                    break;
                                }
                                long b2 = ffwiVar2.b.b();
                                long j2 = ffwk.b;
                                long j3 = b2 / j2;
                                int i2 = (int) (b2 % j2);
                                try {
                                    if (ffwtVar4.b != j3) {
                                        ffwt s2 = s(j3, ffwtVar4);
                                        if (s2 != null) {
                                            ffwtVar2 = s2;
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        ffwtVar2 = ffwtVar4;
                                    }
                                    n2 = ffwiVar.n(ffwtVar2, i2, b2, ffrhVar);
                                    ffwiVar2 = ffwiVar;
                                    ffwt ffwtVar5 = ffwtVar2;
                                    a = ffrhVar;
                                    if (n2 == ffwk.m) {
                                        w(a, ffwtVar5, i2);
                                        break;
                                    }
                                    if (n2 == ffwk.o) {
                                        if (b2 < h()) {
                                            ffwtVar5.p();
                                        }
                                        ffwtVar4 = ffwtVar5;
                                    } else {
                                        if (n2 == ffwk.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        ffwtVar5.p();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    a = ffrhVar;
                                    Throwable th2 = th;
                                    a.E();
                                    throw th2;
                                }
                                ffrhVar = a;
                                ffwiVar = ffwiVar2;
                            }
                        } else {
                            ffwtVar.p();
                        }
                        a.f(n2, null);
                    }
                    Object m = a.m();
                    if (m == ffhh.a) {
                        ffguVar.getClass();
                    }
                    return m;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        throw fghn.b(p());
    }

    @Override // defpackage.ffxg
    public final Object j(ffgu ffguVar) {
        return k(this, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.ffwt r15, int r16, long r17, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffwi.l(ffwt, int, long, ffgu):java.lang.Object");
    }

    @Override // defpackage.ffxg
    public final Object m() {
        ffwt ffwtVar;
        long j = this.b.c;
        long j2 = this.a.c;
        if (P(j2)) {
            return new ffwq(o());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return ffws.a;
        }
        ffqn ffqnVar = this.d;
        fgho fghoVar = ffwk.k;
        ffwt ffwtVar2 = (ffwt) ffqnVar.a;
        while (!z()) {
            long b = this.b.b();
            long j3 = ffwk.b;
            long j4 = b / j3;
            int i = (int) (b % j3);
            if (ffwtVar2.b != j4) {
                ffwt s = s(j4, ffwtVar2);
                if (s != null) {
                    ffwtVar = s;
                } else {
                    continue;
                }
            } else {
                ffwtVar = ffwtVar2;
            }
            Object n = n(ffwtVar, i, b, fghoVar);
            ffwt ffwtVar3 = ffwtVar;
            if (n == ffwk.m) {
                x(b);
                ffwtVar3.t();
                return ffws.a;
            }
            if (n != ffwk.o) {
                if (n == ffwk.n) {
                    throw new IllegalStateException("unexpected");
                }
                ffwtVar3.p();
                return n;
            }
            if (b < h()) {
                ffwtVar3.p();
            }
            ffwtVar2 = ffwtVar3;
        }
        return new ffwq(o());
    }

    public final Object n(ffwt ffwtVar, int i, long j, Object obj) {
        Object d = ffwtVar.d(i);
        if (d == null) {
            if (j >= (this.a.c & 1152921504606846975L)) {
                if (obj == null) {
                    return ffwk.n;
                }
                if (ffwtVar.k(i, null, obj)) {
                    H();
                    return ffwk.m;
                }
            }
        } else if (d == ffwk.d && ffwtVar.k(i, d, ffwk.i)) {
            H();
            return ffwtVar.e(i);
        }
        while (true) {
            Object d2 = ffwtVar.d(i);
            if (d2 == null || d2 == ffwk.e) {
                if (j < (this.a.c & 1152921504606846975L)) {
                    if (ffwtVar.k(i, d2, ffwk.h)) {
                        H();
                        return ffwk.o;
                    }
                } else {
                    if (obj == null) {
                        return ffwk.n;
                    }
                    if (ffwtVar.k(i, d2, obj)) {
                        H();
                        return ffwk.m;
                    }
                }
            } else if (d2 == ffwk.d) {
                if (ffwtVar.k(i, d2, ffwk.i)) {
                    H();
                    return ffwtVar.e(i);
                }
            } else {
                if (d2 == ffwk.j) {
                    return ffwk.o;
                }
                if (d2 == ffwk.h) {
                    return ffwk.o;
                }
                if (d2 == ffwk.l) {
                    H();
                    return ffwk.o;
                }
                if (d2 != ffwk.g && ffwtVar.k(i, d2, ffwk.f)) {
                    boolean z = d2 instanceof ffxj;
                    if (z) {
                        d2 = ((ffxj) d2).a;
                    }
                    if (S(d2, ffwtVar, i)) {
                        ffwtVar.j(i, ffwk.i);
                        H();
                        return ffwtVar.e(i);
                    }
                    ffwtVar.j(i, ffwk.j);
                    ffwtVar.h(i, false);
                    if (z) {
                        H();
                    }
                    return ffwk.o;
                }
            }
        }
    }

    protected final Throwable o() {
        return (Throwable) this.k.a;
    }

    public final Throwable p() {
        Throwable o = o();
        return o == null ? new ffwx() : o;
    }

    protected final Throwable q() {
        Throwable o = o();
        return o == null ? new ffwy("Channel was closed") : o;
    }

    @Override // defpackage.ffxg
    public final ffwo r() {
        return new ffwc(this);
    }

    public final ffwt s(long j, ffwt ffwtVar) {
        Object a;
        long j2;
        long j3;
        ffwt ffwtVar2 = ffwk.a;
        ffwj ffwjVar = ffwj.a;
        loop0: while (true) {
            a = fggd.a(ffwtVar, j, ffwjVar);
            if (!fghm.b(a)) {
                fghl a2 = fghm.a(a);
                while (true) {
                    ffqn ffqnVar = this.d;
                    fghl fghlVar = (fghl) ffqnVar.a;
                    if (fghlVar.b >= a2.b) {
                        break loop0;
                    }
                    if (a2.v()) {
                        if (ffqnVar.d(fghlVar, a2)) {
                            if (fghlVar.u()) {
                                fghlVar.q();
                            }
                        } else if (a2.u()) {
                            a2.q();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (fghm.b(a)) {
            f();
            if (ffwtVar.b * ffwk.b >= h()) {
                return null;
            }
            ffwtVar.p();
            return null;
        }
        ffwt ffwtVar3 = (ffwt) fghm.a(a);
        if (!Q() && j <= F() / ffwk.b) {
            ffqn ffqnVar2 = this.j;
            while (true) {
                fghl fghlVar2 = (fghl) ffqnVar2.a;
                if (fghlVar2.b >= ((fghl) ffwtVar3).b || !ffwtVar3.v()) {
                    break;
                }
                if (ffqnVar2.d(fghlVar2, ffwtVar3)) {
                    if (fghlVar2.u()) {
                        fghlVar2.q();
                    }
                } else if (ffwtVar3.u()) {
                    ffwtVar3.q();
                }
            }
        }
        long j4 = ffwtVar3.b;
        if (j4 <= j) {
            boolean z = ffso.a;
            return ffwtVar3;
        }
        long j5 = ffwk.b;
        ffqm ffqmVar = this.b;
        do {
            j2 = j4 * j5;
            j3 = ffqmVar.c;
            if (j3 >= j2) {
                break;
            }
        } while (!this.b.c(j3, j2));
        if (ffwtVar3.b * ffwk.b >= h()) {
            return null;
        }
        ffwtVar3.p();
        return null;
    }

    @Override // defpackage.ffxg
    public final void t(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        y(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x019a, code lost:
    
        r4 = (defpackage.ffwt) r4.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a1, code lost:
    
        if (r4 != null) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffwi.toString():java.lang.String");
    }

    public final ffwt u(long j, ffwt ffwtVar) {
        Object a;
        long j2;
        long j3;
        ffwt ffwtVar2 = ffwk.a;
        ffwj ffwjVar = ffwj.a;
        loop0: while (true) {
            a = fggd.a(ffwtVar, j, ffwjVar);
            if (!fghm.b(a)) {
                fghl a2 = fghm.a(a);
                while (true) {
                    ffqn ffqnVar = this.c;
                    fghl fghlVar = (fghl) ffqnVar.a;
                    if (fghlVar.b >= a2.b) {
                        break loop0;
                    }
                    if (a2.v()) {
                        if (ffqnVar.d(fghlVar, a2)) {
                            if (fghlVar.u()) {
                                fghlVar.q();
                            }
                        } else if (a2.u()) {
                            a2.q();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (fghm.b(a)) {
            f();
            if (ffwtVar.b * ffwk.b >= g()) {
                return null;
            }
            ffwtVar.p();
            return null;
        }
        ffwt ffwtVar3 = (ffwt) fghm.a(a);
        long j4 = ffwtVar3.b;
        if (j4 <= j) {
            boolean z = ffso.a;
            return ffwtVar3;
        }
        long j5 = ffwk.b;
        ffqm ffqmVar = this.a;
        do {
            long j6 = j4 * j5;
            j2 = ffqmVar.c;
            j3 = 1152921504606846975L & j2;
            if (j3 >= j6) {
                break;
            }
        } while (!this.a.c(j2, ffwk.b(j3, (int) (j2 >> 60))));
        if (ffwtVar3.b * ffwk.b >= g()) {
            return null;
        }
        ffwtVar3.p();
        return null;
    }

    protected final void v(long j) {
        ffwt ffwtVar;
        boolean z = ffso.a;
        ffwt ffwtVar2 = (ffwt) this.d.a;
        while (true) {
            ffqm ffqmVar = this.b;
            int i = this.g;
            long j2 = ffqmVar.c;
            if (j < Math.max(i + j2, F())) {
                return;
            }
            if (this.b.c(j2, 1 + j2)) {
                long j3 = j2 / ffwk.b;
                int i2 = (int) (j2 % ffwk.b);
                if (ffwtVar2.b != j3) {
                    ffwt s = s(j3, ffwtVar2);
                    if (s != null) {
                        ffwtVar = s;
                    }
                } else {
                    ffwtVar = ffwtVar2;
                }
                if (n(ffwtVar, i2, j2, null) != ffwk.o) {
                    ffwtVar.p();
                } else if (j2 < h()) {
                    ffwtVar.p();
                }
                ffwtVar2 = ffwtVar;
            }
        }
    }

    public final void w(ffvq ffvqVar, ffwt ffwtVar, int i) {
        ffvqVar.C(ffwtVar, i);
    }

    public final void x(long j) {
        long j2;
        long j3;
        if (Q()) {
            return;
        }
        while (F() <= j) {
        }
        int i = ffwk.c;
        for (int i2 = 0; i2 < i; i2++) {
            long F = F();
            if (F == (4611686018427387903L & this.i.c) && F == F()) {
                return;
            }
        }
        ffqm ffqmVar = this.i;
        do {
            j2 = ffqmVar.c;
        } while (!ffqmVar.c(j2, ffwk.a(j2 & 4611686018427387903L, true)));
        while (true) {
            long F2 = F();
            long j4 = this.i.c;
            long j5 = j4 & 4611686018427387903L;
            long j6 = 4611686018427387904L & j4;
            if (F2 == j5 && F2 == F()) {
                break;
            } else if (j6 == 0) {
                this.i.c(j4, ffwk.a(j5, true));
            }
        }
        ffqm ffqmVar2 = this.i;
        do {
            j3 = ffqmVar2.c;
        } while (!ffqmVar2.c(j3, ffwk.a(j3 & 4611686018427387903L, false)));
    }

    protected final boolean y(Throwable th, boolean z) {
        long j;
        long b;
        Object obj;
        long j2;
        long j3;
        if (z) {
            ffqm ffqmVar = this.a;
            do {
                j3 = ffqmVar.c;
                if (((int) (j3 >> 60)) != 0) {
                    break;
                }
            } while (!ffqmVar.c(j3, ffwk.b(j3 & 1152921504606846975L, 1)));
        }
        boolean d = this.k.d(ffwk.s, th);
        if (z) {
            ffqm ffqmVar2 = this.a;
            do {
                j2 = ffqmVar2.c;
            } while (!ffqmVar2.c(j2, ffwk.b(j2 & 1152921504606846975L, 3)));
        } else {
            ffqm ffqmVar3 = this.a;
            do {
                j = ffqmVar3.c;
                int i = (int) (j >> 60);
                if (i == 0) {
                    b = ffwk.b(j & 1152921504606846975L, 2);
                } else {
                    if (i != 1) {
                        break;
                    }
                    b = ffwk.b(j & 1152921504606846975L, 3);
                }
            } while (!ffqmVar3.c(j, b));
        }
        f();
        if (d) {
            ffqn ffqnVar = this.l;
            do {
                obj = ffqnVar.a;
            } while (!ffqnVar.d(obj, obj == null ? ffwk.q : ffwk.r));
            if (obj != null) {
                fflf.e(obj, 1);
                ((ffji) obj).invoke(o());
                return true;
            }
        }
        return d;
    }

    public final boolean z() {
        return P(this.a.c);
    }
}
