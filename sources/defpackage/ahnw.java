package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahnw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ahny b;
    final /* synthetic */ eisx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahnw(ahny ahnyVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ahnyVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahnw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ahny ahnyVar = this.b;
        eisx eisxVar = this.c;
        this.a = 1;
        Object c = ahnyVar.c(eisxVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahnw(this.b, this.c, ffguVar);
    }
}
