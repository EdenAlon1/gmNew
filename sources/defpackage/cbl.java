package defpackage;

import android.content.Context;
import android.util.Range;
import android.util.Rational;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cbl {
    private static final avi C = new cbh();
    public final long A;
    public final cbd B;
    private final aua D;
    private final aua E;
    private final Range F;
    private final cbn G;
    private final cbn H;
    private final cbq I;
    public atl a;
    public int b;
    public awl c;
    public avk d;
    public boy e;
    public Executor f;
    public auo g;
    public btz h;
    public btd i;
    public final Map j;
    public bro k;
    public int l;
    public ata m;
    public cck n;
    public axy o;
    public awk p;
    public final ccq q;
    public boolean r;
    public final boolean s;
    public cbk t;
    public final llg u;
    public final cbq v;
    public final cbq w;
    public final Set x;
    public final Context y;
    public final Map z;

    public cbl(Context context) {
        bqc bqcVar = bqc.a;
        ListenableFuture f = bkj.f(bqb.a(context), new afd() { // from class: cbe
            @Override // defpackage.afd
            public final Object a(Object obj) {
                return new ccl((bqc) obj);
            }
        }, bjb.a());
        this.a = atl.b;
        this.b = 3;
        this.i = null;
        this.j = new HashMap();
        this.k = btb.a;
        this.l = 0;
        aua auaVar = aua.a;
        this.D = auaVar;
        this.E = auaVar;
        this.F = bgr.g;
        this.r = true;
        this.s = true;
        this.G = new cbn();
        this.H = new cbn();
        llg llgVar = new llg(new ccy(0));
        this.u = llgVar;
        bik.a(llgVar, new afd() { // from class: cbb
            @Override // defpackage.afd
            public final Object a(Object obj) {
                return Integer.valueOf(((ccy) obj).a);
            }
        });
        this.v = new cbq();
        this.w = new cbq();
        this.I = new cbq();
        this.x = new HashSet();
        this.z = new HashMap();
        this.A = TimeUnit.MILLISECONDS.toNanos(5000L);
        Context a = bhv.a(context);
        this.y = a;
        this.c = A();
        this.d = z(null);
        this.g = y(null, null, null);
        this.h = B();
        bkj.f(f, new afd() { // from class: cbc
            @Override // defpackage.afd
            public final Object a(Object obj) {
                cbl cblVar = cbl.this;
                cblVar.n = (cck) obj;
                cblVar.n();
                cblVar.l();
                return null;
            }
        }, bjm.a());
        this.q = new ccq(a);
        this.B = new cbd(this);
    }

    private final awl A() {
        awi awiVar = new awi();
        C(awiVar, null);
        awiVar.i(this.E);
        return awiVar.b();
    }

    private final btz B() {
        final int x;
        bro broVar = btb.a;
        brc e = brd.e();
        final bro broVar2 = this.k;
        ksw.i(broVar2, "The specified quality selector can't be null.");
        e.e(new ksp() { // from class: bsn
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                ((bus) obj).c(bro.this);
            }
        });
        axy axyVar = this.o;
        if (axyVar != null && this.k == btb.a && (x = x(axyVar)) != -1) {
            e.e(new ksp() { // from class: bsm
                @Override // defpackage.ksp
                public final void accept(Object obj) {
                    ((bus) obj).b(x);
                }
            });
        }
        btv btvVar = new btv(new btb(e.a()));
        btvVar.a.c(bhh.u, this.F);
        btvVar.a.c(bet.H, Integer.valueOf(this.l));
        btvVar.d(this.D);
        return new btz(btvVar.c());
    }

    private final void C(bes besVar, boy boyVar) {
        bow d;
        if (boyVar != null) {
            besVar.e(boyVar);
            return;
        }
        axy axyVar = this.o;
        if (axyVar == null || (d = d(axyVar)) == null) {
            return;
        }
        besVar.e(new boy(d, null));
    }

    private final int x(axy axyVar) {
        int b = axyVar == null ? 0 : bhp.b(axyVar.c);
        cck cckVar = this.n;
        int b2 = cckVar == null ? 0 : cckVar.b(this.a).b();
        cck cckVar2 = this.n;
        int a = bhp.a(b, b2, cckVar2 == null || cckVar2.b(this.a).a() == 1);
        Rational rational = axyVar.b;
        if (a == 90 || a == 270) {
            rational = new Rational(rational.getDenominator(), rational.getNumerator());
        }
        if (rational.equals(new Rational(4, 3))) {
            return 0;
        }
        return rational.equals(new Rational(16, 9)) ? 1 : -1;
    }

    private final auo y(Integer num, Integer num2, Integer num3) {
        aul aulVar = new aul();
        if (num != null) {
            bfh bfhVar = aulVar.a;
            num.intValue();
            bfhVar.c(ben.a, num);
        }
        if (num2 != null) {
            bfh bfhVar2 = aulVar.a;
            num2.intValue();
            bfhVar2.c(ben.b, num2);
        }
        if (num3 != null) {
            bfh bfhVar3 = aulVar.a;
            num3.intValue();
            bfhVar3.c(ben.d, num3);
        }
        C(aulVar, null);
        ben c = aulVar.c();
        ber.d(c);
        return new auo(c);
    }

    private final avk z(Integer num) {
        avc avcVar = new avc();
        if (num != null) {
            bfh bfhVar = avcVar.a;
            num.intValue();
            bfhVar.c(beo.a, num);
        }
        C(avcVar, this.e);
        Executor executor = this.f;
        if (executor != null) {
            avcVar.i(executor);
        }
        return avcVar.b();
    }

    public final int a() {
        biw.b();
        return this.d.b();
    }

    public final int b() {
        biw.b();
        return this.d.a;
    }

    public abstract ata c();

    public final bow d(axy axyVar) {
        int x = x(axyVar);
        if (x != -1) {
            return new bow(x);
        }
        return null;
    }

    public final cdo e() {
        if (this.z.get(cdn.SCREEN_FLASH_VIEW) != null) {
            return (cdo) this.z.get(cdn.SCREEN_FLASH_VIEW);
        }
        if (this.z.get(cdn.PREVIEW_VIEW) != null) {
            return (cdo) this.z.get(cdn.PREVIEW_VIEW);
        }
        return null;
    }

    public final lld f() {
        biw.b();
        return this.G;
    }

    public final ListenableFuture g(float f) {
        biw.b();
        return !r() ? this.I.a(Float.valueOf(f)) : this.m.b().k(f);
    }

    public final void h() {
        biw.b();
        cck cckVar = this.n;
        if (cckVar != null) {
            cckVar.c(this.c, this.d, this.g, this.h);
        }
        this.c.a(null);
        this.m = null;
        this.p = null;
        this.o = null;
        ccq ccqVar = this.q;
        cbd cbdVar = this.B;
        synchronized (ccqVar.a) {
            ccp ccpVar = (ccp) ccqVar.c.get(cbdVar);
            if (ccpVar != null) {
                ccpVar.b.set(false);
                ccqVar.c.remove(cbdVar);
            }
            if (ccqVar.c.isEmpty()) {
                ccqVar.b.disable();
            }
        }
    }

    public final void i(btd btdVar) {
        if (this.i == btdVar) {
            this.i = null;
        }
    }

    final void j(ksp kspVar) {
        btd btdVar = (btd) this.j.remove(kspVar);
        if (btdVar != null) {
            i(btdVar);
        }
    }

    public final void k(int i) {
        biw.b();
        if (i == 3) {
            Integer b = this.a.b();
            if (b != null && b.intValue() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            q();
            i = 3;
        }
        avk avkVar = this.d;
        avw.a("ImageCapture", a.h(i, "setFlashMode: flashMode = "));
        if (i != 0 && i != 1 && i != 2) {
            if (i != 3) {
                throw new IllegalArgumentException(a.h(i, "Invalid flash mode: "));
            }
            if (avkVar.f.a == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            }
            if (avkVar.F() != null && avkVar.a() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        synchronized (avkVar.b) {
            avkVar.d = i;
            avkVar.t();
        }
    }

    public final void l() {
        m(null);
    }

    public final void m(Runnable runnable) {
        try {
            this.m = c();
            if (!r()) {
                avw.a("CameraController", "Use cases not attached to camera.");
                return;
            }
            this.G.b(this.m.c().i());
            this.H.b(this.m.c().h());
            this.v.b(new afd() { // from class: cax
                @Override // defpackage.afd
                public final Object a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    boolean booleanValue = bool.booleanValue();
                    biw.b();
                    cbl cblVar = cbl.this;
                    return !cblVar.r() ? cblVar.v.a(bool) : cblVar.m.b().i(booleanValue);
                }
            });
            this.w.b(new afd() { // from class: cay
                @Override // defpackage.afd
                public final Object a(Object obj) {
                    Float f = (Float) obj;
                    float floatValue = f.floatValue();
                    biw.b();
                    cbl cblVar = cbl.this;
                    return !cblVar.r() ? cblVar.w.a(f) : cblVar.m.b().j(floatValue);
                }
            });
            this.I.b(new afd() { // from class: caz
                @Override // defpackage.afd
                public final Object a(Object obj) {
                    return cbl.this.g(((Float) obj).floatValue());
                }
            });
        } catch (RuntimeException e) {
            if (runnable != null) {
                runnable.run();
            }
            throw e;
        }
    }

    public final void n() {
        if (s()) {
            this.n.c(this.c);
        }
        awl A = A();
        this.c = A;
        awk awkVar = this.p;
        if (awkVar != null) {
            A.a(awkVar);
        }
        o(Integer.valueOf(b()));
        Integer valueOf = Integer.valueOf(this.g.a());
        Integer valueOf2 = Integer.valueOf(this.g.b());
        Integer valueOf3 = Integer.valueOf(this.g.c());
        biw.b();
        if (s()) {
            this.n.c(this.g);
        }
        this.g = y(valueOf, valueOf2, valueOf3);
        p();
    }

    public final void o(Integer num) {
        if (s()) {
            this.n.c(this.d);
        }
        int b = this.d.b();
        this.d = z(num);
        k(b);
    }

    public final void p() {
        if (s()) {
            this.n.c(this.h);
        }
        this.h = B();
    }

    public final void q() {
        cdo e = e();
        if (e == null) {
            avw.a("CameraController", "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            this.d.r(C);
        } else {
            this.d.r(null);
            avw.a("CameraController", "Set ScreenFlash instance to ImageCapture, provided by ".concat(String.valueOf(e.a.name())));
        }
    }

    public final boolean r() {
        return this.m != null;
    }

    public final boolean s() {
        return this.n != null;
    }

    public final boolean t() {
        biw.b();
        return v(1);
    }

    public final boolean u() {
        biw.b();
        btd btdVar = this.i;
        return (btdVar == null || btdVar.a.get()) ? false : true;
    }

    public final boolean v(int i) {
        return (i & this.b) != 0;
    }

    public final boolean w() {
        biw.b();
        return v(4);
    }
}
