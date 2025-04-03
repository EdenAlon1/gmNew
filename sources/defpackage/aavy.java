package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aavy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aawf b;
    final /* synthetic */ ffxx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aavy(aawf aawfVar, ffxx ffxxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aawfVar;
        this.c = ffxxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aavy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aawf aawfVar = this.b;
            ffxx ffxxVar = this.c;
            aavs aavsVar = new aavs(aawfVar, null);
            ffxx a = ffyy.a(new aavx(fgck.a(aawfVar.j, ffxxVar, aawfVar.i.a, aavsVar)));
            aavu aavuVar = new aavu(this.b);
            this.a = 1;
            if (a.a(aavuVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aavy(this.b, this.c, ffguVar);
    }
}
