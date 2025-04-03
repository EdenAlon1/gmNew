package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wmk extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ eqsq c;
    final /* synthetic */ wmn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmk(eqsq eqsqVar, wmn wmnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = eqsqVar;
        this.d = wmnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wmk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            eqsq eqsqVar = this.c;
            comc comcVar = (comc) this.d.c.b();
            this.a = eqsqVar;
            this.b = 1;
            Object c = comcVar.c(this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            obj2 = eqsqVar;
            obj = c;
        }
        boolean z = ((czuk) obj).c;
        ((eyfq) obj2).copyOnWrite();
        eqss eqssVar = (eqss) ((eqsq) obj2).instance;
        eqss eqssVar2 = eqss.a;
        eqssVar.b |= 64;
        eqssVar.n = z;
        akxl akxlVar = (akxl) this.d.a.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.MAGIC_COMPOSE_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqsq eqsqVar2 = this.c;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqss eqssVar3 = (eqss) eqsqVar2.build();
        eqssVar3.getClass();
        eolvVar2.bL = eqssVar3;
        eolvVar2.g |= 131072;
        akxlVar.o(eoluVar);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wmk(this.c, this.d, ffguVar);
    }
}
