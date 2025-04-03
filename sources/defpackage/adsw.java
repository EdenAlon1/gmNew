package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adsw implements adst {
    public static final enru a = enru.c("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl");
    public final bzgd b;
    public final ffbr c;
    public final ffbr d;
    private final errl e;
    private final errl f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public adsw(errl errlVar, errl errlVar2, bzgd bzgdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.e = errlVar;
        this.f = errlVar2;
        this.b = bzgdVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.c = ffbrVar4;
        this.d = ffbrVar5;
    }

    @Override // defpackage.adst
    public final elfl a() {
        return ((Boolean) cgcv.a.e()).booleanValue() ? ((bzgw) this.i.b()).h() : elfo.e(false);
    }

    @Override // defpackage.adst
    public final elfl b() {
        if (!((Boolean) this.g.b()).booleanValue()) {
            return ((axkm) this.c.b()).r().h(new emwl() { // from class: adsu
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    adsw adswVar = adsw.this;
                    axkl axklVar = ((axkm) adswVar.c.b()).n;
                    if (axkl.f((axeu) obj)) {
                        ensk e = adsw.a.e();
                        e.Y(ente.a, "BugleGDitto");
                        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "shouldShowGaiaPairingPromo", 85, "GaiaPairingUtilsImpl.java")).q("NO_SHOW, Fi sync is enabled");
                        return adss.NO_SHOW;
                    }
                    if (((acpf) adswVar.d.b()).a()) {
                        ensk e2 = adsw.a.e();
                        e2.Y(ente.a, "BugleGDitto");
                        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "shouldShowGaiaPairingPromo", 89, "GaiaPairingUtilsImpl.java")).q("NO_SHOW on tablet device");
                        return adss.NO_SHOW;
                    }
                    if (adswVar.b.a() == 0) {
                        ensk e3 = adsw.a.e();
                        e3.Y(ente.a, "BugleGDitto");
                        ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "getGaiaPromoStatus", 100, "GaiaPairingUtilsImpl.java")).q("Show gaia promo for new users");
                        return adss.SHOW_FOR_NEW_USERS;
                    }
                    if (adswVar.b.q(Optional.empty())) {
                        ensk e4 = adsw.a.e();
                        e4.Y(ente.a, "BugleGDitto");
                        ((enrr) ((enrr) e4).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "getGaiaPromoStatus", 106, "GaiaPairingUtilsImpl.java")).q("Skip showing gaia promo");
                        return adss.NO_SHOW;
                    }
                    ensk e5 = adsw.a.e();
                    e5.Y(ente.a, "BugleGDitto");
                    ((enrr) ((enrr) e5).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "getGaiaPromoStatus", 103, "GaiaPairingUtilsImpl.java")).q("Show gaia promo for existing qr paired users.");
                    return adss.SHOW_FOR_EXISTING_QR_PAIRED_USERS;
                }
            }, this.f);
        }
        ensk e = a.e();
        e.Y(ente.a, "BugleGDitto");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "shouldShowGaiaPairingPromo", 76, "GaiaPairingUtilsImpl.java")).q("NO_SHOW, gaia promo is force disabled");
        return elfo.e(adss.NO_SHOW);
    }

    @Override // defpackage.adst
    public final void c(eisx eisxVar, ejlq ejlqVar, ejlr ejlrVar) {
        emxf.b(eisxVar != null, "accountId is not present for onGaiaPromoAllowButtonClicked()");
        ejlqVar.i(new ejlp(elfl.g(((eixo) this.h.b()).c(eisxVar)).h(new emwl() { // from class: adsv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (((eixn) obj).b().k.equals("pseudonymous")) {
                    ensk h = adsw.a.h();
                    h.Y(ente.a, "BugleGDitto");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "isGaiaSignedIn", 121, "GaiaPairingUtilsImpl.java")).q("GAIA not signed in, route to ESI launching flow.");
                    return false;
                }
                ensk h2 = adsw.a.h();
                h2.Y(ente.a, "BugleGDitto");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/growthkit/promo/gaia/GaiaPairingUtilsImpl", "isGaiaSignedIn", 118, "GaiaPairingUtilsImpl.java")).q("GAIA signed in, launch device pairing page.");
                return true;
            }
        }, this.e)), new ejlm(null), ejlrVar);
    }
}
