package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgeo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ fgfm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgeo(ffxx ffxxVar, fgfm fgfmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = fgfmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fgeo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx ffxxVar = this.b;
            fgfm fgfmVar = this.c;
            this.a = 1;
            if (ffxxVar.a(fgfmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fgeo(this.b, this.c, ffguVar);
    }
}
