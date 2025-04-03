package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpcl extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpcl(List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpcl) c((dpdf) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dpdf dpdfVar = (dpdf) this.a;
        if (dpdfVar instanceof dpde) {
            this.b.add(((dpde) dpdfVar).b);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dpcl dpclVar = new dpcl(this.b, ffguVar);
        dpclVar.a = obj;
        return dpclVar;
    }
}
