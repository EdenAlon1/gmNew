package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wmi extends ffhv implements ffji {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    int g;
    final /* synthetic */ wmn h;
    final /* synthetic */ esgx i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmi(wmn wmnVar, esgx esgxVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.h = wmnVar;
        this.i = esgxVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7 = ffhh.a;
        if (this.g == 0) {
            ffci.b(obj);
            eolu eoluVar = (eolu) eolv.a.createBuilder();
            eolt eoltVar = eolt.MAGIC_COMPOSE_ICON_EVENT;
            eoluVar.copyOnWrite();
            eolv eolvVar = (eolv) eoluVar.instance;
            eolvVar.j = eoltVar.dk;
            eolvVar.b |= 1;
            wmn wmnVar = this.h;
            obj2 = this.i;
            eqtj a = eqti.a((eqsv) eqsw.a.createBuilder());
            eqsv eqsvVar = a.a;
            eqsvVar.copyOnWrite();
            eqsw eqswVar = (eqsw) eqsvVar.instance;
            eqswVar.b |= 2;
            eqswVar.d = true;
            comc comcVar = (comc) wmnVar.c.b();
            this.a = wmnVar;
            this.b = obj2;
            this.c = a;
            this.d = a;
            this.e = a;
            this.f = eoluVar;
            this.g = 1;
            Object c = comcVar.c(this);
            if (c != obj7) {
                obj7 = eoluVar;
                obj3 = a;
                obj = c;
                obj4 = obj3;
                obj6 = a;
                obj5 = wmnVar;
            }
            return obj7;
        }
        obj7 = this.f;
        Object obj8 = this.e;
        obj4 = this.d;
        obj3 = this.c;
        obj2 = this.b;
        Object obj9 = this.a;
        ffci.b(obj);
        obj6 = obj8;
        obj5 = obj9;
        ((eqtj) obj6).c(((czuk) obj).c);
        if (wmn.p()) {
            ((eqtj) obj4).b(wmn.p());
        }
        if (obj2 != null) {
            eqtg eqtgVar = (eqtg) Map.EL.getOrDefault(((wmx) ((wmn) obj5).b.b()).b, obj2, eqtg.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_UNSPECIFIED);
            eqtgVar.getClass();
            eqsv eqsvVar2 = ((eqtj) obj4).a;
            eqsvVar2.copyOnWrite();
            eqsw eqswVar2 = (eqsw) eqsvVar2.instance;
            eqsw eqswVar3 = eqsw.a;
            eqswVar2.e = eqtgVar.i;
            eqswVar2.b |= 4;
        }
        eqsw a2 = ((eqtj) obj3).a();
        ((eyfq) obj7).copyOnWrite();
        eolv eolvVar2 = (eolv) ((eolu) obj7).instance;
        eolv eolvVar3 = eolv.a;
        eolvVar2.bP = a2;
        eolvVar2.g |= 4194304;
        return obj7;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new wmi(this.h, this.i, (ffgu) obj).b(ffcu.a);
    }
}
