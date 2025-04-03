package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axsv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;
    final /* synthetic */ ffjm e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axsv(ffxx ffxxVar, int i, long j, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = i;
        this.d = j;
        this.e = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axsv) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            axsu axsuVar = new axsu(this.b, this.c, this.d, (ffxy) this.f, this.e, null);
            this.a = 1;
            if (ffsl.a(axsuVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axsv axsvVar = new axsv(this.b, this.c, this.d, this.e, ffguVar);
        axsvVar.f = obj;
        return axsvVar;
    }
}
