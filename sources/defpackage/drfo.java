package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drfo extends ffhv implements ffjm {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drfo(List list, List list2, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drfo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return dqie.a(this.a, this.b, null, new ffjm() { // from class: drfn
            @Override // defpackage.ffjm
            public final Object a(Object obj2, Object obj3) {
                return Boolean.valueOf(ffkj.e(((dren) obj2).e(), ((dren) obj3).e()));
            }
        }, 12);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drfo(this.a, this.b, ffguVar);
    }
}
