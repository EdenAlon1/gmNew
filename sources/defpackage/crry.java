package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crry extends ffhv implements ffjm {
    int a;
    final /* synthetic */ crsa b;
    final /* synthetic */ crsd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crry(crsa crsaVar, crsd crsdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = crsaVar;
        this.c = crsdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crry) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        crsa crsaVar = this.b;
        crsd crsdVar = this.c;
        this.a = 1;
        Object c = crsaVar.c(crsdVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new crry(this.b, this.c, ffguVar);
    }
}
