package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejsm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ fgcm d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejsm(ffgu ffguVar, ffxx ffxxVar, ffjm ffjmVar, fgcm fgcmVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = ffjmVar;
        this.d = fgcmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejsm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx b = ffyo.b(ffyo.a(new ffxs(new ejse(new ejst(), new ejsk(this.b, this.c), ejsg.a, new ffji() { // from class: ejsf
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    ejsr ejsrVar = (ejsr) obj2;
                    ejsrVar.getClass();
                    return Boolean.valueOf(ejsrVar instanceof ejsp);
                }
            }, null))), fftc.b);
            ejsn ejsnVar = new ejsn(this.d);
            this.a = 1;
            if (b.a(ejsnVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ejsm ejsmVar = new ejsm(ffguVar, this.b, this.c, this.d);
        ejsmVar.e = obj;
        return ejsmVar;
    }
}
