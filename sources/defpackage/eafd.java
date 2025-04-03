package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eafd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eafe b;
    final /* synthetic */ exyd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eafd(eafe eafeVar, exyd exydVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eafeVar;
        this.c = exydVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eafd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        int f = this.b.c.f();
        if (f == 1) {
            return ffcu.a;
        }
        if (f == 3) {
            return ffcu.a;
        }
        eafe eafeVar = this.b;
        exyd exydVar = this.c;
        eagp a = eano.a(eafeVar.b);
        this.a = 1;
        Object c = eafeVar.a.c(exydVar, a, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eafd(this.b, this.c, ffguVar);
    }
}
