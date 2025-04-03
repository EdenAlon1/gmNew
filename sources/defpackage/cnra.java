package defpackage;

import io.grpc.StatusException;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnra extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnrn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnra(ffgu ffguVar, cnrn cnrnVar) {
        super(2, ffguVar);
        this.b = cnrnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnra) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Closeable closeable;
        Throwable th;
        StatusException e;
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            closeable = (Closeable) this.c;
            try {
                try {
                    ffci.b(obj);
                } catch (StatusException e2) {
                    e = e2;
                    ensk j = cnrn.a.j();
                    j.Y(ente.a, "BugleSatellite");
                    ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteSessionState-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 328, "OutgoingSatelliteApiImpl.kt")).q("Call SatelliteSessionStateService.getSatelliteSessionState failed");
                    Object a = ffci.a(e);
                    ffig.a(closeable, null);
                    obj2 = a;
                    return new ffch(obj2);
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    ffig.a(closeable, th);
                    throw th3;
                }
            }
        } else {
            ffci.b(obj);
            ensk h = cnrn.a.h();
            h.Y(ente.a, "BugleSatellite");
            ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteSessionState-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 319, "OutgoingSatelliteApiImpl.kt")).q("Calling SatelliteSessionStateService.getSatelliteSessionState");
            ekzz f = eleg.f("SatelliteSessionStateService.getSatelliteSessionState");
            try {
                ders dersVar = this.b.d;
                deqj deqjVar = (deqj) deqk.a.createBuilder();
                deqjVar.getClass();
                eyfy build = deqjVar.build();
                build.getClass();
                this.c = f;
                this.a = 1;
                Object b = dersVar.b((deqk) build, new febo(), this);
                if (b == ffhhVar) {
                    return ffhhVar;
                }
                closeable = f;
                obj = b;
            } catch (StatusException e3) {
                closeable = f;
                e = e3;
                ensk j2 = cnrn.a.j();
                j2.Y(ente.a, "BugleSatellite");
                ((enrr) ((enrr) j2).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteSessionState-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 328, "OutgoingSatelliteApiImpl.kt")).q("Call SatelliteSessionStateService.getSatelliteSessionState failed");
                Object a2 = ffci.a(e);
                ffig.a(closeable, null);
                obj2 = a2;
                return new ffch(obj2);
            } catch (Throwable th4) {
                closeable = f;
                th = th4;
                throw th;
            }
        }
        deqm deqmVar = (deqm) obj;
        ffig.a(closeable, null);
        ensk h2 = cnrn.a.h();
        h2.Y(ente.a, "BugleSatellite");
        enrr enrrVar = (enrr) h2.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteSessionState-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 334, "OutgoingSatelliteApiImpl.kt");
        int b2 = dert.b(deqmVar.b);
        enrrVar.t("Call SatelliteSessionStateService.getSatelliteSessionState succeeded, session status: [%s].", dert.a(b2 != 0 ? b2 : 1));
        obj2 = deqmVar;
        return new ffch(obj2);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnra cnraVar = new cnra(ffguVar, this.b);
        cnraVar.c = obj;
        return cnraVar;
    }
}
