package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cemz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cena b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cemz(cena cenaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cenaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cemz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cena cenaVar = this.b;
            this.a = 1;
            if (((Boolean) ((cfup) csfu.j.get()).e()).booleanValue()) {
                ensk h = cena.a.h();
                h.Y(ente.a, "BugleCms");
                ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/staterecovery/ResetAllLocalStateRecover", "recover", 39, "ResetAllLocalStateRecover.kt")).q("Run ResetAllLocalStateRecover.");
                a = ffra.a(ekxi.a(cenaVar.d), new cemx(null, cenaVar), this);
                if (a != ffhh.a) {
                    a = ffcu.a;
                }
            } else {
                ensk h2 = cena.a.h();
                h2.Y(ente.a, "BugleCms");
                ((enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/staterecovery/ResetAllLocalStateRecover", "recover", 35, "ResetAllLocalStateRecover.kt")).q("Skip ResetAllLocalStateRecover because flag is off.");
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cemz(this.b, ffguVar);
    }
}
