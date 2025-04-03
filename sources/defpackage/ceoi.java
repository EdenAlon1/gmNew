package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceoi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceoj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceoi(ceoj ceojVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ceojVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceoi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.c;
            ceoj ceojVar = this.b;
            ffss b = ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.a, new ceof(null, ceojVar));
            ceoj ceojVar2 = this.b;
            ffss b2 = ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.a, new ceog(null, ceojVar2));
            ceoj ceojVar3 = this.b;
            ffss[] ffssVarArr = {b, b2, ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.a, new ceoh(null, ceojVar3))};
            this.a = 1;
            obj = ffqv.b(ffssVarArr, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        List list = (List) obj;
        return new cenx(((Number) list.get(0)).intValue(), ((Number) list.get(2)).intValue(), ((Number) list.get(1)).intValue());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceoi ceoiVar = new ceoi(this.b, ffguVar);
        ceoiVar.c = obj;
        return ceoiVar;
    }
}
