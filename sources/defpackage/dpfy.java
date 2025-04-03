package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpfy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpfz b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfy(dpfz dpfzVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpfzVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpfy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dpfz dpfzVar = this.b;
        dpfx dpfxVar = new dpfx(dpfzVar, this.c, null);
        this.a = 1;
        Object f = dpfzVar.e.f("GalleryLoaderImpl#loadMedia", dpfxVar, this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpfy(this.b, this.c, ffguVar);
    }
}
