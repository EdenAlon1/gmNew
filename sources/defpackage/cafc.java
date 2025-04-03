package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cafc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cafe b;
    final /* synthetic */ cafb c;
    final /* synthetic */ awui d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cafc(cafe cafeVar, cafb cafbVar, awui awuiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cafeVar;
        this.c = cafbVar;
        this.d = awuiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cafc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cafe cafeVar = this.b;
        cafb cafbVar = this.c;
        awui awuiVar = this.d;
        this.a = 1;
        Object a = cafeVar.a(cafbVar, awuiVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cafc(this.b, this.c, this.d, ffguVar);
    }
}
