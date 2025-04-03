package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddu extends ffhv implements ffjm {
    final /* synthetic */ ddx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddu(ddx ddxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ddxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ddu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ddx ddxVar = this.a;
        if (ddxVar.f == null) {
            dwk dwkVar = new dwk();
            dwn dwnVar = ddxVar.h;
            if (dwnVar != null) {
                ffqy.d(ddxVar.D(), null, null, new ddm(dwnVar, dwkVar, null), 3);
            }
            ddxVar.f = dwkVar;
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ddu(this.a, ffguVar);
    }
}
