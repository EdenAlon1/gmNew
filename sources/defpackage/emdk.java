package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emdk extends ffhv implements ffjm {
    final /* synthetic */ emdw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emdk(emdw emdwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = emdwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((emdk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((enrr) this.a.d.e().h("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl$close$1", "invokeSuspend", 286, "PenpalOnDeviceClientImpl.kt")).q("Closing AiCore client");
        this.a.j().close();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new emdk(this.a, ffguVar);
    }
}
