package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cosc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cosd b;
    final /* synthetic */ eqsb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cosc(cosd cosdVar, eqsb eqsbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cosdVar;
        this.c = eqsbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cosc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cosk coskVar = (cosk) this.b.a.b();
            eqsb eqsbVar = this.c;
            this.a = 1;
            if (coskVar.b(eqsbVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cosc(this.b, this.c, ffguVar);
    }
}
