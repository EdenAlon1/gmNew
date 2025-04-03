package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzjv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bzjx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzjv(bzjx bzjxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzjxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzjv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                if (!((bzgd) this.b.d.b()).r()) {
                    ensk h = this.b.i.h();
                    h.Y(ente.a, "BugleGDitto");
                    ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl$optOutGaiaPairingIfQrExists$1", "invokeSuspend", 205, "GaiaDevicePairingManagerImpl.kt")).q("No need to disable Gaia device pairing as no QR paired device");
                    return ffcu.a;
                }
                ensk h2 = this.b.i.h();
                h2.Y(ente.a, "BugleGDitto");
                ((enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl$optOutGaiaPairingIfQrExists$1", "invokeSuspend", 185, "GaiaDevicePairingManagerImpl.kt")).q("Start opting out Gaia device pairing as QR paired device exists");
                elfl i = this.b.f.i(3);
                this.a = 1;
                obj = fgfz.c(i, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                ((akzt) this.b.g.b()).c("Bugle.Gaia.Pairing.Disabled.When.Switching.To.Qr.Success.Count");
                ensk h3 = this.b.i.h();
                h3.Y(ente.a, "BugleGDitto");
                ((enrr) h3.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerImpl$optOutGaiaPairingIfQrExists$1", "invokeSuspend", 195, "GaiaDevicePairingManagerImpl.kt")).q("Successfully disabled Gaia device pairing");
            }
            return ffcu.a;
        } catch (bzkv e) {
            this.b.j("Bugle.Gaia.Pairing.Disabled.When.Switching.To.Qr.Failure.Count", e);
            throw e;
        } catch (Throwable th) {
            this.b.k("Bugle.Gaia.Pairing.Disabled.When.Switching.To.Qr.Failure.Count", th);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzjv(this.b, ffguVar);
    }
}
