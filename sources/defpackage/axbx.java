package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axbx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axby b;
    final /* synthetic */ axbq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axbx(axby axbyVar, axbq axbqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axbyVar;
        this.c = axbqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axbx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        axby axbyVar = this.b;
        axbq axbqVar = this.c;
        this.a = 1;
        Object a = ffra.a(ekxi.a(axbyVar.b), new axbw(null, axbyVar, axbqVar), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axbx(this.b, this.c, ffguVar);
    }
}
