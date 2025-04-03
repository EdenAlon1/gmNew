package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azmc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ azml b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azmc(azml azmlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = azmlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azmc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        azml azmlVar = this.b;
        this.a = 1;
        Object i2 = azmlVar.i(this);
        return i2 == ffhhVar ? ffhhVar : i2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azmc(this.b, ffguVar);
    }
}
