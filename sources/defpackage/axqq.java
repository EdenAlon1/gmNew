package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axqq extends ffhv implements ffjo {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ ffiy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axqq(ffiy ffiyVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.e = ffiyVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        axqq axqqVar = new axqq(this.e, (ffgu) obj4);
        axqqVar.b = (ffcl) obj;
        axqqVar.c = (ffcl) obj2;
        axqqVar.d = (ffcl) obj3;
        return axqqVar.b(ffcu.a);
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
        ffiy ffiyVar = this.e;
        ffcl ffclVar = (ffcl) obj2;
        Object obj5 = ffclVar.a;
        Object obj6 = ffclVar.b;
        Object obj7 = ffclVar.c;
        ffcl ffclVar2 = (ffcl) obj3;
        Object obj8 = ffclVar2.a;
        Object obj9 = ffclVar2.b;
        Object obj10 = ffclVar2.c;
        ffcl ffclVar3 = (ffcl) obj4;
        Object obj11 = ffclVar3.a;
        Object obj12 = ffclVar3.b;
        Object obj13 = ffclVar3.c;
        this.b = null;
        this.c = null;
        this.a = 1;
        Object m = ffiyVar.m(obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, this);
        return m == ffhhVar ? ffhhVar : m;
    }
}
