package defpackage;

import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdjb extends ceut {
    public static final cskc a = cskc.g("BugleCms", "CmsKeySyncWorkHandler");
    public final axdf b;
    public final errl c;
    public final cdih d;
    public final cdit e;
    private final axkm f;

    public cdjb(cdit cditVar, axkm axkmVar, cdih cdihVar, axdf axdfVar, errl errlVar) {
        this.e = cditVar;
        this.f = axkmVar;
        this.d = cdihVar;
        this.b = axdfVar;
        this.c = errlVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(Alert.DURATION_SHOW_INDEFINITELY);
        l.b(cevc.WORKMANAGER_ONLY);
        l.f(poa.EXPONENTIAL);
        poh pohVar = new poh();
        pohVar.c(4);
        ((ceti) l).a = pohVar.a();
        l.e(true);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CmsKeySyncWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cdjw.b.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(final ceuw ceuwVar, eyhs eyhsVar) {
        final cdjw cdjwVar = (cdjw) eyhsVar;
        return this.f.n.b().i(new eroh() { // from class: cdja
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    csjb c = cdjb.a.c();
                    c.I("Cms turned off, finishing the step");
                    c.r();
                    return elfo.e(ceyt.i());
                }
                final cdjw cdjwVar2 = cdjwVar;
                final cdjb cdjbVar = cdjb.this;
                cdju b = cdju.b(cdjwVar2.e);
                if (b == null) {
                    b = cdju.UNSPECIFIED_STEP;
                }
                final cdit cditVar = cdjbVar.e;
                ceuw ceuwVar2 = ceuwVar;
                int i = cdjwVar2.d;
                final int i2 = ((cetk) ceuwVar2.a()).c;
                elfl h = cditVar.a.b(i).h(new emwl() { // from class: cdin
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return (cdis) ekhv.a(cdit.this.b, cdis.class, (eisx) obj2);
                    }
                }, erpp.a);
                int ordinal = b.ordinal();
                return (ordinal != 1 ? (ordinal == 2 || ordinal == 3 || ordinal == 4) ? h.i(new eroh() { // from class: cdip
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final cdjq cdjqVar = (cdjq) ((cdis) obj2).bR();
                        if (cdjqVar.d instanceof ccjc) {
                            cdjq.a.n("CmsHandler for key is not bind");
                            return elfo.d(new cdjo());
                        }
                        if (i2 > ((Integer) cdjq.c.e()).intValue()) {
                            return elfo.d(new cdjp());
                        }
                        final cdjw cdjwVar3 = cdjwVar2;
                        cdju b2 = cdju.b(cdjwVar3.e);
                        if (b2 == null) {
                            b2 = cdju.UNSPECIFIED_STEP;
                        }
                        int ordinal2 = b2.ordinal();
                        final int i3 = 2;
                        if (ordinal2 != 2) {
                            i3 = 3;
                            if (ordinal2 == 3) {
                                i3 = 1;
                            } else if (ordinal2 != 4) {
                                throw new AssertionError("current step is not a key sync step");
                            }
                        }
                        final int c2 = cclk.c(i3);
                        csjb c3 = cdjq.a.c();
                        c3.I("Sync CMS key step is invoked");
                        c3.y("Key type", i3);
                        c3.r();
                        return elfo.g(new Callable() { // from class: cdjj
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                cskc cskcVar = cdjq.a;
                                bqwn a2 = bqws.a();
                                a2.z("SyncCmsKeyStep#getCmsKeysToBackup");
                                final int i4 = i3;
                                a2.e(new Function() { // from class: cdjh
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        bqwr bqwrVar = (bqwr) obj3;
                                        cskc cskcVar2 = cdjq.a;
                                        bqwrVar.e(i4);
                                        return bqwrVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                a2.c(new bqwk(bqws.c.a));
                                return a2.b().y();
                            }
                        }, cdjqVar.e).i(new eroh() { // from class: cdjk
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                engw engwVar = (engw) obj3;
                                if (engwVar.isEmpty()) {
                                    cdjq.a.n("Key not generated before backup");
                                    return elfo.d(new cdjm());
                                }
                                if (engwVar.size() > 1 && !((Boolean) ((cfup) csgj.Z.get()).e()).booleanValue()) {
                                    cdjq.a.n("More than one key found!");
                                    return elfo.d(new cdjn());
                                }
                                final int i4 = c2;
                                final int i5 = i3;
                                final cdjq cdjqVar2 = cdjq.this;
                                if (!((Boolean) ((cfup) csgj.Z.get()).e()).booleanValue()) {
                                    return cdjqVar2.a((bqvj) engwVar.get(0), i5, i4);
                                }
                                elfl e = elfo.e(false);
                                int size = engwVar.size();
                                for (int i6 = 0; i6 < size; i6++) {
                                    final bqvj bqvjVar = (bqvj) engwVar.get(i6);
                                    e = e.i(new eroh() { // from class: cdje
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj4) {
                                            return cdjq.this.a(bqvjVar, i5, i4);
                                        }
                                    }, cdjqVar2.e).f(Exception.class, new eroh() { // from class: cdjf
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj4) {
                                            Exception exc = (Exception) obj4;
                                            ensk j = cdjq.b.j();
                                            j.Y(ente.a, "BugleCms");
                                            enrr enrrVar = (enrr) ((enrr) ((enrr) j).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/keysync/SyncCmsKeyStep", "doWork", 133, "SyncCmsKeyStep.java");
                                            bqvj bqvjVar2 = bqvj.this;
                                            enrrVar.u("processKey failed with keyIndex = %d, keyType = %d", bqvjVar2.k(), bqvjVar2.l());
                                            return elfo.d(exc);
                                        }
                                    }, cdjqVar2.f);
                                }
                                return e;
                            }
                        }, cdjqVar.e).h(new emwl() { // from class: cdjl
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                cskc cskcVar = cdjq.a;
                                cdjs cdjsVar = (cdjs) cdjw.this.toBuilder();
                                cdjsVar.copyOnWrite();
                                cdjw cdjwVar4 = (cdjw) cdjsVar.instance;
                                cdjwVar4.f = 2;
                                cdjwVar4.c |= 4;
                                return (cdjw) cdjsVar.build();
                            }
                        }, cdjqVar.f);
                    }
                }, erpp.a) : ordinal != 5 ? elfo.d(new csha(68, csgx.NO_RETRY)) : h.i(new eroh() { // from class: cdiq
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        ((cdis) obj2).hf();
                        if (i2 > ((Integer) cdjd.a.e()).intValue()) {
                            return elfo.d(new cdjc());
                        }
                        cdjs cdjsVar = (cdjs) cdjwVar2.toBuilder();
                        cdjsVar.copyOnWrite();
                        cdjw cdjwVar3 = (cdjw) cdjsVar.instance;
                        cdjwVar3.f = 2;
                        cdjwVar3.c |= 4;
                        return elfo.e((cdjw) cdjsVar.build());
                    }
                }, erpp.a) : h.i(new eroh() { // from class: cdio
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        cdiw bQ = ((cdis) obj2).bQ();
                        if (i2 > ((Integer) cdim.b.e()).intValue()) {
                            return elfo.d(new cdil());
                        }
                        final cdjw cdjwVar3 = cdjwVar2;
                        csjb a2 = cdim.a.a();
                        a2.I("Generate key step is invoked");
                        a2.r();
                        cdim cdimVar = (cdim) bQ;
                        final ccla cclaVar = cdimVar.c;
                        return elfo.f(new Runnable() { // from class: cdij
                            @Override // java.lang.Runnable
                            public final void run() {
                                cclc cclcVar = (cclc) ccla.this;
                                if (((cryg) cclcVar.b.b()).c(2) == null) {
                                    ((ensz) ((ensz) cclc.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsKeyManagerImpl", "initializeKeys", 54, "CmsKeyManagerImpl.java")).q("No backup key found, inserting backup key");
                                    ((cryg) cclcVar.b.b()).e(cshi.a(), 2);
                                    cclcVar.a();
                                }
                                if (((cryg) cclcVar.b.b()).c(1) == null) {
                                    ((ensz) ((ensz) cclc.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsKeyManagerImpl", "initializeKeys", 63, "CmsKeyManagerImpl.java")).q("No CMS key found, inserting CMS key");
                                    ((cryg) cclcVar.b.b()).e(cshi.a(), 1);
                                }
                                if (((cryg) cclcVar.b.b()).c(3) == null) {
                                    ((ensz) ((ensz) cclc.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsKeyManagerImpl", "initializeKeys", 72, "CmsKeyManagerImpl.java")).q("No HMAC key found, inserting HMAC key");
                                    ((cryg) cclcVar.b.b()).e(cshi.b(), 3);
                                }
                            }
                        }, cdimVar.d).h(new emwl() { // from class: cdik
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                cskc cskcVar = cdim.a;
                                cdjs cdjsVar = (cdjs) cdjw.this.toBuilder();
                                cdjsVar.copyOnWrite();
                                cdjw cdjwVar4 = (cdjw) cdjsVar.instance;
                                cdjwVar4.f = 2;
                                cdjwVar4.c |= 4;
                                return (cdjw) cdjsVar.build();
                            }
                        }, erpp.a);
                    }
                }, erpp.a)).h(new emwl() { // from class: cdir
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cdjw cdjwVar3 = (cdjw) obj2;
                        cdju b2 = cdju.b(cdjwVar3.e);
                        if (b2 == null) {
                            b2 = cdju.UNSPECIFIED_STEP;
                        }
                        eygk eygkVar = new eygk(cdjwVar3.g, cdjw.a);
                        if (!eygkVar.contains(b2)) {
                            throw new csha(67, csgx.NO_RETRY);
                        }
                        int size = eygkVar.size() - 1;
                        int indexOf = eygkVar.indexOf(b2);
                        if (size == indexOf) {
                            return Optional.empty();
                        }
                        cdjs cdjsVar = (cdjs) cdjwVar3.toBuilder();
                        cdju cdjuVar = (cdju) eygkVar.get(indexOf + 1);
                        cdjsVar.copyOnWrite();
                        cdjw cdjwVar4 = (cdjw) cdjsVar.instance;
                        cdjwVar4.e = cdjuVar.g;
                        cdjwVar4.c |= 2;
                        cdjsVar.copyOnWrite();
                        cdjw cdjwVar5 = (cdjw) cdjsVar.instance;
                        cdjwVar5.f = 1;
                        cdjwVar5.c |= 4;
                        return Optional.of((cdjw) cdjsVar.build());
                    }
                }, erpp.a).h(new emwl() { // from class: cdix
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        Optional optional = (Optional) obj2;
                        if (!optional.isEmpty()) {
                            cdjw cdjwVar3 = (cdjw) optional.get();
                            ceys h2 = ceyt.h();
                            cetp cetpVar = new cetp();
                            cdjw cdjwVar4 = (cdjw) optional.get();
                            int i3 = cdjwVar4.d;
                            cdju b2 = cdju.b(cdjwVar4.e);
                            if (b2 == null) {
                                b2 = cdju.UNSPECIFIED_STEP;
                            }
                            int ordinal2 = b2.ordinal();
                            cetpVar.b = i3 + (ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? ordinal2 != 4 ? ordinal2 != 5 ? "Unspecified_Step" : "Complete_Key_Sync" : "Sync HMAC_Key" : "Sync_Encryption_Key" : "Sync_Backup_Key" : "Generate_Key");
                            ((cetn) h2).a = engw.r(ceyr.h("cms_key_sync", cdjwVar3, cetpVar.a()));
                            h2.b(true);
                            h2.c(false);
                            return h2.a();
                        }
                        cdjw cdjwVar5 = cdjw.this;
                        csjb c2 = cdjb.a.c();
                        c2.I("Key sync process succeeded");
                        c2.r();
                        cdxn cdxnVar = (cdxn) cdxp.a.createBuilder();
                        int i4 = cdjwVar5.d;
                        cdxnVar.copyOnWrite();
                        cdxp cdxpVar = (cdxp) cdxnVar.instance;
                        cdxpVar.b = 1 | cdxpVar.b;
                        cdxpVar.c = i4;
                        if (csgj.a()) {
                            csgm b3 = csgm.b(cdjwVar5.h);
                            if (b3 == null) {
                                b3 = csgm.CMS_FEATURE_UNDEFINED;
                            }
                            cdxnVar.copyOnWrite();
                            cdxp cdxpVar2 = (cdxp) cdxnVar.instance;
                            cdxpVar2.e = b3.d;
                            cdxpVar2.b |= 32;
                        }
                        cdxp cdxpVar3 = (cdxp) cdxnVar.build();
                        cetp cetpVar2 = new cetp();
                        cetpVar2.b = "backup_self_participant";
                        return ceyt.j(engw.r(ceyr.h("backup_self_participant", cdxpVar3, cetpVar2.a())));
                    }
                }, cdjbVar.c).f(Throwable.class, new eroh() { // from class: cdiy
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        Throwable th = (Throwable) obj2;
                        boolean z = th instanceof csha;
                        cdjw cdjwVar3 = cdjwVar2;
                        if (!z && !(th instanceof baan)) {
                            csjb e = cdjb.a.e();
                            cdju b2 = cdju.b(cdjwVar3.e);
                            if (b2 == null) {
                                b2 = cdju.UNSPECIFIED_STEP;
                            }
                            e.A("step", b2.name());
                            e.I("Key sync failed, will retry");
                            e.s(th);
                            return elfo.e(ceyt.m());
                        }
                        csjb e2 = cdjb.a.e();
                        cdju b3 = cdju.b(cdjwVar3.e);
                        if (b3 == null) {
                            b3 = cdju.UNSPECIFIED_STEP;
                        }
                        cdjb cdjbVar2 = cdjb.this;
                        e2.A("step", b3.name());
                        e2.I("Key sync failed due to fatal error, terminate key sync flow");
                        e2.s(th);
                        cdjbVar2.b.h(true, epdw.KEY_BACKUP, true, 0, th);
                        return cdjbVar2.d.b(1).h(new emwl() { // from class: cdiz
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return ceyt.k();
                            }
                        }, erpp.a);
                    }
                }, erpp.a);
            }
        }, erpp.a);
    }
}
