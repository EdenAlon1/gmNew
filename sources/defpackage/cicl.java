package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cicl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cice b;
    final /* synthetic */ ciff c;
    final /* synthetic */ eslh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cicl(cice ciceVar, ciff ciffVar, eslh eslhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ciceVar;
        this.c = ciffVar;
        this.d = eslhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cicl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cice ciceVar = this.b;
        ciff ciffVar = this.c;
        eslh eslhVar = this.d;
        this.a = 1;
        Object h = ciceVar.h(ciffVar, eslhVar, this);
        return h == ffhhVar ? ffhhVar : h;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cicl(this.b, this.c, this.d, ffguVar);
    }
}
