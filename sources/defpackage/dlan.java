package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlan extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public dlan(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlan) c((List) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        List list = (List) this.a;
        list.getClass();
        pqq pqqVar = (pqq) ffdx.U(list);
        return Boolean.valueOf(pqqVar != null ? pqqVar.b.a() : false);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dlan dlanVar = new dlan(ffguVar);
        dlanVar.a = obj;
        return dlanVar;
    }
}
