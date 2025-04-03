package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccaz extends ceut {
    public static final cskc a = cskc.g("BugleCms", "BlockOnInitialBackupPreconditionsWorkHandler");
    public static final cfup b = cfvl.e(cfvl.b, "cms_block_on_initial_backup_preconditions_max_retry", 3);
    public final axkm c;
    public final errl d;
    public final errl e;
    public final babm f;
    public final crue g;
    public final axdf h;
    public final Optional i;

    public ccaz(axkm axkmVar, crue crueVar, axdf axdfVar, errl errlVar, errl errlVar2, babm babmVar, Optional optional) {
        this.c = axkmVar;
        this.d = errlVar;
        this.e = errlVar2;
        this.g = crueVar;
        this.h = axdfVar;
        this.f = babmVar;
        this.i = optional;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c(((Integer) b.e()).intValue());
        l.b(cevc.WORKMANAGER_ONLY);
        l.f(poa.LINEAR);
        l.e(true);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("BlockOnInitialBackupPreconditionsWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cdvx.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(final ceuw ceuwVar, eyhs eyhsVar) {
        final cdvx cdvxVar = (cdvx) eyhsVar;
        return elfo.f(new Runnable() { // from class: ccav
            @Override // java.lang.Runnable
            public final void run() {
                ccaz.this.h.t(epfx.BLOCK_ON_INITIAL_BACKUP_PRECONDITIONS);
            }
        }, this.e).i(new eroh() { // from class: ccaw
            /* JADX WARN: Type inference failed for: r1v3, types: [comc, java.lang.Object] */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl k;
                final ccaz ccazVar = ccaz.this;
                if (!csgj.a()) {
                    return ccazVar.k();
                }
                csgm b2 = csgm.b(cdvxVar.d);
                if (b2 == null) {
                    b2 = csgm.CMS_FEATURE_UNDEFINED;
                }
                if (b2.equals(csgm.CMS_FEATURE_BACKUP_AND_RESTORE)) {
                    axkm axkmVar = ccazVar.c;
                    k = axkmVar.e.get().h().h(new emwl() { // from class: axjq
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return Boolean.valueOf(((axez) obj2).x);
                        }
                    }, axkmVar.f).i(new eroh() { // from class: ccau
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final ccaz ccazVar2 = ccaz.this;
                            final Boolean bool = (Boolean) obj2;
                            return ccazVar2.c.k().h(new emwl() { // from class: ccap
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    boolean o = axmm.o((axez) obj3);
                                    axdf axdfVar = ccaz.this.h;
                                    Boolean bool2 = bool;
                                    boolean z = false;
                                    axdfVar.l(false, o, csfz.BACKUP_AND_RESTORE, Optional.of(bool2));
                                    if (bool2.booleanValue() && o) {
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                                }
                            }, ccazVar2.e);
                        }
                    }, ccazVar.e);
                } else {
                    k = ccazVar.k();
                }
                return k.h(new emwl() { // from class: ccat
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        Boolean bool = (Boolean) obj2;
                        if (bool.booleanValue()) {
                            ccaz.this.i.isPresent();
                        }
                        return bool;
                    }
                }, ccazVar.d);
            }
        }, this.d).i(new eroh() { // from class: ccax
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    ccaz.a.p("Not starting initial backup. Preconditions are not yet satisfied.");
                    return elfo.e(ceyt.i());
                }
                final cdvx cdvxVar2 = cdvxVar;
                final ccaz ccazVar = ccaz.this;
                return ccazVar.f.b(cdvxVar2.c).i(new eroh() { // from class: ccaq
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        csfz csfzVar;
                        eisx eisxVar = (eisx) obj2;
                        ccaz.a.p("Starting initial backup for linked account");
                        if (csgj.a()) {
                            cdvx cdvxVar3 = cdvxVar2;
                            emwd m = new tem().m();
                            csgm b2 = csgm.b(cdvxVar3.d);
                            if (b2 == null) {
                                b2 = csgm.CMS_FEATURE_UNDEFINED;
                            }
                            csfzVar = (csfz) m.fP(b2);
                        } else {
                            csfzVar = csfz.MULTI_DEVICE;
                        }
                        return ccaz.this.g.a(eisxVar, csfzVar);
                    }
                }, ccazVar.d).h(new emwl() { // from class: ccar
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cskc cskcVar = ccaz.a;
                        return ceyt.i();
                    }
                }, ccazVar.d).e(baan.class, new emwl() { // from class: ccas
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ccaz.this.h.e(epfx.BLOCK_ON_INITIAL_BACKUP_PRECONDITIONS);
                        ccaz.a.n("Could not start initial backup because account is not linked");
                        return ceyt.k();
                    }
                }, ccazVar.e);
            }
        }, this.d).e(Exception.class, new emwl() { // from class: ccay
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                ccaz.a.o("Could not check initial backup preconditions", exc);
                ceuw ceuwVar2 = ceuwVar;
                ccaz.this.h.n(epfx.BLOCK_ON_INITIAL_BACKUP_PRECONDITIONS, ((cetk) ceuwVar2.a()).c, exc);
                return ceyt.m();
            }
        }, this.e);
    }

    public final elfl k() {
        return this.c.k().h(new emwl() { // from class: ccao
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axez axezVar = (axez) obj;
                boolean z = axezVar.w;
                boolean o = axmm.o(axezVar);
                ccaz.this.h.l(z, o, csfz.MULTI_DEVICE, Optional.empty());
                boolean z2 = false;
                if (z && o) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }, this.e);
    }
}
