package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axpz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjq b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    final /* synthetic */ Object h;
    final /* synthetic */ fflb i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axpz(ffjq ffjqVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, fflb fflbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjqVar;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = fflbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axpz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.a(this.c, this.d, this.e, this.f, this.g, this.h);
            this.a = 1;
            if (ffsw.c(1000L, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.i.a = null;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axpz(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ffguVar);
    }
}
