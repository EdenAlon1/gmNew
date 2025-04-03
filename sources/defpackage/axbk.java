package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axbk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axbl b;
    final /* synthetic */ axbq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axbk(axbl axblVar, axbq axbqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axblVar;
        this.c = axbqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axbk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        axbl axblVar = this.b;
        axbq axbqVar = this.c;
        this.a = 1;
        Object b = axblVar.b(axbqVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axbk(this.b, this.c, ffguVar);
    }
}
