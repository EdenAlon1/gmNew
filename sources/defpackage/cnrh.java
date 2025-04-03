package defpackage;

import io.grpc.StatusException;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnrh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnrn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnrh(ffgu ffguVar, cnrn cnrnVar) {
        super(2, ffguVar);
        this.b = cnrnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnrh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ffhh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Closeable closeable;
        StatusException e;
        Object a;
        ?? r0 = ffhh.a;
        try {
            if (this.a != 0) {
                closeable = (Closeable) this.c;
                try {
                    ffci.b(obj);
                } catch (StatusException e2) {
                    e = e2;
                    ensk j = cnrn.a.j();
                    j.Y(ente.a, "BugleSatellite");
                    ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callStartSatelliteSession-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 364, "OutgoingSatelliteApiImpl.kt")).q("Call SatelliteSessionStateService.startSatelliteSession failed");
                    a = ffci.a(e);
                    ffig.a(closeable, null);
                    return new ffch(a);
                }
            } else {
                ffci.b(obj);
                ensk h = cnrn.a.h();
                h.Y(ente.a, "BugleSatellite");
                ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callStartSatelliteSession-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 353, "OutgoingSatelliteApiImpl.kt")).q("Calling SatelliteSessionStateService.startSatelliteSession");
                if (!ekxi.b(u())) {
                    throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                ekzz f = eleg.f("SatelliteSessionStateService.startSatelliteSession");
                try {
                    ders dersVar = this.b.d;
                    desc descVar = (desc) desd.a.createBuilder();
                    descVar.getClass();
                    descVar.copyOnWrite();
                    desd desdVar = (desd) descVar.instance;
                    desdVar.c = 1;
                    desdVar.b |= 1;
                    eyfy build = descVar.build();
                    build.getClass();
                    this.c = f;
                    this.a = 1;
                    Object c = dersVar.c((desd) build, new febo(), this);
                    if (c == r0) {
                        return r0;
                    }
                    closeable = f;
                    obj = c;
                } catch (StatusException e3) {
                    closeable = f;
                    e = e3;
                    ensk j2 = cnrn.a.j();
                    j2.Y(ente.a, "BugleSatellite");
                    ((enrr) ((enrr) j2).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callStartSatelliteSession-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 364, "OutgoingSatelliteApiImpl.kt")).q("Call SatelliteSessionStateService.startSatelliteSession failed");
                    a = ffci.a(e);
                    ffig.a(closeable, null);
                    return new ffch(a);
                } catch (Throwable th) {
                    r0 = f;
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ffig.a(r0, th);
                        throw th2;
                    }
                }
            }
            a = (desf) obj;
            ffig.a(closeable, null);
            ensk h2 = cnrn.a.h();
            h2.Y(ente.a, "BugleSatellite");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callStartSatelliteSession-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 368, "OutgoingSatelliteApiImpl.kt")).q("Call SatelliteSessionStateService.startSatelliteSession succeeded.");
            return new ffch(a);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnrh cnrhVar = new cnrh(ffguVar, this.b);
        cnrhVar.c = obj;
        return cnrhVar;
    }
}
