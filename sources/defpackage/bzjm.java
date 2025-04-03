package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzjm extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ bzid c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzjm(bzid bzidVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = bzidVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ?? r0;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            r0 = this.a;
            try {
                ffci.b(obj);
                r0 = r0;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    ffig.a(r0, th);
                    throw th2;
                }
            }
        } else {
            ffci.b(obj);
            bzid bzidVar = this.c;
            ekzz f = eleg.f("GaiaDevicePairingManagerImpl#unregisterTachyon");
            try {
                ensk h = bzidVar.l.h();
                h.Y(ente.a, "BugleGDitto");
                ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl$unregisterTachyon$2", "invokeSuspend", 570, "GaiaDevicePairingManagerDelegateImpl.kt")).q("tachyonReceiver stopBind");
                ((cilj) bzidVar.f.b()).e();
                elfl o = ((cgxw) bzidVar.g.b()).o();
                this.a = f;
                this.b = 1;
                obj = fgfz.c(o, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
                r0 = f;
            } catch (Throwable th3) {
                th = th3;
                r0 = f;
                throw th;
            }
        }
        ffig.a(r0, null);
        ensk h2 = this.c.l.h();
        h2.Y(ente.a, "BugleGDitto");
        ((enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaDevicePairingManagerDelegateImpl$unregisterTachyon$2", "invokeSuspend", 574, "GaiaDevicePairingManagerDelegateImpl.kt")).q("Tachyon has been unregistered for Gaia device pairing");
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bzjm(this.c, (ffgu) obj).b(ffcu.a);
    }
}
