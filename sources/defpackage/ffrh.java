package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffrh extends ffsz implements ffrf, ffhs, ffvq {
    public final ffgu a;
    public final ffhd b;
    public final ffql c;
    public final ffqn d;
    private final ffqn f;

    public ffrh(ffgu ffguVar, int i) {
        super(i);
        this.a = ffguVar;
        boolean z = ffso.a;
        this.b = ffguVar.u();
        this.c = new ffql(536870911, ffqo.a);
        this.d = new ffqn(ffqr.a, ffqo.a);
        this.f = new ffqn(null, ffqo.a);
    }

    private final ffte L() {
        ffte b;
        ffud ffudVar = (ffud) this.b.get(ffud.c);
        if (ffudVar == null) {
            return null;
        }
        b = ffui.b(ffudVar, true, new ffrl(this));
        this.f.d(null, b);
        return b;
    }

    private final void M(int i) {
        int i2;
        do {
            i2 = this.c.c;
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = ffso.a;
                ffgu t = t();
                boolean z2 = i == 4;
                if (z2 || !(t instanceof fggk) || ffta.b(i) != ffta.b(this.e)) {
                    ffta.a(this, t, z2);
                    return;
                }
                fggk fggkVar = (fggk) t;
                ffsd ffsdVar = fggkVar.a;
                ffhd u = fggkVar.u();
                if (ffsdVar.ex(u)) {
                    ffsdVar.a(u, this);
                    return;
                }
                ThreadLocal threadLocal = ffvi.a;
                ffti a = ffvi.a();
                if (a.q()) {
                    a.o(this);
                    return;
                }
                a.p(true);
                try {
                    ffta.a(this, t(), true);
                    do {
                    } while (a.s());
                    return;
                } catch (Throwable th) {
                    try {
                        K(th);
                        return;
                    } finally {
                        a.n(true);
                    }
                }
            }
        } while (!this.c.c(i2, (536870911 & i2) + 1073741824));
    }

    private static final void N(Object obj, Object obj2) {
        throw new IllegalStateException(a.j(obj2, obj, "It's prohibited to register multiple handlers, tried to register ", ", already has "));
    }

    private static final Object O(ffuy ffuyVar, Object obj, int i, ffjn ffjnVar) {
        ffjn ffjnVar2;
        if (obj instanceof ffrt) {
            boolean z = ffso.a;
            return obj;
        }
        if (ffta.b(i)) {
            if (ffjnVar != null) {
                ffjnVar2 = ffjnVar;
            } else if (ffuyVar instanceof ffrd) {
                ffjnVar2 = null;
            }
            return new ffrs(obj, ffuyVar instanceof ffrd ? (ffrd) ffuyVar : null, ffjnVar2, null, 16);
        }
        return obj;
    }

    private final void P(fghl fghlVar) {
        int i = this.c.c & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            fghlVar.l(i);
        } catch (Throwable th) {
            ffhd ffhdVar = this.b;
            toString();
            ffsf.b(ffhdVar, new ffru("Exception in invokeOnCancellation handler for ".concat(toString()), th));
        }
    }

    public final void A() {
        if (G()) {
            return;
        }
        z();
    }

    public final void B() {
        ffte L = L();
        if (L != null && k()) {
            L.hO();
            this.f.c(ffux.a);
        }
    }

    @Override // defpackage.ffvq
    public final void C(fghl fghlVar, int i) {
        ffql ffqlVar;
        int i2;
        do {
            ffqlVar = this.c;
            i2 = ffqlVar.c;
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!ffqlVar.c(i2, ((i2 >> 29) << 29) + i));
        D(fghlVar);
    }

    public final void D(Object obj) {
        boolean z = ffso.a;
        while (true) {
            Object obj2 = this.d.a;
            if (obj2 instanceof ffqr) {
                if (this.d.d(obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof ffrd) || (obj2 instanceof fghl)) {
                N(obj, obj2);
            } else {
                if (obj2 instanceof ffrt) {
                    ffrt ffrtVar = (ffrt) obj2;
                    if (!ffrtVar.a()) {
                        N(obj, obj2);
                    }
                    if (obj2 instanceof ffrk) {
                        Throwable th = ffrtVar != null ? ffrtVar.b : null;
                        if (obj instanceof ffrd) {
                            x((ffrd) obj, th);
                            return;
                        } else {
                            obj.getClass();
                            P((fghl) obj);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof ffrs) {
                    ffrs ffrsVar = (ffrs) obj2;
                    if (ffrsVar.b != null) {
                        N(obj, obj2);
                    }
                    if (obj instanceof fghl) {
                        return;
                    }
                    obj.getClass();
                    ffrd ffrdVar = (ffrd) obj;
                    if (ffrsVar.a()) {
                        x(ffrdVar, ffrsVar.e);
                        return;
                    } else {
                        if (this.d.d(obj2, ffrs.b(ffrsVar, ffrdVar, null, 29))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof fghl) {
                        return;
                    }
                    obj.getClass();
                    if (this.d.d(obj2, new ffrs(obj2, (ffrd) obj, null, null, 28))) {
                        return;
                    }
                }
            }
        }
    }

    public final void E() {
        ffgu ffguVar = this.a;
        Throwable th = null;
        fggk fggkVar = ffguVar instanceof fggk ? (fggk) ffguVar : null;
        if (fggkVar != null) {
            while (true) {
                Object obj = fggkVar.f.a;
                fgho fghoVar = fggl.b;
                if (obj == fghoVar) {
                    if (fggkVar.f.d(fghoVar, this)) {
                        break;
                    }
                } else {
                    if (!(obj instanceof Throwable)) {
                        Objects.toString(obj);
                        throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)));
                    }
                    if (!fggkVar.f.d(obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            z();
            h(th);
        }
    }

    public final void F(Object obj, int i, ffjn ffjnVar) {
        Object obj2;
        do {
            obj2 = this.d.a;
            if (!(obj2 instanceof ffuy)) {
                if (obj2 instanceof ffrk) {
                    ffrk ffrkVar = (ffrk) obj2;
                    if (ffrkVar.a.b()) {
                        if (ffjnVar != null) {
                            y(ffjnVar, ffrkVar.b, obj);
                            return;
                        }
                        return;
                    }
                }
                Objects.toString(obj);
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)));
            }
        } while (!this.d.d(obj2, O((ffuy) obj2, obj, i, ffjnVar)));
        A();
        M(i);
    }

    public final boolean G() {
        return this.e == 2 && ((fggk) this.a).f.a != null;
    }

    @Override // defpackage.ffsz
    public final void H(Throwable th) {
        while (true) {
            Object obj = this.d.a;
            if (obj instanceof ffuy) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof ffrt) {
                return;
            }
            if (obj instanceof ffrs) {
                ffrs ffrsVar = (ffrs) obj;
                if (ffrsVar.a()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (this.d.d(obj, ffrs.b(ffrsVar, null, th, 15))) {
                    ffrd ffrdVar = ffrsVar.b;
                    if (ffrdVar != null) {
                        x(ffrdVar, th);
                    }
                    ffjn ffjnVar = ffrsVar.c;
                    if (ffjnVar != null) {
                        y(ffjnVar, th, ffrsVar.a);
                        return;
                    }
                    return;
                }
            } else {
                Throwable th2 = th;
                if (this.d.d(obj, new ffrs(obj, null, null, th2, 14))) {
                    return;
                } else {
                    th = th2;
                }
            }
        }
    }

    public final fgho J(Object obj, ffjn ffjnVar) {
        Object obj2;
        do {
            obj2 = this.d.a;
            if (!(obj2 instanceof ffuy)) {
                return null;
            }
        } while (!this.d.d(obj2, O((ffuy) obj2, obj, this.e, ffjnVar)));
        A();
        return ffri.a;
    }

    @Override // defpackage.ffrf
    public final void a(Object obj) {
        boolean z = ffso.a;
        M(this.e);
    }

    @Override // defpackage.ffrf
    public final void d(ffji ffjiVar) {
        D(new ffrc(ffjiVar));
    }

    @Override // defpackage.ffhs
    public final ffhs dI() {
        ffgu ffguVar = this.a;
        if (ffguVar instanceof ffhs) {
            return (ffhs) ffguVar;
        }
        return null;
    }

    @Override // defpackage.ffrf
    public final void e(Object obj, final ffji ffjiVar) {
        F(obj, this.e, ffjiVar != null ? new ffjn() { // from class: ffrg
            @Override // defpackage.ffjn
            public final Object a(Object obj2, Object obj3, Object obj4) {
                ffji.this.invoke((Throwable) obj2);
                return ffcu.a;
            }
        } : null);
    }

    @Override // defpackage.ffrf
    public final void f(Object obj, ffjn ffjnVar) {
        F(obj, this.e, ffjnVar);
    }

    @Override // defpackage.ffrf
    public final void g(ffsd ffsdVar, Object obj) {
        ffgu ffguVar = this.a;
        fggk fggkVar = ffguVar instanceof fggk ? (fggk) ffguVar : null;
        F(obj, (fggkVar != null ? fggkVar.a : null) == ffsdVar ? 4 : this.e, null);
    }

    @Override // defpackage.ffrf
    public final boolean h(Throwable th) {
        Object obj;
        do {
            obj = this.d.a;
            if (!(obj instanceof ffuy)) {
                return false;
            }
        } while (!this.d.d(obj, new ffrk(this, th, (obj instanceof ffrd) || (obj instanceof fghl))));
        ffuy ffuyVar = (ffuy) obj;
        if (ffuyVar instanceof ffrd) {
            x((ffrd) obj, th);
        } else if (ffuyVar instanceof fghl) {
            P((fghl) obj);
        }
        A();
        M(this.e);
        return true;
    }

    @Override // defpackage.ffrf
    public final boolean i() {
        return n() instanceof ffuy;
    }

    @Override // defpackage.ffrf
    public final boolean j() {
        return n() instanceof ffrk;
    }

    @Override // defpackage.ffrf
    public final boolean k() {
        return !(n() instanceof ffuy);
    }

    @Override // defpackage.ffrf
    public final Object l(Object obj, ffjn ffjnVar) {
        return J(obj, ffjnVar);
    }

    public final Object m() {
        int i;
        ffud ffudVar;
        boolean G = G();
        do {
            i = this.c.c;
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (G) {
                    E();
                }
                Object n = n();
                if (n instanceof ffrt) {
                    Throwable th = ((ffrt) n).b;
                    if (ffso.b) {
                        throw fghn.a(th, this);
                    }
                    throw th;
                }
                if (!ffta.b(this.e) || (ffudVar = (ffud) this.b.get(ffud.c)) == null || ffudVar.v()) {
                    return o(n);
                }
                CancellationException p = ffudVar.p();
                H(p);
                if (ffso.b) {
                    throw fghn.a(p, this);
                }
                throw p;
            }
        } while (!this.c.c(i, (536870911 & i) + 536870912));
        if (v() == null) {
            L();
        }
        if (G) {
            E();
        }
        return ffhh.a;
    }

    public final Object n() {
        return this.d.a;
    }

    @Override // defpackage.ffsz
    public final Object o(Object obj) {
        return obj instanceof ffrs ? ((ffrs) obj).a : obj;
    }

    @Override // defpackage.ffsz
    public final Object p() {
        return n();
    }

    protected String q() {
        return "CancellableContinuation";
    }

    public Throwable r(ffud ffudVar) {
        return ffudVar.p();
    }

    @Override // defpackage.ffsz
    public final Throwable s(Object obj) {
        Throwable s = super.s(obj);
        if (s == null) {
            return null;
        }
        ffgu ffguVar = this.a;
        return (ffso.b && (ffguVar instanceof ffhs)) ? fghn.a(s, (ffhs) ffguVar) : s;
    }

    @Override // defpackage.ffsz
    public final ffgu t() {
        return this.a;
    }

    public final String toString() {
        String c = ffsp.c(this.a);
        Object n = n();
        String str = n instanceof ffuy ? "Active" : n instanceof ffrk ? "Cancelled" : "Completed";
        return q() + "(" + c + "){" + str + "}@" + ffsp.b(this);
    }

    @Override // defpackage.ffgu
    public final ffhd u() {
        return this.b;
    }

    public final ffte v() {
        return (ffte) this.f.a;
    }

    @Override // defpackage.ffgu
    public final void w(Object obj) {
        Throwable c = ffch.c(obj);
        if (c != null) {
            if (ffso.b) {
                c = fghn.a(c, this);
            }
            obj = new ffrt(c);
        }
        F(obj, this.e, null);
    }

    public final void x(ffrd ffrdVar, Throwable th) {
        try {
            ffrdVar.b(th);
        } catch (Throwable th2) {
            ffhd ffhdVar = this.b;
            toString();
            ffsf.b(ffhdVar, new ffru("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    public final void y(ffjn ffjnVar, Throwable th, Object obj) {
        try {
            ffjnVar.a(th, obj, this.b);
        } catch (Throwable th2) {
            ffhd ffhdVar = this.b;
            toString();
            ffsf.b(ffhdVar, new ffru("Exception in resume onCancellation handler for ".concat(toString()), th2));
        }
    }

    public final void z() {
        ffte v = v();
        if (v == null) {
            return;
        }
        v.hO();
        this.f.c(ffux.a);
    }

    @Override // defpackage.ffhs
    public final void dJ() {
    }
}
