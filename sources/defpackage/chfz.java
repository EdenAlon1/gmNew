package defpackage;

import com.google.android.rcs.client.profile.RcsProfileService;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chfz implements ehxi {
    public final chbx c;
    public final RcsProfileService d;
    public final ffbr e;
    public final errl f;
    public final errl g;
    public final ffbr h;
    public final AtomicBoolean i = new AtomicBoolean();
    private final ffbr k;
    private final ffbr l;
    private static final String j = RcsProfileService.class.getName();
    public static final cskc a = cskc.g("BugleNetwork", "TachyonPhoneRegistration");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager");

    public chfz(chbx chbxVar, RcsProfileService rcsProfileService, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errl errlVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.c = chbxVar;
        this.d = rcsProfileService;
        this.k = ffbrVar;
        this.e = ffbrVar2;
        this.f = errlVar;
        this.g = errlVar2;
        this.h = ffbrVar3;
        this.l = ffbrVar4;
    }

    final elfl a(Optional optional) {
        if (!h()) {
            return elfo.d(new IllegalStateException("Tachyon phone registration flag disabled"));
        }
        a.p("Ensuring Tachyon phone registration");
        return this.c.d(optional.isPresent() ? ((awui) optional.get()).d : "", 12).i(new chfr(this), this.g).h(new emwl() { // from class: chfv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = chfz.a;
                return null;
            }
        }, erpp.a).e(fedn.class, new emwl() { // from class: chfw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chfz.a.s("Failed to ensure Tachyon registration", (fedn) obj);
                return null;
            }
        }, erpp.a);
    }

    public final elfl b() {
        return ((djrv) this.k.b()).f().h(new emwl() { // from class: chfy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Stream stream = Collection.EL.stream((Set) obj);
                final chfz chfzVar = chfz.this;
                Stream map = stream.map(new Function() { // from class: chfn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((avkc) chfz.this.e.b()).c(((djrj) obj2).a);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: chfo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Optional.of((awui) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: chfp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return chfz.this.a((Optional) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                return (engw) map.collect(endq.a);
            }
        }, this.g).h(new emwl() { // from class: chfm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = chfz.a;
                return null;
            }
        }, erpp.a);
    }

    public final elfl c(final awui awuiVar) {
        if (!h()) {
            ensk h = b.h();
            h.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 148, "TachyonPhoneRegistrationManager.java")).q("Tachyon phone registration flag disabled.");
            return elfo.e(null);
        }
        enru enruVar = b;
        ensk h2 = enruVar.h();
        h2.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 151, "TachyonPhoneRegistrationManager.java")).q("Tachyon phone registration flag enabled.");
        this.i.set(true);
        if (!awuiVar.d.isEmpty()) {
            return elfo.h(new erog() { // from class: chfq
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return chfz.this.a(Optional.of(awuiVar));
                }
            }, this.g);
        }
        ensk j2 = enruVar.j();
        j2.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 155, "TachyonPhoneRegistrationManager.java")).q("No chat endpoint provided for registration. Attempting to acquire from profile service.");
        if (this.d.isConnected()) {
            ensk j3 = enruVar.j();
            j3.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 164, "TachyonPhoneRegistrationManager.java")).q("Forcing Tachyon phone registration for all self identities");
            return b();
        }
        ensk j4 = enruVar.j();
        j4.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) j4).h("com/google/android/apps/messaging/shared/net/TachyonPhoneRegistrationManager", "forceTachyonPhoneRegistration", 160, "TachyonPhoneRegistrationManager.java")).q("Config update received but no chat endpoint could be acquired");
        return elfo.e(null);
    }

    @Override // defpackage.ehxi
    public final void e(String str) {
        ekzz f = eleg.f("SynchronousRcsService#handleServiceConnected");
        try {
            if (h()) {
                cskc cskcVar = a;
                cskcVar.m("Tachyon phone registration flag enabled");
                if (j.equals(str)) {
                    if (this.d.isConnected()) {
                        csvs.c(b(), "BugleNetwork", "Failed to ensure Tachyon phone registration.");
                    } else {
                        cskcVar.r("Profile service is not connected at service connected callback.");
                    }
                }
            } else {
                a.m("Tachyon phone registration flag disabled");
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final elfl g(chbu chbuVar) {
        return chbuVar.l(cgwm.FORCE_REFRESH).h(new emwl() { // from class: chfu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fcdu fcduVar = (fcdu) obj;
                chfz.a.m("Completed ensuring Tachyon phone registration");
                chfz.this.i.set(false);
                return fcduVar;
            }
        }, erpp.a);
    }

    public final boolean h() {
        return chru.a();
    }

    @Override // defpackage.ehxi
    public final void f(String str) {
    }

    @Override // defpackage.ehxi
    public final void d(String str, ehxh ehxhVar) {
    }
}
