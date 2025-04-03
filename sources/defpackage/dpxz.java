package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpxz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpyd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpxz(dpyd dpydVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpydVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpxz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dpyd dpydVar = this.b;
            List b = ffdx.b(dqlf.a);
            this.a = 1;
            obj = dpydVar.x.b(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            dpyd dpydVar2 = this.b;
            dpni F = dpydVar2.F();
            dpydVar2.J(F != null ? F.b : false);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpxz(this.b, ffguVar);
    }
}
