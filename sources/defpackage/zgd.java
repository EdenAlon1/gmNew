package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgd extends ffhv implements ffjm {
    final /* synthetic */ zgm a;
    final /* synthetic */ eot b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgd(zgm zgmVar, eot eotVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = zgmVar;
        this.b = eotVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zgd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        fgcm fgcmVar = this.a.a;
        if (fgcmVar == null) {
            ffkj.c("currentPage");
            fgcmVar = null;
        }
        fgcmVar.f(new Integer(this.b.j()));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zgd(this.a, this.b, ffguVar);
    }
}
