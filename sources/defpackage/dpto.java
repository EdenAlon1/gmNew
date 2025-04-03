package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpto extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dptq b;
    final /* synthetic */ drnn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpto(dptq dptqVar, drnn drnnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dptqVar;
        this.c = drnnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpto) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dptq dptqVar = this.b;
            drnn drnnVar = this.c;
            this.a = 1;
            if (dptqVar.b.fQ(drnnVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpto(this.b, this.c, ffguVar);
    }
}
