package defpackage;

import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dprf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dprt b;
    final /* synthetic */ dpvx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dprf(dprt dprtVar, dpvx dpvxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dprtVar;
        this.c = dpvxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dprf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dpwf dpwfVar = this.b.k;
            if (dpwfVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (dpwfVar.k != null) {
                dpwfVar.g.f(false);
                fafg fafgVar = null;
                dpwfVar.f.f(null);
                dpwfVar.h.f(new LinkedHashSet());
                dpwfVar.d.f();
                fafg fafgVar2 = dpwfVar.k;
                if (fafgVar2 == null) {
                    ffkj.c("xenoEffect");
                } else {
                    fafgVar = fafgVar2;
                }
                fafgVar.d.d.d();
            }
            dprt dprtVar = this.b;
            dpqg dpqgVar = new dpqg(this.c);
            this.a = 1;
            if (dprtVar.j.fQ(dpqgVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dprf(this.b, this.c, ffguVar);
    }
}
