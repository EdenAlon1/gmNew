package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tdn extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ esku e;
    final /* synthetic */ tdo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdn(esku eskuVar, tdo tdoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = eskuVar;
        this.f = tdoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tdn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        fgjb fgjbVar;
        ?? r0;
        ffhh ffhhVar = ffhh.a;
        int i = this.d;
        try {
            if (i == 0) {
                ffci.b(obj);
                if (eskt.a(this.e.b) != eskt.CANCEL_REQUEST) {
                    ensk j = tdo.a.j();
                    j.Y(ente.a, "BugleAlphaverse");
                    ((enrr) j.h("com/google/android/apps/messaging/cloudstore/cmsrpc/deviceonboarding/CancelPairingDelegate$handleDeviceOnboardingPayload$1", "invokeSuspend", 49, "CancelPairingDelegate.kt")).t("DeviceOnboardingMessage payload is not cancel request, skip handling. Payload case: %s", eskt.a(this.e.b));
                    return Optional.empty();
                }
                fgjb fgjbVar2 = cgvq.a;
                tdo tdoVar = this.f;
                obj2 = this.e;
                fgjb fgjbVar3 = cgvq.a;
                this.a = fgjbVar3;
                this.b = tdoVar;
                this.c = obj2;
                this.d = 1;
                if (fgjbVar3.a(null, this) != ffhhVar) {
                    obj3 = tdoVar;
                    fgjbVar = fgjbVar3;
                }
                return ffhhVar;
            }
            if (i != 1) {
                r0 = this.a;
                try {
                    ffci.b(obj);
                    r0 = r0;
                    Optional of = Optional.of(obj);
                    r0.b(null);
                    return of;
                } catch (Throwable th) {
                    th = th;
                    r0.b(null);
                    throw th;
                }
            }
            obj2 = this.c;
            obj3 = this.b;
            ?? r4 = this.a;
            ffci.b(obj);
            fgjbVar = r4;
            eslc eslcVar = ((esku) obj2).b == 15 ? (eslc) ((esku) obj2).c : eslc.a;
            eslcVar.getClass();
            this.a = fgjbVar;
            this.b = null;
            this.c = null;
            this.d = 2;
            obj = ((tdo) obj3).b(eslcVar, this);
            if (obj != ffhhVar) {
                r0 = fgjbVar;
                Optional of2 = Optional.of(obj);
                r0.b(null);
                return of2;
            }
            return ffhhVar;
        } catch (Throwable th2) {
            th = th2;
            r0 = fgjbVar;
            r0.b(null);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new tdn(this.e, this.f, ffguVar);
    }
}
