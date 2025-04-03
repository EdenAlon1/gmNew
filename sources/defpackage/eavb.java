package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eavb implements eiye, eiyd, ekhx {
    public static final entd a = entd.c("GnpSdk");
    private final errl b;
    private final eatj c;

    public eavb(eatj eatjVar, errl errlVar) {
        this.c = eatjVar;
        this.b = errlVar;
    }

    private final void c() {
        ListenableFuture b;
        eatj eatjVar = this.c;
        b = fgfz.b(eatjVar.a, ffhe.a, ffsm.a, new eati(eatjVar, null));
        erny.g(b, eldl.d(new eroh() { // from class: eava
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                eafl eaflVar = (eafl) obj;
                entd entdVar = eavb.a;
                if (eaflVar.e()) {
                    ((ensz) ((ensz) ((ensz) eavb.a.j()).g(eaflVar.d())).h("com/google/android/libraries/notifications/platform/tiktok/registration/GnpRegistrationInterceptor", "handleGnpRegistration", '@', "GnpRegistrationInterceptor.java")).q("Failed scheduling GNP registration");
                }
                return erre.a;
            }
        }), this.b);
    }

    @Override // defpackage.ekhx
    public final ListenableFuture a() {
        ((ensz) a.o().h("com/google/android/libraries/notifications/platform/tiktok/registration/GnpRegistrationInterceptor", "onStartupAfterPackageReplaced", 81, "GnpRegistrationInterceptor.java")).q("onStartupAfterPackageReplaced called.");
        c();
        return erre.a;
    }

    @Override // defpackage.eiye
    public final ListenableFuture b(eiyc eiycVar) {
        ((ensz) a.o().h("com/google/android/libraries/notifications/platform/tiktok/registration/GnpRegistrationInterceptor", "onAccountEnabled", 48, "GnpRegistrationInterceptor.java")).t("onAccountEnabled called for [%s]", ((eizj) eiycVar).b.g);
        c();
        return erre.a;
    }

    @Override // defpackage.eiyd
    public final ListenableFuture l(eiyc eiycVar) {
        ((ensz) a.o().h("com/google/android/libraries/notifications/platform/tiktok/registration/GnpRegistrationInterceptor", "onAccountDisabled", 74, "GnpRegistrationInterceptor.java")).t("onAccountDisabled called for [%s]", ((eizj) eiycVar).b.g);
        c();
        return erre.a;
    }
}
