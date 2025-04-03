package defpackage;

import io.grpc.StatusException;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnqy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnrn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnqy(ffgu ffguVar, cnrn cnrnVar) {
        super(2, ffguVar);
        this.b = cnrnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnqy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ffhh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Closeable closeable;
        StatusException e;
        Object obj2;
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
                    ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteCapabilities-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 275, "OutgoingSatelliteApiImpl.kt")).q("Call SendDatagramService.getDatagramCapabilities failed");
                    Object a = ffci.a(e);
                    ffig.a(closeable, null);
                    obj2 = a;
                    return new ffch(obj2);
                }
            } else {
                ffci.b(obj);
                ensk h = cnrn.a.h();
                h.Y(ente.a, "BugleSatellite");
                ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteCapabilities-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 266, "OutgoingSatelliteApiImpl.kt")).q("Calling SendDatagramService.getDatagramCapabilities");
                ekzz f = eleg.f("SendDatagramService.getDatagramCapabilities");
                try {
                    desb desbVar = this.b.b;
                    deqb deqbVar = (deqb) deqc.a.createBuilder();
                    deqbVar.getClass();
                    eyfy build = deqbVar.build();
                    build.getClass();
                    this.c = f;
                    this.a = 1;
                    Object b = desbVar.b((deqc) build, new febo(), this);
                    if (b == r0) {
                        return r0;
                    }
                    closeable = f;
                    obj = b;
                } catch (StatusException e3) {
                    closeable = f;
                    e = e3;
                    ensk j2 = cnrn.a.j();
                    j2.Y(ente.a, "BugleSatellite");
                    ((enrr) ((enrr) j2).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteCapabilities-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 275, "OutgoingSatelliteApiImpl.kt")).q("Call SendDatagramService.getDatagramCapabilities failed");
                    Object a2 = ffci.a(e);
                    ffig.a(closeable, null);
                    obj2 = a2;
                    return new ffch(obj2);
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
            deqe deqeVar = (deqe) obj;
            ffig.a(closeable, null);
            ensk h2 = cnrn.a.h();
            h2.Y(ente.a, "BugleSatellite");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callGetSatelliteCapabilities-IoAF18A$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 281, "OutgoingSatelliteApiImpl.kt")).r("Call SendDatagramService.getDatagramCapabilities succeeded, maxDatagramSize: [%d].", deqeVar.b);
            obj2 = deqeVar;
            return new ffch(obj2);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnqy cnqyVar = new cnqy(ffguVar, this.b);
        cnqyVar.c = obj;
        return cnqyVar;
    }
}
