package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bziq extends ffhv implements ffji {
    int a;
    final /* synthetic */ bzid b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bziq(bzid bzidVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = bzidVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        elfl c;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            bzid bzidVar = this.b;
            ekzz f = eleg.f("GaiaDevicePairingManagerImpl#registerTachyon");
            try {
                ensk h = bzidVar.l.h();
                h.Y(ente.a, "BugleGDitto");
                ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl", "registerTachyon", 545, "GaiaDevicePairingManagerDelegateImpl.kt")).q("tachyonReceiver registerTachyon");
                c = axol.c(bzidVar.h, ffhe.a, ffsm.a, new bzjc(bzidVar, null));
                ffig.a(f, null);
                this.a = 1;
                if (fgfz.c(c, this) == ffhhVar) {
                    return ffhhVar;
                }
            } finally {
            }
        }
        ensk h2 = this.b.l.h();
        h2.Y(ente.a, "BugleGDitto");
        ((enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl$optInGaiaPairing$2", "invokeSuspend", 597, "GaiaDevicePairingManagerDelegateImpl.kt")).q("Tachyon has been registered for Gaia device pairing");
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bziq(this.b, (ffgu) obj).b(ffcu.a);
    }
}
