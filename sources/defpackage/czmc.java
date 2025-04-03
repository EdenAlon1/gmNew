package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czmc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ czmd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czmc(czmd czmdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = czmdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((czmc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            czmd czmdVar = this.b;
            this.a = 1;
            obj = czmdVar.a(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.a.f((Map) obj);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new czmc(this.b, ffguVar);
    }
}
