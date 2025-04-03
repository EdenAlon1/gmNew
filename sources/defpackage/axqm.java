package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axqm extends ffhv implements ffjo {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ ffjs e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axqm(ffjs ffjsVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.e = ffjsVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        axqm axqmVar = new axqm(this.e, (ffgu) obj4);
        axqmVar.b = (ffcl) obj;
        axqmVar.c = (ffcl) obj2;
        axqmVar.d = obj3;
        return axqmVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        ffjs ffjsVar = this.e;
        ffcl ffclVar = (ffcl) obj2;
        Object obj5 = ffclVar.a;
        Object obj6 = ffclVar.b;
        Object obj7 = ffclVar.c;
        ffcl ffclVar2 = (ffcl) obj3;
        Object obj8 = ffclVar2.a;
        Object obj9 = ffclVar2.b;
        Object obj10 = ffclVar2.c;
        this.b = null;
        this.c = null;
        this.a = 1;
        Object k = ffjsVar.k(obj5, obj6, obj7, obj8, obj9, obj10, obj4, this);
        return k == ffhhVar ? ffhhVar : k;
    }
}
