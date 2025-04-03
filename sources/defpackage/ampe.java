package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ampe extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;

    public ampe(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ampe) c((aqux) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl b = ((aqux) this.b).e().b();
            b.getClass();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Boolean.valueOf(((aqys) obj).a());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ampe ampeVar = new ampe(ffguVar);
        ampeVar.b = obj;
        return ampeVar;
    }
}
