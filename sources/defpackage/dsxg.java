package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxg implements dsmn {
    static final /* synthetic */ ffmx[] a;
    public static final enru b;
    public final dsxk c;
    public final dsma d;
    public final ffji e;
    public final dszd f;
    public final Map g;
    private final ernh h;
    private final dszm i;
    private final dszj j;
    private final fr k;
    private final ffix l;
    private final dtac m;
    private final dsxd n;
    private final ffls o;
    private final ffls p;

    static {
        ffko ffkoVar = new ffko(dsxg.class, "currentScreen", "getCurrentScreen()Lcom/google/android/libraries/compose/ui/screen/HugoScreen;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar, new ffko(dsxg.class, "currentState", "getCurrentState()Lcom/google/android/libraries/compose/ui/rendering/RenderingState;", 0)};
        b = enru.c("com/google/android/libraries/compose/ui/rendering/RenderingManager");
    }

    public dsxg(ernh ernhVar, dszm dszmVar, dszj dszjVar, fr frVar, ffix ffixVar, dsxk dsxkVar, dsma dsmaVar, dtac dtacVar, ffji ffjiVar) {
        dszd dsziVar;
        this.h = ernhVar;
        this.i = dszmVar;
        this.j = dszjVar;
        this.k = frVar;
        this.l = ffixVar;
        this.c = dsxkVar;
        this.d = dsmaVar;
        this.m = dtacVar;
        this.e = ffjiVar;
        if (dsxkVar.a) {
            Context context = (Context) dszmVar.a.b();
            context.getClass();
            dsxv dsxvVar = (dsxv) dszmVar.b.b();
            dsxvVar.getClass();
            dsziVar = new dszl(context, dsxvVar, frVar, dsxkVar, dsmaVar);
        } else {
            Context context2 = (Context) dszjVar.a.b();
            context2.getClass();
            dsxv dsxvVar2 = (dsxv) dszjVar.b.b();
            dsxvVar2.getClass();
            dsziVar = new dszi(context2, dsxvVar2, frVar, dsxkVar, dsmaVar);
        }
        this.f = dsziVar;
        this.n = new dsxd(this);
        this.o = new dsxe(this);
        this.p = new dsxf(dsxi.d, this);
        this.g = new LinkedHashMap();
    }

    public static /* synthetic */ boolean p(dsxg dsxgVar) {
        dsxi b2 = dsxgVar.b();
        b2.getClass();
        return b2 != dsxi.d;
    }

    private final Object q(ffji ffjiVar, Object obj) {
        try {
            return ffjiVar.invoke(this.l.invoke());
        } catch (ffct unused) {
            ((enrr) b.h().h("com/google/android/libraries/compose/ui/rendering/RenderingManager", "safelyRunWithDraftController", 373, "RenderingManager.kt")).t("DraftController not initialized. Returning default value %s.", obj);
            return obj;
        }
    }

    public final int a(dsxi dsxiVar) {
        dsxiVar.getClass();
        return this.f.b();
    }

    public final dsxi b() {
        return (dsxi) this.p.c(a[1]);
    }

    public final dtaa c(dszr dszrVar) {
        dszrVar.getClass();
        return this.f.d(dszrVar);
    }

    public final dtaa d() {
        return (dtaa) this.o.c(a[0]);
    }

    public final void e() {
        dszd dszdVar = this.f;
        dsym dsymVar = dszdVar.g;
        if (dsymVar.a.h) {
            dsymVar.c(dsymVar.b);
        }
        dsymVar.a.c.setOnHierarchyChangeListener(dsymVar.e);
        dszdVar.h();
    }

    public final void f(dtaa dtaaVar) {
        dtaaVar.gU(this.c, this.n);
        dtaaVar.gV(this.l);
    }

    public final void g() {
        dsxi b2 = b();
        dsmm dsmmVar = dsmm.a;
        int ordinal = b2.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            o(dsxi.d);
            i(d());
        }
        h();
    }

    public final void h() {
        this.f.f();
    }

    public final void i(dtaa dtaaVar) {
        Instant a2 = this.h.a();
        a2.getClass();
        if (dtaaVar != null) {
            dtaaVar.bd();
            dtac dtacVar = this.m;
            dszr t = dtaaVar.t();
            int intValue = ((Number) q(new ffji() { // from class: dsxa
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    enru enruVar = dsxg.b;
                    ((dqls) obj).getClass();
                    return 0;
                }
            }, 0)).intValue();
            Duration between = Duration.between(dtaaVar.aQ, a2);
            between.getClass();
            dtacVar.a(t, intValue, between);
            dtaaVar.bH(Instant.EPOCH);
        }
    }

    public final void j() {
        Duration bD;
        dtaa d = d();
        if (d != null) {
            if (true != d.bI()) {
                d = null;
            }
            if (d != null) {
                f(d);
                if (b() == dsxi.a && this.d.d() == dsmm.a) {
                    this.d.i();
                }
                if (b() != dsxi.d) {
                    if (ffkj.e(d.aQ, Instant.EPOCH)) {
                        d.bH(this.h.a());
                        bD = Duration.ZERO;
                    } else {
                        bD = d.bD();
                    }
                    bD.getClass();
                    d.be();
                    this.m.b(d.t(), ((Number) q(new ffji() { // from class: dsxc
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj) {
                            enru enruVar = dsxg.b;
                            ((dqls) obj).getClass();
                            return 0;
                        }
                    }, 0)).intValue(), bD);
                }
            }
        }
    }

    public final void k(dtaa dtaaVar) {
        dtaaVar.getClass();
        e();
        if (!ffkj.e(dtaaVar, d())) {
            n(dtaaVar);
        }
        dsxi b2 = b();
        dsmm dsmmVar = dsmm.a;
        if (b2.ordinal() != 3) {
            return;
        }
        o(dsxi.a);
        j();
    }

    @Override // defpackage.dsmn
    public final void l(int i) {
        dsxi b2 = b();
        dsmm dsmmVar = dsmm.a;
        int ordinal = b2.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            dszd.m(this.f, i, 2);
        } else if (i > this.f.b()) {
            this.f.i(i, false);
        }
    }

    @Override // defpackage.dsmn
    public final void m(dsmm dsmmVar) {
        dsmmVar.getClass();
        dsmm dsmmVar2 = dsmm.a;
        int ordinal = dsmmVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3 && !this.c.a && b().ordinal() == 1) {
                g();
                return;
            }
            return;
        }
        int ordinal2 = b().ordinal();
        if (ordinal2 == 0) {
            g();
            return;
        }
        if (ordinal2 != 1) {
            return;
        }
        dsma dsmaVar = this.d;
        dszd dszdVar = this.f;
        dsxk dsxkVar = this.c;
        int b2 = dsmaVar.b();
        dszdVar.k(b2, dsxkVar.a() - b2);
    }

    public final void n(dtaa dtaaVar) {
        this.o.d(a[0], dtaaVar);
    }

    public final void o(dsxi dsxiVar) {
        this.p.d(a[1], dsxiVar);
    }
}
