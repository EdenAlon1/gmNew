package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkv implements adkp {
    public static final enru a = enru.c("com/google/android/apps/messaging/gaia/capability/GmsGaiaCapabilityRetriever");
    public final ffhd b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    private final ffsk g;
    private final ffbr h;

    public adkv(ffhd ffhdVar, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffhdVar.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.b = ffhdVar;
        this.g = ffskVar;
        this.c = ffbrVar;
        this.h = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
    }

    @Override // defpackage.adkp
    public final elfl a(eisx eisxVar, String str) {
        elfl c;
        eisxVar.getClass();
        ekzz f = eleg.f("GmsGaiaCapabilityRetriever#hasCapability");
        try {
            c = axol.c(this.g, ffhe.a, ffsm.a, new adkq(this, eisxVar, str, null));
            ffig.a(f, null);
            return c;
        } finally {
        }
    }

    @Override // defpackage.adkp
    public final elfl b(eixn eixnVar, String str) {
        elfl c;
        eixnVar.getClass();
        ekzz f = eleg.f("GmsGaiaCapabilityRetriever#hasCapabilityAccount");
        try {
            c = axol.c(this.g, ffhe.a, ffsm.a, new adkr(this, eixnVar, str, null));
            ffig.a(f, null);
            return c;
        } finally {
        }
    }

    public final Object c(eixn eixnVar, String str, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.b), new adkt(null, eixnVar, this, str), ffguVar);
    }

    public final Object d(eisx eisxVar, String str, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.b), new adku(null, this, eisxVar, str), ffguVar);
    }

    public final void e(int i) {
        ensk h = a.h();
        h.Y(ente.a, "BugleGaia");
        ((enrr) h.h("com/google/android/apps/messaging/gaia/capability/GmsGaiaCapabilityRetriever", "logCounter", BasePaymentResult.ERROR_REQUEST_FAILED, "GmsGaiaCapabilityRetriever.kt")).r("Gaia capability response result_code=%d", i);
        ((akzt) this.h.b()).e("Bugle.Gaia.Capability.ResponseResult", i);
    }
}
