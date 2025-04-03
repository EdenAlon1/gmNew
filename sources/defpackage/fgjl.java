package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgjl {
    private final ffqn a;
    public final int b;
    public final ffql c;
    private final ffqn e;
    private final ffjn g;
    private final ffqm d = new ffqm(0, ffqo.a);
    private final ffqm f = new ffqm(0, ffqo.a);

    public fgjl(int i) {
        this.b = i;
        if (i <= 0) {
            throw new IllegalArgumentException(a.h(i, "Semaphore should have at least 1 permit, but had "));
        }
        fgjo fgjoVar = new fgjo(0L, null, 2);
        this.a = new ffqn(fgjoVar, ffqo.a);
        ffqo ffqoVar = ffqo.a;
        this.e = new ffqn(fgjoVar, ffqoVar);
        this.c = new ffql(i, ffqoVar);
        this.g = new ffjn() { // from class: fgji
            @Override // defpackage.ffjn
            public final Object a(Object obj, Object obj2, Object obj3) {
                fgjl.this.h();
                return ffcu.a;
            }
        };
    }

    private final int c() {
        int andDecrement;
        do {
            andDecrement = ffql.a.getAndDecrement(this.c);
        } while (andDecrement > this.b);
        return andDecrement;
    }

    private final boolean d(ffvq ffvqVar) {
        Object a;
        fgjo fgjoVar = (fgjo) this.e.a;
        long b = this.f.b();
        fgjj fgjjVar = fgjj.a;
        long j = b / fgjn.f;
        loop0: while (true) {
            a = fggd.a(fgjoVar, j, fgjjVar);
            if (!fghm.b(a)) {
                fghl a2 = fghm.a(a);
                while (true) {
                    ffqn ffqnVar = this.e;
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
        fgjo fgjoVar2 = (fgjo) fghm.a(a);
        int i = (int) (b % fgjn.f);
        if (fgjoVar2.c.a(i).d(null, ffvqVar)) {
            ffvqVar.C(fgjoVar2, i);
            return true;
        }
        if (!fgjoVar2.c.a(i).d(fgjn.b, fgjn.c)) {
            boolean z = ffso.a;
            return false;
        }
        if (ffvqVar instanceof ffrf) {
            ((ffrf) ffvqVar).f(ffcu.a, this.g);
        } else {
            if (!(ffvqVar instanceof fgix)) {
                Objects.toString(ffvqVar);
                throw new IllegalStateException("unexpected: ".concat(ffvqVar.toString()));
            }
            ((fgix) ffvqVar).i(ffcu.a);
        }
        return true;
    }

    protected final void e(ffrf ffrfVar) {
        while (c() <= 0) {
            if (d((ffvq) ffrfVar)) {
                return;
            }
        }
        ffrfVar.f(ffcu.a, this.g);
    }

    public final void f() {
        int i;
        int i2;
        do {
            ffql ffqlVar = this.c;
            i = this.b;
            i2 = ffqlVar.c;
            if (i2 <= i) {
                return;
            }
        } while (!this.c.c(i2, i));
    }

    public final Object g(ffgu ffguVar) {
        if (c() <= 0) {
            ffrh a = ffrj.a(ffhi.c(ffguVar));
            try {
                if (!d(a)) {
                    e(a);
                }
                Object m = a.m();
                ffhh ffhhVar = ffhh.a;
                if (m == ffhhVar) {
                    ffguVar.getClass();
                }
                if (m != ffhhVar) {
                    m = ffcu.a;
                }
                if (m == ffhhVar) {
                    return m;
                }
            } catch (Throwable th) {
                a.E();
                throw th;
            }
        }
        return ffcu.a;
    }

    public final void h() {
        Object a;
        while (true) {
            ffql ffqlVar = this.c;
            int i = this.b;
            int andIncrement = ffql.a.getAndIncrement(ffqlVar);
            if (andIncrement >= i) {
                f();
                throw new IllegalStateException("The number of released permits cannot be greater than " + this.b);
            }
            if (andIncrement >= 0) {
                return;
            }
            fgjo fgjoVar = (fgjo) this.a.a;
            long b = this.d.b();
            long j = b / fgjn.f;
            ffqn ffqnVar = this.a;
            fgjk fgjkVar = fgjk.a;
            while (true) {
                a = fggd.a(fgjoVar, j, fgjkVar);
                if (fghm.b(a)) {
                    break;
                }
                fghl a2 = fghm.a(a);
                while (true) {
                    fghl fghlVar = (fghl) ffqnVar.a;
                    if (fghlVar.b >= a2.b) {
                        break;
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
            }
            fgjo fgjoVar2 = (fgjo) fghm.a(a);
            fgjoVar2.p();
            if (fgjoVar2.b <= j) {
                int i2 = (int) (b % fgjn.f);
                Object a3 = fgjoVar2.c.a(i2).a(fgjn.b);
                if (a3 == null) {
                    int i3 = fgjn.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (fgjoVar2.c.a(i2).a == fgjn.c) {
                            return;
                        }
                    }
                    if (!fgjoVar2.c.a(i2).d(fgjn.b, fgjn.d)) {
                        return;
                    }
                } else if (a3 == fgjn.e) {
                    continue;
                } else if (a3 instanceof ffrf) {
                    ffrf ffrfVar = (ffrf) a3;
                    Object l = ffrfVar.l(ffcu.a, this.g);
                    if (l != null) {
                        ffrfVar.a(l);
                        return;
                    }
                } else {
                    if (!(a3 instanceof fgix)) {
                        Objects.toString(a3);
                        throw new IllegalStateException("unexpected: ".concat(a3.toString()));
                    }
                    if (((fgix) a3).j(this, ffcu.a)) {
                        return;
                    }
                }
            }
        }
    }
}
