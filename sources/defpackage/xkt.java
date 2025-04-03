package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xkt extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffxx c;
    final /* synthetic */ xle d;
    final /* synthetic */ fflb e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkt(ffgu ffguVar, ffxx ffxxVar, xle xleVar, fflb fflbVar) {
        super(3, ffguVar);
        this.c = ffxxVar;
        this.d = xleVar;
        this.e = fflbVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xkt xktVar = new xkt((ffgu) obj3, this.c, this.d, this.e);
        xktVar.f = (ffxy) obj;
        xktVar.b = obj2;
        return xktVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx b;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r8 = this.f;
            alxh alxhVar = (alxh) this.b;
            if (alxhVar != alxh.NONE) {
                ensk e = xle.a.e();
                e.Y(ente.a, "BugleComposeRow2");
                ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver$transportCapabilityDataFlow$1$invokeSuspend$$inlined$flatMapLatest$1", "invokeSuspend", 461, "MapiTransportCapabilityResolver.kt")).t("Disabled Transport Capability with ComposeDisabledReason %s", alxhVar);
                alxhVar.getClass();
                b = new ffyg(new xlq(alxhVar));
            } else {
                ffxx a = ffyy.a(new xkz(this.c, this.d));
                xle xleVar = this.d;
                b = fgck.b(a, xleVar.l, xleVar.m, xleVar.n, new xks(this.e, xleVar, null));
            }
            this.a = 1;
            if (ffyk.c(r8, b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
