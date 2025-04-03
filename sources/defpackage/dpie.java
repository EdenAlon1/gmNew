package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpie extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ dpif c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpie(dpif dpifVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = dpifVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dpie dpieVar = new dpie(this.c, (ffgu) obj3);
        dpieVar.a = (dphb) obj;
        dpieVar.b = (Duration) obj2;
        return dpieVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        boolean z = obj2 instanceof dpgw;
        Object obj3 = this.b;
        if (z) {
            dpif dpifVar = this.c;
            return new dplj(new dphv(dpifVar), new dphw(dpifVar), new dphx(dpifVar), dpifVar, new dphy(dpifVar), 16);
        }
        if (obj2 instanceof dpgy) {
            Duration duration = this.c.e.a;
            Duration minus = duration != null ? duration.minus((Duration) obj3) : null;
            dpif dpifVar2 = this.c;
            return new dplq(new dphz(dpifVar2), new dpia(dpifVar2), new dpib(dpifVar2), dpifVar2, new dpic(dpifVar2), minus != null ? new Integer((int) minus.getSeconds()) : null, 16);
        }
        if (obj2 instanceof dpgz) {
            dpif dpifVar3 = this.c;
            return new dplv(new dpid(dpifVar3), new dphm(dpifVar3), this.c, dpifVar3.a().a(), new dphn(dpifVar3));
        }
        if (obj2 instanceof dpgx) {
            dpif dpifVar4 = this.c;
            return new dplk(new dpho(dpifVar4), new dphp(dpifVar4), dpifVar4, ernk.g(3), new dphq(dpifVar4), ((dpgx) obj2).a, dpifVar4.e.e);
        }
        if (!(obj2 instanceof dpha)) {
            throw new ffcd();
        }
        dpif dpifVar5 = this.c;
        return new dplq(new dphr(dpifVar5), new dphs(dpifVar5), new dpht(dpifVar5), dpifVar5, new dphu(dpifVar5), null, 16);
    }
}
