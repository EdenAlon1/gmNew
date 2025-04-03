package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceuq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceur b;
    final /* synthetic */ eyhs c;
    final /* synthetic */ ceuw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceuq(ceur ceurVar, eyhs eyhsVar, ceuw ceuwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ceurVar;
        this.c = eyhsVar;
        this.d = ceuwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceuq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ceur ceurVar = this.b;
        eyhs eyhsVar = this.c;
        ceuw ceuwVar = this.d;
        this.a = 1;
        Object a = ceurVar.b.a(eyhsVar, ceuwVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ceuq(this.b, this.c, this.d, ffguVar);
    }
}
