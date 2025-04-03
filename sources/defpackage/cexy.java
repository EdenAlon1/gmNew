package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cexy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceyc b;
    final /* synthetic */ fgcm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cexy(ceyc ceycVar, fgcm fgcmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ceycVar;
        this.c = fgcmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cexy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgbt fgbtVar = new fgbt(new cexx(this.b.e().e(), this.b), new cexu(this.c, null));
            this.a = 1;
            if (ffyk.a(fgbtVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cexy(this.b, this.c, ffguVar);
    }
}
