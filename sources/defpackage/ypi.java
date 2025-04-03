package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ypi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ yqb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypi(ffxx ffxxVar, yqb yqbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = yqbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ypi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx ffxxVar = this.b;
            yqb yqbVar = this.c;
            ffxx a = ffyy.a(ffxxVar);
            yph yphVar = new yph(yqbVar);
            this.a = 1;
            if (a.a(yphVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ypi(this.b, this.c, ffguVar);
    }
}
