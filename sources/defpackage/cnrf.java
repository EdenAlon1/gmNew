package defpackage;

import io.grpc.StatusException;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnrf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnrn b;
    final /* synthetic */ derv c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnrf(ffgu ffguVar, cnrn cnrnVar, derv dervVar) {
        super(2, ffguVar);
        this.b = cnrnVar;
        this.c = dervVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnrf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
                closeable = (Closeable) this.d;
                try {
                    ffci.b(obj);
                } catch (StatusException e2) {
                    e = e2;
                    ensk j = cnrn.a.j();
                    j.Y(ente.a, "BugleSatellite");
                    ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callSendDatagram-gIAlu-s$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 148, "OutgoingSatelliteApiImpl.kt")).q("Call SendDatagramService.sendDatagram failed");
                    Object a = ffci.a(e);
                    ffig.a(closeable, null);
                    obj2 = a;
                    return new ffch(obj2);
                }
            } else {
                ffci.b(obj);
                ensk h = cnrn.a.h();
                h.Y(ente.a, "BugleSatellite");
                ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callSendDatagram-gIAlu-s$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 139, "OutgoingSatelliteApiImpl.kt")).q("Calling SendDatagramService.sendDatagram");
                ekzz f = eleg.f("SendDatagramService.SendDatagram");
                try {
                    desb desbVar = this.b.b;
                    derv dervVar = this.c;
                    this.d = f;
                    this.a = 1;
                    Object c = desbVar.c(dervVar, new febo(), this);
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
                    ((enrr) ((enrr) j2).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callSendDatagram-gIAlu-s$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 148, "OutgoingSatelliteApiImpl.kt")).q("Call SendDatagramService.sendDatagram failed");
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
            derx derxVar = (derx) obj;
            ffig.a(closeable, null);
            ensk h2 = cnrn.a.h();
            h2.Y(ente.a, "BugleSatellite");
            enrr enrrVar = (enrr) h2;
            enrrVar.Y(csux.Y, new bdgr(derxVar.b));
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/OutgoingSatelliteApiImpl$callSendDatagram-gIAlu-s$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 157, "OutgoingSatelliteApiImpl.kt")).q("Call SendDatagramService.sendDatagram succeeded");
            obj2 = derxVar;
            return new ffch(obj2);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnrf cnrfVar = new cnrf(ffguVar, this.b, this.c);
        cnrfVar.d = obj;
        return cnrfVar;
    }
}
