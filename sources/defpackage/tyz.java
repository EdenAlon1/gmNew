package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tyz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ tzc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyz(tzc tzcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = tzcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tyz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        tzc tzcVar = this.b;
        this.a = 1;
        Object a = ffra.a(ekxi.a(tzcVar.b), new tyy(null, tzcVar), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new tyz(this.b, ffguVar);
    }
}
