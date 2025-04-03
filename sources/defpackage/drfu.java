package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drfu extends ffhv implements ffjm {
    final /* synthetic */ dtcq a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drfu(dtcq dtcqVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dtcqVar;
        this.b = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drfu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return dqie.a(this.a.e, this.b, null, null, 28);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drfu(this.a, this.b, ffguVar);
    }
}
