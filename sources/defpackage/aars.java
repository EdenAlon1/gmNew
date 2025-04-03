package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aars extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aasc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aars(aasc aascVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aascVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aars) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl x = ((alxl) this.b.f.b()).x(this.b.e, cuea.c);
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
        return new aars(this.b, ffguVar);
    }
}
