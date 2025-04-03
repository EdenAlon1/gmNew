package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dstj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eot b;
    final /* synthetic */ List c;
    final /* synthetic */ ffix d;
    final /* synthetic */ hho e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dstj(eot eotVar, List list, ffix ffixVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eotVar;
        this.c = list;
        this.d = ffixVar;
        this.e = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dstj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final eot eotVar = this.b;
            final List list = this.c;
            final ffix ffixVar = this.d;
            ffxx a = hkt.a(new ffix() { // from class: dstg
                @Override // defpackage.ffix
                public final Object invoke() {
                    dsth dsthVar = new dsth(list);
                    ffix ffixVar2 = ffixVar;
                    ffixVar2.getClass();
                    eot eotVar2 = eot.this;
                    Object invoke = dsthVar.invoke(Integer.valueOf(eotVar2.j()));
                    return new dste(invoke, eotVar2.c(), eotVar2.c() > 0.0f ? dsthVar.invoke(Integer.valueOf(eotVar2.j() + 1)) : eotVar2.c() < 0.0f ? dsthVar.invoke(Integer.valueOf(eotVar2.j() - 1)) : invoke == null ? ffixVar2.invoke() : null);
                }
            });
            dsti dstiVar = new dsti(this.e);
            this.a = 1;
            if (a.a(dstiVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dstj(this.b, this.c, this.d, this.e, ffguVar);
    }
}
