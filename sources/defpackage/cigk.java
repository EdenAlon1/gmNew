package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cigk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cigm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cigk(cigm cigmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cigmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cigk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ensk e = cigm.a.e();
                e.Y(ente.a, "BugleDittoRcs");
                ((enrr) e.h("com/google/android/apps/messaging/shared/net/handler/ditto/UnlinkIdentityDelegate$handleRequestInternal$2", "invokeSuspend", 50, "UnlinkIdentityDelegate.kt")).q("Unlink RCS from Gaia account.");
                cigm cigmVar = this.b;
                this.a = 1;
                obj = cigmVar.d(this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return (esdm) obj;
        } catch (fedn e2) {
            ensk j = cigm.a.j();
            j.Y(ente.a, "BugleDittoRcs");
            ((enrr) ((enrr) j).g(e2).h("com/google/android/apps/messaging/shared/net/handler/ditto/UnlinkIdentityDelegate$handleRequestInternal$2", "invokeSuspend", 55, "UnlinkIdentityDelegate.kt")).q("Cannot unlink RCS from Gaia account.");
            esdj esdjVar = (esdj) esdm.a.createBuilder();
            esdjVar.getClass();
            return esdn.a(esdjVar);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cigk(this.b, ffguVar);
    }
}
