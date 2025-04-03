package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ gnn b;
    final /* synthetic */ dhy c;
    final /* synthetic */ ffjm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnk(gnn gnnVar, dhy dhyVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = gnnVar;
        this.c = dhyVar;
        this.d = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gnk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.i(true);
            gnn gnnVar = this.b;
            dhy dhyVar = this.c;
            ffjm ffjmVar = this.d;
            this.a = 1;
            if (gnnVar.h.b(gnnVar.g, dhyVar, ffjmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.i(false);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new gnk(this.b, this.c, this.d, ffguVar);
    }
}
