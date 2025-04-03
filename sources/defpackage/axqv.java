package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axqv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgdj b;
    final /* synthetic */ fgcm c;
    final /* synthetic */ ffji d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axqv(fgdj fgdjVar, fgcm fgcmVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgdjVar;
        this.c = fgcmVar;
        this.d = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axqv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgdj fgdjVar = this.b;
            axqu axquVar = new axqu(this.c, this.d);
            this.a = 1;
            if (fgdjVar.a(axquVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axqv(this.b, this.c, this.d, ffguVar);
    }
}
