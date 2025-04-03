package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awl extends axv {
    public static final /* synthetic */ int d = 0;
    private static final Executor e;
    bgc a;
    public bnr b;
    axt c;
    private awk f;
    private Executor g;
    private bdy h;
    private boc i;
    private bgd s;

    static {
        bfq bfqVar = awj.a;
        e = bjm.a();
    }

    public awl(bfq bfqVar) {
        super(bfqVar);
        this.g = e;
    }

    private final void c() {
        bgd bgdVar = this.s;
        if (bgdVar != null) {
            bgdVar.b();
            this.s = null;
        }
        bdy bdyVar = this.h;
        if (bdyVar != null) {
            bdyVar.d();
            this.h = null;
        }
        boc bocVar = this.i;
        if (bocVar != null) {
            bocVar.c();
            this.i = null;
        }
        bnr bnrVar = this.b;
        if (bnrVar != null) {
            bnrVar.g();
            this.b = null;
        }
        this.c = null;
    }

    private final void h() {
        bct F = F();
        bnr bnrVar = this.b;
        if (F == null || bnrVar == null) {
            return;
        }
        bnrVar.k(B(F, T(F)), x());
    }

    public final void a(awk awkVar) {
        Executor executor = e;
        biw.b();
        if (awkVar == null) {
            this.f = null;
            this.r = 2;
            M();
        } else {
            this.f = awkVar;
            this.g = executor;
            if (D() != null) {
                b((bfq) this.k, this.l);
                L();
            }
            K();
        }
    }

    @Override // defpackage.axv
    public final Set af() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    public final void b(bfq bfqVar, bgr bgrVar) {
        biw.b();
        final bct F = F();
        F.getClass();
        c();
        ksw.c(this.b == null);
        Matrix matrix = this.n;
        boolean H = F.H();
        Size c = bgrVar.c();
        Rect rect = this.m;
        if (rect == null) {
            rect = c != null ? new Rect(0, 0, c.getWidth(), c.getHeight()) : null;
        }
        Rect rect2 = rect;
        rect2.getClass();
        this.b = new bnr(1, 34, bgrVar, matrix, H, rect2, B(F, T(F)), x(), F.H() && T(F));
        atd atdVar = this.o;
        if (atdVar != null) {
            this.i = new boc(F, new bof(atdVar));
            this.b.e(new Runnable() { // from class: awf
                @Override // java.lang.Runnable
                public final void run() {
                    awl.this.L();
                }
            });
            bou i = bou.i(this.b);
            bnr bnrVar = (bnr) this.i.a(new bmd(this.b, Collections.singletonList(i))).get(i);
            bnrVar.getClass();
            bnrVar.e(new Runnable() { // from class: awg
                @Override // java.lang.Runnable
                public final void run() {
                    awl awlVar = awl.this;
                    bnr bnrVar2 = awlVar.b;
                    biw.b();
                    if (F == awlVar.F()) {
                        bnrVar2.i();
                    }
                }
            });
            this.c = bnrVar.a(F);
            this.h = this.b.c();
        } else {
            this.b.e(new Runnable() { // from class: awf
                @Override // java.lang.Runnable
                public final void run() {
                    awl.this.L();
                }
            });
            axt a = this.b.a(F);
            this.c = a;
            this.h = a.i;
        }
        if (this.f != null) {
            h();
            final awk awkVar = this.f;
            ksw.h(awkVar);
            final axt axtVar = this.c;
            ksw.h(axtVar);
            this.g.execute(new Runnable() { // from class: awe
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = awl.d;
                    awk.this.a(axtVar);
                }
            });
        }
        bgc a2 = bgc.a(bfqVar, bgrVar.c());
        J(a2, bgrVar);
        a2.s(bhe.a(bfqVar));
        if (bgrVar.e() != null) {
            a2.h(bgrVar.e());
        }
        if (this.f != null) {
            a2.n(this.h, bgrVar.d(), z());
        }
        bgd bgdVar = this.s;
        if (bgdVar != null) {
            bgdVar.b();
        }
        bgd bgdVar2 = new bgd(new bge() { // from class: awh
            @Override // defpackage.bge
            public final void a(bgk bgkVar) {
                awl awlVar = awl.this;
                if (awlVar.F() == null) {
                    return;
                }
                awlVar.b((bfq) awlVar.k, awlVar.l);
                awlVar.L();
            }
        });
        this.s = bgdVar2;
        a2.f = bgdVar2;
        this.a = a2;
        Q(awd.a(new Object[]{a2.b()}));
    }

    @Override // defpackage.axv
    public final bgr d(bdp bdpVar) {
        this.a.h(bdpVar);
        Q(awd.a(new Object[]{this.a.b()}));
        bgq f = this.l.f();
        ((bbp) f).b = bdpVar;
        return f.a();
    }

    @Override // defpackage.axv
    public final bhg e(bdp bdpVar) {
        return awi.a(bdpVar);
    }

    @Override // defpackage.axv
    public final bhh f(boolean z, bhl bhlVar) {
        bdp a = bhlVar.a(bhe.f(awj.a), 1);
        if (z) {
            a = bdm.a(a, awj.a);
        }
        if (a == null) {
            return null;
        }
        return awi.a(a).c();
    }

    @Override // defpackage.axv
    protected final bhh g(bcq bcqVar, bhg bhgVar) {
        bhgVar.f().c(beq.C, 34);
        return bhgVar.c();
    }

    @Override // defpackage.axv
    public final void j() {
        c();
    }

    @Override // defpackage.axv
    public final void l(Rect rect) {
        this.m = rect;
        h();
    }

    @Override // defpackage.axv
    protected final void p(bgr bgrVar, bgr bgrVar2) {
        b((bfq) this.k, bgrVar);
    }

    public final String toString() {
        return "Preview:".concat(I());
    }
}
