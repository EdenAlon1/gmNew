package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acnd implements eivv {
    public static final entd a = entd.c("BugleDittoSatellite");
    public final errl b;
    public final aclb c;
    public final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ejar g;

    public acnd(ffbr ffbrVar, ffbr ffbrVar2, ejar ejarVar, errl errlVar, aclb aclbVar, ffbr ffbrVar3) {
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ejarVar;
        this.b = errlVar;
        this.c = aclbVar;
        this.d = ffbrVar3;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        final eisx a2 = eivtVar.a();
        final String b = eivtVar.b();
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/gaia/SatelliteAccountCallbacks", "onAccountChanged", 70, "SatelliteAccountCallbacks.java")).D("Account has changed. accountId: %s, type: %s", a2, b);
        elfl h = elfl.g(this.g.b(a2)).h(new emwl() { // from class: acmy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Optional.ofNullable((String) obj);
            }
        }, this.b);
        final aclb aclbVar = this.c;
        aclbVar.getClass();
        h.i(new eroh() { // from class: acmz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return aclb.this.h((Optional) obj);
            }
        }, this.b).i(new eroh() { // from class: acna
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e(false);
                }
                eisx eisxVar = a2;
                acnd acndVar = acnd.this;
                ((acni) acndVar.d.b()).b();
                return (eisxVar == null || b.equals("pseudonymous")) ? elfo.e(false) : ((acni) acndVar.d.b()).a(eisxVar);
            }
        }, this.b).i(new eroh() { // from class: acnb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                acnd acndVar = acnd.this;
                if (booleanValue) {
                    return acndVar.c.i(acky.PAIRING);
                }
                if (b.equals("pseudonymous")) {
                    acndVar.c.i(acky.REMOVE_PAIRING).k(axnw.b(), acndVar.b);
                }
                return elfo.e(null);
            }
        }, this.b).h(new emwl() { // from class: acnc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) acnd.a.h()).h("com/google/android/apps/messaging/dittosatellite/gaia/SatelliteAccountCallbacks", "onAccountChanged", 106, "SatelliteAccountCallbacks.java")).t("Finished saving account, accountId: %s", eisx.this);
                return null;
            }
        }, this.b).k(axnw.b(), this.b);
    }

    @Override // defpackage.eivv
    public final void ab() {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/gaia/SatelliteAccountCallbacks", "onAccountLoading", 57, "SatelliteAccountCallbacks.java")).q("onAccountLoading");
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        ((ensz) ((ensz) ((ensz) a.j()).g(eiupVar)).h("com/google/android/apps/messaging/dittosatellite/gaia/SatelliteAccountCallbacks", "onNoAccountAvailable", 'y', "SatelliteAccountCallbacks.java")).q("onNoAccountAvailable: Could not load the selected Ditto Satellite GAIA account");
        if (((Boolean) this.f.b()).booleanValue()) {
            this.c.i(acky.REMOVE_PAIRING).k(axnw.b(), this.b);
            ((adio) this.e.b()).a(eiupVar);
        }
    }

    @Override // defpackage.eivv
    public final void d() {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/gaia/SatelliteAccountCallbacks", "onActivityAccountReady", 116, "SatelliteAccountCallbacks.java")).q("onActivityAccountReady");
    }
}
