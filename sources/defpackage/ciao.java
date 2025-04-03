package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ciao;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ciao implements ciap {
    public static final cskc a = cskc.g("BugleNetwork", "CloudSyncGaiaBindManagerImpl");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/net/handler/bindhandler/CloudSyncGaiaBindManagerImpl");
    public final Context c;
    public final ffbr d;
    private final errl e;
    private final babm f;
    private final babf g;
    private final ffbr h;
    private final ffbr i;

    /* compiled from: PG */
    public interface a {
        cilj dq();
    }

    public ciao(Context context, errl errlVar, babm babmVar, babf babfVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.c = context;
        this.e = errlVar;
        this.f = babmVar;
        this.g = babfVar;
        this.d = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
    }

    private final elfl i(final fcek fcekVar) {
        final babm babmVar = this.f;
        return elfl.g(babmVar.a.c(fcekVar.c)).i(new eroh() { // from class: babk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return babm.this.b(((eisx) obj).a());
            }
        }, erpp.a).e(eizq.class, new emwl() { // from class: babl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                throw new baan("Account is not valid", (eizq) obj);
            }
        }, erpp.a).h(new emwl() { // from class: cian
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Optional.of((eisx) obj);
            }
        }, erpp.a).e(baan.class, new emwl() { // from class: ciad
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjb e = ciao.a.e();
                e.I("Tachyon notification received for a non linked account");
                e.M("id", fcek.this.c);
                e.s((baan) obj);
                return Optional.empty();
            }
        }, erpp.a);
    }

    @Override // defpackage.ciap
    public final elfl a(final fcek fcekVar) {
        return i(fcekVar).i(new eroh() { // from class: ciac
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final fcek fcekVar2 = fcekVar;
                Function function = new Function() { // from class: ciai
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((cilj) obj2).b(fcek.this);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                return ciao.this.b((Optional) obj, null, function);
            }
        }, this.e);
    }

    public final elfl b(Optional optional, Object obj, Function function) {
        Object apply;
        if (optional.isEmpty()) {
            return elfo.e(obj);
        }
        a.p("Starting to pull from Tachyon for GAIA account");
        apply = function.apply(((a) ekhv.a(this.c, a.class, (eisx) optional.get())).dq());
        return (elfl) apply;
    }

    @Override // defpackage.ciap
    public final elfl c(final fcek fcekVar) {
        return i(fcekVar).i(new eroh() { // from class: ciae
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ppn ppnVar = new ppn();
                final fcek fcekVar2 = fcekVar;
                Function function = new Function() { // from class: ciaf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((cilj) obj2).c(fcek.this);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                return ciao.this.b((Optional) obj, ppnVar, function);
            }
        }, this.e);
    }

    @Override // defpackage.ciap
    public final elfl d() {
        a.p("Start bind handler if there is a GAIA account associated with CMS");
        return this.g.a().i(new eroh() { // from class: ciag
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ciao.this.e(Optional.of((eisx) obj), false, "");
            }
        }, this.e).e(babn.class, new emwl() { // from class: ciah
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ciao.a.p("No GAIA account is linked.");
                return null;
            }
        }, erpp.a);
    }

    public final elfl e(Optional optional, boolean z, String str) {
        if (((aslq) this.h.b()).a() && !((cspt) this.i.b()).a()) {
            ensk h = b.h();
            h.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/CloudSyncGaiaBindManagerImpl", "startBindHandler", 193, "CloudSyncGaiaBindManagerImpl.java")).q("Device data over satellite, skipping start bind");
            return elfo.e(null);
        }
        if (!optional.isEmpty()) {
            a.p("Starting to bind to Tachyon for GAIA account");
            a aVar = (a) ekhv.a(this.c, a.class, (eisx) optional.get());
            return z ? aVar.dq().f(str) : aVar.dq().d();
        }
        ensk j = b.j();
        j.Y(ente.a, "BugleCms");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/CloudSyncGaiaBindManagerImpl", "startBindHandler", 197, "CloudSyncGaiaBindManagerImpl.java")).q("No Gaia account found, Skipping start bind");
        return elfo.e(null);
    }

    @Override // defpackage.ciap
    public final elfl f(fcek fcekVar, final String str) {
        return i(fcekVar).i(new eroh() { // from class: ciak
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ciao.this.e((Optional) obj, true, str);
            }
        }, this.e);
    }

    @Override // defpackage.ciap
    public final void g() {
        a.p("Start bind handler if there is a GAIA account associated with CMS multi-device");
        ((axkm) this.d.b()).r().i(new eroh() { // from class: ciaj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ciao ciaoVar = ciao.this;
                axkl axklVar = ((axkm) ciaoVar.d.b()).n;
                if (axkl.f((axeu) obj)) {
                    ciao.a.p("CMS Multi-device enabled");
                    return ciaoVar.d();
                }
                ciao.a.p("CMS Multi-device not enabled, skip binding");
                return elfo.e(null);
            }
        }, this.e);
    }

    @Override // defpackage.ciap
    public final void h() {
        this.g.a().i(new eroh() { // from class: cial
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ciao.a aVar;
                Optional of = Optional.of((eisx) obj);
                if (of.isEmpty()) {
                    ensk j = ciao.b.j();
                    j.Y(ente.a, "BugleCms");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/CloudSyncGaiaBindManagerImpl", "getAccountScopedInjector", 242, "CloudSyncGaiaBindManagerImpl.java")).q("No Gaia Account Found, skipping Account scoped injection");
                    aVar = null;
                } else {
                    aVar = (ciao.a) ekhv.a(ciao.this.c, ciao.a.class, (eisx) of.get());
                }
                if (aVar != null) {
                    ensk h = ciao.b.h();
                    h.Y(ente.a, "BugleCms");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/CloudSyncGaiaBindManagerImpl", "stopBindHandler", 216, "CloudSyncGaiaBindManagerImpl.java")).q("stopping CMS tachyon bind handler for GAIA account");
                    aVar.dq().e();
                }
                return elfo.e(null);
            }
        }, this.e).e(babn.class, new emwl() { // from class: ciam
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((enrr) ciao.a.i().h("com/google/android/apps/messaging/shared/net/handler/bindhandler/CloudSyncGaiaBindManagerImpl", "stopBind", 143, "CloudSyncGaiaBindManagerImpl.java")).q("No GAIA account linked");
                return null;
            }
        }, erpp.a);
    }
}
