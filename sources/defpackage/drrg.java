package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drrg extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ drri c;
    final /* synthetic */ ffji d;
    final /* synthetic */ ffji e;
    final /* synthetic */ drre f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drrg(drri drriVar, ffji ffjiVar, ffji ffjiVar2, drre drreVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = drriVar;
        this.d = ffjiVar;
        this.e = ffjiVar2;
        this.f = drreVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drrg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.b != 0) {
                obj2 = this.a;
                ffci.b(obj);
            } else {
                ffci.b(obj);
                drri drriVar = this.c;
                ffji ffjiVar = this.d;
                this.a = drriVar;
                this.b = 1;
                Object invoke = ffjiVar.invoke(this);
                if (invoke == ffhhVar) {
                    return ffhhVar;
                }
                obj2 = drriVar;
                obj = invoke;
            }
            drri.G((drri) obj2, (drlj) obj, this.e, this.f, null, null, 112);
        } catch (Exception e) {
            ((enrr) ((enrr) drri.s.i()).g(e).h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder$bind$4", "invokeSuspend", 74, "MediaViewHolder.kt")).q("Unable to resolve media, showing error state");
            drri drriVar2 = this.c;
            qpt.c(drriVar2.y).k(drriVar2.v);
            this.c.E();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drrg(this.c, this.d, this.e, this.f, ffguVar);
    }
}
