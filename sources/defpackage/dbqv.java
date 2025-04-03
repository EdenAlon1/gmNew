package defpackage;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqv implements bcxf {
    public static final cskc a = cskc.g("Bugle", "DittoWelcomeFragmentPeerDelegate");
    public dbri c;
    public final adsd d;
    public final ffbr e;
    private final Optional f;
    private final Optional g;
    private final ea h;
    private final adsg i;
    private final cgwk j;
    private final bcxh k;
    private final ejwl l;
    private final axkm m;
    private final dbrj n;
    private final ejvb o;
    private final ffbr p;
    private final dvvb s;
    public final bcpt b = new bcpt();
    private final ejwd q = new ejwd<axez>() { // from class: dbqv.1
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            dbqv.a.r("Error loading fi settings data, defaulting to ditto welcome banner");
            dbqv.this.c.F(false);
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            dbqv.this.c.F(((axez) obj).e);
        }

        @Override // defpackage.ejwd
        public final void hB() {
        }
    };
    private final ejwd r = new ejwd<Boolean>() { // from class: dbqv.2
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            dbqv.a.r("Error getting showDittoBatteryPromo");
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                dbqv.this.d.a(15);
            } else {
                dbqv.a.m("No need to show Ditto Battery Promo");
            }
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    };

    public dbqv(Optional optional, Optional optional2, ea eaVar, adsd adsdVar, dvvb dvvbVar, adsg adsgVar, cgwk cgwkVar, bcxh bcxhVar, ejwl ejwlVar, axkm axkmVar, ffbr ffbrVar, ejvb ejvbVar, dbrj dbrjVar, ffbr ffbrVar2) {
        this.f = optional;
        this.g = optional2;
        this.h = eaVar;
        this.d = adsdVar;
        this.s = dvvbVar;
        this.i = adsgVar;
        this.j = cgwkVar;
        this.k = bcxhVar;
        this.l = ejwlVar;
        this.m = axkmVar;
        this.n = dbrjVar;
        this.e = ffbrVar;
        this.o = ejvbVar;
        this.p = ffbrVar2;
    }

    public final void a() {
        this.b.f();
    }

    public final void b() {
        this.s.b();
    }

    public final void c() {
        this.s.a(this.i.a(this.h.G(), null));
    }

    public final void d() {
        ffbr ffbrVar = this.k.a;
        eg G = this.h.G();
        azwc azwcVar = (azwc) ffbrVar.b();
        azwcVar.getClass();
        G.getClass();
        this.b.c(new bcxg(azwcVar, G, this));
        bcxg bcxgVar = (bcxg) this.b.a();
        loo a2 = loo.a(this.h);
        Bundle bundle = new Bundle();
        bundle.putString("bindingId", this.b.b());
        bcxgVar.a = a2;
        bcxgVar.a.c(1, bundle, bcxgVar);
        dbrj dbrjVar = this.n;
        ffbr ffbrVar2 = dbrjVar.a;
        eg G2 = this.h.G();
        csrh csrhVar = (csrh) ffbrVar2.b();
        csrhVar.getClass();
        ctbe ctbeVar = (ctbe) dbrjVar.b.b();
        ctbeVar.getClass();
        akzt akztVar = (akzt) dbrjVar.c.b();
        akztVar.getClass();
        akzt akztVar2 = (akzt) dbrjVar.d.b();
        akztVar2.getClass();
        chep chepVar = (chep) dbrjVar.e.b();
        chepVar.getClass();
        ((bzar) dbrjVar.f.b()).getClass();
        chyn chynVar = (chyn) dbrjVar.g.b();
        chynVar.getClass();
        ellq ellqVar = (ellq) dbrjVar.i.b();
        ellqVar.getClass();
        elbx elbxVar = (elbx) dbrjVar.j.b();
        elbxVar.getClass();
        ((asie) dbrjVar.m.b()).getClass();
        G2.getClass();
        Optional optional = this.f;
        optional.getClass();
        this.c = new dbri(csrhVar, ctbeVar, akztVar, akztVar2, chepVar, chynVar, dbrjVar.h, ellqVar, elbxVar, dbrjVar.k, dbrjVar.l, G2, optional);
        this.j.s();
        if (this.f.isPresent() && this.g.isPresent()) {
            ((dbtj) this.g.get()).c();
        }
    }

    public final View e() {
        View findViewById;
        RecyclerView recyclerView = new RecyclerView(this.h.G());
        recyclerView.aL();
        recyclerView.setVerticalScrollBarEnabled(true);
        this.h.G();
        recyclerView.ap(new LinearLayoutManager());
        recyclerView.am(this.c);
        recyclerView.z(new dbqw());
        this.l.b(this.m.e(), this.q);
        this.l.c(new ejuy(this.o, new eros() { // from class: dbqt
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                final cgzv cgzvVar = (cgzv) dbqv.this.e.b();
                chho chhoVar = cgzvVar.t;
                final Context context = cgzvVar.i;
                return new erph(elfo.g(new Callable() { // from class: chhn
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Integer.valueOf(chho.b(context));
                    }
                }, chhoVar.a).i(new eroh() { // from class: cgyw
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        Integer num = (Integer) obj;
                        if (num == null || num.intValue() != 1) {
                            cgzv.a.m("Battery is not optimized");
                            return elfo.e(false);
                        }
                        final cgzv cgzvVar2 = cgzv.this;
                        return ((chnf) cgzvVar2.o.b()).a().i(new eroh() { // from class: cgyo
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                Long l = (Long) obj2;
                                if (l == null || l.longValue() <= 0) {
                                    cgzv.a.m("Fcm has never been downgraded");
                                    return elfo.e(false);
                                }
                                boolean z = l.longValue() + TimeUnit.DAYS.toMicros((long) ((Integer) cgzv.f.e()).intValue()) > TimeUnit.MILLISECONDS.toMicros(cgzv.this.n.f().toEpochMilli());
                                csjb a2 = cgzv.a.a();
                                a2.B("Fcm has been recently downgraded", z);
                                a2.r();
                                return elfo.e(Boolean.valueOf(z));
                            }
                        }, cgzvVar2.j);
                    }
                }, cgzvVar.j));
            }
        }, "SHOW_DITTO_BATTERY_PROMO"), ejwa.FEW_HOURS, this.r);
        if (((asln) this.p.b()).a() && (findViewById = this.h.fe().findViewById(R.id.content)) != null) {
            kud kudVar = new kud() { // from class: dbqu
                @Override // defpackage.kud
                public final kxh ey(View view, kxh kxhVar) {
                    kpt f = kxhVar.f(519);
                    view.setPadding(f.b, 0, f.d, 0);
                    return kxhVar;
                }
            };
            int[] iArr = kvo.a;
            kvd.k(findViewById, kudVar);
        }
        return recyclerView;
    }
}
