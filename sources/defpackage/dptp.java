package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dptp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dptq b;
    final /* synthetic */ dpse c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dptp(dptq dptqVar, dpse dpseVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dptqVar;
        this.c = dpseVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dptp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dptq dptqVar = this.b;
            dpse dpseVar = this.c;
            this.a = 1;
            if (dptqVar.d.fQ(dpseVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dptp(this.b, this.c, ffguVar);
    }
}
