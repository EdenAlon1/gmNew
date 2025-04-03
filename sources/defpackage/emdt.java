package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emdt extends ffhv implements ffjm {
    final /* synthetic */ emdw a;
    final /* synthetic */ saq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emdt(emdw emdwVar, saq saqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = emdwVar;
        this.b = saqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((emdt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((enrr) this.a.d.h().h("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl$requestFeatureDownload$1", "invokeSuspend", 492, "PenpalOnDeviceClientImpl.kt")).r("Requesting download for feature %d", this.b.a());
        emdw emdwVar = this.a;
        emdwVar.j().g(this.b, new emdl(emdwVar));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new emdt(this.a, this.b, ffguVar);
    }
}
