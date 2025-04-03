package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xcn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xco b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcn(xco xcoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xcoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xcn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            xco xcoVar = this.b;
            xcm xcmVar = new xcm(xcoVar);
            this.a = 1;
            if (xcoVar.a.a(xcmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xcn(this.b, ffguVar);
    }
}
