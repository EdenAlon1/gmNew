package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddv extends ffhv implements ffjm {
    final /* synthetic */ ddx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddv(ddx ddxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ddxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ddv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ddx ddxVar = this.a;
        dwk dwkVar = ddxVar.f;
        if (dwkVar != null) {
            dwl dwlVar = new dwl(dwkVar);
            dwn dwnVar = ddxVar.h;
            if (dwnVar != null) {
                ffqy.d(ddxVar.D(), null, null, new ddn(dwnVar, dwlVar, null), 3);
            }
            ddxVar.f = null;
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ddv(this.a, ffguVar);
    }
}
