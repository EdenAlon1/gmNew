package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cctl {
    public static final cfup a = cfvl.e(cfvl.b, "batch_restore_max_retry", 2);
    static final emyl b = cfvl.x(192093368, "terminate_restore_when_cms_not_enabled");
    public static final cskc c = cskc.g("BugleCms", "CmsWorker");
    public final axkm d;
    public final cscn e;
    public final ccry f;
    public final errl g;
    public final errl h;
    public final axdf i;
    public final ffbr j;
    public final axmm k;
    public final ffbr l;
    public int m = 0;
    public final cbwj n;

    public cctl(ffbr ffbrVar, ffbr ffbrVar2, axkm axkmVar, axdf axdfVar, cscn cscnVar, ccry ccryVar, axmm axmmVar, cbwj cbwjVar, errl errlVar, errl errlVar2) {
        this.j = ffbrVar;
        this.l = ffbrVar2;
        this.d = axkmVar;
        this.e = cscnVar;
        this.f = ccryVar;
        this.n = cbwjVar;
        this.k = axmmVar;
        this.g = errlVar;
        this.h = errlVar2;
        this.i = axdfVar;
    }

    public final elfl a(final pot potVar, final String str, final cctm cctmVar, final boolean z) {
        return (((Boolean) ((cfup) b.get()).e()).booleanValue() ? this.d.n.b().i(new eroh() { // from class: ccsv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cfup cfupVar = cctl.a;
                return !((Boolean) obj).booleanValue() ? elfo.d(new cctk()) : elfo.e(null);
            }
        }, erpp.a) : elfo.e(null)).i(new eroh() { // from class: ccsw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cfup cfupVar = cctl.a;
                return cctm.this.d(str);
            }
        }, this.g).i(new eroh() { // from class: ccsx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final csdq csdqVar = (csdq) obj;
                engw engwVar = csdqVar.a;
                final boolean c2 = emxe.c(str);
                final int size = engwVar.size();
                final cctl cctlVar = cctl.this;
                final cctm cctmVar2 = cctmVar;
                cctlVar.d.j().i(new eroh() { // from class: ccsg
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        String h = cctmVar2.h();
                        String d = cegr.d(h);
                        cctl cctlVar2 = cctl.this;
                        ((akzt) cctlVar2.j.b()).e(d, size);
                        ((akzt) cctlVar2.j.b()).e(cegr.b(h), ((Integer) obj2).intValue());
                        return cctlVar2.d.j();
                    }
                }, erpp.a);
                boolean c3 = cctmVar2.c().c();
                final boolean z2 = z;
                return !c3 ? cctlVar.b(csdqVar, cctmVar2, z2) : cctlVar.d.j().i(new eroh() { // from class: ccsh
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        Integer num = (Integer) obj2;
                        int intValue = num.intValue();
                        int intValue2 = ((Integer) cctl.a.e()).intValue();
                        final cctl cctlVar2 = cctl.this;
                        final csdq csdqVar2 = csdqVar;
                        final cctm cctmVar3 = cctmVar2;
                        final boolean z3 = z2;
                        if (intValue <= intValue2) {
                            final boolean z4 = c2;
                            final long a2 = ((cqoh) cctlVar2.l.b()).a();
                            return elfo.h(new erog() { // from class: ccsc
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    final ccdx c4 = cctmVar3.c();
                                    c4.getClass();
                                    Optional empty = Optional.empty();
                                    if (!c4.c()) {
                                        throw new UnsupportedOperationException("Batch restore is not supported yet.");
                                    }
                                    csdq csdqVar3 = csdq.this;
                                    return c4.a((engw) Collection.EL.stream(csdqVar3.a).filter(new Predicate() { // from class: ccdy
                                        public final /* synthetic */ Predicate and(Predicate predicate) {
                                            return Predicate$CC.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* renamed from: negate */
                                        public final /* synthetic */ Predicate mo439negate() {
                                            return Predicate$CC.$default$negate(this);
                                        }

                                        public final /* synthetic */ Predicate or(Predicate predicate) {
                                            return Predicate$CC.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj3) {
                                            return ccdx.this.b(obj3);
                                        }
                                    }).collect(endq.a), empty, z4);
                                }
                            }, cctlVar2.g).f(Exception.class, new eroh() { // from class: ccsn
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    Exception exc = (Exception) obj3;
                                    if (!(exc instanceof csgt) || !((csgt) exc).b.equals(csgx.NO_RETRY)) {
                                        csjb e = cctl.c.e();
                                        e.I("Retriable failure found during batch message restore! Retrying now!");
                                        e.s(exc);
                                        throw exc;
                                    }
                                    boolean z5 = z3;
                                    cctm cctmVar4 = cctmVar3;
                                    csdq csdqVar3 = csdqVar2;
                                    cctl cctlVar3 = cctl.this;
                                    csjb e2 = cctl.c.e();
                                    e2.I("Unretriable failure found during batch message restore! It will not retry! Falling back to one-by-one restore!");
                                    e2.s(exc);
                                    return cctlVar3.b(csdqVar3, cctmVar4, z5).h(new emwl() { // from class: ccsp
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj4) {
                                            cfup cfupVar = cctl.a;
                                            return enoz.a;
                                        }
                                    }, erpp.a);
                                }
                            }, erpp.a).h(new emwl() { // from class: ccsy
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    cctl.this.c(cctmVar3.h(), a2);
                                    return csdqVar2.b;
                                }
                            }, erpp.a);
                        }
                        csjb e = cctl.c.e();
                        e.I("Max try limit of batch restore exceeded! Falling back to one-by-one restore!");
                        e.A("retried count", num);
                        e.r();
                        return cctlVar2.b(csdqVar2, cctmVar3, z3);
                    }
                }, erpp.a);
            }
        }, this.g).i(new eroh() { // from class: ccsz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cctl cctlVar = cctl.this;
                cctlVar.m++;
                return cctlVar.d.w((String) obj);
            }
        }, erpp.a).i(new eroh() { // from class: ccta
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str2 = (String) obj;
                boolean isEmpty = TextUtils.isEmpty(str2);
                cctl cctlVar = cctl.this;
                final cctm cctmVar2 = cctmVar;
                final pot potVar2 = potVar;
                if (!isEmpty) {
                    return cctlVar.a(potVar2, str2, cctmVar2, z);
                }
                cctl.c.p("Doing post execution for ".concat(String.valueOf(cctmVar2.getClass().getSimpleName())));
                return cctlVar.d.w("POST_RESTORE_PAGE_TOKEN").i(new eroh() { // from class: ccsu
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        cfup cfupVar = cctl.a;
                        return cctm.this.e(potVar2);
                    }
                }, cctlVar.g);
            }
        }, this.g).f(csgw.class, new eroh() { // from class: cctb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final csgw csgwVar = (csgw) obj;
                int i = csgwVar.a;
                cctl cctlVar = cctl.this;
                return cctlVar.e.a(i).i(new eroh() { // from class: cctf
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        cfup cfupVar = cctl.a;
                        return ((Boolean) obj2).booleanValue() ? elfo.e(null) : elfo.d(csgw.this);
                    }
                }, cctlVar.g);
            }
        }, this.g).f(crtx.class, new eroh() { // from class: cctc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cctl.this.k.g();
                return elfo.d((crtx) obj);
            }
        }, this.g);
    }

    public final elfl b(final csdq csdqVar, final cctm cctmVar, boolean z) {
        final long a2 = ((cqoh) this.l.b()).a();
        final enhk enhkVar = (enhk) Collection.EL.stream(csdqVar.a).collect(endq.a(new Function() { // from class: ccsj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cctm.this.g(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: ccsk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(final Object obj) {
                final cctm cctmVar2 = cctmVar;
                return elfo.h(new erog() { // from class: ccte
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        Object obj2 = obj;
                        obj2.getClass();
                        ccdx c2 = cctmVar2.c();
                        return !c2.b(obj2) ? elfo.e(null) : c2.d(obj2);
                    }
                }, cctl.this.g);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        final String h = cctmVar.h();
        return z ? elfo.j(enhkVar.values()).b(new erog() { // from class: ccsl
            @Override // defpackage.erog
            public final ListenableFuture a() {
                cctl cctlVar = cctl.this;
                cctlVar.c(h, a2);
                cctm cctmVar2 = cctmVar;
                final epfx f = cctmVar2.f();
                final bqkx b2 = cctmVar2.b();
                final ccry ccryVar = cctlVar.f;
                elfl j = ((axkm) ccryVar.c.b()).j();
                final enhk enhkVar2 = enhkVar;
                return j.i(new eroh() { // from class: ccrp
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        Integer num = (Integer) obj;
                        enhd enhdVar = new enhd();
                        enhd enhdVar2 = new enhd();
                        for (Map.Entry entry : enhkVar2.entrySet()) {
                            String str = (String) entry.getKey();
                            elfl elflVar = (elfl) entry.getValue();
                            try {
                                erqt.q(elflVar);
                            } catch (ExecutionException e) {
                                Throwable cause = e.getCause();
                                cause.getClass();
                                if ((cause instanceof csgt) && csgx.NO_RETRY.equals(((csgt) cause).b)) {
                                    enhdVar.k(str, cause);
                                } else {
                                    if (Status.c(e).getCode().equals(Status.Code.UNAVAILABLE) || num.intValue() < ((Integer) csgj.b.e()).intValue()) {
                                        return elflVar;
                                    }
                                    enhdVar2.k(str, cause);
                                }
                            }
                        }
                        final enhk c2 = enhdVar.c();
                        final enhk c3 = enhdVar2.c();
                        final int intValue = num.intValue();
                        if (c2.isEmpty() && c3.isEmpty()) {
                            return elfo.e(null);
                        }
                        final bqkx bqkxVar = b2;
                        final epfx epfxVar = f;
                        final ccry ccryVar2 = ccry.this;
                        return elfo.f(new Runnable() { // from class: ccrq
                            @Override // java.lang.Runnable
                            public final void run() {
                                engi values = ((enhk) c2).values();
                                engi values2 = ((enhk) c3).values();
                                epfr epfrVar = (epfr) epfs.a.createBuilder();
                                epfrVar.copyOnWrite();
                                epfs epfsVar = (epfs) epfrVar.instance;
                                epfsVar.b |= 1;
                                epfsVar.e = intValue;
                                Stream map = Collection.EL.stream(values).map(new Function() { // from class: axcr
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return axdy.a((Throwable) obj2);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i = engw.d;
                                Iterable iterable = (Iterable) map.collect(endq.a);
                                epfrVar.copyOnWrite();
                                epfs epfsVar2 = (epfs) epfrVar.instance;
                                eygi eygiVar = epfsVar2.c;
                                if (!eygiVar.c()) {
                                    epfsVar2.c = eyfy.mutableCopy(eygiVar);
                                }
                                Iterator it = iterable.iterator();
                                while (it.hasNext()) {
                                    epfsVar2.c.h(((epeg) it.next()).bs);
                                }
                                Iterable iterable2 = (Iterable) Collection.EL.stream(values2).map(new Function() { // from class: axcr
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return axdy.a((Throwable) obj2);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(endq.a);
                                epfrVar.copyOnWrite();
                                epfs epfsVar3 = (epfs) epfrVar.instance;
                                eygi eygiVar2 = epfsVar3.d;
                                if (!eygiVar2.c()) {
                                    epfsVar3.d = eyfy.mutableCopy(eygiVar2);
                                }
                                Iterator it2 = iterable2.iterator();
                                while (it2.hasNext()) {
                                    epfsVar3.d.h(((epeg) it2.next()).bs);
                                }
                                ccry ccryVar3 = ccry.this;
                                epfx epfxVar2 = epfxVar;
                                epfs epfsVar4 = (epfs) epfrVar.build();
                                epep epepVar = (epep) epeq.a.createBuilder();
                                axdf axdfVar = ccryVar3.d;
                                epfx c4 = axdfVar.c(epfxVar2);
                                epepVar.copyOnWrite();
                                epeq epeqVar = (epeq) epepVar.instance;
                                epeqVar.c = c4.s;
                                epeqVar.b |= 1;
                                epepVar.copyOnWrite();
                                epeq epeqVar2 = (epeq) epepVar.instance;
                                epeqVar2.d = 5;
                                epeqVar2.b |= 2;
                                epepVar.copyOnWrite();
                                epeq epeqVar3 = (epeq) epepVar.instance;
                                epfsVar4.getClass();
                                epeqVar3.h = epfsVar4;
                                epeqVar3.b |= 32;
                                epepVar.a(axdfVar.b());
                                epepVar.a(axdfVar.b());
                                axdfVar.m((epeq) epepVar.build());
                            }
                        }, ccryVar2.g).i(new eroh() { // from class: ccrr
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                final Map map = c2;
                                final bqkx bqkxVar2 = bqkxVar;
                                final Map map2 = c3;
                                return ccry.this.j.b("CmsRestoreFailureMapper#logSkippedFailures", new Runnable() { // from class: ccrv
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        bqkx bqkxVar3;
                                        cskc cskcVar = ccry.a;
                                        ArrayList arrayList = new ArrayList();
                                        Iterator<E> it = ((enhk) map).entrySet().iterator();
                                        while (true) {
                                            bqkxVar3 = bqkxVar2;
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Map.Entry entry2 = (Map.Entry) it.next();
                                            String str2 = (String) entry2.getKey();
                                            Throwable th = (Throwable) entry2.getValue();
                                            csjb e2 = ccry.a.e();
                                            e2.I("Skipping non-retriable restore failure");
                                            e2.A("cmsId", str2);
                                            e2.A("cmsDataType", bqkxVar3);
                                            e2.s(th);
                                            String[] strArr = bqkv.a;
                                            bqiw bqiwVar = new bqiw();
                                            bqiwVar.k(str2);
                                            bqiwVar.j(bqkxVar3);
                                            bqiwVar.c(bqkw.INITIAL_RESTORE_NON_RETRIABLE);
                                            bqiwVar.l(axdy.a(th));
                                            arrayList.add(bqiwVar.a());
                                        }
                                        Map map3 = map2;
                                        bqkv.f((bqir[]) enjk.s(arrayList, bqir.class));
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Map.Entry entry3 : ((enhk) map3).entrySet()) {
                                            String str3 = (String) entry3.getKey();
                                            Throwable th2 = (Throwable) entry3.getValue();
                                            csjb e3 = ccry.a.e();
                                            e3.I("Skipping max-retried restore failure");
                                            e3.A("cmsId", str3);
                                            e3.A("cmsDataType", bqkxVar3);
                                            e3.s(th2);
                                            bqiw bqiwVar2 = new bqiw();
                                            bqiwVar2.k(str3);
                                            bqiwVar2.j(bqkxVar3);
                                            bqiwVar2.c(bqkw.INITIAL_RESTORE_MAX_RETRIED);
                                            bqiwVar2.l(axdy.a(th2));
                                            arrayList2.add(bqiwVar2.a());
                                        }
                                        bqkv.f((bqir[]) enjk.s(arrayList2, bqir.class));
                                    }
                                });
                            }
                        }, ccryVar2.g).i(new eroh() { // from class: ccrs
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                final engi values = ((enhk) c2).values();
                                final engi values2 = ((enhk) c3).values();
                                final ccry ccryVar3 = ccry.this;
                                return ccryVar3.h.a() ? ((axkm) ccryVar3.c.b()).o().i(new eroh() { // from class: ccrw
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        elfl h2;
                                        Integer num2 = (Integer) obj3;
                                        final int i = 0;
                                        for (Throwable th : values) {
                                            if (num2.intValue() + i >= ((Integer) ccry.b.e()).intValue()) {
                                                break;
                                            }
                                            crze.c("CMS restore failure", th);
                                            i++;
                                        }
                                        for (Throwable th2 : values2) {
                                            if (num2.intValue() + i >= ((Integer) ccry.b.e()).intValue()) {
                                                break;
                                            }
                                            crze.c("CMS restore failure", th2);
                                            i++;
                                        }
                                        final ccry ccryVar4 = ccry.this;
                                        synchronized (ccryVar4.i) {
                                            h2 = ((axkm) ccryVar4.c.b()).o().i(new eroh() { // from class: ccrx
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj4) {
                                                    return ((axkm) ccry.this.c.b()).x(((Integer) obj4).intValue() + i);
                                                }
                                            }, ccryVar4.f).h(new emwl() { // from class: ccro
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj4) {
                                                    cskc cskcVar = ccry.a;
                                                    return null;
                                                }
                                            }, erpp.a);
                                        }
                                        return h2;
                                    }
                                }, ccryVar3.f) : ((axkm) ccryVar3.c.b()).o().i(new eroh() { // from class: ccrn
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj3) {
                                        final ccry ccryVar4;
                                        Integer num2 = (Integer) obj3;
                                        ArrayList arrayList = new ArrayList();
                                        Iterator it = values.iterator();
                                        while (true) {
                                            ccryVar4 = ccry.this;
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Throwable th = (Throwable) it.next();
                                            if (num2.intValue() >= ((Integer) ccry.b.e()).intValue()) {
                                                break;
                                            }
                                            int intValue2 = num2.intValue() + 1;
                                            cfyt cfytVar = ccryVar4.e;
                                            num2 = Integer.valueOf(intValue2);
                                            arrayList.add(cfytVar.b(th));
                                        }
                                        for (Throwable th2 : values2) {
                                            if (num2.intValue() >= ((Integer) ccry.b.e()).intValue()) {
                                                break;
                                            }
                                            int intValue3 = num2.intValue() + 1;
                                            cfyt cfytVar2 = ccryVar4.e;
                                            num2 = Integer.valueOf(intValue3);
                                            arrayList.add(cfytVar2.b(th2));
                                        }
                                        final int intValue4 = num2.intValue();
                                        return elfo.l(arrayList).b(new erog() { // from class: ccrt
                                            @Override // defpackage.erog
                                            public final ListenableFuture a() {
                                                return ((axkm) ccry.this.c.b()).x(intValue4).h(new emwl() { // from class: ccru
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj4) {
                                                        cskc cskcVar = ccry.a;
                                                        return null;
                                                    }
                                                }, erpp.a);
                                            }
                                        }, ccryVar4.f);
                                    }
                                }, ccryVar3.f);
                            }
                        }, ccryVar2.f);
                    }
                }, ccryVar.f);
            }
        }, this.g).h(new emwl() { // from class: ccsm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cfup cfupVar = cctl.a;
                return csdq.this.b;
            }
        }, this.g) : elfo.l(enhkVar.values()).a(new Callable() { // from class: ccso
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cctl.this.c(h, a2);
                return csdqVar.b;
            }
        }, this.g);
    }

    public final void c(String str, long j) {
        ((akzt) this.j.b()).g(cegr.c(str), ((cqoh) this.l.b()).a() - j);
    }

    public final elfl d(final pot potVar, final cctm cctmVar, final boolean z, final ceyr ceyrVar) {
        return this.d.k().i(new eroh() { // from class: cctg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                axez axezVar = (axez) obj;
                String str = axezVar.h;
                boolean equals = str.equals("POST_RESTORE_PAGE_TOKEN");
                final cctm cctmVar2 = cctmVar;
                final pot potVar2 = potVar;
                if (equals) {
                    return cctmVar2.e(potVar2);
                }
                final boolean z2 = z;
                final cctl cctlVar = cctl.this;
                if (!"RESTORE_DONE_PAGE_TOKEN".equals(str)) {
                    return cctlVar.a(potVar2, str, cctmVar2, z2);
                }
                axew a2 = cctmVar2.a();
                axew b2 = axew.b(axezVar.o);
                if (b2 == null) {
                    b2 = axew.UNSPECIFIED_STAGE;
                }
                if (a2.equals(b2)) {
                    return elfo.e(null);
                }
                csjb c2 = cctl.c.c();
                c2.I("Updating stage and clearing page token");
                c2.A("stage", cctmVar2.a());
                c2.r();
                return cctlVar.n.b("CmsRestoreRunner#updateRestoreStage", new Runnable() { // from class: cctd
                    @Override // java.lang.Runnable
                    public final void run() {
                        cctl cctlVar2 = cctl.this;
                        cctlVar2.d.ab(cctmVar2.a());
                        cctlVar2.d.G();
                    }
                }).i(new eroh() { // from class: ccst
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return cctl.this.a(potVar2, "", cctmVar2, z2);
                    }
                }, cctlVar.h);
            }
        }, this.g).i(new eroh() { // from class: ccth
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cctl.this.d.w("RESTORE_DONE_PAGE_TOKEN");
            }
        }, this.h).h(new emwl() { // from class: ccti
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cfup cfupVar = cctl.a;
                return new ppp();
            }
        }, erpp.a).e(baan.class, new emwl() { // from class: cctj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cctl.this.i.e(cctmVar.f());
                cctl.c.s("Restore work failed because account is not linked", (baan) obj);
                return new ppn();
            }
        }, this.g).e(cctk.class, new emwl() { // from class: ccsd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb c2 = cctl.c.c();
                c2.I("Terminating restore because CMS sync is disabled");
                c2.s((cctk) obj);
                return new ppn();
            }
        }, erpp.a).e(crtx.class, new emwl() { // from class: ccse
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb b2 = cctl.c.b();
                b2.I("Terminating restore because of a page token cycle");
                b2.s((crtx) obj);
                return new ppn();
            }
        }, erpp.a).f(Exception.class, new eroh() { // from class: ccsf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Exception exc = (Exception) obj;
                cctl.c.s("Unexpected exception; worker will retry", exc);
                final cctl cctlVar = cctl.this;
                final cctm cctmVar2 = cctmVar;
                return cctlVar.d.j().h(new emwl() { // from class: ccsq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cctl.this.i.n(cctmVar2.f(), ((Integer) obj2).intValue(), exc);
                        return null;
                    }
                }, cctlVar.g).i(new eroh() { // from class: ccsr
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return cctl.this.d.B(new Function() { // from class: axgq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                axep axepVar = (axep) obj3;
                                cskc cskcVar = axkm.a;
                                int i = ((axez) axepVar.instance).n + 1;
                                axepVar.copyOnWrite();
                                axez axezVar = (axez) axepVar.instance;
                                axezVar.b |= 1024;
                                axezVar.n = i;
                                return axepVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: axgr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return Integer.valueOf(((axez) obj3).n);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                }, erpp.a).h(new emwl() { // from class: ccss
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        csjb c2 = cctl.c.c();
                        c2.I("Incremented page attempt count.");
                        c2.A("attemptCount", (Integer) obj2);
                        c2.r();
                        return new ppo();
                    }
                }, erpp.a);
            }
        }, erpp.a).h(new emwl() { // from class: ccsi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ppq ppqVar = (ppq) obj;
                if (new ppp().equals(ppqVar)) {
                    return ceyt.i();
                }
                if (new ppo().equals(ppqVar)) {
                    return cctl.this.m > 0 ? ceyt.j(engw.r(ceyrVar)) : ceyt.m();
                }
                if (new ppn().equals(ppqVar)) {
                    return ceyt.k();
                }
                throw new IllegalArgumentException(String.format("Unknown Result type was found in CmsRestoreBackupKeyWorkHandler! Result is: [%s]", ppqVar));
            }
        }, erpp.a);
    }
}
