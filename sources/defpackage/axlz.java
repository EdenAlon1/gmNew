package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.csdh;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axlz extends ffhv implements ffjn {
    int a;
    /* synthetic */ boolean b;
    /* synthetic */ boolean c;
    final /* synthetic */ axmb d;
    final /* synthetic */ Context e;
    final /* synthetic */ eisx f;
    final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axlz(axmb axmbVar, Context context, eisx eisxVar, boolean z, ffgu ffguVar) {
        super(3, ffguVar);
        this.d = axmbVar;
        this.e = context;
        this.f = eisxVar;
        this.g = z;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        axlz axlzVar = new axlz(this.d, this.e, this.f, this.g, (ffgu) obj3);
        axlzVar.b = booleanValue;
        axlzVar.c = booleanValue2;
        return axlzVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            boolean z = this.b;
            boolean z2 = this.c;
            if (z && z2) {
                throw new cshx();
            }
            this.d.b.p("Start initial restore for MultiDevice with unencrypted backup");
            axmb axmbVar = this.d;
            Context context = this.e;
            final eisx eisxVar = this.f;
            final boolean z3 = this.g;
            csdh.a.m("Restore for multi-device.");
            final crvt eW = ((csdh.a) ekhv.a(context, csdh.a.class, eisxVar)).eW();
            final csdh csdhVar = (csdh) axmbVar.a;
            final tsp tspVar = csdhVar.d;
            elfl e = tspVar.e.c().i(new eroh() { // from class: tsl
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj2) {
                    return tsp.this.e.s();
                }
            }, tspVar.k).h(new emwl() { // from class: tsm
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    return null;
                }
            }, erpp.a).e(chdh.class, new emwl() { // from class: tsn
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    final tsp tspVar2 = tsp.this;
                    chdh chdhVar = (chdh) obj2;
                    axnw.i(tspVar2.b.b(eisxVar), new Consumer() { // from class: tsk
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj3) {
                            String str = (String) obj3;
                            csjb e2 = tsp.a.e();
                            e2.I("Tachyon registration failed for Dasher account. Dasher account is not allowed to use Messages.");
                            e2.M("accountName", str);
                            e2.r();
                            Object[] objArr = {str};
                            tsp tspVar3 = tsp.this;
                            tspVar3.d.m(tspVar3.m.getString(R.string.dasher_account_restricted_toast, objArr));
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, tspVar2.k);
                    throw chdhVar;
                }
            }, tspVar.k).e(chdi.class, new emwl() { // from class: tso
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    final tsp tspVar2 = tsp.this;
                    chdi chdiVar = (chdi) obj2;
                    axnw.i(tspVar2.b.b(eisxVar), new Consumer() { // from class: tsi
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj3) {
                            String str = (String) obj3;
                            csjb e2 = tsp.a.e();
                            e2.I("Tachyon registration failed for Unicorn account. Unicorn account is not allowed to use Messages.");
                            e2.M("accountName", str);
                            e2.r();
                            Object[] objArr = {str};
                            tsp tspVar3 = tsp.this;
                            tspVar3.d.m(tspVar3.m.getString(R.string.unicorn_account_restricted_toast, objArr));
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, tspVar2.k);
                    throw chdiVar;
                }
            }, tspVar.k);
            if (tspVar.f.a()) {
                e = e.i(new eroh() { // from class: tse
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        elfl c;
                        cgwa cgwaVar = tsp.this.g;
                        c = axol.c(cgwaVar.a, ffhe.a, ffsm.a, new cgvu(cgwaVar, eisxVar, null));
                        return c;
                    }
                }, tspVar.l).h(new emwl() { // from class: tsf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, tspVar.l);
            }
            elfl i2 = e.i(new eroh() { // from class: cscx
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj2) {
                    elfl c;
                    csdh.a.p("Registered gaia account for MultiDevice feature.");
                    cryz cryzVar = csdh.this.e;
                    c = axol.c(cryzVar.c, ffhe.a, ffsm.a, new cryv(cryzVar, eisxVar, null));
                    return c;
                }
            }, csdhVar.k).i(new eroh() { // from class: cscy
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj2) {
                    csdh csdhVar2 = csdh.this;
                    csdhVar2.h.j(cinj.ACCOUNT_REMOVED);
                    csdhVar2.h.j(cinj.DASHER_DISABLED);
                    csdhVar2.h.j(cinj.PRIMARY_DEVICE_CHANGED_MD);
                    csdhVar2.h.j(cinj.PRIMARY_DEVICE_CHANGED_BNR);
                    csdh.a.p("Checked D2D delta sync eligibility for MultiDevice feature. Starting restore flow.");
                    return eW.b();
                }
            }, csdhVar.i).i(new eroh() { // from class: cscz
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj2) {
                    final csdh csdhVar2 = csdh.this;
                    final eisx eisxVar2 = eisxVar;
                    return csdhVar2.s.b("CmsRestoreManagerImpl#restoreCmsBackupForMultidevice", new Runnable() { // from class: cscv
                        @Override // java.lang.Runnable
                        public final void run() {
                            csdh csdhVar3 = csdh.this;
                            eisx eisxVar3 = eisxVar2;
                            if (csgj.a()) {
                                try {
                                    csdhVar3.l.a(2);
                                    csdhVar3.b();
                                    cbwj cbwjVar = csdhVar3.s;
                                    dtut dtutVar = new dtut() { // from class: cscw
                                        @Override // defpackage.dtut
                                        public final ekzz a() {
                                            return eleg.f("CRMI::notifyDataChanged2::runAfterCommit");
                                        }
                                    };
                                    final axkm axkmVar = csdhVar3.c;
                                    axkmVar.getClass();
                                    cbwjVar.a.g(dtutVar, "CmsRestoreManagerImpl#restoreCmsBackupForMultidevice", new Runnable() { // from class: csdd
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            axkm.this.N();
                                        }
                                    });
                                } catch (cshj e2) {
                                    throw new IllegalStateException(e2);
                                }
                            } else {
                                csdh.a.m("Update settings for restore.");
                                csdhVar3.b.c(eisxVar3);
                                csdhVar3.b();
                                csdhVar3.c.aa(true);
                                csdhVar3.c.Z(true);
                                csdhVar3.c.aj(UUID.randomUUID().toString());
                                csdhVar3.c.af(axeu.ENABLING);
                                if (!csdhVar3.q.a()) {
                                    ((cmgr) csdhVar3.p.b()).m(cmip.TOGGLE_STATE_AUTOMATICALLY_DISABLED);
                                }
                                csdhVar3.o.i();
                            }
                            csdhVar3.c.U(axes.ENCRYPTION_STATUS_NOT_ENCRYPTED);
                            csjb c = csdh.a.c();
                            c.B("isEncrypted", false);
                            c.I("Enqueue restore work using PWQ for MultiDevice feature.");
                            c.r();
                            csdhVar3.a(eisxVar3, csfz.MULTI_DEVICE);
                        }
                    });
                }
            }, csdhVar.i).h(new emwl() { // from class: csda
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    int b = teq.b();
                    epfx epfxVar = epfx.RESTORE;
                    epep epepVar = (epep) epeq.a.createBuilder();
                    axdf axdfVar = csdh.this.j;
                    epfx c = axdfVar.c(epfxVar);
                    epepVar.copyOnWrite();
                    epeq epeqVar = (epeq) epepVar.instance;
                    epeqVar.c = c.s;
                    epeqVar.b |= 1;
                    epepVar.copyOnWrite();
                    epeq epeqVar2 = (epeq) epepVar.instance;
                    epeqVar2.d = 1;
                    epeqVar2.b |= 2;
                    epepVar.copyOnWrite();
                    epeq epeqVar3 = (epeq) epepVar.instance;
                    epeqVar3.g = (true == z3 ? 3 : 2) - 1;
                    epeqVar3.b |= 16;
                    epeg epegVar = epeg.NO_FAILURE;
                    epepVar.copyOnWrite();
                    epeq epeqVar4 = (epeq) epepVar.instance;
                    epeqVar4.e = epegVar.bs;
                    epeqVar4.b |= 4;
                    epepVar.copyOnWrite();
                    epeq epeqVar5 = (epeq) epepVar.instance;
                    epeqVar5.b |= 64;
                    epeqVar5.i = b;
                    epepVar.a(axdfVar.b());
                    axdfVar.m((epeq) epepVar.build());
                    return Optional.empty();
                }
            }, csdhVar.i).i(new eroh() { // from class: csdb
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj2) {
                    csdh.a.p("Restore is ready to start.");
                    return csdh.this.f.g();
                }
            }, csdhVar.k).i(new eroh() { // from class: csdc
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj2) {
                    final csdp csdpVar = csdh.this.g;
                    if (!csdpVar.h.a()) {
                        return elfo.a((Iterable) Collection.EL.stream(csdpVar.a.o()).map(new Function() { // from class: csdn
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                fcek fcekVar = (fcek) obj3;
                                csdp csdpVar2 = csdp.this;
                                ((bzea) csdpVar2.b.b()).r(fcekVar.c, 19);
                                return csdpVar2.e.a(csdpVar2.c.a(fcekVar));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new csdm()))).h(new emwl() { // from class: csdo
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return null;
                            }
                        }, csdpVar.f);
                    }
                    final bzgd bzgdVar = csdpVar.a;
                    bzgdVar.getClass();
                    return elfo.g(new Callable() { // from class: csdi
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            efbd.b();
                            int i3 = engw.d;
                            engr engrVar = new engr();
                            ekzz f = eleg.f("DittoDesktops#getDittoIdContainersForAllDesktops");
                            bzgd bzgdVar2 = bzgd.this;
                            try {
                                bsuz a = bsve.a();
                                a.z("getDittoIdContainersForAllDesktops");
                                bstr bstrVar = bsve.c;
                                a.c(bstrVar.b, bstrVar.u, bstrVar.t);
                                bstt bsttVar = (bstt) a.b().o();
                                while (bsttVar.moveToNext()) {
                                    try {
                                        engrVar.h(bzgdVar2.g(bsttVar.i(), bsttVar.j(), bzgdVar2.m((bsrt) bsttVar.cO())));
                                    } finally {
                                    }
                                }
                                bsttVar.close();
                                f.close();
                                return engrVar.g();
                            } catch (Throwable th) {
                                try {
                                    f.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }, csdpVar.g).i(new eroh() { // from class: csdj
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj3) {
                            Stream stream = Collection.EL.stream((engw) obj3);
                            final csdp csdpVar2 = csdp.this;
                            return elfo.a((Iterable) stream.map(new Function() { // from class: csdl
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj4) {
                                    bzge bzgeVar = (bzge) obj4;
                                    csdp csdpVar3 = csdp.this;
                                    ((bzea) csdpVar3.b.b()).r(bzgeVar.b, 19);
                                    return csdpVar3.d.b(bzgeVar);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }).collect(Collectors.toCollection(new csdm())));
                        }
                    }, csdpVar.f).h(new emwl() { // from class: csdk
                        @Override // defpackage.emwl
                        public final Object apply(Object obj3) {
                            return null;
                        }
                    }, csdpVar.f);
                }
            }, csdhVar.i);
            this.a = 1;
            if (fgfz.c(i2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
