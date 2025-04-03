package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apja extends ffhv implements ffjm {
    int a;
    final /* synthetic */ apjf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apja(apjf apjfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = apjfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apja) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffss[] ffssVarArr = {axol.e(this.b.b.b()), axol.e(this.b.c.b())};
            this.a = 1;
            obj = ffqv.b(ffssVarArr, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        if (obj2 == null || !(obj2 instanceof apjs) || obj3 == null || !(obj3 instanceof exdz)) {
            return false;
        }
        apjs apjsVar = (apjs) obj2;
        double d = apjsVar.c;
        double d2 = apjsVar.d;
        double d3 = apjsVar.e;
        enin eninVar = new enin();
        engw engwVar = ((exdz) obj3).a;
        for (int i2 = 0; i2 < ((enou) engwVar).c; i2++) {
            exdw exdwVar = (exdw) engwVar.get(i2);
            if (exdwVar.b.a(d, d2, d3)) {
                eninVar.c(exdwVar.a);
            }
        }
        eninVar.g().getClass();
        return Boolean.valueOf(!r12.isEmpty());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apja(this.b, ffguVar);
    }
}
