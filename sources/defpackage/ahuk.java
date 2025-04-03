package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahuk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ahul b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahuk(ahul ahulVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ahulVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahuk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ahul ahulVar = this.b;
            ffxx b = ahulVar.b.b();
            ahuj ahujVar = new ahuj(ahulVar);
            this.a = 1;
            if (b.a(ahujVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahuk(this.b, ffguVar);
    }
}
