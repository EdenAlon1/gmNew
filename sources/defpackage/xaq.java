package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xaq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xax b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xaq(xax xaxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xaxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xaq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl x = ((alxl) this.b.d.b()).x(this.b.c.d(), cuea.d);
            x.getClass();
            this.a = 1;
            if (fgfz.c(x, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xaq(this.b, ffguVar);
    }
}
