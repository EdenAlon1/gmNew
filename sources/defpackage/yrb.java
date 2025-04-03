package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yrb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yrg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrb(yrg yrgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yrgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yrb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            yrg yrgVar = this.b;
            ffxx ffxxVar = yrgVar.c.i;
            yra yraVar = new yra(yrgVar);
            this.a = 1;
            if (ffxxVar.a(yraVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yrb(this.b, ffguVar);
    }
}
