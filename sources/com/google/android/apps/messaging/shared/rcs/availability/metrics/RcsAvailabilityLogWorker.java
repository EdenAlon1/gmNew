package com.google.android.apps.messaging.shared.rcs.availability.metrics;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.asqr;
import defpackage.asra;
import defpackage.ckhg;
import defpackage.ckhh;
import defpackage.cort;
import defpackage.djro;
import defpackage.dkpp;
import defpackage.dktn;
import defpackage.dkty;
import defpackage.dkvg;
import defpackage.dkvu;
import defpackage.ekhw;
import defpackage.elfo;
import defpackage.emxf;
import defpackage.eqwf;
import defpackage.erog;
import defpackage.errl;
import defpackage.ffbr;
import defpackage.ppr;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class RcsAvailabilityLogWorker extends ppr {
    public static final dktn e = new dktn("RcsAvailabilityLogWorker");
    public final ffbr f;
    public final errl g;
    public final cort h;
    private final ckhh i;
    private final errl j;
    private final dkvu k;
    private final dkpp l;
    private final asra m;
    private final ffbr n;

    /* compiled from: PG */
    public interface a {
        asra ay();

        ckhh cm();

        cort ct();

        dkpp dw();

        dkvu dx();

        ffbr gh();

        ffbr gq();

        errl p();

        errl x();
    }

    public RcsAvailabilityLogWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ekhw.a(context, a.class);
        this.f = aVar.gh();
        this.i = aVar.cm();
        this.j = aVar.p();
        this.g = aVar.x();
        this.k = aVar.dx();
        this.l = aVar.dw();
        this.h = aVar.ct();
        this.m = aVar.ay();
        this.n = aVar.gq();
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        dkty.d(e, "%s is started", "RcsAvailabilityLogWorker");
        return ((asqr) this.n.b()).a() ? elfo.h(new erog() { // from class: ckhb
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final RcsAvailabilityLogWorker rcsAvailabilityLogWorker = RcsAvailabilityLogWorker.this;
                return rcsAvailabilityLogWorker.h.d().h(new emwl() { // from class: ckhe
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        for (cosz coszVar : (Set) obj) {
                            RcsAvailabilityLogWorker rcsAvailabilityLogWorker2 = RcsAvailabilityLogWorker.this;
                            rcsAvailabilityLogWorker2.c(((ckge) ((csjk) rcsAvailabilityLogWorker2.f.b()).a()).w(new djro(coszVar.c)), Optional.of(coszVar));
                        }
                        return new ppp();
                    }
                }, rcsAvailabilityLogWorker.g);
            }
        }, this.g) : this.m.a() ? elfo.h(new erog() { // from class: ckgz
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final RcsAvailabilityLogWorker rcsAvailabilityLogWorker = RcsAvailabilityLogWorker.this;
                return rcsAvailabilityLogWorker.h.e(cors.a).h(new emwl() { // from class: ckgy
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        final Optional optional = (Optional) obj;
                        final RcsAvailabilityLogWorker rcsAvailabilityLogWorker2 = RcsAvailabilityLogWorker.this;
                        optional.ifPresentOrElse(new Consumer() { // from class: ckgw
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                RcsAvailabilityLogWorker rcsAvailabilityLogWorker3 = RcsAvailabilityLogWorker.this;
                                rcsAvailabilityLogWorker3.c(((ckge) ((csjk) rcsAvailabilityLogWorker3.f.b()).a()).w(new djro(((cosz) obj2).c)), optional);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, new Runnable() { // from class: ckgx
                            @Override // java.lang.Runnable
                            public final void run() {
                                dkty.d(RcsAvailabilityLogWorker.e, "%s No default SimSubscriptionInfoFound. Skipping availability update.", "RcsAvailabilityLogWorker");
                            }
                        });
                        return new ppp();
                    }
                }, rcsAvailabilityLogWorker.g);
            }
        }, this.g) : elfo.g(new Callable() { // from class: ckha
            @Override // java.util.concurrent.Callable
            public final Object call() {
                RcsAvailabilityLogWorker rcsAvailabilityLogWorker = RcsAvailabilityLogWorker.this;
                rcsAvailabilityLogWorker.c(((ckge) ((csjk) rcsAvailabilityLogWorker.f.b()).a()).x(), Optional.empty());
                return new ppp();
            }
        }, this.j);
    }

    public final void c(eqwf eqwfVar, Optional optional) {
        if (this.m.a()) {
            emxf.b(optional.isPresent(), "No SimSubscriptionInfo present.");
        }
        djro djroVar = new djro((String) optional.map(new Function() { // from class: ckhc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cosz) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(this.l.l()));
        dkvg a2 = this.k.a(((Integer) optional.map(new Function() { // from class: ckhd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((cosz) obj).d);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(Integer.valueOf(this.l.b()))).intValue());
        this.i.h(new ckhg(eqwfVar, eqwfVar), dkvg.SINGLE_REG.equals(a2) ? 5 : dkvg.DUAL_REG.equals(a2) ? 4 : 1, djroVar);
    }
}
