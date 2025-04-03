package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ocv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ ocy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocv(ffxx ffxxVar, ocy ocyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = ocyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ocv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgby fgbyVar = new fgby(this.b);
            ocu ocuVar = new ocu(this.c);
            this.a = 1;
            if (fgbyVar.a(ocuVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ocv(this.b, this.c, ffguVar);
    }
}
