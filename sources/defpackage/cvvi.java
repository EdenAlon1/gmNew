package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvvi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvvj b;
    final /* synthetic */ aoku c;
    final /* synthetic */ aqux d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvvi(cvvj cvvjVar, aoku aokuVar, aqux aquxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvvjVar;
        this.c = aokuVar;
        this.d = aquxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvvi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cvvj cvvjVar = this.b;
            aoku aokuVar = this.c;
            cwde cwdeVar = cvvjVar.e;
            aokuVar.getClass();
            aqux aquxVar = this.d;
            this.a = 1;
            if (cwdeVar.a(aokuVar, aquxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvvi(this.b, this.c, this.d, ffguVar);
    }
}
