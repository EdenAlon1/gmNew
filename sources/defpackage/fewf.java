package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fewf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffud b;
    final /* synthetic */ Exception c;
    final /* synthetic */ fdxo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fewf(ffud ffudVar, Exception exc, fdxo fdxoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffudVar;
        this.c = exc;
        this.d = fdxoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fewf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffud ffudVar = this.b;
            Exception exc = this.c;
            this.a = 1;
            ffui.e(ffudVar, "Collection of responses completed exceptionally", exc);
            Object o = ffudVar.o(this);
            if (o != ffhh.a) {
                o = ffcu.a;
            }
            if (o == ffhhVar) {
                return ffhhVar;
            }
        }
        this.d.c("Collection of responses completed exceptionally", this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fewf(this.b, this.c, this.d, ffguVar);
    }
}
