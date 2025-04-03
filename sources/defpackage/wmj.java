package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wmj extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ wmn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmj(wmn wmnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.g = wmnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wmj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        akxl akxlVar;
        ffhh ffhhVar = ffhh.a;
        if (this.f != 0) {
            obj2 = this.e;
            Object obj6 = this.d;
            obj3 = this.c;
            Object obj7 = this.b;
            obj4 = this.a;
            ffci.b(obj);
            akxlVar = obj6;
            obj5 = obj7;
        } else {
            ffci.b(obj);
            akxl akxlVar2 = (akxl) this.g.a.b();
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.MAGIC_COMPOSE_ICON_EVENT;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b |= 1;
            wmn wmnVar = this.g;
            eqtj a = eqti.a((eqsv) eqsw.a.createBuilder());
            eqsv eqsvVar = a.a;
            eqsvVar.copyOnWrite();
            eqsw eqswVar = (eqsw) eqsvVar.instance;
            eqswVar.b |= 1;
            eqswVar.c = true;
            comc comcVar = (comc) wmnVar.c.b();
            this.a = a;
            this.b = a;
            this.c = a;
            this.d = akxlVar2;
            this.e = eoluVar;
            this.f = 1;
            Object c = comcVar.c(this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            obj2 = eoluVar;
            obj = c;
            obj3 = a;
            obj4 = obj3;
            akxlVar = akxlVar2;
            obj5 = a;
        }
        ((eqtj) obj3).c(((czuk) obj).c);
        if (wmn.p()) {
            ((eqtj) obj5).b(wmn.p());
        }
        eqsw a2 = ((eqtj) obj4).a();
        ((eyfq) obj2).copyOnWrite();
        eolu eoluVar2 = (eolu) obj2;
        eolv eolvVar2 = (eolv) eoluVar2.instance;
        eolv eolvVar3 = eolv.a;
        eolvVar2.bP = a2;
        eolvVar2.g |= 4194304;
        akxlVar.o(eoluVar2);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wmj(this.g, ffguVar);
    }
}
