package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hae extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ild b;
    final /* synthetic */ gvi c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hae(ild ildVar, gvi gviVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ildVar;
        this.c = gviVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hae) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.d;
            ild ildVar = this.b;
            had hadVar = new had(ffskVar, this.c, null);
            this.a = 1;
            if (dpu.b(ildVar, hadVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        hae haeVar = new hae(this.b, this.c, ffguVar);
        haeVar.d = obj;
        return haeVar;
    }
}
