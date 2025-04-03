package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctrd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bvhc b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctrd(ffgu ffguVar, bvhc bvhcVar) {
        super(2, ffguVar);
        this.b = bvhcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctrd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl w = this.b.w();
        w.getClass();
        this.a = 1;
        Object c = fgfz.c(w, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctrd ctrdVar = new ctrd(ffguVar, this.b);
        ctrdVar.c = obj;
        return ctrdVar;
    }
}
