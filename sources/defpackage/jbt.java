package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jbt extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ jbu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbt(jbu jbuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = jbuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jbt) c((jer) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a == 0) {
            ffci.b(obj);
            jer jerVar = (jer) this.b;
            jbu jbuVar = this.c;
            this.b = jerVar;
            this.a = 1;
            ffrh ffrhVar = new ffrh(ffhi.c(this), 1);
            ffrhVar.B();
            jvw jvwVar = jbuVar.b;
            jvwVar.a.c();
            jvwVar.b.set(new jwj(jvwVar, jvwVar.a));
            ffrhVar.d(new jbs(jerVar, jbuVar));
            if (ffrhVar.m() == ffhhVar) {
                return ffhhVar;
            }
        } else {
            ffci.b(obj);
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        jbt jbtVar = new jbt(this.c, ffguVar);
        jbtVar.b = obj;
        return jbtVar;
    }
}
