package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ekky implements fbas {
    private static final enru a = enru.c("com/google/apps/tiktok/inject/processor/generateaccount/FragmentAccountComponentManager");
    private volatile Object b;
    private final Object c = new Object();
    private final ea d;
    private final boolean e;

    /* compiled from: PG */
    public interface a {
        ekjp aO();
    }

    /* compiled from: PG */
    public interface b {
        akgi H();
    }

    /* compiled from: PG */
    public interface c {
        ekjq bk();
    }

    /* compiled from: PG */
    public interface d {
        emxc eJ();
    }

    /* compiled from: PG */
    public interface e {
        emxc aV();
    }

    public ekky(ea eaVar, boolean z) {
        this.d = eaVar;
        this.e = z;
    }

    public static final void b(ea eaVar, eisx eisxVar) {
        eisxVar.getClass();
        int a2 = eisxVar.a();
        emxf.n(a2 >= 0, "AccountId is invalid: %s", a2);
        c(eaVar, a2);
    }

    public static void c(ea eaVar, int i) {
        fbae.e(eaVar);
        eaVar.m.putInt("TIKTOK_FRAGMENT_ACCOUNT_ID", i);
    }

    protected void a(ea eaVar) {
        if (eaVar.m != null) {
            emxf.b(!r2.getBoolean("TIKTOK_FRAGMENT_NO_ACCOUNT_ONLY"), "Account-scoped Fragment cannot be instantiated with an argument bundle marking it as no-Account only. If you are using NoAccountNavigation, you must switch to AccountNavigation to navigate to this fragment.");
        }
    }

    @Override // defpackage.fbas
    public final Object aX() {
        Object obj;
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    ea eaVar = this.d;
                    eaVar.X().getClass();
                    emxf.p(eaVar.X() instanceof fbas, "Sting Fragments must be attached to an @Sting Activity. Found: %s", eaVar.X().getClass());
                    a(this.d);
                    Bundle bundle = this.d.m;
                    eisx eisxVar = null;
                    if (bundle != null && bundle.containsKey("TIKTOK_FRAGMENT_ACCOUNT_ID")) {
                        eisxVar = eisx.b(bundle.getInt("TIKTOK_FRAGMENT_ACCOUNT_ID"));
                    }
                    if (this.e && eisxVar == null) {
                        ekkx ekkxVar = new ekkx("Exception while injecting account Fragment bindings because of missing AccountId in account Fragment's arguments");
                        if (!((Boolean) ((d) fazh.a(this.d.z().getApplicationContext(), d.class)).eJ().e(false)).booleanValue()) {
                            throw new ekkx("Account id is not set in the account Fragment. Possible causes:\n\t1. This account Fragment is @GenerateAccountFragment and was created without calling setBundledAccountId on itself after creation.\n\t2. This account Fragment's arguments were overridden without preserving the previous arguments.\n\t3. This account Fragment is declared in an XML but not as a navigation destination.\n\t4. This account Fragment is declared in an XML as a navigation destination, but the account navigation is not correctly setup with AccountNavigation (go/tiktok-navigation#navigating)");
                        }
                        ((enrr) ((enrr) ((enrr) a.i()).g(ekkxVar)).h("com/google/apps/tiktok/inject/processor/generateaccount/FragmentAccountComponentManager", "createComponent", (char) 141, "FragmentAccountComponentManager.java")).q("Fragment AccountId check failed.");
                    }
                    if (((c) fazh.a(this.d.X(), c.class)).bk().a.g()) {
                        emxc aV = ((e) fazh.a(this.d.X(), e.class)).aV();
                        if (eisxVar == null) {
                            eisxVar = (eisx) aV.f();
                            if (eisxVar != null && eisxVar.a() != -1) {
                                b(this.d, eisxVar);
                            }
                        } else {
                            emxf.m(aV.g(), "There is no propagated account id. Did you forget to add one of the account modules:\n\t\"//java/com/google/apps/tiktok/account:module\",\n\t\"//java/com/google/apps/tiktok/account/testing:module\",");
                            if (((eisx) aV.c()).a() != -1) {
                                emxf.r(((eisx) aV.c()).equals(eisxVar), "The given account id does not match the propagated account id.\n\tPropagated AccountId: %s\n\tGiven AccountId: %s", aV.c(), eisxVar);
                            }
                        }
                    }
                    ekjp aO = ((a) fazh.a(this.d.X(), a.class)).aO();
                    synchronized (aO.a) {
                        if (!aO.b.containsKey(eisxVar)) {
                            aO.b.put(eisxVar, aO.a(eisxVar));
                        }
                        obj = aO.b.get(eisxVar);
                    }
                    akgi H = ((b) fazh.a(obj, b.class)).H();
                    H.e = this.d;
                    fbbe.a(H.e, ea.class);
                    ea eaVar2 = H.e;
                    akfv akfvVar = H.d;
                    akfy akfyVar = H.c;
                    this.b = new akgo(H.a, H.b, akfyVar, akfvVar, eaVar2);
                }
            }
        }
        return this.b;
    }
}
