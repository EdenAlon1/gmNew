package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tdz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ted b;
    final /* synthetic */ esku c;
    final /* synthetic */ String d;
    final /* synthetic */ long e;
    final /* synthetic */ eyee f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdz(ted tedVar, esku eskuVar, String str, long j, eyee eyeeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = tedVar;
        this.c = eskuVar;
        this.d = str;
        this.e = j;
        this.f = eyeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tdz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ensk e = ted.a.e();
        e.Y(ente.a, "BugleAlphaverse");
        ((enrr) e.h("com/google/android/apps/messaging/cloudstore/cmsrpc/deviceonboarding/CreatePairingDelegate$handleDeviceOnboardingPayload$1", "invokeSuspend", 77, "CreatePairingDelegate.kt")).q("Processing deviceOnboardingMessage");
        ted tedVar = this.b;
        esku eskuVar = this.c;
        String str = this.d;
        long j = this.e;
        eyee eyeeVar = this.f;
        this.a = 1;
        Object k = tedVar.k(eskuVar, str, j, eyeeVar, this);
        return k == ffhhVar ? ffhhVar : k;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new tdz(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
