package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqez extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqfc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqez(dqfc dqfcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqfcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqez) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqli q = this.b.q();
            List g = ffdx.g(dqlf.e, dqlf.f);
            this.a = 1;
            obj = q.a(g, false, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        dpgc dpgcVar = this.b.ah;
        if (dpgcVar == null) {
            ffkj.c("galleryMediaObserver");
            dpgcVar = null;
        }
        dpgcVar.onChange(true);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqez(this.b, ffguVar);
    }
}
