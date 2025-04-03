package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azov extends ffhv implements ffjm {
    int a;
    final /* synthetic */ azow b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azov(azow azowVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = azowVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azov) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        azow azowVar = this.b;
        int i2 = this.c;
        this.a = 1;
        Object e = azowVar.a.e(i2, this);
        return e == ffhhVar ? ffhhVar : e;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azov(this.b, this.c, ffguVar);
    }
}
