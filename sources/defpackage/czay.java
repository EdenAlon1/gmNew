package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czay extends ffhv implements ffiy {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ Object f;
    /* synthetic */ Object g;
    /* synthetic */ Object h;
    /* synthetic */ Object i;
    final /* synthetic */ czbb j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czay(czbb czbbVar, ffgu ffguVar) {
        super(10, ffguVar);
        this.j = czbbVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.e;
        Object obj7 = this.f;
        Object obj8 = this.g;
        Object obj9 = this.h;
        Object obj10 = this.i;
        fgdj f = ((ajjd) this.j.c.b()).f();
        ffxx b = ((cyrd) this.j.i.b()).b();
        if (true != this.j.n.a()) {
            obj10 = null;
        }
        czbb czbbVar = this.j;
        czbd czbdVar = new czbd(czbbVar.l.a(), czbbVar.m.a(), czbbVar.n.a(), czbbVar.o.a());
        return new czal(new czbe((czdj) obj2, (cysm) obj3, (czcw) obj4, (cyqe) obj5, (cyor) obj6, (cyph) obj7, (cypq) obj8, b, (cyyj) obj9, (cyxb) obj10, czbdVar), f);
    }

    @Override // defpackage.ffiy
    public final /* bridge */ /* synthetic */ Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        czay czayVar = new czay(this.j, (ffgu) obj10);
        czayVar.a = (czdj) obj;
        czayVar.b = (cysm) obj2;
        czayVar.c = (czcw) obj3;
        czayVar.d = (cyqe) obj4;
        czayVar.e = (cyor) obj5;
        czayVar.f = (cyph) obj6;
        czayVar.g = (cypq) obj7;
        czayVar.h = (cyyj) obj8;
        czayVar.i = (cyxb) obj9;
        return czayVar.b(ffcu.a);
    }
}
