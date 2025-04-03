package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axpy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjo b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ fflb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axpy(ffjo ffjoVar, Object obj, Object obj2, Object obj3, Object obj4, fflb fflbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjoVar;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = fflbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axpy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.a(this.c, this.d, this.e, this.f);
            this.a = 1;
            if (ffsw.c(1000L, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.g.a = null;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axpy(this.b, this.c, this.d, this.e, this.f, this.g, ffguVar);
    }
}
