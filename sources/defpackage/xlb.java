package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xlb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ xle c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlb(ffxx ffxxVar, xle xleVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = xleVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xlb) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxy ffxyVar = (ffxy) this.d;
            fflb fflbVar = new fflb();
            ffxx a = ffyy.a(new xkw(this.b));
            xkt xktVar = new xkt(null, this.b, this.c, fflbVar);
            int i2 = fgau.a;
            fgen fgenVar = new fgen(xktVar, a);
            this.a = 1;
            if (ffyk.c(ffxyVar, fgenVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xlb xlbVar = new xlb(this.b, this.c, ffguVar);
        xlbVar.d = obj;
        return xlbVar;
    }
}
