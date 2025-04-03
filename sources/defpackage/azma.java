package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azma extends ffhv implements ffjm {
    int a;
    final /* synthetic */ azml b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azma(azml azmlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = azmlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azma) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        Object d = azmlVar.d(this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azma(this.b, ffguVar);
    }
}
