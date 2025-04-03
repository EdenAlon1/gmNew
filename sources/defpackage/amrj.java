package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amrj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amrp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrj(amrp amrpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amrpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amrj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl b = this.b.b.n().b();
        b.getClass();
        this.a = 1;
        Object c = fgfz.c(b, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amrj(this.b, ffguVar);
    }
}
