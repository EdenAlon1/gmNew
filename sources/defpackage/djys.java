package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djys extends ffhv implements ffjm {
    int a;
    final /* synthetic */ djyt b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djys(djyt djytVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = djytVar;
        this.c = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djys) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0 || this.b.o.isEmpty()) {
            return null;
        }
        if (this.b.v.get()) {
            obj2 = ((ffcf) this.b.o.getLast()).b;
            this.b.o.clear();
        } else {
            obj2 = this.c;
        }
        djyt djytVar = this.b;
        this.a = 1;
        if (djytVar.g(obj2, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new djys(this.b, this.c, ffguVar);
    }
}
