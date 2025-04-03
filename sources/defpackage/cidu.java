package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cidu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cidw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cidu(cidw cidwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cidwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cidu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffsk ffskVar = (ffsk) this.c;
        ensk e = cidw.a.e();
        e.Y(ente.a, "BugleDittoRcs");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.O, ffskVar.getClass().getSimpleName());
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/LinkIdentityDelegate$handleRequestInternal$2", "invokeSuspend", 56, "LinkIdentityDelegate.kt")).q("Link RCS to Gaia account.");
        cidw cidwVar = this.b;
        this.a = 1;
        Object d = cidwVar.d(this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cidu ciduVar = new cidu(this.b, ffguVar);
        ciduVar.c = obj;
        return ciduVar;
    }
}
