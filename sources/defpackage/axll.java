package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axll extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axlx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axll(axlx axlxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axlxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axll) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        axlx axlxVar = this.b;
        this.a = 1;
        Object i2 = axlxVar.i(this);
        return i2 == ffhhVar ? ffhhVar : i2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axll(this.b, ffguVar);
    }
}
